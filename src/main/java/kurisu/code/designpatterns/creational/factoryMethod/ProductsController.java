package kurisu.code.designpatterns.creational.factoryMethod;

import java.util.HashMap;
import java.util.Map;

import kurisu.code.designpatterns.creational.factoryMethod.matcha.Controller;
import kurisu.code.designpatterns.creational.factoryMethod.sharp.SharpController;

// public class ProductsController extends Controller { // <- Default
public class ProductsController extends SharpController { // <- Override via factory
    public void listProducts() {
        System.out.println("Gettin products from database.");

        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
