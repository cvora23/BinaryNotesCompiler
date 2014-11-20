
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
    @ASN1Sequence ( name = "Poc_AbsoluteRange", isSet = false )
    public class Poc_AbsoluteRange implements IASN1PreparedElement {
            
        @ASN1Element ( name = "lower-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type lower_value = null;
                
  
        @ASN1Element ( name = "upper-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type upper_value = null;
                
  
        
        public FLOAT_Type getLower_value () {
            return this.lower_value;
        }

        

        public void setLower_value (FLOAT_Type value) {
            this.lower_value = value;
        }
        
  
        
        public FLOAT_Type getUpper_value () {
            return this.upper_value;
        }

        

        public void setUpper_value (FLOAT_Type value) {
            this.upper_value = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_AbsoluteRange.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            