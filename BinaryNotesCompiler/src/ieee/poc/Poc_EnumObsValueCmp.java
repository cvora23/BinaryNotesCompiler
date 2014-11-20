
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
    @ASN1BoxedType ( name = "Poc_EnumObsValueCmp" )
    public class Poc_EnumObsValueCmp implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-EnumObsValueCmp" , isSetOf = false)
	    private java.util.Collection<Poc_EnumObsValue> value = null; 
    
            public Poc_EnumObsValueCmp () {
            }
        
            public Poc_EnumObsValueCmp ( java.util.Collection<Poc_EnumObsValue> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_EnumObsValue> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_EnumObsValue> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_EnumObsValue>()); 
            }
            
            public void add(Poc_EnumObsValue item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_EnumObsValueCmp.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            