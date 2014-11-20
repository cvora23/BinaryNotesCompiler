
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
    @ASN1Sequence ( name = "Poc_SaCalData8", isSet = false )
    public class Poc_SaCalData8 implements IASN1PreparedElement {
            
        @ASN1Element ( name = "lower-absolute-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type lower_absolute_value = null;
                
  
        @ASN1Element ( name = "upper-absolute-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type upper_absolute_value = null;
                
  
        @ASN1Element ( name = "lower-scaled-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 lower_scaled_value = null;
                
  
        @ASN1Element ( name = "upper-scaled-value", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U8 upper_scaled_value = null;
                
  
        @ASN1Element ( name = "increment", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U16 increment = null;
                
  
        @ASN1Element ( name = "cal-type", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_SaCalDataType cal_type = null;
                
  
        
        public FLOAT_Type getLower_absolute_value () {
            return this.lower_absolute_value;
        }

        

        public void setLower_absolute_value (FLOAT_Type value) {
            this.lower_absolute_value = value;
        }
        
  
        
        public FLOAT_Type getUpper_absolute_value () {
            return this.upper_absolute_value;
        }

        

        public void setUpper_absolute_value (FLOAT_Type value) {
            this.upper_absolute_value = value;
        }
        
  
        
        public INT_U8 getLower_scaled_value () {
            return this.lower_scaled_value;
        }

        

        public void setLower_scaled_value (INT_U8 value) {
            this.lower_scaled_value = value;
        }
        
  
        
        public INT_U8 getUpper_scaled_value () {
            return this.upper_scaled_value;
        }

        

        public void setUpper_scaled_value (INT_U8 value) {
            this.upper_scaled_value = value;
        }
        
  
        
        public INT_U16 getIncrement () {
            return this.increment;
        }

        

        public void setIncrement (INT_U16 value) {
            this.increment = value;
        }
        
  
        
        public Poc_SaCalDataType getCal_type () {
            return this.cal_type;
        }

        

        public void setCal_type (Poc_SaCalDataType value) {
            this.cal_type = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SaCalData8.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            