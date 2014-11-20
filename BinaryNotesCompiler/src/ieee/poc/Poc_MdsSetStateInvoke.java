
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
    @ASN1Sequence ( name = "Poc_MdsSetStateInvoke", isSet = false )
    public class Poc_MdsSetStateInvoke implements IASN1PreparedElement {
            
        @ASN1Element ( name = "new-state", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_MDSStatus new_state = null;
                
  
        @ASN1Element ( name = "authorization", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 authorization = null;
                
  
        
        public Poc_MDSStatus getNew_state () {
            return this.new_state;
        }

        

        public void setNew_state (Poc_MDSStatus value) {
            this.new_state = value;
        }
        
  
        
        public INT_U32 getAuthorization () {
            return this.authorization;
        }

        

        public void setAuthorization (INT_U32 value) {
            this.authorization = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MdsSetStateInvoke.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            