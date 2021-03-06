
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
    @ASN1Sequence ( name = "Poc_CmplxObsValue", isSet = false )
    public class Poc_CmplxObsValue implements IASN1PreparedElement {
            
        @ASN1Element ( name = "cm-obs-cnt", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 cm_obs_cnt = null;
                
  
        @ASN1Element ( name = "cm-obs-flags", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_CmplxFlags cm_obs_flags = null;
                
  
        @ASN1Element ( name = "cm-obs-elem-list", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_CmplxObsElemList cm_obs_elem_list = null;
                
  
        
        public INT_U8 getCm_obs_cnt () {
            return this.cm_obs_cnt;
        }

        

        public void setCm_obs_cnt (INT_U8 value) {
            this.cm_obs_cnt = value;
        }
        
  
        
        public Poc_CmplxFlags getCm_obs_flags () {
            return this.cm_obs_flags;
        }

        

        public void setCm_obs_flags (Poc_CmplxFlags value) {
            this.cm_obs_flags = value;
        }
        
  
        
        public Poc_CmplxObsElemList getCm_obs_elem_list () {
            return this.cm_obs_elem_list;
        }

        

        public void setCm_obs_elem_list (Poc_CmplxObsElemList value) {
            this.cm_obs_elem_list = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CmplxObsValue.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            