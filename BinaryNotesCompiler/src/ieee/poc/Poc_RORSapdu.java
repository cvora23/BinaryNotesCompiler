
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
    @ASN1Sequence ( name = "Poc_RORSapdu", isSet = false )
    public class Poc_RORSapdu implements IASN1PreparedElement {
            
        @ASN1Element ( name = "invokeID", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private InvokeIDType invokeID = null;
                
  
        @ASN1Element ( name = "operation-result", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_operation_result operation_result = null;
                
  
        
        public InvokeIDType getInvokeID () {
            return this.invokeID;
        }

        

        public void setInvokeID (InvokeIDType value) {
            this.invokeID = value;
        }
        
  
        
        public Poc_operation_result getOperation_result () {
            return this.operation_result;
        }

        

        public void setOperation_result (Poc_operation_result value) {
            this.operation_result = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_RORSapdu.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            