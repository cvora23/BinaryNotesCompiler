
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
    @ASN1Sequence ( name = "Poc_CurrentRange", isSet = false )
    public class Poc_CurrentRange implements IASN1PreparedElement {
            
        @ASN1Element ( name = "lower", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type lower = null;
                
  
        @ASN1Element ( name = "upper", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type upper = null;
                
  
        
        public FLOAT_Type getLower () {
            return this.lower;
        }

        

        public void setLower (FLOAT_Type value) {
            this.lower = value;
        }
        
  
        
        public FLOAT_Type getUpper () {
            return this.upper;
        }

        

        public void setUpper (FLOAT_Type value) {
            this.upper = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CurrentRange.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            