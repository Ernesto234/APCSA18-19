
/**
 * Write a description of class CellPhone here.
 *
 * @author Wiebe
 * @version 9.4.18
 */
public class CellPhone{
    private int screenWidth;
    private int screenHeight;
    private String color;
    private String chargePort;
    private boolean camera;

    public CellPhone(int screenW, int screenH, String colour, String chargeP, boolean cam){
        screenWidth = screenW;
        screenHeight = screenH;
        color = colour;
        chargePort = chargeP;
        camera = cam;
    }

    public CellPhone(){
        this(1920, 1080, "Black", "USB", true);
    }

    public CellPhone(int screenW, int screenH, String color, boolean cam){
        screenWidth = screenW;
        screenHeight = screenH;
        this.color = color;
        chargePort = "USB";
        camera = cam;
    }

    public CellPhone(int screenW, int screenH){
        this(screenW, screenH, "Black", true);
    }

    public void call(String name){
        System.out.println("You call " + name);
    }

    public void compute(){
        System.out.println("You compute stuff");
    }

    public static void getOtherPhoneNumber(){
        System.out.println("You get their digits");
    }

    /**
     * The following is an accessor method
     * 
     * @return The Width of the screen
     */
    public int getScreenWidth(){
        return screenWidth;
    }

    public boolean hasCamera(){
        return camera;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getChargePort(){
        return chargePort;
    }
    
    public int getScreenHeight(){
        return screenHeight;
    }
    
    /**
     * The following is a mutator method
     * 
     * @param The new color
     */
    public void setColor(String colour){
        this.color = colour;
    }
    public void toggleCamera(boolean set){
        camera = set;
    }
    
}
