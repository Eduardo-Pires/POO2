package P1prep.src.factoryMethod;

public class ITDepartment extends Departamento{
    @Override
    public Object createEmployee() {
        return new Programmer();
    }
}
