
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
    @ASN1Sequence ( name = "DataProto", isSet = false )
    public class DataProto implements IASN1PreparedElement {
            
        @ASN1Element ( name = "data-proto-id", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private DataProtoId data_proto_id = null;
                
  @ASN1Any( name = "" )
    
        @ASN1Element ( name = "data-proto-info", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private byte[] data_proto_info = null;
                
  
        
        public DataProtoId getData_proto_id () {
            return this.data_proto_id;
        }

        

        public void setData_proto_id (DataProtoId value) {
            this.data_proto_id = value;
        }
        
  
        
        public byte[] getData_proto_info () {
            return this.data_proto_info;
        }

        

        public void setData_proto_info (byte[] value) {
            this.data_proto_info = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DataProto.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            