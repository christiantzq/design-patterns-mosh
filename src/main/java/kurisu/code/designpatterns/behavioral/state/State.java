package kurisu.code.designpatterns.behavioral.state;

import lombok.Setter;

/**
 * State Design Pattern
 * 
 * Uses polymorphism to make an object behave differently on the same actions but different state.
 * Its like a Finite-State Machine and not to be confused with the Strategy pattern.
 * 
 * State                                      vs     Strategy
 * - States can be dependent as you can              - Strategies are completely independent
 * easily jump from one state to another.            and unaware of each other.
 * - The State pattern is about doing                - The Strategy pattern is really about
 * different things based on the state,              about having different implementations that
 * hence the result may vary.                        accomplish the same thing.
 * 
 * A switch can change the state of our program. These switching rules called transitions 
 * are finite and predetermined.
 * 
 * In this case when using the mouse inside a canvas.
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
 * It defines behavior for when mouse button us pressed or released.
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
        System.out.println("Start erasing something inside the canvas.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Stop erasing something inside the canvas.");
    }

}