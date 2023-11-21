package kurisu.code.designpatterns.behavioural;

import lombok.Getter;
import lombok.Setter;

/**
 * State Design Pattern 
 * 
 * Uses polimorphism to make a tool behave differently con the same actions, in 
 * this case when using the mouse insice a canvas.
 * 
 * Open Closed Principle, 
 *  - The class should be Open for extension
 *  - The class should be Closed for modification
 */
public class State {

    public void test() {
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
 * Implementation of a Canvas in a graphic design app.
 */
class Canvas{
    @Getter @Setter private ClickableUITool selectedTool;

    public void mouseDown() {
        selectedTool.mouseDown();
    }

    public void mouseUp() {
        selectedTool.mouseUp();
    }
}

/**
 *  Interface for a tool that is able to use the mouse inside the Canvas
 */
interface ClickableUITool {
    void mouseDown();
    void mouseUp();
}


/**
 * An Implementation of a specific tool for the canvas
 */
class Brush implements ClickableUITool {

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
 * An Implementation of a specific tool for the canvas
 */
class Eraser implements ClickableUITool {

    @Override
    public void mouseDown() {
        System.out.println("Start erasing somethigin inside the canvas.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Stop erasing somethigin inside the canvas.");
    }

}