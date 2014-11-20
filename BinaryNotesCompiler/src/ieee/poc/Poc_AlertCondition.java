
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
    @ASN1Sequence ( name = "Poc_AlertCondition", isSet = false )
    public class Poc_AlertCondition implements IASN1PreparedElement {
            
        @ASN1Element ( name = "obj-reference", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private HANDLE obj_reference = null;
                
  
        @ASN1Element ( name = "controls", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertControls controls = null;
                
  
        @ASN1Element ( name = "alert-flags", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertFlags alert_flags = null;
                
  
        @ASN1Element ( name = "alert-source", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type alert_source = null;
                
  
        @ASN1Element ( name = "alert-code", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type alert_code = null;
                
  
        @ASN1Element ( name = "alert-type", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertType alert_type = null;
                
  
        @ASN1Element ( name = "alert-info-id", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private PrivateOid alert_info_id = null;
                
  @ASN1Any( name = "" )
    
        @ASN1Element ( name = "alert-info", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] alert_info = null;
                
  
        
        public HANDLE getObj_reference () {
            return this.obj_reference;
        }

        

        public void setObj_reference (HANDLE value) {
            this.obj_reference = value;
        }
        
  
        
        public Poc_AlertControls getControls () {
            return this.controls;
        }

        

        public void setControls (Poc_AlertControls value) {
            this.controls = value;
        }
        
  
        
        public Poc_AlertFlags getAlert_flags () {
            return this.alert_flags;
        }

        

        public void setAlert_flags (Poc_AlertFlags value) {
            this.alert_flags = value;
        }
        
  
        
        public OID_Type getAlert_source () {
            return this.alert_source;
        }

        

        public void setAlert_source (OID_Type value) {
            this.alert_source = value;
        }
        
  
        
        public OID_Type getAlert_code () {
            return this.alert_code;
        }

        

        public void setAlert_code (OID_Type value) {
            this.alert_code = value;
        }
        
  
        
        public Poc_AlertType getAlert_type () {
            return this.alert_type;
        }

        

        public void setAlert_type (Poc_AlertType value) {
            this.alert_type = value;
        }
        
  
        
        public PrivateOid getAlert_info_id () {
            return this.alert_info_id;
        }

        

        public void setAlert_info_id (PrivateOid value) {
            this.alert_info_id = value;
        }
        
  
        
        public byte[] getAlert_info () {
            return this.alert_info;
        }

        

        public void setAlert_info (byte[] value) {
            this.alert_info = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_AlertCondition.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            