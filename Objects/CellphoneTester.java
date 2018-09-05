
/**
 * Write a description of class CellphoneTester here.
 *
 * @author Wiebe
 * @version 9.5.18
 */
public class CellphoneTester{
    public static void main(String[] args){
        CellPhone cell = new CellPhone();
        System.out.println("The screen width is: ");
        System.out.println(cell.getScreenWidth());
        System.out.println();

        System.out.println("The old colour is: ");
        System.out.println(cell.getColor());
        System.out.println();

        cell.setColor("Blue");
        System.out.println("The new colour is: ");
        System.out.println(cell.getColor());
        
        if(cell.hasCamera()){
            System.out.println("This phone has a camera.");
        }else{
            System.out.println("This phone has no camera");
        }
    }
}
