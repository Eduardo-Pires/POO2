package TemplateMethod;

public class concreteClassA extends AbstractClass{

    @Override
    protected void stepOne() {
        System.out.println("Passo 1 da A");
    }

    @Override
    protected void stepTwo() {
        System.out.println("Passo 2 da A");
    }
}
