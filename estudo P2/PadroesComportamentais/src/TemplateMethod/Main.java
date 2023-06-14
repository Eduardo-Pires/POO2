package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractClass classA = new concreteClassA();
        classA.templateMethod();
        System.out.println("-------------------------");
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
