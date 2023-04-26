package P1prep.src.factoryMethod;

public class AccountingDepartment extends Departamento{
    @Override
    public Object createEmployee() {
        return new Accountant();
    }
}
