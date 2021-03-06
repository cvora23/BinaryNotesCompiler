
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
    @ASN1Sequence ( name = "Poc_SetLeapSecondsInvoke", isSet = false )
    public class Poc_SetLeapSecondsInvoke implements IASN1PreparedElement {
            
        @ASN1Element ( name = "leap-seconds-cum", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private INT_I32 leap_seconds_cum = null;
                
  
        @ASN1Element ( name = "next-leap-seconds", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_LeapSecondsTransition next_leap_seconds = null;
                
  
        
        public INT_I32 getLeap_seconds_cum () {
            return this.leap_seconds_cum;
        }

        

        public void setLeap_seconds_cum (INT_I32 value) {
            this.leap_seconds_cum = value;
        }
        
  
        
        public Poc_LeapSecondsTransition getNext_leap_seconds () {
            return this.next_leap_seconds;
        }

        

        public void setNext_leap_seconds (Poc_LeapSecondsTransition value) {
            this.next_leap_seconds = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SetLeapSecondsInvoke.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            