package ieee.poc.coders.mder;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import org.bn.coders.CoderUtils;
import org.bn.coders.DecodedObject;
import org.bn.coders.ElementInfo;
import org.bn.coders.ElementType;
import org.bn.coders.Encoder;
import org.bn.coders.TagClass;
import org.bn.coders.UniversalTag;
import org.bn.coders.ber.BERCoderUtils;
import org.bn.metadata.ASN1SequenceOfMetadata;
import org.bn.types.BitString;
import org.bn.utils.ReverseByteArrayOutputStream;

public class MDEREncoder<T> extends Encoder<T> {

	public MDEREncoder() {
		// TODO Auto-generated constructor stub
	}

    public void encode(T object, OutputStream stream) throws Exception {
        ReverseByteArrayOutputStream reverseStream = new ReverseByteArrayOutputStream();        
        super.encode(object, reverseStream);
        reverseStream.writeTo(stream);        
    }
    
    protected int encodeHeader(DecodedObject<Integer> tagValue, int contentLen, OutputStream stream) throws Exception {
        int resultSize = encodeLength(contentLen, stream);
        resultSize += encodeTag(tagValue, stream);
        return resultSize;
    }
    
    protected int encodeTag(DecodedObject<Integer> tagValue, OutputStream stream) throws Exception {
        int resultSize = tagValue.getSize();
        int value = tagValue.getValue();
        for (int i = 0 ; i < tagValue.getSize() ; i++) {
            stream.write((byte)value);
            value =  value >> 8 ;            
        }
        return resultSize;
    }
    
    protected int encodeLength(int length, OutputStream stream) throws IOException {
        int resultSize = 0;
        
        if (length < 0) {
            throw new IllegalArgumentException() ;
        }
        else 
        if (length < 65536) {
            stream.write((byte)(length)) ;
            stream.write((byte)(length >> 8));
            resultSize+=2;
        }
        else{
            throw new IllegalArgumentException() ;
        }
        return resultSize;
    }

    public int encodeChoice(Object object, OutputStream stream, 
        ElementInfo elementInfo)  throws Exception {
		int resultSize = 0;
		int sizeOfChoiceField =  super.encodeChoice ( object, stream , elementInfo );
		
		if((elementInfo.hasPreparedInfo() && elementInfo.hasPreparedASN1ElementInfo() && elementInfo.getPreparedASN1ElementInfo().hasTag())
		|| (elementInfo.getASN1ElementInfo()!=null && elementInfo.getASN1ElementInfo().hasTag() )) {
		resultSize += encodeHeader (BERCoderUtils.getTagValueForElement (elementInfo,TagClass.ContextSpecific, ElementType.Constructed, UniversalTag.LastUniversal), sizeOfChoiceField, stream );
		}        
		resultSize+= sizeOfChoiceField;
		return resultSize;
	}    

	@Override
	public int encodeAny(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0, sizeOfString = 0;
        byte[] buffer = (byte[])object;
        stream.write( buffer );
        sizeOfString = buffer.length;
        CoderUtils.checkConstraints(sizeOfString,elementInfo);
        resultSize += sizeOfString;
        resultSize += encodeLength(sizeOfString, stream);
        return resultSize;
	}


    public int encodeIntegerValue(long value, OutputStream stream) throws Exception {
        int resultSize = CoderUtils.getIntegerLength(value);
        for (int i = 0 ; i < resultSize ; i++) {
            stream.write((byte)value);
            value =  value >> 8 ;
        }
        return resultSize;
    }
	
	@Override
	public int encodeInteger(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		
        int resultSize = 0;
        int szOfInt = 0;
        if(object instanceof Integer) {
            Integer value = (Integer) object;
            CoderUtils.checkConstraints(value,elementInfo);
            szOfInt = encodeIntegerValue(value,stream);
        }
        else if(object instanceof Long) {
            Long value = (Long) object;
            CoderUtils.checkConstraints(value,elementInfo);
            szOfInt = encodeIntegerValue(value,stream);            
        }
        resultSize += szOfInt;        
        return resultSize;

	}

