package ieee.poc.coders.mder;

import java.io.OutputStream;

import org.bn.coders.CoderUtils;
import org.bn.coders.ElementInfo;
import org.bn.coders.ElementType;
import org.bn.coders.Encoder;
import org.bn.coders.TagClass;
import org.bn.coders.UniversalTag;
import org.bn.coders.ber.BERCoderUtils;
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
	
	@Override
	public int encodeEnumItem(Object enumConstant, Class enumClass,
			OutputStream stream, ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeBoolean(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeAny(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeNull(Object object, OutputStream stream,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
	public int encodeReal(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeOctetString(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeBitString(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeObjectIdentifier(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeString(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encodeSequenceOf(Object object, OutputStream steam,
			ElementInfo elementInfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
