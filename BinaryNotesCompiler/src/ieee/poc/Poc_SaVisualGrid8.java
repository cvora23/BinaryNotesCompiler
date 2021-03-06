
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
    @ASN1BoxedType ( name = "Poc_SaVisualGrid8" )
    public class Poc_SaVisualGrid8 implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-SaVisualGrid8" , isSetOf = false)
	    private java.util.Collection<Poc_SaGridEntry8> value = null; 
    
            public Poc_SaVisualGrid8 () {
            }
        
            public Poc_SaVisualGrid8 ( java.util.Collection<Poc_SaGridEntry8> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_SaGridEntry8> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_SaGridEntry8> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_SaGridEntry8>()); 
            }
            
            public void add(Poc_SaGridEntry8 item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SaVisualGrid8.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            