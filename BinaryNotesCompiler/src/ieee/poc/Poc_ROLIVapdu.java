
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
    @ASN1Sequence ( name = "Poc_ROLIVapdu", isSet = false )
    public class Poc_ROLIVapdu implements IASN1PreparedElement {
            
        @ASN1Element ( name = "invokeID", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private InvokeIDType invokeID = null;
                
  
        @ASN1Element ( name = "linkedID", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private InvokeIDType linkedID = null;
                
  
        @ASN1Element ( name = "operation-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_OPERATION operation_value = null;
                
  @ASN1Any( name = "" )
    
        @ASN1Element ( name = "argument", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] argument = null;
                
  
        
        public InvokeIDType getInvokeID () {
            return this.invokeID;
        }

        

        public void setInvokeID (InvokeIDType value) {
            this.invokeID = value;
        }
        
  
        
        public InvokeIDType getLinkedID () {
            return this.linkedID;
        }

        

        public void setLinkedID (InvokeIDType value) {
            this.linkedID = value;
        }
        
  
        
        public Poc_OPERATION getOperation_value () {
            return this.operation_value;
        }

        

        public void setOperation_value (Poc_OPERATION value) {
            this.operation_value = value;
        }
        
  
        
        public byte[] getArgument () {
            return this.argument;
        }

        

        public void setArgument (byte[] value) {
            this.argument = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ROLIVapdu.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            