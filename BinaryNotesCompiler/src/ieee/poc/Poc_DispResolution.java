
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
    @ASN1Sequence ( name = "Poc_DispResolution", isSet = false )
    public class Poc_DispResolution implements IASN1PreparedElement {
            
        @ASN1Element ( name = "pre-point", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 pre_point = null;
                
  
        @ASN1Element ( name = "post-point", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 post_point = null;
                
  
        
        public INT_U8 getPre_point () {
            return this.pre_point;
        }

        

        public void setPre_point (INT_U8 value) {
            this.pre_point = value;
        }
        
  
        
        public INT_U8 getPost_point () {
            return this.post_point;
        }

        

        public void setPost_point (INT_U8 value) {
            this.post_point = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_DispResolution.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            