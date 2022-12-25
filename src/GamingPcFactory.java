public class GamingPcFactory implements IFactory{
    @Override
    public IDisk disk() {
        return new Nvme();
    }

    @Override
    public IIslemci islemci() {
        return new Intel();
    }
}
