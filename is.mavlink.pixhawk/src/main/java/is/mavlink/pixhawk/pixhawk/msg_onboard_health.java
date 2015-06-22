        // MESSAGE ONBOARD_HEALTH PACKING
package com.MAVLink.pixhawk;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * 
        */
        public class msg_onboard_health extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_ONBOARD_HEALTH = 206;
        public static final int MAVLINK_MSG_LENGTH = 39;
        private static final long serialVersionUID = MAVLINK_MSG_ID_ONBOARD_HEALTH;
        
        
         	/**
        * Uptime of system
        */
        public int uptime;
         	/**
        * RAM size in GiB
        */
        public float ram_total;
         	/**
        * Swap size in GiB
        */
        public float swap_total;
         	/**
        * Disk total in GiB
        */
        public float disk_total;
         	/**
        * Temperature
        */
        public float temp;
         	/**
        * Supply voltage V
        */
        public float voltage;
         	/**
        * Network load inbound KiB/s
        */
        public float network_load_in;
         	/**
        * Network load outbound in KiB/s 
        */
        public float network_load_out;
         	/**
        * CPU frequency
        */
        public short cpu_freq;
         	/**
        * CPU load in percent
        */
        public byte cpu_load;
         	/**
        * RAM usage in percent
        */
        public byte ram_usage;
         	/**
        * Swap usage in percent
        */
        public byte swap_usage;
         	/**
        * Disk health (-1: N/A, 0: ERR, 1: RO, 2: RW)
        */
        public byte disk_health;
         	/**
        * Disk usage in percent
        */
        public byte disk_usage;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_ONBOARD_HEALTH;
        		packet.payload.putInt(uptime);
        		packet.payload.putFloat(ram_total);
        		packet.payload.putFloat(swap_total);
        		packet.payload.putFloat(disk_total);
        		packet.payload.putFloat(temp);
        		packet.payload.putFloat(voltage);
        		packet.payload.putFloat(network_load_in);
        		packet.payload.putFloat(network_load_out);
        		packet.payload.putShort(cpu_freq);
        		packet.payload.putByte(cpu_load);
        		packet.payload.putByte(ram_usage);
        		packet.payload.putByte(swap_usage);
        		packet.payload.putByte(disk_health);
        		packet.payload.putByte(disk_usage);
        
		return packet;
        }
        
        /**
        * Decode a onboard_health message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.uptime = payload.getInt();
        	    this.ram_total = payload.getFloat();
        	    this.swap_total = payload.getFloat();
        	    this.disk_total = payload.getFloat();
        	    this.temp = payload.getFloat();
        	    this.voltage = payload.getFloat();
        	    this.network_load_in = payload.getFloat();
        	    this.network_load_out = payload.getFloat();
        	    this.cpu_freq = payload.getShort();
        	    this.cpu_load = payload.getByte();
        	    this.ram_usage = payload.getByte();
        	    this.swap_usage = payload.getByte();
        	    this.disk_health = payload.getByte();
        	    this.disk_usage = payload.getByte();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_onboard_health(){
    	msgid = MAVLINK_MSG_ID_ONBOARD_HEALTH;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_onboard_health(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ONBOARD_HEALTH;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "ONBOARD_HEALTH");
        //Log.d("MAVLINK_MSG_ID_ONBOARD_HEALTH", toString());
        }
        
                                    
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_ONBOARD_HEALTH -"+" uptime:"+uptime+" ram_total:"+ram_total+" swap_total:"+swap_total+" disk_total:"+disk_total+" temp:"+temp+" voltage:"+voltage+" network_load_in:"+network_load_in+" network_load_out:"+network_load_out+" cpu_freq:"+cpu_freq+" cpu_load:"+cpu_load+" ram_usage:"+ram_usage+" swap_usage:"+swap_usage+" disk_health:"+disk_health+" disk_usage:"+disk_usage+"";
        }
        }
        