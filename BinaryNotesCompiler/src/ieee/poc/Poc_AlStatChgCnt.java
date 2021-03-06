
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
    @ASN1Sequence ( name = "Poc_AlStatChgCnt", isSet = false )
    public class Poc_AlStatChgCnt implements IASN1PreparedElement {
            
        @ASN1Element ( name = "al-new-chg-cnt", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 al_new_chg_cnt = null;
                
  
        @ASN1Element ( name = "al-stack-chg-cnt", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 al_stack_chg_cnt = null;
                
  
        
        public INT_U8 getAl_new_chg_cnt () {
            return this.al_new_chg_cnt;
        }

        

        public void setAl_new_chg_cnt (INT_U8 value) {
            this.al_new_chg_cnt = value;
        }
        
  
        
        public INT_U8 getAl_stack_chg_cnt () {
            return this.al_stack_chg_cnt;
        }

        

        public void setAl_stack_chg_cnt (INT_U8 value) {
            this.al_stack_chg_cnt = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_AlStatChgCnt.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            