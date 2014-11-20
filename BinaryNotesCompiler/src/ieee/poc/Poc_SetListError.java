
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
    @ASN1Sequence ( name = "Poc_SetListError", isSet = false )
    public class Poc_SetListError implements IASN1PreparedElement {
            
        @ASN1Element ( name = "managedObject", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_ManagedObjectId managedObject = null;
                
  
@ASN1SequenceOf( name = "setInfoList", isSetOf = false ) 

    
        @ASN1Element ( name = "setInfoList", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<Poc_SetError>  setInfoList = null;
                
  
        
        public Poc_ManagedObjectId getManagedObject () {
            return this.managedObject;
        }

        

        public void setManagedObject (Poc_ManagedObjectId value) {
            this.managedObject = value;
        }
        
  
        
        public java.util.Collection<Poc_SetError>  getSetInfoList () {
            return this.setInfoList;
        }

        

        public void setSetInfoList (java.util.Collection<Poc_SetError>  value) {
            this.setInfoList = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SetListError.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            