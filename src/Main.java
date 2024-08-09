public class Main {

    public static void main(String[] args) {

        // POO
        Caneta c1 = new Caneta("Bic");
        //c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.tampar();
        //--c1.rabiscar();
        c1.setPonta(0.7f);
        //--System.out.println("A caneta é do modelo " + c1.getModelo() + " com a ponta " + c1.getPonta());

        Caneta c2 = new Caneta("Bic2");
        //c2.modelo = "Bic2";
        c2.cor = "Preta";
        c2.destampar();
        //--c2.rabiscar();
        c2.setPonta(0.9f);
        //--System.out.println("A caneta é do modelo " + c2.getModelo() + " com a ponta " + c2.getPonta());

        // Encapsulamento
        ControleRemoto co1 = new ControleRemoto();
        co1.ligar();
        co1.maisVolume();
        //--co1.abrirMenu();

        // Objetos Compostos
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Lutador L0", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Lutador L1", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Lutador L2", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Lutador L3", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Lutador L4", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Lutador L5", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        //l[1].status();

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();

    }

}