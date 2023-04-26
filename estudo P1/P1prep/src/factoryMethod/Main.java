package P1prep.src.factoryMethod;

public class Main {
    public static void main(String[] args) {
        AccountingDepartment dep = new AccountingDepartment();
        Object empregado = dep.createEmployee();

        System.out.println(empregado);
    }
}
