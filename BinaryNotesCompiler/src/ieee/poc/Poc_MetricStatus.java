
package ieee.poc;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "Poc_MetricStatus" )
    public class Poc_MetricStatus implements IASN1PreparedElement {
    
            @ASN1BitString( name = "Poc-MetricStatus" )
            
            @ASN1SizeConstraint ( max = 16L )
        
            private BitString value = null;
            
            public Poc_MetricStatus() {
            }

            public Poc_MetricStatus(BitString value) {
                this.value = value;
            }
            
            public void setValue(BitString value) {
                this.value = value;
            }
            
            public BitString getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MetricStatus.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

    }
            