package patternsP.visitor.element;

import patternsP.visitor.visitor.Visitor;

//element
public interface Element {
    void accept(Visitor visitor);
}
