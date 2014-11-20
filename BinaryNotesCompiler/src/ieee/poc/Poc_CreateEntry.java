
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
    @ASN1Sequence ( name = "Poc_CreateEntry", isSet = false )
    public class Poc_CreateEntry implements IASN1PreparedElement {
            
        @ASN1Element ( name = "superior-object", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_ManagedObjectId superior_object = null;
                
  
@ASN1SequenceOf( name = "created-object", isSetOf = false ) 

    
        @ASN1Element ( name = "created-object", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<Poc_CreatedObject>  created_object = null;
                
  
        
        public Poc_ManagedObjectId getSuperior_object () {
            return this.superior_object;
        }

        

        public void setSuperior_object (Poc_ManagedObjectId value) {
            this.superior_object = value;
        }
        
  
        
        public java.util.Collection<Poc_CreatedObject>  getCreated_object () {
            return this.created_object;
        }

        

        public void setCreated_object (java.util.Collection<Poc_CreatedObject>  value) {
            this.created_object = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CreateEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            