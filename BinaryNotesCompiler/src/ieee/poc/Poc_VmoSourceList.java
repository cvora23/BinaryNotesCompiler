
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
    @ASN1BoxedType ( name = "Poc_VmoSourceList" )
    public class Poc_VmoSourceList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-VmoSourceList" , isSetOf = false)
	    private java.util.Collection<Poc_VmoSourceEntry> value = null; 
    
            public Poc_VmoSourceList () {
            }
        
            public Poc_VmoSourceList ( java.util.Collection<Poc_VmoSourceEntry> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_VmoSourceEntry> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_VmoSourceEntry> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_VmoSourceEntry>()); 
            }
            
            public void add(Poc_VmoSourceEntry item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_VmoSourceList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            