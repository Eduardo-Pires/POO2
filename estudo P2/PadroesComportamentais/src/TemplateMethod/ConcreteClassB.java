package TemplateMethod;

public class ConcreteClassB extends AbstractClass{

    @Override
    protected void stepOne() {
        System.out.println("Passo 1 da B");
    }

    @Override
    protected void stepTwo() {
        System.out.println("Passo 2 da B");
    }
}
