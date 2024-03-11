package kurisu.code.designpatterns.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/**
 * State Design Pattern 
 * 
 * Uses polimorphism to make a tool behave differently on the same actions, in 
 * this case when using the mouse inside a canvas.
 * 
 * Open Closed Principle, 
 *  - The class should be Open for extension
 *  - The class should be Closed for modification
 */
public class State {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
    
        canvas.setSelectedTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();
    
        canvas.setSelectedTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
        
    }
    
}

/**
 * Canvas View
 * 
 * A Canvas in a graphic design app.
 */
class Canvas{
    @Setter private UiTool selectedTool;

    public void mouseDown() {
        selectedTool.mouseDown();
    }

    public void mouseUp() {
        selectedTool.mouseUp();
    }
}

/**
 * Base Interface
 * 
 * Used by any tools able to use the mouse inside the Canvas.
 * 
 * It defines behaviour for when mouse button us pressed or released.
 */
interface UiTool {
    void mouseDown();
    void mouseUp();
}


/**
 * Brush class
 * 
 * A concrete implementation of a UI tool.
 */
class Brush implements UiTool {

    @Override
    public void mouseDown() {
        System.out.println("Start painting inside the canvas.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Stop painting inside the canvas.");
    }

}


/**
 * Eraser class
 * 
 * A concrete implementation of a UI tool.
 */
class Eraser implements UiTool {

    @Override
    public void mouseDown() {
        System.out.println("Start erasing somethigin inside the canvas.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Stop erasing somethigin inside the canvas.");
    }

}