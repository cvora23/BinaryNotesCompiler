
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
    @ASN1Sequence ( name = "Poc_OperationInvoke", isSet = false )
    public class Poc_OperationInvoke implements IASN1PreparedElement {
            
        @ASN1Element ( name = "checksum", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_I16 checksum = null;
                
  
        @ASN1Element ( name = "invoke-cookie", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 invoke_cookie = null;
                
  
        @ASN1Element ( name = "op-elem-list", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_OpInvokeList op_elem_list = null;
                
  
        
        public INT_I16 getChecksum () {
            return this.checksum;
        }

        

        public void setChecksum (INT_I16 value) {
            this.checksum = value;
        }
        
  
        
        public INT_U32 getInvoke_cookie () {
            return this.invoke_cookie;
        }

        

        public void setInvoke_cookie (INT_U32 value) {
            this.invoke_cookie = value;
        }
        
  
        
        public Poc_OpInvokeList getOp_elem_list () {
            return this.op_elem_list;
        }

        

        public void setOp_elem_list (Poc_OpInvokeList value) {
            this.op_elem_list = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_OperationInvoke.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            