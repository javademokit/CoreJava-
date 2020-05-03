package com.rsb;
import java.util.Calendar;
import java.util.Timer;
public class flexcube_sms_scheduler_Start
{
	private static Timer timer = new Timer();

    private static Calendar getFirstTime() {
        Calendar cal = Calendar.getInstance();

        int currentMinute = cal.get(Calendar.MINUTE);

        if (currentMinute < 2) {
            cal.set(Calendar.MINUTE, 1);
        }
        if (currentMinute < 3) {
            cal.set(Calendar.MINUTE, 1);
        }
        if (currentMinute < 4) {
            cal.set(Calendar.MINUTE, 1);
        }
        if (currentMinute >= 1) {
            cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) + 0);// current time of  system 
            cal.set(Calendar.MINUTE, 0);
        }

        cal.set(Calendar.SECOND, 0);

        return cal;
    }

    public static void main(String... args) {
        Calendar firstTaskTime = getFirstTime();
        System.out.println("Task will start at: " + firstTaskTime.getTime());
        
        timer.schedule(new flexcube_sms_getway_to_call_by_scheduler(), firstTaskTime.getTime(), 100* 600 * 150); // for starting time 
        
    }
}


	
	
	
	




