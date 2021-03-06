
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
    @ASN1Sequence ( name = "Poc_OperationInvokeResult", isSet = false )
    public class Poc_OperationInvokeResult implements IASN1PreparedElement {
            
        @ASN1Element ( name = "invoke-cookie", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 invoke_cookie = null;
                
  
        @ASN1Element ( name = "result", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_OpInvResult result = null;
                
  
        
        public INT_U32 getInvoke_cookie () {
            return this.invoke_cookie;
        }

        

        public void setInvoke_cookie (INT_U32 value) {
            this.invoke_cookie = value;
        }
        
  
        
        public Poc_OpInvResult getResult () {
            return this.result;
        }

        

        public void setResult (Poc_OpInvResult value) {
            this.result = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_OperationInvokeResult.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            