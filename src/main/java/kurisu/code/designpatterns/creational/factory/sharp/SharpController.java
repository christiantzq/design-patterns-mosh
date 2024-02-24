package kurisu.code.designpatterns.creational.factory.sharp;

import kurisu.code.designpatterns.creational.factory.matcha.Controller;
import kurisu.code.designpatterns.creational.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    
    @Override
    protected ViewEngine createViewEngine() {        
        return new SharpViewEngine(); // <- Again, Factory here, whole point is to have flexible
        // implementations
    }
}
 