
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
    @ASN1Sequence ( name = "AttributeModEntry", isSet = false )
    public class AttributeModEntry implements IASN1PreparedElement {
            
        @ASN1Element ( name = "modify-operator", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private ModifyOperator modify_operator = null;
                
  
        @ASN1Element ( name = "attribute", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private AVA_Type attribute = null;
                
  
        
        public ModifyOperator getModify_operator () {
            return this.modify_operator;
        }

        

        public void setModify_operator (ModifyOperator value) {
            this.modify_operator = value;
        }
        
  
        
        public AVA_Type getAttribute () {
            return this.attribute;
        }

        

        public void setAttribute (AVA_Type value) {
            this.attribute = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AttributeModEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            