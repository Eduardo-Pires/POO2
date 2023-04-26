package P1prep.src.abstractFactory;

public class VictorianFornitureFactory implements fornitureFactory{

    @Override
    public Cadeira createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
