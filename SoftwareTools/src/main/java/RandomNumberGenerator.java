import jdk.nashorn.internal.IntDeque;

import java.lang.Math;

public class RandomNumberGenerator {
    private int generateRandomNumber() {
        int scaleNum = 1000;
        return (int)(Math.random()*scaleNum);
    }
    
    private String formatTaskId() {
        String todayDate = java.time.LocalDate.now().toString().replace("-","");
        String result = "EU" + todayDate + generateRandomNumber();
        return result;
    }

    public static void main(String args[]) {
        RandomNumberGenerator randNumber = new RandomNumberGenerator();
        System.out.println(randNumber.formatTaskId());
    }
        
}
