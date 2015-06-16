        // MESSAGE ACTUATOR_CONTROL_TARGET PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * Set the vehicle attitude and body angular rates.
        */
        public class msg_actuator_control_target extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET = 140;
        public static final int MAVLINK_MSG_LENGTH = 41;
        private static final long serialVersionUID = MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET;
        
        
         	/**
        * Timestamp (micros since boot or Unix epoch)
        */
        public long time_usec;
         	/**
        * Actuator controls. Normed to -1..+1 where 0 is neutral position. Throttle for single rotation direction motors is 0..1, negative range for reverse direction. Standard mapping for attitude controls (group 0): (index 0-7): roll, pitch, yaw, throttle, flaps, spoilers, airbrakes, landing gear. Load a pass-through mixer to repurpose them as generic outputs.
        */
        public float controls[] = new float[8];
         	/**
        * Actuator group. The "_mlx" indicates this is a multi-instance message and a MAVLink parser should use this field to difference between instances.
        */
        public byte group_mlx;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET;
        		packet.payload.putLong(time_usec);
        		 for (int i = 0; i < controls.length; i++) {
                    packet.payload.putFloat(controls[i]);
                    }
        		packet.payload.putByte(group_mlx);
        
		return packet;
        }
        
        /**
        * Decode a actuator_control_target message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.time_usec = payload.getLong();
        	     for (int i = 0; i < this.controls.length; i++) {
                    this.controls[i] = payload.getFloat();
                    }
        	    this.group_mlx = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_actuator_control_target(){
    	msgid = MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_actuator_control_target(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "ACTUATOR_CONTROL_TARGET");
        //Log.d("MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET", toString());
        }
        
              
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_ACTUATOR_CONTROL_TARGET -"+" time_usec:"+time_usec+" controls:"+controls+" group_mlx:"+group_mlx+"";
        }
        }
        