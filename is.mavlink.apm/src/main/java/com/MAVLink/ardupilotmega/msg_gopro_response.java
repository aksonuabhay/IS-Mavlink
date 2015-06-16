        // MESSAGE GOPRO_RESPONSE PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * 
            Response to a command sent to a HeroBus attached GoPro with a GOPRO_COMMAND message.  Contains response from the camera as well as information about any errors encountered while attempting to communicate with the camera
        
        */
        public class msg_gopro_response extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_GOPRO_RESPONSE = 218;
        public static final int MAVLINK_MSG_LENGTH = 6;
        private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_RESPONSE;
        
        
         	/**
        * Result of the command attempt to the GoPro, as defined by GOPRO_CMD_RESULT enum.
        */
        public short gp_cmd_result;
         	/**
        * First character of the 2 character GoPro command that generated this response
        */
        public byte gp_cmd_name_1;
         	/**
        * Second character of the 2 character GoPro command that generated this response
        */
        public byte gp_cmd_name_2;
         	/**
        * Response byte from the GoPro's response to the command.  0 = Success, 1 = Failure
        */
        public byte gp_cmd_response_status;
         	/**
        * Response argument from the GoPro's response to the command
        */
        public byte gp_cmd_response_argument;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_GOPRO_RESPONSE;
        		packet.payload.putShort(gp_cmd_result);
        		packet.payload.putByte(gp_cmd_name_1);
        		packet.payload.putByte(gp_cmd_name_2);
        		packet.payload.putByte(gp_cmd_response_status);
        		packet.payload.putByte(gp_cmd_response_argument);
        
		return packet;
        }
        
        /**
        * Decode a gopro_response message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.gp_cmd_result = payload.getShort();
        	    this.gp_cmd_name_1 = payload.getByte();
        	    this.gp_cmd_name_2 = payload.getByte();
        	    this.gp_cmd_response_status = payload.getByte();
        	    this.gp_cmd_response_argument = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_gopro_response(){
    	msgid = MAVLINK_MSG_ID_GOPRO_RESPONSE;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_gopro_response(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GOPRO_RESPONSE;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "GOPRO_RESPONSE");
        //Log.d("MAVLINK_MSG_ID_GOPRO_RESPONSE", toString());
        }
        
                  
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_GOPRO_RESPONSE -"+" gp_cmd_result:"+gp_cmd_result+" gp_cmd_name_1:"+gp_cmd_name_1+" gp_cmd_name_2:"+gp_cmd_name_2+" gp_cmd_response_status:"+gp_cmd_response_status+" gp_cmd_response_argument:"+gp_cmd_response_argument+"";
        }
        }
        