
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
    @ASN1BoxedType ( name = "AttributeList" )
    public class AttributeList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "AttributeList" , isSetOf = false)
	    private java.util.Collection<AVA_Type> value = null; 
    
            public AttributeList () {
            }
        
            public AttributeList ( java.util.Collection<AVA_Type> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<AVA_Type> value) {
                this.value = value;
            }
            
            public java.util.Collection<AVA_Type> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<AVA_Type>()); 
            }
            
            public void add(AVA_Type item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AttributeList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            