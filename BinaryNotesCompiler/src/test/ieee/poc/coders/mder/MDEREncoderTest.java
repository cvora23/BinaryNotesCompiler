package test.ieee.poc.coders.mder;

import org.bn.CoderFactory;
import org.bn.IEncoder;

import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.EncoderTest;

public class MDEREncoderTest extends EncoderTest {
    protected CoderFactory coderFactory = new CoderFactory();

	public MDEREncoderTest(String sTestName) {
		super(sTestName, new MDERCoderTestUtils());		
	}

	public MDEREncoderTest(String sTestName, CoderTestUtilities coderUtils) {
		super(sTestName, coderUtils);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void testEncodeBitString() throws Exception {
        IEncoder encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("TestBitStr test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBitStr());            
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBitStr(), ((MDERCoderTestUtils) coderTestUtils).createTestBitStrBytes());
        printEncoded("Test Bits-8 test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit8Str());
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit8Str(), ((MDERCoderTestUtils) coderTestUtils).createTestBit8StrBytes());
        printEncoded("Test Bits-16 test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit16Str());
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit16Str(), ((MDERCoderTestUtils) coderTestUtils).createTestBit16StrBytes());
        printEncoded("Test Bits-32 test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit32Str());
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestBit32Str(), ((MDERCoderTestUtils) coderTestUtils).createTestBit32StrBytes());
    }
	    
    public void testEncodeInt16() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testEncodeInt16 test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestInt16());            
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestInt16(), ((MDERCoderTestUtils) coderTestUtils).createTestInt16Bytes());
    }
    
    @Override
    public void testEncodeString() throws Exception {
        IEncoder encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("TestPRN",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestPRN());
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestPRN(), ((MDERCoderTestUtils) coderTestUtils).createTestPRNBytes());
        
        printEncoded("TestOCT",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestOCT());
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestOCT(), ((MDERCoderTestUtils) coderTestUtils).createTestOCTBytes());        
    }


	@Override
	protected <T> IEncoder<T> newEncoder() throws Exception {
        return coderFactory.newEncoder("MDER");
	}

}
