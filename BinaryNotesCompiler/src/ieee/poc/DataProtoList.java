
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
    @ASN1BoxedType ( name = "DataProtoList" )
    public class DataProtoList implements IASN1PreparedElement {
                
            
            @ASN1SequenceOf( name = "DataProtoList" , isSetOf = false)
	    private java.util.Collection<DataProto> value = null; 
    
            public DataProtoList () {
            }
        
            public DataProtoList ( java.util.Collection<DataProto> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<DataProto> value) {
                this.value = value;
            }
            
            public java.util.Collection<DataProto> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<DataProto>()); 
            }
            
            public void add(DataProto item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DataProtoList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            