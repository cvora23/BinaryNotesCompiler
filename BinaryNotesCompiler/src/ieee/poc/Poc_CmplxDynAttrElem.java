
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
    @ASN1Sequence ( name = "Poc_CmplxDynAttrElem", isSet = false )
    public class Poc_CmplxDynAttrElem implements IASN1PreparedElement {
            
        @ASN1Element ( name = "cm-elem-idx-1", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 cm_elem_idx_1 = null;
                
  
        @ASN1Element ( name = "cm-elem-idx-2", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 cm_elem_idx_2 = null;
                
  
        @ASN1Element ( name = "attributes", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private AttributeList attributes = null;
                
  
        
        public INT_U8 getCm_elem_idx_1 () {
            return this.cm_elem_idx_1;
        }

        

        public void setCm_elem_idx_1 (INT_U8 value) {
            this.cm_elem_idx_1 = value;
        }
        
  
        
        public INT_U8 getCm_elem_idx_2 () {
            return this.cm_elem_idx_2;
        }

        

        public void setCm_elem_idx_2 (INT_U8 value) {
            this.cm_elem_idx_2 = value;
        }
        
  
        
        public AttributeList getAttributes () {
            return this.attributes;
        }

        

        public void setAttributes (AttributeList value) {
            this.attributes = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CmplxDynAttrElem.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            