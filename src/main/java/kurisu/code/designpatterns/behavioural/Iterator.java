package kurisu.code.designpatterns.behavioural;

import java.util.ArrayList;
import java.util.List;

/**
 * This example illustrates a simple browser history that lets you store
 * and retrieve URLs, but can also provide an Iterator to see the entire
 * list of URLs
 */
public class Iterator {

    public void test() {
        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        MyItarable<String> iterator = history.getIterator();
        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}

class BrowserHistory {
    private List<String> history = new ArrayList<>();

    public void push(String url) {
        history.add(url);
    }

    public MyItarable<String> getIterator(){
        return new ListIterator();
    }

    /**
     * Embdeded class to implement its own iterator
     */
    class ListIterator implements MyItarable<String> {

        private int index = 0;

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.get(index);
        }

        @Override
        public boolean hasNext() {
            if(index < history.size()){
                return true; 
            }
            return false;
        }

    }

}

interface MyItarable<T> {
    void next();
    T current();
    boolean hasNext();
}
