
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
    @ASN1Sequence ( name = "Poc_SingleCtxtOperScan", isSet = false )
    public class Poc_SingleCtxtOperScan implements IASN1PreparedElement {
            
        @ASN1Element ( name = "context-id", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Poc_MdsContext context_id = null;
                
  
@ASN1SequenceOf( name = "scan-info", isSetOf = false ) 

    
        @ASN1Element ( name = "scan-info", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<Poc_OpAttributeScan>  scan_info = null;
                
  
        
        public Poc_MdsContext getContext_id () {
            return this.context_id;
        }

        

        public void setContext_id (Poc_MdsContext value) {
            this.context_id = value;
        }
        
  
        
        public java.util.Collection<Poc_OpAttributeScan>  getScan_info () {
            return this.scan_info;
        }

        

        public void setScan_info (java.util.Collection<Poc_OpAttributeScan>  value) {
            this.scan_info = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(Poc_SingleCtxtOperScan.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            