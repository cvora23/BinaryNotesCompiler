
package test.org.bn.coders.test_asn;
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
    @ASN1BoxedType ( name = "Config" )
    public class Config implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "Config" , isSet = false )
       public static class ConfigSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "lstVersion", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private LstVersion lstVersion = null;
                
  
        @ASN1Element ( name = "major_config", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Major major_config = null;
                
  
        
        public LstVersion getLstVersion () {
            return this.lstVersion;
        }

        

        public void setLstVersion (LstVersion value) {
            this.lstVersion = value;
        }
        
  
        
        public Major getMajor_config () {
            return this.major_config;
        }

        

        public void setMajor_config (Major value) {
            this.major_config = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ConfigSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ConfigSequenceType = CoderFactory.getInstance().newPreparedElementData(ConfigSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "Config", isOptional =  false , hasTag =  true, tag = 76, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ConfigSequenceType  value;        

        
        
        public Config () {
        }
        
        
        
        public void setValue(ConfigSequenceType value) {
            this.value = value;
        }
        
        
        
        public ConfigSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Config.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            