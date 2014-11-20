
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
    @ASN1BoxedType ( name = "Set6" )
    public class Set6 implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "Set6" , isSet = true )
       public static class Set6SequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "set4", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Set4 set4 = null;
                
  
        @ASN1Element ( name = "set5", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Set5 set5 = null;
                
  
        
        public Set4 getSet4 () {
            return this.set4;
        }

        

        public void setSet4 (Set4 value) {
            this.set4 = value;
        }
        
  
        
        public Set5 getSet5 () {
            return this.set5;
        }

        

        public void setSet5 (Set5 value) {
            this.set5 = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_Set6SequenceType;
        }

       private static IASN1PreparedElementData preparedData_Set6SequenceType = CoderFactory.getInstance().newPreparedElementData(Set6SequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "Set6", isOptional =  false , hasTag =  true, tag = 56, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private Set6SequenceType  value;        

        
        
        public Set6 () {
        }
        
        
        
        public void setValue(Set6SequenceType value) {
            this.value = value;
        }
        
        
        
        public Set6SequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Set6.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            