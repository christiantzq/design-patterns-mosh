package kurisu.code.designpatterns.behavioral.observer;

import lombok.Getter;

/**
 * Concrete Topic (Subject)
 * 
 * In this case for tracking PS5 in stock.
 */
public class PlayStation5Stock extends Topic {

    @Getter private int stock;

    public void setStock(int stock) {
        this.stock = stock;
        notifySubscribers(); // Notify all subscribers when PS5 stock changes
    }

}
