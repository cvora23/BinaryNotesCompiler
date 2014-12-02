package test.ieee.poc.coders.poc;

import org.bn.CoderFactory;
import org.bn.IEncoder;

import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.EncoderTest;

public class PocTest extends EncoderTest{
    protected CoderFactory coderFactory = new CoderFactory();

	public PocTest(String sTestName, CoderTestUtilities coderUtils) {
		// TODO Auto-generated constructor stub
		super(sTestName, coderUtils);
	}
	
	public PocTest(String sTestName) {
		super(sTestName, new POCCoderTestUtils());		
	}

    public void testEncodeInt16() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testEncodeInt16 test",encoder, ((POCCoderTestUtils) coderTestUtils).createTestInt16());            
        checkEncoded(encoder, ((POCCoderTestUtils) coderTestUtils).createTestInt16(), ((POCCoderTestUtils) coderTestUtils).createTestInt16Bytes());
    }
    
    public void testAarq() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testAarq test",encoder, ((POCCoderTestUtils) coderTestUtils).createTestAarq());            
    }

    public void testDataProto() throws Exception {
        IEncoder  encoder = newEncoder();
        assertNotNull(encoder);
        printEncoded("testDataProto test",encoder, ((POCCoderTestUtils) coderTestUtils).createDataProto());            
    }
    
	
	@Override
	protected <T> IEncoder<T> newEncoder() throws Exception {
		// TODO Auto-generated method stub
        return coderFactory.newEncoder("MDER");
	}

}
