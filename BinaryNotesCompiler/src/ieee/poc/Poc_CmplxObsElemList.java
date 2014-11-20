
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
    @ASN1BoxedType ( name = "Poc_CmplxObsElemList" )
    public class Poc_CmplxObsElemList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-CmplxObsElemList" , isSetOf = false)
	    private java.util.Collection<Poc_CmplxObsElem> value = null; 
    
            public Poc_CmplxObsElemList () {
            }
        
            public Poc_CmplxObsElemList ( java.util.Collection<Poc_CmplxObsElem> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_CmplxObsElem> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_CmplxObsElem> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_CmplxObsElem>()); 
            }
            
            public void add(Poc_CmplxObsElem item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_CmplxObsElemList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            