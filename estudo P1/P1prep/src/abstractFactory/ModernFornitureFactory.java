package P1prep.src.abstractFactory;

public class ModernFornitureFactory implements fornitureFactory{

    @Override
    public Cadeira createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
