
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
    @ASN1Sequence ( name = "Poc_PatDemogOptPackAgt", isSet = false )
    public class Poc_PatDemogOptPackAgt implements IASN1PreparedElement {
            @ASN1BitString( name = "" )
    
            @ASN1SizeConstraint ( max = 32L )
        
        @ASN1Element ( name = "pat-demog-options", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private BitString pat_demog_options = null;
                
  
        @ASN1Element ( name = "max-storage-size", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 max_storage_size = null;
                
  
        
        public BitString getPat_demog_options () {
            return this.pat_demog_options;
        }

        

        public void setPat_demog_options (BitString value) {
            this.pat_demog_options = value;
        }
        
  
        
        public INT_U32 getMax_storage_size () {
            return this.max_storage_size;
        }

        

        public void setMax_storage_size (INT_U32 value) {
            this.max_storage_size = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_PatDemogOptPackAgt.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            