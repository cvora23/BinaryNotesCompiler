
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
    @ASN1BoxedType ( name = "Poc_SaVisualGrid16" )
    public class Poc_SaVisualGrid16 implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-SaVisualGrid16" , isSetOf = false)
	    private java.util.Collection<Poc_SaGridEntry16> value = null; 
    
            public Poc_SaVisualGrid16 () {
            }
        
            public Poc_SaVisualGrid16 ( java.util.Collection<Poc_SaGridEntry16> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_SaGridEntry16> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_SaGridEntry16> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_SaGridEntry16>()); 
            }
            
            public void add(Poc_SaGridEntry16 item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SaVisualGrid16.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            