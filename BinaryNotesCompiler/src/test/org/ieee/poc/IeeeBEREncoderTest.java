package test.org.ieee.poc;

import org.bn.IEncoder;
import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.ber.BEREncoderTest;

public class IeeeBEREncoderTest extends BEREncoderTest {

	public IeeeBEREncoderTest(String sTestName) {
		super(sTestName, new IeeeBERCoderTestUtils());		
	}

	public IeeeBEREncoderTest(String sTestName, CoderTestUtilities coderUtils) {
		super(sTestName, coderUtils);
		// TODO Auto-generated constructor stub
	}
	    
    public void testEncodeInt16() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testEncodeInt16 test",encoder, ((IeeeBERCoderTestUtils) coderTestUtils).createTestInt16());            
        checkEncoded(encoder, ((IeeeBERCoderTestUtils) coderTestUtils).createTestInt16(), ((IeeeBERCoderTestUtils) coderTestUtils).createTestInt16Bytes());
    }

}
