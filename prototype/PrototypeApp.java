package patternsP.prototype;

import patternsP.prototype.model.Human;
import patternsP.prototype.model.HumanFactory;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        Human copy = (Human) original.copy();

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setPrototype(new Human(30, "Valer"));
        System.out.println(factory.makeCopy());
    }
}





