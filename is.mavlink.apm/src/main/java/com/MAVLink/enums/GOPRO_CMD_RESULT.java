            /** 
            */
            package com.MAVLink.enums;
            
            public class GOPRO_CMD_RESULT {
            	public static final int GOPRO_CMD_RESULT_UNKNOWN = 0; /* The result of the command is unknown | */
            	public static final int GOPRO_CMD_RESULT_SUCCESSFUL = 1; /* The command was successfully sent, and a response was successfully received | */
            	public static final int GOPRO_CMD_RESULT_SEND_CMD_START_TIMEOUT = 2; /* Timed out waiting for the GoPro to acknowledge our request to send a command | */
            	public static final int GOPRO_CMD_RESULT_SEND_CMD_COMPLETE_TIMEOUT = 3; /* Timed out waiting for the GoPro to read the command | */
            	public static final int GOPRO_CMD_RESULT_GET_RESPONSE_START_TIMEOUT = 4; /* Timed out waiting for the GoPro to begin transmitting a response to the command | */
            	public static final int GOPRO_CMD_RESULT_GET_RESPONSE_COMPLETE_TIMEOUT = 5; /* Timed out waiting for the GoPro to finish transmitting a response to the command | */
            	public static final int GOPRO_CMD_RESULT_GET_CMD_COMPLETE_TIMEOUT = 6; /* Timed out waiting for the GoPro to finish transmitting its own command | */
            	public static final int GOPRO_CMD_RESULT_SEND_RESPONSE_START_TIMEOUT = 7; /* Timed out waiting for the GoPro to start reading a response to its own command | */
            	public static final int GOPRO_CMD_RESULT_SEND_RESPONSE_COMPLETE_TIMEOUT = 8; /* Timed out waiting for the GoPro to finish reading a response to its own command | */
            	public static final int GOPRO_CMD_RESULT_PREEMPTED = 9; /* Command to the GoPro was preempted by the GoPro sending its own command | */
            	public static final int GOPRO_CMD_RECEIVED_DATA_OVERFLOW = 10; /* More data than expected received in response to the command | */
            	public static final int GOPRO_CMD_RECEIVED_DATA_UNDERFLOW = 11; /* Less data than expected received in response to the command | */
            	public static final int GOPRO_CMD_RESULT_ENUM_END = 12; /*  | */
            
            }
            