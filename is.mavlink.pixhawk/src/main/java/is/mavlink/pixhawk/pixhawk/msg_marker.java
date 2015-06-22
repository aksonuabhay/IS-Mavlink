        // MESSAGE MARKER PACKING
package com.MAVLink.pixhawk;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * 
        */
        public class msg_marker extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_MARKER = 171;
        public static final int MAVLINK_MSG_LENGTH = 26;
        private static final long serialVersionUID = MAVLINK_MSG_ID_MARKER;
        
        
         	/**
        * x position
        */
        public float x;
         	/**
        * y position
        */
        public float y;
         	/**
        * z position
        */
        public float z;
         	/**
        * roll orientation
        */
        public float roll;
         	/**
        * pitch orientation
        */
        public float pitch;
         	/**
        * yaw orientation
        */
        public float yaw;
         	/**
        * ID
        */
        public short id;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_MARKER;
        		packet.payload.putFloat(x);
        		packet.payload.putFloat(y);
        		packet.payload.putFloat(z);
        		packet.payload.putFloat(roll);
        		packet.payload.putFloat(pitch);
        		packet.payload.putFloat(yaw);
        		packet.payload.putShort(id);
        
		return packet;
        }
        
        /**
        * Decode a marker message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.x = payload.getFloat();
        	    this.y = payload.getFloat();
        	    this.z = payload.getFloat();
        	    this.roll = payload.getFloat();
        	    this.pitch = payload.getFloat();
        	    this.yaw = payload.getFloat();
        	    this.id = payload.getShort();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_marker(){
    	msgid = MAVLINK_MSG_ID_MARKER;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_marker(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MARKER;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "MARKER");
        //Log.d("MAVLINK_MSG_ID_MARKER", toString());
        }
        
                      
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_MARKER -"+" x:"+x+" y:"+y+" z:"+z+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" id:"+id+"";
        }
        }
        