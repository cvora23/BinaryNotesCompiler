
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
    @ASN1BoxedType ( name = "Poc_MibCcCounter" )
    public class Poc_MibCcCounter implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "Poc-MibCcCounter", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
        private INT_U32  value;        

        
        
        public Poc_MibCcCounter () {
        }
        
        
        
        public void setValue(INT_U32 value) {
            this.value = value;
        }
        
        
        
        public INT_U32 getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MibCcCounter.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            