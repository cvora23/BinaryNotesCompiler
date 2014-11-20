/*
 Copyright 2006-2011 Abdulla Abdurakhmanov (abdulla@latestbit.com)
 Original sources are available at www.latestbit.com

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package test.org.bn.coders.per;

import test.org.bn.coders.CoderTestUtilities;

public class PERAlignedCoderTestUtils extends CoderTestUtilities {
    public byte[] createNullSeqBytes() {
        return new byte[0];
    }

    public byte[] createTaggedNullSeqBytes() {
        return new byte[0];
    }

    public byte[] createEnumBytes() {
        return new byte[] { 0x20 };
    }

    public byte[] createITUSeqBytes() {
        return new byte[] { (byte)0x80, 0x05,0x61,0x61,0x61,0x61,0x61,0x05,0x62,0x62,0x62,
        0x62,0x62,0x05,0x63,0x63,0x63,0x63,0x63,0x05,0x63,0x63,0x63,0x63,0x63,
        0x05,0x63,0x63,0x63,0x63,0x63,0x05,0x64,0x64,
        0x64,0x64,0x64,0x05,0x65,0x65,0x65,0x65,0x65};
    }

    public byte[] createDataSeqBytes() {
        return new byte[] {
            0x40,0x00,0x00,0x07,0x61,0x61,0x61,0x61,0x61,0x61,0x61,0x01, (byte)0xBA, 
            0x00,0x01,0x00,0x44,0x02,0x06,0x62,0x62,0x62,0x62,0x62,0x62,0x05,0x63,
            0x63,0x63,0x63,0x63,0x01,0x00,0x07,0x65,0x65,0x65,0x65,0x65,0x65,0x65, (byte)0xFF };
    }

    public byte[] createSequenceWithEnumBytes() {
        return new byte[] { 0x05,0x61,0x61,0x61,0x61,0x61,0x20,0x20 } ;
    }

    public byte[] createTestInteger1Bytes() {
        return new byte[] { 0x0F };
    }

    public byte[] createTestInteger2Bytes() {
        return new byte[] { (byte)0x0F, (byte)0xF0 };
    }

    public byte[] createTestInteger3Bytes() {
        return new byte[] { (byte)0xFF, (byte)0xF0 };
    }

    public byte[] createTestInteger4Bytes() {
        return new byte[] {
            (byte)0x60,0x00,(byte)0xF0,(byte)0xF0,(byte)0xF0
        };
    }

    public byte[] createSeqWithNullBytes() {
        return new byte[] { 0x03,0x73,0x73,0x73,0x03,0x64,0x64,0x64 } ;
    }

    public byte[] createTestRecursiveDefinitionBytes() {
        return new byte[] { (byte)0x80, 0x05,0x61,0x61,0x61,0x61,0x61,0x00,0x05,0x62,0x62,0x62,0x62,0x62 };
    }

    public byte[] createUnboundedTestIntegerBytes() {
        return new byte[] {
            0x04,0x00,(byte)0xFA,(byte)0xFB,(byte)0xFC
        };
    }

    public byte[] createTestIntegerRBytes() {
        return new byte[] { 0x40 };
    }

    public byte[] createTestInteger2_12Bytes() {
        return new byte[] { 0x1F, (byte)0xF1 };
    }

    public byte[] createTestPRNBytes() {
        return new byte[] {0x05, 0x48, 0x65, 0x6C, 0x6C, 0x6F};
    }

    public byte[] createTestOCTBytes() {
        return new byte[] {0x05,0x01,0x02, (byte)0xFF, 0x03, 0x04};
    }

    public byte[] createDataSeqMOBytes() {
        return new byte[] {0x7F,0x01,0x40,0x00,0x00,0x07,0x61,0x61,0x61,0x61,
        0x61,0x61,0x61,0x01, (byte)0xAB, (byte)0x80, 
                0x01,0x00,0x00,0x02,0x06,0x62,0x62,0x62,
        0x62,0x62,0x62,0x05,0x63,0x63,0x63,0x63,0x63,0x02,0x00,0x07,0x65,0x65,
        0x65,0x65,0x65,0x65,0x65,0x00,0x04,0x66,0x66,0x66,0x66, (byte)0xAA, 
        0x01,0x60,0x04,0x64,0x64,0x64,0x64};
    }

    public byte[] createDataChoiceTestOCTBytes() {
        return new byte[] {0x40,0x01, (byte)0xFF };
    }

    public byte[] createDataChoiceSimpleTypeBytes() {
        return new byte[] {0x60,0x07,0x61,0x61,0x61,0x61,0x61,0x61,0x61};
    }

    public byte[] createDataChoiceBooleanBytes() {
        return new byte[] { (byte)0xB0 };
    }

    public byte[] createDataChoiceIntBndBytes() {
        return new byte[] { (byte)0xE0, 0x07};
    }

    public byte[] createDataChoicePlainBytes() {
        return new byte[] {0x00,0x06,0x62,0x62,0x62,0x62,0x62,0x62};
    }

    public byte[] createStringArrayBytes() {
        return new byte[] { 0x02,0x06,0x62,0x62,0x62,0x62,0x62,0x62,0x05,0x63,0x63,0x63,0x63,0x63};
    }

    public byte[] createTestNIBytes() {
        return new byte[] {0x00,0x78};
    }

    public byte[] createTestNI2Bytes() {
        return new byte[] {0x00,0x30};
    }

    public byte[] createSetBytes() {
        return new byte[] { (byte)0x80, 0x04,0x61,0x61,0x61,0x61,0x02,0x00, (byte)0xAA, 0x04,0x62,0x62,0x62,0x62 };
    }

    public byte[] createTestBitStrBytes() {
        return new byte[] { 0x24, (byte)0xAA, (byte)0xBB, (byte)0xCC, (byte)0xDD, (byte)0xF0 };
    }

    public byte[] createTestBitStrSmallBytes() {
        return new byte[] { 0x0C, (byte)0xAA, (byte)0xB0 };
    }

    public byte[] createUnicodeStrBytes() {
        return new byte[] { 0x06, (byte)0xD1, (byte)0xA5, (byte)0xD1, (byte)0xA4, (byte)0xD1, (byte)0xA6 } ;
    }

    public byte[] createTestSequenceV12Bytes() {
        return new byte[] { (byte)0xB0, 0x03,0x61,0x62,0x61, (byte)0xC0, 
                0x63,0x63,0x63,0x63,0x06,0x64,0x64,0x64,0x64,0x64,0x64,0x20,0x04,0x61,0x61,0x61,0x61,0x03,0x62,0x62,0x62,0x0F, (byte)0x99, (byte)0x80, 
                0x0C, (byte)0xF0, 0x30, (byte)0xA0, 
                0x0A,0x0B,0x0C,0x0D };
    }

    public byte[] createTestBitStrBndBytes() {
        return new byte[] {0x30, (byte)0xF0 };
    }

    public byte[] createChoiceInChoiceBytes() {
        return new byte[] { 0x00, (byte)0x80, 0x01,0x05};
    }

    public byte[] createTaggedSeqInSeqBytes() {
        return new byte[] {  0x04,0x61,0x61,0x61,0x61,0x04,0x62,0x62,0x62,0x62 };
    }

    public byte[] createTestReal0_5Bytes() {
        return new byte[] { 0x03, (byte)0x80, (byte)0xFF, 0x01};
    }

    public byte[] createTestReal1_5Bytes() {
        return new byte[] { 0x03, (byte)0x80, (byte)0xFF, 0x03};
    }

    public byte[] createTestReal2Bytes() {
        return new byte[] { 0x03, (byte)0x80, (byte)0x01, 0x01};
    }

    public byte[] createTestRealBigBytes() {
        return new byte[] { 0x05, (byte)0x80, (byte)0xFD, 0x18, 0x6D, 0x21};
    }

    public byte[] createChoiceInChoice2Bytes() {
        return new byte[] { 0x01,0x00, (byte)0x80, 0x01,0x05 };
    }

    public byte[] createChoiceInChoice3Bytes() {
        return new byte[] { 0x02, (byte)0x80, 0x00,0x01,0x00, (byte)0x80, 
                0x00,0x01,0x64};
    }

    public byte[] createTestLongTagBytes() {
        return new byte[] { 0x02,0x00, (byte)0xAA };
    }
    
    public byte[] createTestLongTag2Bytes() {
        return new byte[] { 0x03 ,0x00, (byte)0xFE, (byte)0xED };
    }

    public byte[] createUTF8StringArrayBytes() {
        return new byte[] { 0x02,0x06,0x62,0x62,0x62,0x62,0x62,0x62,0x05,0x63,0x63,0x63,0x63,0x63 };
    }

    public byte[] createTestOID1Bytes()
    {
        return new byte[] { 0x03, 0x55, 0x04, 0x06 };
    }

    public byte[] createTestOID2Bytes()
    {
        return new byte[] { 0x09, 0x2A, (byte)0x86, 0x48, (byte)0x86, (byte)0xF7, 
                0x0D, 0x01, 0x01, 0x05 };
    }

    public byte[] createTestOID3Bytes()
    {
        return new byte[] { 0x04, 0x28, (byte)0xC2, 0x7B, 0x02 };
    }

    public byte[] createTestOID4Bytes()
    {
        return new byte[] { 0x04, 0x67, 0x2A, 0x03, 0x00 };
    }

	@Override
	public byte[] createTaggedSetBytes() {
		return new byte[] { 0x01,(byte) 0xC0,0x02,0x00,(byte) 0xAA,0x02,0x00,(byte) 0xBB,0x02,0x00,(byte) 0xCC };
	}
    

	@Override
	public byte[] createTaggedSetInSetBytes() {
		return new byte[] { 0x01,(byte) 0xC0,0x02,0x00,(byte) 0xAA,0x02,0x00,(byte) 0xBB,0x02,0x00,(byte) 0xCC,0x01,(byte) 0xC0,0x02,0x00,(byte) 0xAA,0x02,0x00,(byte) 0xBB,0x02,0x00,(byte) 0xCC } ;
	}

	@Override
	public byte[] createSet7Bytes() {
		return new byte[] { 0x01,0x01,0x01,0x44,0x01,0x01,0x01,0x44 };
	}
    
}
