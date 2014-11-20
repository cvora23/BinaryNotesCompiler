
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
    @ASN1BoxedType ( name = "AssociationVersion" )
    public class AssociationVersion implements IASN1PreparedElement {
    
            @ASN1BitString( name = "AssociationVersion" )
            
            @ASN1SizeConstraint ( max = 32L )
        
            private BitString value = null;
            
            public AssociationVersion() {
            }

            public AssociationVersion(BitString value) {
                this.value = value;
            }
            
            public void setValue(BitString value) {
                this.value = value;
            }
            
            public BitString getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AssociationVersion.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

    }
            