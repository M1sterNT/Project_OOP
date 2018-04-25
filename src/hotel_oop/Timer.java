/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_oop;

/**
 *
 * @author MisterNT
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Timer {
    public String getTimer(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
