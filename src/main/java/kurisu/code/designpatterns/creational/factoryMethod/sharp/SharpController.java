package kurisu.code.designpatterns.creational.factoryMethod.sharp;

import kurisu.code.designpatterns.creational.factoryMethod.matcha.Controller;
import kurisu.code.designpatterns.creational.factoryMethod.matcha.ViewEngine;

public class SharpController extends Controller {
    
    @Override
    protected ViewEngine createViewEngine() {        
        return new SharpViewEngine(); // <- Again, Factory here, whole point is to have flexible
        // implementations
    }
}
 