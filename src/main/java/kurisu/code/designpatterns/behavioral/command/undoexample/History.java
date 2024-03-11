package kurisu.code.designpatterns.behavioral.command.undoexample;

import java.util.ArrayDeque;

import java.util.Deque;


public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand cmd){

        commands.add(cmd);

    }

    public UndoableCommand pop(){
        return commands.pop();
    }


    public int size(){
        return commands.size();
    }
    
}
