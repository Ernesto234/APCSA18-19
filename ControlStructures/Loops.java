
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops
{
    public static void whileLoops(){
        int x = 0;
        while(x<10){
            System.out.println(x);
            x++;
        }
    }
    public static void forLoop(){
        for (int i = 0; i < 10; i++){
            System.out.println("Mmmmmm....Bacon!");
        }
    }
    public static void forLoop2(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
    public static void litLoop(){
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void litLoop2(){
        for(int i = 1; i < 6; i++){
            for (int j = i; j < 6; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
