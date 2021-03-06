
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
    @ASN1Sequence ( name = "Poc_DsaRangeSpec", isSet = false )
    public class Poc_DsaRangeSpec implements IASN1PreparedElement {
            
        @ASN1Element ( name = "first-element-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type first_element_value = null;
                
  
        @ASN1Element ( name = "last-element-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type last_element_value = null;
                
  
        
        public FLOAT_Type getFirst_element_value () {
            return this.first_element_value;
        }

        

        public void setFirst_element_value (FLOAT_Type value) {
            this.first_element_value = value;
        }
        
  
        
        public FLOAT_Type getLast_element_value () {
            return this.last_element_value;
        }

        

        public void setLast_element_value (FLOAT_Type value) {
            this.last_element_value = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_DsaRangeSpec.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            