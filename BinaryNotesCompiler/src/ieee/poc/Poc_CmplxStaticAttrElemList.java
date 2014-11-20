
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
    @ASN1BoxedType ( name = "Poc_CmplxStaticAttrElemList" )
    public class Poc_CmplxStaticAttrElemList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-CmplxStaticAttrElemList" , isSetOf = false)
	    private java.util.Collection<Poc_CmplxStaticAttrElem> value = null; 
    
            public Poc_CmplxStaticAttrElemList () {
            }
        
            public Poc_CmplxStaticAttrElemList ( java.util.Collection<Poc_CmplxStaticAttrElem> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_CmplxStaticAttrElem> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_CmplxStaticAttrElem> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_CmplxStaticAttrElem>()); 
            }
            
            public void add(Poc_CmplxStaticAttrElem item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CmplxStaticAttrElemList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            