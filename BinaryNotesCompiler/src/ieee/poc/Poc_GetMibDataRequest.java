
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
    @ASN1Sequence ( name = "Poc_GetMibDataRequest", isSet = false )
    public class Poc_GetMibDataRequest implements IASN1PreparedElement {
            
        @ASN1Element ( name = "dif-index", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U16 dif_index = null;
                
  
        @ASN1Element ( name = "mib-id-list", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_MibIdList mib_id_list = null;
                
  
        
        public INT_U16 getDif_index () {
            return this.dif_index;
        }

        

        public void setDif_index (INT_U16 value) {
            this.dif_index = value;
        }
        
  
        
        public Poc_MibIdList getMib_id_list () {
            return this.mib_id_list;
        }

        

        public void setMib_id_list (Poc_MibIdList value) {
            this.mib_id_list = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_GetMibDataRequest.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            