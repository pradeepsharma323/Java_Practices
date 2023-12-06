package collection_practice.accntr;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DisplayRandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt()*10);
        System.out.println(ThreadLocalRandom.current().nextDouble());
        //System.out.println(Math.random(10));
        System.out.println(Math.random()*10);
        System.out.println(rand.nextDouble()*10);

    }
}
