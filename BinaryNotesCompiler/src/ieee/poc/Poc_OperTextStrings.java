
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
    @ASN1Sequence ( name = "Poc_OperTextStrings", isSet = false )
    public class Poc_OperTextStrings implements IASN1PreparedElement {
            @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "label", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] label = null;
                
  @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "help", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] help = null;
                
  @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "confirm", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] confirm = null;
                
  
        
        public byte[] getLabel () {
            return this.label;
        }

        

        public void setLabel (byte[] value) {
            this.label = value;
        }
        
  
        
        public byte[] getHelp () {
            return this.help;
        }

        

        public void setHelp (byte[] value) {
            this.help = value;
        }
        
  
        
        public byte[] getConfirm () {
            return this.confirm;
        }

        

        public void setConfirm (byte[] value) {
            this.confirm = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_OperTextStrings.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            