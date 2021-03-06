
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
    @ASN1Sequence ( name = "Poc_ROLIV_Invoke_ID", isSet = false )
    public class Poc_ROLIV_Invoke_ID implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "state", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Long state = null;
                
  
        @ASN1Element ( name = "count", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 count = null;
                
  
        
        public Long getState () {
            return this.state;
        }

        

        public void setState (Long value) {
            this.state = value;
        }
        
  
        
        public INT_U8 getCount () {
            return this.count;
        }

        

        public void setCount (INT_U8 value) {
            this.count = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ROLIV_Invoke_ID.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            