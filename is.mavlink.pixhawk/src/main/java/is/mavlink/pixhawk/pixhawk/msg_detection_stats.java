        // MESSAGE DETECTION_STATS PACKING
package com.MAVLink.pixhawk;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        //import android.util.Log;
        
        /**
        * 
        */
        public class msg_detection_stats extends MAVLinkMessage{
        
        public static final int MAVLINK_MSG_ID_DETECTION_STATS = 205;
        public static final int MAVLINK_MSG_LENGTH = 48;
        private static final long serialVersionUID = MAVLINK_MSG_ID_DETECTION_STATS;
        
        
         	/**
        * Number of detections
        */
        public int detections;
         	/**
        * Number of cluster iterations
        */
        public int cluster_iters;
         	/**
        * Best score
        */
        public float best_score;
         	/**
        * Latitude of the best detection * 1E7
        */
        public int best_lat;
         	/**
        * Longitude of the best detection * 1E7
        */
        public int best_lon;
         	/**
        * Altitude of the best detection * 1E3
        */
        public int best_alt;
         	/**
        * Best detection ID
        */
        public int best_detection_id;
         	/**
        * Best cluster ID
        */
        public int best_cluster_id;
         	/**
        * Best cluster ID
        */
        public int best_cluster_iter_id;
         	/**
        * Number of images already processed
        */
        public int images_done;
         	/**
        * Number of images still to process
        */
        public int images_todo;
         	/**
        * Average images per seconds processed
        */
        public float fps;
        
        
        /**
        * Generates the payload for a mavlink message for a message of this type
        * @return
        */
        public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_DETECTION_STATS;
        		packet.payload.putInt(detections);
        		packet.payload.putInt(cluster_iters);
        		packet.payload.putFloat(best_score);
        		packet.payload.putInt(best_lat);
        		packet.payload.putInt(best_lon);
        		packet.payload.putInt(best_alt);
        		packet.payload.putInt(best_detection_id);
        		packet.payload.putInt(best_cluster_id);
        		packet.payload.putInt(best_cluster_iter_id);
        		packet.payload.putInt(images_done);
        		packet.payload.putInt(images_todo);
        		packet.payload.putFloat(fps);
        
		return packet;
        }
        
        /**
        * Decode a detection_stats message into this class fields
        *
        * @param payload The message to decode
        */
        public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        	    this.detections = payload.getInt();
        	    this.cluster_iters = payload.getInt();
        	    this.best_score = payload.getFloat();
        	    this.best_lat = payload.getInt();
        	    this.best_lon = payload.getInt();
        	    this.best_alt = payload.getInt();
        	    this.best_detection_id = payload.getInt();
        	    this.best_cluster_id = payload.getInt();
        	    this.best_cluster_iter_id = payload.getInt();
        	    this.images_done = payload.getInt();
        	    this.images_todo = payload.getInt();
        	    this.fps = payload.getFloat();
        
        }
        
        /**
        * Constructor for a new message, just initializes the msgid
        */
        public msg_detection_stats(){
    	msgid = MAVLINK_MSG_ID_DETECTION_STATS;
        }
        
        /**
        * Constructor for a new message, initializes the message with the payload
        * from a mavlink packet
        *
        */
        public msg_detection_stats(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_DETECTION_STATS;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "DETECTION_STATS");
        //Log.d("MAVLINK_MSG_ID_DETECTION_STATS", toString());
        }
        
                                
        /**
        * Returns a string with the MSG name and data
        */
        public String toString(){
    	return "MAVLINK_MSG_ID_DETECTION_STATS -"+" detections:"+detections+" cluster_iters:"+cluster_iters+" best_score:"+best_score+" best_lat:"+best_lat+" best_lon:"+best_lon+" best_alt:"+best_alt+" best_detection_id:"+best_detection_id+" best_cluster_id:"+best_cluster_id+" best_cluster_iter_id:"+best_cluster_iter_id+" images_done:"+images_done+" images_todo:"+images_todo+" fps:"+fps+"";
        }
        }
        