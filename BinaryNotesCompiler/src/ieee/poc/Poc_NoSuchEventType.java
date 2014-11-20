
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
    @ASN1Sequence ( name = "Poc_NoSuchEventType", isSet = false )
    public class Poc_NoSuchEventType implements IASN1PreparedElement {
            
        @ASN1Element ( name = "managedObjectClass", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type managedObjectClass = null;
                
  
        @ASN1Element ( name = "eventType", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type eventType = null;
                
  
        
        public OID_Type getManagedObjectClass () {
            return this.managedObjectClass;
        }

        

        public void setManagedObjectClass (OID_Type value) {
            this.managedObjectClass = value;
        }
        
  
        
        public OID_Type getEventType () {
            return this.eventType;
        }

        

        public void setEventType (OID_Type value) {
            this.eventType = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_NoSuchEventType.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            