public class Main {
    public static void main(String[] args) {

    Istemci istemci = new Istemci(new GamingPcFactory());
    istemci.calistir();

        System.out.println("--------");

    Istemci istemci2 =new Istemci(new OrtaPcFactory());
    istemci2.calistir();


    }
}