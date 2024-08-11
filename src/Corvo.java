public class Corvo extends Animal{

    @Override
    protected void locomover() {
        System.out.println("Voando.");
    }

    public void agir() {
        System.out.println("O corvo está dormindo.");
    }

    public void agir(String acao) {
        System.out.println("O corvo está " + acao + ".");
    }

}