	@Override
	public int encodeReal(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0;
        Double value = (Double) object;
        //CoderUtils.checkConstraints(value,elementInfo);
        int szOfInt = 0;
        long asLong = Double.doubleToLongBits(value);
        if(asLong == 0x7ff0000000000000L) { // positive infinity
            stream.write(0x40); // 01000000 Value is PLUS-INFINITY
        }
        else
        if(asLong == 0xfff0000000000000L) { // negative infinity            
            stream.write(0x41); // 01000001 Value is MINUS-INFINITY
        }        
        else 
        if(asLong!=0x0) {
            long exponent = ((0x7ff0000000000000L & asLong) >> 52) - 1023 - 52;
            long mantissa = 0x000fffffffffffffL & asLong;
            mantissa |= 0x10000000000000L; // set virtual delimeter
            
            // pack mantissa for base 2
            while((mantissa & 0xFFL) == 0x0) {
                mantissa >>= 8;
                exponent += 8; //increment exponent to 8 (base 2)
            }        
            while((mantissa & 0x01L) == 0x0) {
                mantissa >>= 1;
                exponent+=1; //increment exponent to 1
            }
             
             szOfInt+= encodeIntegerValue(mantissa,stream);
             int szOfExp = CoderUtils.getIntegerLength(exponent);
             szOfInt+= encodeIntegerValue(exponent,stream);
             
             int realPreamble = 0x80;
             realPreamble |= (byte)(szOfExp - 1);
             if( (asLong & 0x8000000000000000L) == 1) {
                 realPreamble|= 0x40; // Sign
             }
             stream.write(realPreamble );
             szOfInt+=1;
        }
        resultSize += szOfInt;

        return resultSize;
	}

	@Override
	public int encodeOctetString(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0, sizeOfString = 0;
        byte[] buffer = (byte[])object;
        stream.write( buffer );
        sizeOfString = buffer.length;

        resultSize += sizeOfString;
        CoderUtils.checkConstraints(sizeOfString,elementInfo);

        return resultSize;
	}

	@Override
	public int encodeBitString(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0, sizeOfString = 0;
        BitString str = (BitString)object;
        CoderUtils.checkConstraints(str.getLengthInBits(), elementInfo);
        
        byte[] buffer = str.getValue();
        stream.write( buffer );
        sizeOfString = buffer.length;

        resultSize += sizeOfString;
        return resultSize;
	}


	@Override
	public int encodeString(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0, sizeOfString = 0;
        byte[] strBuf = CoderUtils.ASN1StringToBuffer(object, elementInfo);
        stream.write( strBuf );
        sizeOfString = strBuf.length;

        resultSize += sizeOfString;
        CoderUtils.checkConstraints(sizeOfString,elementInfo);
        return resultSize;
	}
	
    public int encodeSequence(Object object, OutputStream stream, 
        ElementInfo elementInfo) throws Exception {
		int resultSize = 0;
		Field[] fields = elementInfo.getFields(object.getClass());
		
		for ( int i = 0;i<fields.length; i++) {
		Field field  = fields [ fields.length - 1 - i];
		resultSize+= encodeSequenceField(object, fields.length - 1 - i, field,stream,elementInfo);
		}
		return resultSize;
	}
	

	@Override
	public int encodeSequenceOf(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
        int resultSize = 0;
        Object[] collection = ((java.util.Collection<Object>)object).toArray();
        int sizeOfCollection = 0;
        for(int i=0;i<collection.length;i++) {
            Object obj = collection[collection.length - 1 - i];
            ElementInfo info = new ElementInfo();
            info.setAnnotatedClass(obj.getClass());
            info.setParentAnnotated(elementInfo.getAnnotatedClass());
            if(elementInfo.hasPreparedInfo()) {
                ASN1SequenceOfMetadata seqOfMeta = (ASN1SequenceOfMetadata)elementInfo.getPreparedInfo().getTypeMetadata();
                info.setPreparedInfo( seqOfMeta.getItemClassMetadata() );
            }
            sizeOfCollection+=encodeClassType(obj,stream,info);
        }
        
        CoderUtils.checkConstraints(collection.length,elementInfo);
        resultSize += encodeLength(sizeOfCollection, stream);

        // Encoding the count 
        resultSize += encodeLength(collection.length, stream);
        
        return resultSize;
	}

	@Override
	// Enum type not supported for IEEE-20101 . So dont need it ..
	// TODO:
	public int encodeEnumItem(Object enumConstant, Class enumClass,
			OutputStream stream, ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	// Boolean type not supported for IEEE-20101 . So dont need it ..
	// TODO:
	public int encodeBoolean(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	// ObjectIdentifier type not supported for IEEE-20101 . So dont need it ..
	// TODO:
	public int encodeObjectIdentifier(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	// Null type not supported for IEEE-20101 . So dont need it ..
	// TODO:
	public int encodeNull(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
