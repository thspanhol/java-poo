public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Caneta c1 = new Caneta("Bic");
        //c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.tampar();
        c1.rabiscar();
        c1.setPonta(0.7f);
        System.out.println("A caneta é do modelo " + c1.getModelo() + " com a ponta " + c1.getPonta());

        Caneta c2 = new Caneta("Bic2");
        //c2.modelo = "Bic2";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.setPonta(0.9f);
        System.out.println("A caneta é do modelo " + c2.getModelo() + " com a ponta " + c2.getPonta());

        ControleRemoto co1 = new ControleRemoto();
        co1.ligar();
        co1.maisVolume();
        co1.abrirMenu();
    }

}