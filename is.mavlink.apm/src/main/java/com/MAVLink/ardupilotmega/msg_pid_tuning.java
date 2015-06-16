        // MESSAGE PID_TUNING PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * PID tuning information
        */
        public class msg_pid_tuning extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_PID_TUNING = 194;
        public static final int MAVLINK_MSG_LENGTH = 25;
        private static final long serialVersionUID = MAVLINK_MSG_ID_PID_TUNING;
        
        
         	/**
        * desired rate (degrees/s)
        */
        public float desired;
         	/**
        * achieved rate (degrees/s)
        */
        public float achieved;
         	/**
        * FF component
        */
        public float FF;
         	/**
        * P component
        */
        public float P;
         	/**
        * I component
        */
        public float I;
         	/**
        * D component
        */
        public float D;
         	/**
        * axis
        */
        public byte axis;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_PID_TUNING;
        		packet.payload.putFloat(desired);
        		packet.payload.putFloat(achieved);
        		packet.payload.putFloat(FF);
        		packet.payload.putFloat(P);
        		packet.payload.putFloat(I);
        		packet.payload.putFloat(D);
        		packet.payload.putByte(axis);
        
		return packet;
        }
        
        /**
        * Decode a pid_tuning message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.desired = payload.getFloat();
        	    this.achieved = payload.getFloat();
        	    this.FF = payload.getFloat();
        	    this.P = payload.getFloat();
        	    this.I = payload.getFloat();
        	    this.D = payload.getFloat();
        	    this.axis = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_pid_tuning(){
    	msgid = MAVLINK_MSG_ID_PID_TUNING;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_pid_tuning(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_PID_TUNING;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "PID_TUNING");
        //Log.d("MAVLINK_MSG_ID_PID_TUNING", toString());
        }
        
                      
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_PID_TUNING -"+" desired:"+desired+" achieved:"+achieved+" FF:"+FF+" P:"+P+" I:"+I+" D:"+D+" axis:"+axis+"";
        }
        }
        