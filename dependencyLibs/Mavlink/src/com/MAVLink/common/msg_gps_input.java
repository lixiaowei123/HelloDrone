/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_INPUT PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* GPS sensor input message.  This is a raw sensor value sent by the GPS. This is NOT the global position estimate of the sytem.
*/
public class msg_gps_input extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_GPS_INPUT = 232;
    public static final int MAVLINK_MSG_LENGTH = 63;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_INPUT;


      
    /**
    * Timestamp (micros since boot or Unix epoch)
    */
    public long time_usec;
      
    /**
    * GPS time (milliseconds from start of GPS week)
    */
    public long time_week_ms;
      
    /**
    * Latitude (WGS84), in degrees * 1E7
    */
    public int lat;
      
    /**
    * Longitude (WGS84), in degrees * 1E7
    */
    public int lon;
      
    /**
    * Altitude (AMSL, not WGS84), in m (positive for up)
    */
    public float alt;
      
    /**
    * GPS HDOP horizontal dilution of position in m
    */
    public float hdop;
      
    /**
    * GPS VDOP vertical dilution of position in m
    */
    public float vdop;
      
    /**
    * GPS velocity in m/s in NORTH direction in earth-fixed NED frame
    */
    public float vn;
      
    /**
    * GPS velocity in m/s in EAST direction in earth-fixed NED frame
    */
    public float ve;
      
    /**
    * GPS velocity in m/s in DOWN direction in earth-fixed NED frame
    */
    public float vd;
      
    /**
    * GPS speed accuracy in m/s
    */
    public float speed_accuracy;
      
    /**
    * GPS horizontal accuracy in m
    */
    public float horiz_accuracy;
      
    /**
    * GPS vertical accuracy in m
    */
    public float vert_accuracy;
      
    /**
    * Flags indicating which fields to ignore (see GPS_INPUT_IGNORE_FLAGS enum).  All other fields must be provided.
    */
    public int ignore_flags;
      
    /**
    * GPS week number
    */
    public int time_week;
      
    /**
    * ID of the GPS for multiple GPS inputs
    */
    public short gps_id;
      
    /**
    * 0-1: no fix, 2: 2D fix, 3: 3D fix. 4: 3D with DGPS. 5: 3D with RTK
    */
    public short fix_type;
      
    /**
    * Number of satellites visible.
    */
    public short satellites_visible;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GPS_INPUT;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putUnsignedInt(time_week_ms);
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lon);
              
        packet.payload.putFloat(alt);
              
        packet.payload.putFloat(hdop);
              
        packet.payload.putFloat(vdop);
              
        packet.payload.putFloat(vn);
              
        packet.payload.putFloat(ve);
              
        packet.payload.putFloat(vd);
              
        packet.payload.putFloat(speed_accuracy);
              
        packet.payload.putFloat(horiz_accuracy);
              
        packet.payload.putFloat(vert_accuracy);
              
        packet.payload.putUnsignedShort(ignore_flags);
              
        packet.payload.putUnsignedShort(time_week);
              
        packet.payload.putUnsignedByte(gps_id);
              
        packet.payload.putUnsignedByte(fix_type);
              
        packet.payload.putUnsignedByte(satellites_visible);
        
        return packet;
    }

    /**
    * Decode a gps_input message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.time_week_ms = payload.getUnsignedInt();
              
        this.lat = payload.getInt();
              
        this.lon = payload.getInt();
              
        this.alt = payload.getFloat();
              
        this.hdop = payload.getFloat();
              
        this.vdop = payload.getFloat();
              
        this.vn = payload.getFloat();
              
        this.ve = payload.getFloat();
              
        this.vd = payload.getFloat();
              
        this.speed_accuracy = payload.getFloat();
              
        this.horiz_accuracy = payload.getFloat();
              
        this.vert_accuracy = payload.getFloat();
              
        this.ignore_flags = payload.getUnsignedShort();
              
        this.time_week = payload.getUnsignedShort();
              
        this.gps_id = payload.getUnsignedByte();
              
        this.fix_type = payload.getUnsignedByte();
              
        this.satellites_visible = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_gps_input(){
        msgid = MAVLINK_MSG_ID_GPS_INPUT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_gps_input(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GPS_INPUT;
        unpack(mavLinkPacket.payload);        
    }

                                        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_GPS_INPUT - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" time_week_ms:"+time_week_ms+" lat:"+lat+" lon:"+lon+" alt:"+alt+" hdop:"+hdop+" vdop:"+vdop+" vn:"+vn+" ve:"+ve+" vd:"+vd+" speed_accuracy:"+speed_accuracy+" horiz_accuracy:"+horiz_accuracy+" vert_accuracy:"+vert_accuracy+" ignore_flags:"+ignore_flags+" time_week:"+time_week+" gps_id:"+gps_id+" fix_type:"+fix_type+" satellites_visible:"+satellites_visible+"";
    }
}
        