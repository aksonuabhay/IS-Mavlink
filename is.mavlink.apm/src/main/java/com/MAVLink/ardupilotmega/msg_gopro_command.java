        // MESSAGE GOPRO_COMMAND PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * Send a command to a HeroBus attached GoPro.  Will generate a GOPRO_RESPONSE message with results of the command
        */
        public class msg_gopro_command extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_GOPRO_COMMAND = 217;
        public static final int MAVLINK_MSG_LENGTH = 5;
        private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_COMMAND;
        
        
         	/**
        * System ID
        */
        public byte target_system;
         	/**
        * Component ID
        */
        public byte target_component;
         	/**
        * First character of the 2 character GoPro command
        */
        public byte gp_cmd_name_1;
         	/**
        * Second character of the 2 character GoPro command
        */
        public byte gp_cmd_name_2;
         	/**
        * Parameter for the command
        */
        public byte gp_cmd_parm;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_GOPRO_COMMAND;
        		packet.payload.putByte(target_system);
        		packet.payload.putByte(target_component);
        		packet.payload.putByte(gp_cmd_name_1);
        		packet.payload.putByte(gp_cmd_name_2);
        		packet.payload.putByte(gp_cmd_parm);
        
		return packet;
        }
        
        /**
        * Decode a gopro_command message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.target_system = payload.getByte();
        	    this.target_component = payload.getByte();
        	    this.gp_cmd_name_1 = payload.getByte();
        	    this.gp_cmd_name_2 = payload.getByte();
        	    this.gp_cmd_parm = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_gopro_command(){
    	msgid = MAVLINK_MSG_ID_GOPRO_COMMAND;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_gopro_command(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GOPRO_COMMAND;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "GOPRO_COMMAND");
        //Log.d("MAVLINK_MSG_ID_GOPRO_COMMAND", toString());
        }
        
                  
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_GOPRO_COMMAND -"+" target_system:"+target_system+" target_component:"+target_component+" gp_cmd_name_1:"+gp_cmd_name_1+" gp_cmd_name_2:"+gp_cmd_name_2+" gp_cmd_parm:"+gp_cmd_parm+"";
        }
        }
        