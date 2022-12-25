public class Istemci {

    IDisk disk;
    IIslemci islemci;

    public Istemci(IFactory factory){
        disk= factory.disk();
        islemci=factory.islemci();
    }
    public void calistir(){
        disk.diskSec();
        islemci.cpuSec();
    }


}
