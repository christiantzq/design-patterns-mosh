package kurisu.code.designpatterns.creational.factoryMethod.sharp;

import java.util.Map;

import kurisu.code.designpatterns.creational.factoryMethod.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine{

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Viewing the rendered content using Sharp View Engine!!!";
    }

    
}
