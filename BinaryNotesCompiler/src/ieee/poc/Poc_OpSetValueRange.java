
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
    @ASN1Sequence ( name = "Poc_OpSetValueRange", isSet = false )
    public class Poc_OpSetValueRange implements IASN1PreparedElement {
            
        @ASN1Element ( name = "minimum", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type minimum = null;
                
  
        @ASN1Element ( name = "maximum", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type maximum = null;
                
  
        @ASN1Element ( name = "resolution", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private FLOAT_Type resolution = null;
                
  
        
        public FLOAT_Type getMinimum () {
            return this.minimum;
        }

        

        public void setMinimum (FLOAT_Type value) {
            this.minimum = value;
        }
        
  
        
        public FLOAT_Type getMaximum () {
            return this.maximum;
        }

        

        public void setMaximum (FLOAT_Type value) {
            this.maximum = value;
        }
        
  
        
        public FLOAT_Type getResolution () {
            return this.resolution;
        }

        

        public void setResolution (FLOAT_Type value) {
            this.resolution = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_OpSetValueRange.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            