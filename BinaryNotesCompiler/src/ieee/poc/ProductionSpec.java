
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
    @ASN1BoxedType ( name = "ProductionSpec" )
    public class ProductionSpec implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "ProductionSpec" , isSetOf = false)
	    private java.util.Collection<ProdSpecEntry> value = null; 
    
            public ProductionSpec () {
            }
        
            public ProductionSpec ( java.util.Collection<ProdSpecEntry> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<ProdSpecEntry> value) {
                this.value = value;
            }
            
            public java.util.Collection<ProdSpecEntry> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<ProdSpecEntry>()); 
            }
            
            public void add(ProdSpecEntry item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ProductionSpec.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            