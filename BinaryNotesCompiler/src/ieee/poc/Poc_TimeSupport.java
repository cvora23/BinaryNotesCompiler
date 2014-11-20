
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
    @ASN1Sequence ( name = "Poc_TimeSupport", isSet = false )
    public class Poc_TimeSupport implements IASN1PreparedElement {
            
        @ASN1Element ( name = "time-capability", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_TimeCapability time_capability = null;
                
  
        @ASN1Element ( name = "relative-resolution", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_U32 relative_resolution = null;
                
  
@ASN1SequenceOf( name = "time-protocols", isSetOf = false ) 

    
        @ASN1Element ( name = "time-protocols", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<TimeProtocolId>  time_protocols = null;
                
  
        
        public Poc_TimeCapability getTime_capability () {
            return this.time_capability;
        }

        

        public void setTime_capability (Poc_TimeCapability value) {
            this.time_capability = value;
        }
        
  
        
        public INT_U32 getRelative_resolution () {
            return this.relative_resolution;
        }

        

        public void setRelative_resolution (INT_U32 value) {
            this.relative_resolution = value;
        }
        
  
        
        public java.util.Collection<TimeProtocolId>  getTime_protocols () {
            return this.time_protocols;
        }

        

        public void setTime_protocols (java.util.Collection<TimeProtocolId>  value) {
            this.time_protocols = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_TimeSupport.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            