
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
    @ASN1BoxedType ( name = "INT_U8" )
    public class INT_U8 implements IASN1PreparedElement {
    
            @ASN1Integer( name = "INT-U8" )
            @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 255L 
		
	   )
	   
            private Integer value;
            
            public INT_U8() {
            }

            public INT_U8(Integer value) {
                this.value = value;
            }
            
            public void setValue(Integer value) {
                this.value = value;
            }
            
            public Integer getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(INT_U8.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            