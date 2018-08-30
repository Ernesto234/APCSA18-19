
/**
 * Write a description of class Random here.
 *
 * @author Wiebe
 * @version 8.29.18
 */
import java.lang.Math;
public class Random
{
    public static void run10000(){
        for (int i = 0; i < 10000; i++){
            System.out.println("Iteration " + i);
            main();   
        }
    }
    /**
    * Generates and prints a random number between 1 and 100.
    */
    public static void main(){
        int rand = (int)(Math.random()*100) + 1;
        System.out.println("Your random number is: " + rand);
    }
    /**
    * Generates and prints a random number between 0 and 10000.
    */
    public static void main2(){
        int rand = (int)(Math.random()*10001);
        System.out.println("Your random number is: " + rand);
    }
    /**
    * Generates and prints a random number between 5 and 10.
    */
    public static void main3(){
        int rand = (int)(Math.random()*6)+5;
        System.out.println("Your random number is: " + rand);
    }
    /**
     * This was discussed as part of a question, but is outside of what you need to know
     * Generates a random number between two given values.
     * 
     * precondition: end > start
    */
    public static int randomInt(int start, int end) throws IllegalArgumentException {
        if (end <= start){
            throw new IllegalArgumentException("The start value is too small for the end value");
        }
        int rand = (int)(Math.random()*(end-start)+ start);
        return rand;
    }
}
