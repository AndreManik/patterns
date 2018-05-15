package patternsP.template;

import patternsP.template.tempate.A;
import patternsP.template.tempate.B;

public class TemplateMethodApp {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.templateMethod();
        System.out.println();
        b.templateMethod();
    }
}