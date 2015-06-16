        // MESSAGE GOPRO_POWER_ON PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * Instruct a HeroBus attached GoPro to power on
        */
        public class msg_gopro_power_on extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_GOPRO_POWER_ON = 215;
        public static final int MAVLINK_MSG_LENGTH = 2;
        private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_POWER_ON;
        
        
         	/**
        * System ID
        */
        public byte target_system;
         	/**
        * Component ID
        */
        public byte target_component;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_GOPRO_POWER_ON;
        		packet.payload.putByte(target_system);
        		packet.payload.putByte(target_component);
        
		return packet;
        }
        
        /**
        * Decode a gopro_power_on message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.target_system = payload.getByte();
        	    this.target_component = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_gopro_power_on(){
    	msgid = MAVLINK_MSG_ID_GOPRO_POWER_ON;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_gopro_power_on(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GOPRO_POWER_ON;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "GOPRO_POWER_ON");
        //Log.d("MAVLINK_MSG_ID_GOPRO_POWER_ON", toString());
        }
        
            
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_GOPRO_POWER_ON -"+" target_system:"+target_system+" target_component:"+target_component+"";
        }
        }
        