package rocks.zipcode.dreamhouse;

 * @author  Michael Kölling and David J. Barnes (original)
 * @version 2.0  (Enhanced Mansion Edition)
 */
public class Picture {
    private Square leftWall;
    private Square rightWall;
    private Square centerWall; 
    
    private Square door;
    private Circle doorknob;
    

    private Square[] leftWindows;   
    private Square[] rightWindows;  
    private Square[] centerWindows; 
    

    private Triangle leftRoof;
    private Triangle centerRoof;
    private Triangle rightRoof;
    private Triangle leftPeak;
    private Triangle rightPeak;
    private Triangle centerPeak;  
    
   
    private Circle sun;
    private Circle[] bushes; 
    

    private static final String WALL_COLOR = "white";
    private static final String ROOF_COLOR = "blue";
    private static final String WINDOW_COLOR = "cyan";
    private static final String DOOR_COLOR = "blue";
    private static final String DOORKNOB_COLOR = "yellow";
    private static final String SUN_COLOR = "yellow";
    private static final String BUSH_COLOR = "green";

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // Initialize arrays - **NEW**
        leftWindows = new Square[3];
        rightWindows = new Square[3];
        centerWindows = new Square[2];
        bushes = new Circle[4];
    }

    public void draw() {
        drawWalls();
        drawWindows();
        drawDoor();      
        drawRoof();
        drawDecorations(); 
    }
    
    private void drawWalls() {
        // Left wall section
        leftWall = new Square();
        leftWall.changeColor(WALL_COLOR);
        leftWall.moveVertical(80);
        leftWall.moveHorizontal(-10);
        leftWall.changeSize(140);
        leftWall.makeVisible();
        
        // **NEW**: Center wall section (main entrance)
        centerWall = new Square();
        centerWall.changeColor(WALL_COLOR);
        centerWall.moveVertical(80);
        centerWall.moveHorizontal(60);
        centerWall.changeSize(140);
        centerWall.makeVisible();
        
        // Right wall section
        rightWall = new Square();
        rightWall.changeColor(WALL_COLOR);
        rightWall.moveVertical(80);
        rightWall.moveHorizontal(130);
        rightWall.changeSize(140);
        rightWall.makeVisible();
    }
    
   
    private void drawWindows() {
        
        leftWindows[0] = createWindow(20, 100);
        leftWindows[1] = createWindow(20, 140);
        leftWindows[2] = createWindow(20, 180);
        
        
        centerWindows[0] = createWindow(70, 100);
        centerWindows[1] = createWindow(150, 100);
        
       
        rightWindows[0] = createWindow(200, 100);
        rightWindows[1] = createWindow(200, 140);
        rightWindows[2] = createWindow(200, 180);
    }
    

    private Square createWindow(int x, int y) {
        Square window = new Square();
        window.changeColor(WINDOW_COLOR);
        window.moveHorizontal(x);
        window.moveVertical(y);
        window.changeSize(25);  
        window.makeVisible();
        return window;
    }
    

    private void drawDoor() {
        // Door
        door = new Square();
        door.changeColor(DOOR_COLOR);
        door.moveHorizontal(105);
        door.moveVertical(180);
        door.changeSize(40);
        door.makeVisible();
        
        // Doorknob
        doorknob = new Circle();
        doorknob.changeColor(DOORKNOB_COLOR);
        doorknob.moveHorizontal(135);
        doorknob.moveVertical(190);
        doorknob.changeSize(8);
        doorknob.makeVisible();
    }
    
    
    private void drawRoof() {
        // Left section roof
        leftRoof = new Triangle();
        leftRoof.changeColor(ROOF_COLOR);
        leftRoof.changeSize(50, 140);
        leftRoof.moveHorizontal(31);
        leftRoof.moveVertical(70);
        leftRoof.makeVisible();
        
        // Left peak
        leftPeak = new Triangle();
        leftPeak.changeColor(ROOF_COLOR);
        leftPeak.changeSize(100, 30);
        leftPeak.moveHorizontal(30);
        leftPeak.moveVertical(20);
        leftPeak.makeVisible();
        
        // Center section roof
        centerRoof = new Triangle();
        centerRoof.changeColor(ROOF_COLOR);
        centerRoof.changeSize(50, 140);
        centerRoof.moveHorizontal(100);
        centerRoof.moveVertical(70);
        centerRoof.makeVisible();
        
        //Center peak (tallest for grandeur)
        centerPeak = new Triangle();
        centerPeak.changeColor(ROOF_COLOR);
        centerPeak.changeSize(120, 30);
        centerPeak.moveHorizontal(100);
        centerPeak.moveVertical(0);
        centerPeak.makeVisible();
        
        // Right section roof
        rightRoof = new Triangle();
        rightRoof.changeColor(ROOF_COLOR);
        rightRoof.changeSize(50, 140);
        rightRoof.moveHorizontal(178);
        rightRoof.moveVertical(70);
        rightRoof.makeVisible();
        
        // Right peak
        rightPeak = new Triangle();
        rightPeak.changeColor(ROOF_COLOR);
        rightPeak.changeSize(100, 30);
        rightPeak.moveHorizontal(180);
        rightPeak.moveVertical(20);
        rightPeak.makeVisible();
    }
 
    private void drawDecorations() {
        // Sun
        sun = new Circle();
        sun.changeColor(SUN_COLOR);
        sun.moveHorizontal(10);
        sun.moveVertical(-60);
        sun.changeSize(40);
        sun.makeVisible();
        
        // Bushes for landscaping
        bushes[0] = createBush(-20, 210);
        bushes[1] = createBush(30, 210);
        bushes[2] = createBush(210, 210);
        bushes[3] = createBush(260, 210);
    }
   
    private Circle createBush(int x, int y) {
        Circle bush = new Circle();
        bush.changeColor(BUSH_COLOR);
        bush.moveHorizontal(x);
        bush.moveVertical(y);
        bush.changeSize(30);
        bush.makeVisible();
        return bush;
    }
    
    public void setBlackAndWhite() {
        if (leftWall != null) {  
            leftWall.changeColor("black");
            centerWall.changeColor("black");  
            rightWall.changeColor("black");
            
            // Windows
            for (Square window : leftWindows) {   
                if (window != null) window.changeColor("white");
            }
            for (Square window : centerWindows) {  
                if (window != null) window.changeColor("white");
            }
            for (Square window : rightWindows) {  
                if (window != null) window.changeColor("white");
            }
            
            // Door
            door.changeColor("black");       
            doorknob.changeColor("white");   
            
            // Roof
            leftRoof.changeColor("black");
            centerRoof.changeColor("black");  
            rightRoof.changeColor("black");
            leftPeak.changeColor("black");
            centerPeak.changeColor("black");  
            rightPeak.changeColor("black");
            
            // Decorations
            sun.changeColor("black");
            for (Circle bush : bushes) {     
                if (bush != null) bush.changeColor("black");
            }
        }
    }

    public void setColor() {
        if (leftWall != null) {  
            // Walls
            leftWall.changeColor(WALL_COLOR);
            centerWall.changeColor(WALL_COLOR);    
            rightWall.changeColor(WALL_COLOR);
            
            // Windows
            for (Square window : leftWindows) {   
                if (window != null) window.changeColor(WINDOW_COLOR);
            }
            for (Square window : centerWindows) {  
                if (window != null) window.changeColor(WINDOW_COLOR);
            }
            for (Square window : rightWindows) {   
                if (window != null) window.changeColor(WINDOW_COLOR);
            }
            
            // Door
            door.changeColor(DOOR_COLOR);          
            
            // Roof
            leftRoof.changeColor(ROOF_COLOR);
            centerRoof.changeColor(ROOF_COLOR);   
            rightRoof.changeColor(ROOF_COLOR);
            leftPeak.changeColor(ROOF_COLOR);
            centerPeak.changeColor(ROOF_COLOR);   
            rightPeak.changeColor(ROOF_COLOR);
            
            // Decorations
            sun.changeColor(SUN_COLOR);
            for (Circle bush : bushes) {           
                if (bush != null) bush.changeColor(BUSH_COLOR);
            }
        }
    }
}