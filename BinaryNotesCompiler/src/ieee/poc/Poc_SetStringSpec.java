
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
    @ASN1Sequence ( name = "Poc_SetStringSpec", isSet = false )
    public class Poc_SetStringSpec implements IASN1PreparedElement {
            
        @ASN1Element ( name = "max-str-len", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U16 max_str_len = null;
                
  
        @ASN1Element ( name = "char-size", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U16 char_size = null;
                
  
        @ASN1Element ( name = "set-str-opt", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_SetStrOpt set_str_opt = null;
                
  
        
        public INT_U16 getMax_str_len () {
            return this.max_str_len;
        }

        

        public void setMax_str_len (INT_U16 value) {
            this.max_str_len = value;
        }
        
  
        
        public INT_U16 getChar_size () {
            return this.char_size;
        }

        

        public void setChar_size (INT_U16 value) {
            this.char_size = value;
        }
        
  
        
        public Poc_SetStrOpt getSet_str_opt () {
            return this.set_str_opt;
        }

        

        public void setSet_str_opt (Poc_SetStrOpt value) {
            this.set_str_opt = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SetStringSpec.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            