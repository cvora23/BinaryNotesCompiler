package test.org.ieee.poc;

import ieee.poc.INT_I16;
import test.org.bn.coders.ber.BERCoderTestUtils;

public class IeeeBERCoderTestUtils extends BERCoderTestUtils {

	public IeeeBERCoderTestUtils() {
		// TODO Auto-generated constructor stub
	}
	
    public INT_I16 createTestInt16() {
    	INT_I16 result = new INT_I16();
        //result.setValue(new BitString(new byte[] {(byte)0xAA,(byte)0xB0} , 4 ));
        result.setValue(15000);
        return result;
    }    

    public byte[] createTestInt16Bytes() {
        return new byte[] { 0x02,0x02,0x3A,(byte) 0x98};
    }
    
}
