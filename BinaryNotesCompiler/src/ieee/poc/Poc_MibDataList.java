
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
    @ASN1BoxedType ( name = "Poc_MibDataList" )
    public class Poc_MibDataList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-MibDataList" , isSetOf = false)
	    private java.util.Collection<Poc_MibDataEntry> value = null; 
    
            public Poc_MibDataList () {
            }
        
            public Poc_MibDataList ( java.util.Collection<Poc_MibDataEntry> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_MibDataEntry> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_MibDataEntry> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_MibDataEntry>()); 
            }
            
            public void add(Poc_MibDataEntry item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MibDataList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            