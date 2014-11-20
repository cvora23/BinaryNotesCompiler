
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
    @ASN1BoxedType ( name = "Poc_ScanList" )
    public class Poc_ScanList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "Poc-ScanList" , isSetOf = false)
	    private java.util.Collection<Poc_ScanEntry> value = null; 
    
            public Poc_ScanList () {
            }
        
            public Poc_ScanList ( java.util.Collection<Poc_ScanEntry> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<Poc_ScanEntry> value) {
                this.value = value;
            }
            
            public java.util.Collection<Poc_ScanEntry> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<Poc_ScanEntry>()); 
            }
            
            public void add(Poc_ScanEntry item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ScanList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            