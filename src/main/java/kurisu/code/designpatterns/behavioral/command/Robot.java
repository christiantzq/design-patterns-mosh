package kurisu.code.designpatterns.behavioral.command;

/**
 * Receiver
 * 
 * This is the one that actually does the work (API / business logic)
 */
public class Robot {

    public void type(String text) {
        System.out.println("Keyboard input: [" + text + "]");
    }

    public void keyPress(int keyCode) {
        System.out.println("Pressing key: ["+ keyCode +"]");
    }

    public void keyRelease(int keyCode) {
        System.out.println("Releasing key: ["+ keyCode +"]");
    }

    public void delay(int milliseconds) {
        System.out.println("Waiting: ["+ milliseconds +"] milliseconds");
    }

}
