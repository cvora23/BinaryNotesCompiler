
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
    @ASN1BoxedType ( name = "Poc_OpValStepWidth" )
    public class Poc_OpValStepWidth implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-OpValStepWidth" , isSetOf = false)
	    private java.util.Collection<Poc_StepWidthEntry> value = null; 
    
            public Poc_OpValStepWidth () {
            }
        
            public Poc_OpValStepWidth ( java.util.Collection<Poc_StepWidthEntry> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_StepWidthEntry> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_StepWidthEntry> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_StepWidthEntry>()); 
            }
            
            public void add(Poc_StepWidthEntry item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_OpValStepWidth.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            