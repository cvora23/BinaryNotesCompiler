
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
    @ASN1Sequence ( name = "Poc_MetricCalEntry", isSet = false )
    public class Poc_MetricCalEntry implements IASN1PreparedElement {
            
        @ASN1Element ( name = "cal-type", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_MetricCalType cal_type = null;
                
  
        @ASN1Element ( name = "cal-state", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_MetricCalState cal_state = null;
                
  
        @ASN1Element ( name = "cal-time", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private AbsoluteTime cal_time = null;
                
  
        
        public Poc_MetricCalType getCal_type () {
            return this.cal_type;
        }

        

        public void setCal_type (Poc_MetricCalType value) {
            this.cal_type = value;
        }
        
  
        
        public Poc_MetricCalState getCal_state () {
            return this.cal_state;
        }

        

        public void setCal_state (Poc_MetricCalState value) {
            this.cal_state = value;
        }
        
  
        
        public AbsoluteTime getCal_time () {
            return this.cal_time;
        }

        

        public void setCal_time (AbsoluteTime value) {
            this.cal_time = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_MetricCalEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            