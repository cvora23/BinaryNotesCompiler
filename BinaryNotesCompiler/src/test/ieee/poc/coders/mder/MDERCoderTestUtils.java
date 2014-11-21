package test.ieee.poc.coders.mder;

import ieee.poc.INT_I16;
import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.ber.BERCoderTestUtils;

public class MDERCoderTestUtils extends CoderTestUtilities {

	public MDERCoderTestUtils() {
		// TODO Auto-generated constructor stub
	}
	
    public INT_I16 createTestInt16() {
    	INT_I16 result = new INT_I16();
        result.setValue(15000);
        return result;
    }    

    public byte[] createTestInt16Bytes() {
        return new byte[] {0x3A,(byte) 0x98};
    }

	@Override
	public byte[] createNullSeqBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTaggedNullSeqBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createEnumBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createITUSeqBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataSeqBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataSeqMOBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createSequenceWithEnumBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestIntegerRBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestInteger1Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestInteger2_12Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestInteger2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestInteger3Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestInteger4Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createSeqWithNullBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestRecursiveDefinitionBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createUnboundedTestIntegerBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestPRNBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestOCTBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataChoiceTestOCTBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataChoiceSimpleTypeBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataChoiceBooleanBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataChoiceIntBndBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createDataChoicePlainBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createStringArrayBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createUTF8StringArrayBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestNIBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestNI2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createSetBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestBitStrBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestBitStrSmallBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestBitStrBndBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createUnicodeStrBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestSequenceV12Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createChoiceInChoiceBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createChoiceInChoice2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createChoiceInChoice3Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTaggedSeqInSeqBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestReal0_5Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestReal1_5Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestReal2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestRealBigBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestLongTagBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestLongTag2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestOID1Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestOID2Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestOID3Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTestOID4Bytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTaggedSetBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createTaggedSetInSetBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] createSet7Bytes() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
