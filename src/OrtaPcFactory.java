public class OrtaPcFactory implements IFactory{
    @Override
    public IDisk disk() {
        return new Ssd();
    }

    @Override
    public IIslemci islemci() {
        return new Amd();
    }
}
