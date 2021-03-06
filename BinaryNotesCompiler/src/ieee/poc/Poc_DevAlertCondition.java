
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
    @ASN1Sequence ( name = "Poc_DevAlertCondition", isSet = false )
    public class Poc_DevAlertCondition implements IASN1PreparedElement {
            
        @ASN1Element ( name = "device-alert-state", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertState device_alert_state = null;
                
  
        @ASN1Element ( name = "al-stat-chg-cnt", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlStatChgCnt al_stat_chg_cnt = null;
                
  
        @ASN1Element ( name = "max-p-alarm", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertType max_p_alarm = null;
                
  
        @ASN1Element ( name = "max-t-alarm", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertType max_t_alarm = null;
                
  
        @ASN1Element ( name = "max-aud-alarm", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_AlertType max_aud_alarm = null;
                
  
        
        public Poc_AlertState getDevice_alert_state () {
            return this.device_alert_state;
        }

        

        public void setDevice_alert_state (Poc_AlertState value) {
            this.device_alert_state = value;
        }
        
  
        
        public Poc_AlStatChgCnt getAl_stat_chg_cnt () {
            return this.al_stat_chg_cnt;
        }

        

        public void setAl_stat_chg_cnt (Poc_AlStatChgCnt value) {
            this.al_stat_chg_cnt = value;
        }
        
  
        
        public Poc_AlertType getMax_p_alarm () {
            return this.max_p_alarm;
        }

        

        public void setMax_p_alarm (Poc_AlertType value) {
            this.max_p_alarm = value;
        }
        
  
        
        public Poc_AlertType getMax_t_alarm () {
            return this.max_t_alarm;
        }

        

        public void setMax_t_alarm (Poc_AlertType value) {
            this.max_t_alarm = value;
        }
        
  
        
        public Poc_AlertType getMax_aud_alarm () {
            return this.max_aud_alarm;
        }

        

        public void setMax_aud_alarm (Poc_AlertType value) {
            this.max_aud_alarm = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_DevAlertCondition.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            