package test.ieee.poc.coders.mder;

import org.bn.CoderFactory;
import org.bn.IEncoder;

import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.EncoderTest;
import test.org.bn.coders.ber.BEREncoderTest;

public class MDEREncoderTest extends EncoderTest {
    protected CoderFactory coderFactory = new CoderFactory();

	public MDEREncoderTest(String sTestName) {
		super(sTestName, new MDERCoderTestUtils());		
	}

	public MDEREncoderTest(String sTestName, CoderTestUtilities coderUtils) {
		super(sTestName, coderUtils);
		// TODO Auto-generated constructor stub
	}
	    
    public void testEncodeInt16() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testEncodeInt16 test",encoder, ((MDERCoderTestUtils) coderTestUtils).createTestInt16());            
        checkEncoded(encoder, ((MDERCoderTestUtils) coderTestUtils).createTestInt16(), ((MDERCoderTestUtils) coderTestUtils).createTestInt16Bytes());
    }

	@Override
	protected <T> IEncoder<T> newEncoder() throws Exception {
        return coderFactory.newEncoder("MDER");
	}

}
