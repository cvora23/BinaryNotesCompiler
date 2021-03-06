
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
    @ASN1Choice ( name = "Poc_ROSEapdus" )
    public class Poc_ROSEapdus implements IASN1PreparedElement {
            
        @ASN1Element ( name = "roiv-apdu", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private Poc_ROIVapdu roiv_apdu = null;
                
  
        @ASN1Element ( name = "rors-apdu", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private Poc_RORSapdu rors_apdu = null;
                
  
        @ASN1Element ( name = "roer-apdu", isOptional =  false , hasTag =  true, tag = 3 , hasDefaultValue =  false  )
    
	private Poc_ROERapdu roer_apdu = null;
                
  
        @ASN1Element ( name = "rorj-apdu", isOptional =  false , hasTag =  true, tag = 4 , hasDefaultValue =  false  )
    
	private Poc_RORJapdu rorj_apdu = null;
                
  
        @ASN1Element ( name = "roliv-apdu", isOptional =  false , hasTag =  true, tag = 5 , hasDefaultValue =  false  )
    
	private Poc_ROLIVapdu roliv_apdu = null;
                
  
        
        public Poc_ROIVapdu getRoiv_apdu () {
            return this.roiv_apdu;
        }

        public boolean isRoiv_apduSelected () {
            return this.roiv_apdu != null;
        }

        private void setRoiv_apdu (Poc_ROIVapdu value) {
            this.roiv_apdu = value;
        }

        
        public void selectRoiv_apdu (Poc_ROIVapdu value) {
            this.roiv_apdu = value;
            
                    setRors_apdu(null);
                
                    setRoer_apdu(null);
                
                    setRorj_apdu(null);
                
                    setRoliv_apdu(null);
                            
        }

        
  
        
        public Poc_RORSapdu getRors_apdu () {
            return this.rors_apdu;
        }

        public boolean isRors_apduSelected () {
            return this.rors_apdu != null;
        }

        private void setRors_apdu (Poc_RORSapdu value) {
            this.rors_apdu = value;
        }

        
        public void selectRors_apdu (Poc_RORSapdu value) {
            this.rors_apdu = value;
            
                    setRoiv_apdu(null);
                
                    setRoer_apdu(null);
                
                    setRorj_apdu(null);
                
                    setRoliv_apdu(null);
                            
        }

        
  
        
        public Poc_ROERapdu getRoer_apdu () {
            return this.roer_apdu;
        }

        public boolean isRoer_apduSelected () {
            return this.roer_apdu != null;
        }

        private void setRoer_apdu (Poc_ROERapdu value) {
            this.roer_apdu = value;
        }

        
        public void selectRoer_apdu (Poc_ROERapdu value) {
            this.roer_apdu = value;
            
                    setRoiv_apdu(null);
                
                    setRors_apdu(null);
                
                    setRorj_apdu(null);
                
                    setRoliv_apdu(null);
                            
        }

        
  
        
        public Poc_RORJapdu getRorj_apdu () {
            return this.rorj_apdu;
        }

        public boolean isRorj_apduSelected () {
            return this.rorj_apdu != null;
        }

        private void setRorj_apdu (Poc_RORJapdu value) {
            this.rorj_apdu = value;
        }

        
        public void selectRorj_apdu (Poc_RORJapdu value) {
            this.rorj_apdu = value;
            
                    setRoiv_apdu(null);
                
                    setRors_apdu(null);
                
                    setRoer_apdu(null);
                
                    setRoliv_apdu(null);
                            
        }

        
  
        
        public Poc_ROLIVapdu getRoliv_apdu () {
            return this.roliv_apdu;
        }

        public boolean isRoliv_apduSelected () {
            return this.roliv_apdu != null;
        }

        private void setRoliv_apdu (Poc_ROLIVapdu value) {
            this.roliv_apdu = value;
        }

        
        public void selectRoliv_apdu (Poc_ROLIVapdu value) {
            this.roliv_apdu = value;
            
                    setRoiv_apdu(null);
                
                    setRors_apdu(null);
                
                    setRoer_apdu(null);
                
                    setRorj_apdu(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_ROSEapdus.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            