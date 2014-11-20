
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
    @ASN1Choice ( name = "ApduType" )
    public class ApduType implements IASN1PreparedElement {
            
        @ASN1Element ( name = "aarq", isOptional =  false , hasTag =  true, tag = 57856 , hasDefaultValue =  false  )
    
	private AarqApdu aarq = null;
                
  
        @ASN1Element ( name = "aare", isOptional =  false , hasTag =  true, tag = 58112 , hasDefaultValue =  false  )
    
	private AareApdu aare = null;
                
  
        @ASN1Element ( name = "rlrq", isOptional =  false , hasTag =  true, tag = 58368 , hasDefaultValue =  false  )
    
	private RlrqApdu rlrq = null;
                
  
        @ASN1Element ( name = "rlre", isOptional =  false , hasTag =  true, tag = 58624 , hasDefaultValue =  false  )
    
	private RlreApdu rlre = null;
                
  
        @ASN1Element ( name = "abrt", isOptional =  false , hasTag =  true, tag = 58880 , hasDefaultValue =  false  )
    
	private AbrtApdu abrt = null;
                
  
        @ASN1Element ( name = "prst", isOptional =  false , hasTag =  true, tag = 59136 , hasDefaultValue =  false  )
    
	private PrstApdu prst = null;
                
  
        @ASN1Element ( name = "mdap-rose", isOptional =  false , hasTag =  true, tag = 59392 , hasDefaultValue =  false  )
    
	private Poc_ROSEapdus mdap_rose = null;
                
  
        
        public AarqApdu getAarq () {
            return this.aarq;
        }

        public boolean isAarqSelected () {
            return this.aarq != null;
        }

        private void setAarq (AarqApdu value) {
            this.aarq = value;
        }

        
        public void selectAarq (AarqApdu value) {
            this.aarq = value;
            
                    setAare(null);
                
                    setRlrq(null);
                
                    setRlre(null);
                
                    setAbrt(null);
                
                    setPrst(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public AareApdu getAare () {
            return this.aare;
        }

        public boolean isAareSelected () {
            return this.aare != null;
        }

        private void setAare (AareApdu value) {
            this.aare = value;
        }

        
        public void selectAare (AareApdu value) {
            this.aare = value;
            
                    setAarq(null);
                
                    setRlrq(null);
                
                    setRlre(null);
                
                    setAbrt(null);
                
                    setPrst(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public RlrqApdu getRlrq () {
            return this.rlrq;
        }

        public boolean isRlrqSelected () {
            return this.rlrq != null;
        }

        private void setRlrq (RlrqApdu value) {
            this.rlrq = value;
        }

        
        public void selectRlrq (RlrqApdu value) {
            this.rlrq = value;
            
                    setAarq(null);
                
                    setAare(null);
                
                    setRlre(null);
                
                    setAbrt(null);
                
                    setPrst(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public RlreApdu getRlre () {
            return this.rlre;
        }

        public boolean isRlreSelected () {
            return this.rlre != null;
        }

        private void setRlre (RlreApdu value) {
            this.rlre = value;
        }

        
        public void selectRlre (RlreApdu value) {
            this.rlre = value;
            
                    setAarq(null);
                
                    setAare(null);
                
                    setRlrq(null);
                
                    setAbrt(null);
                
                    setPrst(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public AbrtApdu getAbrt () {
            return this.abrt;
        }

        public boolean isAbrtSelected () {
            return this.abrt != null;
        }

        private void setAbrt (AbrtApdu value) {
            this.abrt = value;
        }

        
        public void selectAbrt (AbrtApdu value) {
            this.abrt = value;
            
                    setAarq(null);
                
                    setAare(null);
                
                    setRlrq(null);
                
                    setRlre(null);
                
                    setPrst(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public PrstApdu getPrst () {
            return this.prst;
        }

        public boolean isPrstSelected () {
            return this.prst != null;
        }

        private void setPrst (PrstApdu value) {
            this.prst = value;
        }

        
        public void selectPrst (PrstApdu value) {
            this.prst = value;
            
                    setAarq(null);
                
                    setAare(null);
                
                    setRlrq(null);
                
                    setRlre(null);
                
                    setAbrt(null);
                
                    setMdap_rose(null);
                            
        }

        
  
        
        public Poc_ROSEapdus getMdap_rose () {
            return this.mdap_rose;
        }

        public boolean isMdap_roseSelected () {
            return this.mdap_rose != null;
        }

        private void setMdap_rose (Poc_ROSEapdus value) {
            this.mdap_rose = value;
        }

        
        public void selectMdap_rose (Poc_ROSEapdus value) {
            this.mdap_rose = value;
            
                    setAarq(null);
                
                    setAare(null);
                
                    setRlrq(null);
                
                    setRlre(null);
                
                    setAbrt(null);
                
                    setPrst(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ApduType.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            