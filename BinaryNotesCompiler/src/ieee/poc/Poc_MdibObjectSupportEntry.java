
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
    @ASN1Sequence ( name = "Poc_MdibObjectSupportEntry", isSet = false )
    public class Poc_MdibObjectSupportEntry implements IASN1PreparedElement {
            
        @ASN1Element ( name = "object-type", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private TYPE object_type = null;
                
  
        @ASN1Element ( name = "max-inst", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 max_inst = null;
                
  
        
        public TYPE getObject_type () {
            return this.object_type;
        }

        

        public void setObject_type (TYPE value) {
            this.object_type = value;
        }
        
  
        
        public INT_U32 getMax_inst () {
            return this.max_inst;
        }

        

        public void setMax_inst (INT_U32 value) {
            this.max_inst = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MdibObjectSupportEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            