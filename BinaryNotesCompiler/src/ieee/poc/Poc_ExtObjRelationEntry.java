
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
    @ASN1Sequence ( name = "Poc_ExtObjRelationEntry", isSet = false )
    public class Poc_ExtObjRelationEntry implements IASN1PreparedElement {
            
        @ASN1Element ( name = "relation-type", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type relation_type = null;
                
  
        @ASN1Element ( name = "related-object", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private OID_Type related_object = null;
                
  
        @ASN1Element ( name = "relation-attributes", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private AttributeList relation_attributes = null;
                
  
        
        public OID_Type getRelation_type () {
            return this.relation_type;
        }

        

        public void setRelation_type (OID_Type value) {
            this.relation_type = value;
        }
        
  
        
        public OID_Type getRelated_object () {
            return this.related_object;
        }

        

        public void setRelated_object (OID_Type value) {
            this.related_object = value;
        }
        
  
        
        public AttributeList getRelation_attributes () {
            return this.relation_attributes;
        }

        

        public void setRelation_attributes (AttributeList value) {
            this.relation_attributes = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ExtObjRelationEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            