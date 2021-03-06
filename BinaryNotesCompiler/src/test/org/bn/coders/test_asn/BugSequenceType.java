
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
    @ASN1Sequence ( name = "BugSequenceType", isSet = false )
    public class BugSequenceType implements IASN1PreparedElement {
            @ASN1Boolean( name = "" )
    
        @ASN1Element ( name = "booleanField", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Boolean booleanField = null;
                
  @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "integerField", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Long integerField = null;
                
  
        
        public Boolean getBooleanField () {
            return this.booleanField;
        }

        

        public void setBooleanField (Boolean value) {
            this.booleanField = value;
        }
        
  
        
        public Long getIntegerField () {
            return this.integerField;
        }

        

        public void setIntegerField (Long value) {
            this.integerField = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(BugSequenceType.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            