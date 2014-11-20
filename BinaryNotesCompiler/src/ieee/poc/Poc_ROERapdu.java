
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
    @ASN1Sequence ( name = "Poc_ROERapdu", isSet = false )
    public class Poc_ROERapdu implements IASN1PreparedElement {
            
        @ASN1Element ( name = "invokeID", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private InvokeIDType invokeID = null;
                
  
        @ASN1Element ( name = "error-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_ERROR error_value = null;
                
  @ASN1Any( name = "" )
    
        @ASN1Element ( name = "parameter", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] parameter = null;
                
  
        
        public InvokeIDType getInvokeID () {
            return this.invokeID;
        }

        

        public void setInvokeID (InvokeIDType value) {
            this.invokeID = value;
        }
        
  
        
        public Poc_ERROR getError_value () {
            return this.error_value;
        }

        

        public void setError_value (Poc_ERROR value) {
            this.error_value = value;
        }
        
  
        
        public byte[] getParameter () {
            return this.parameter;
        }

        

        public void setParameter (byte[] value) {
            this.parameter = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ROERapdu.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            