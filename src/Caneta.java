public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    /*
    * public -> Acessado de qualquer lugar.
    * private -> Acessado apenas pela classe.
    * Protected -> Acessado pelo elemento pai e filhos.
    */

    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada, não consegue rabiscar.");
        } else {
            System.out.println("A caneta está rabiscando.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    /*
     * getter -> Acessa determinado atributo do objeto criado.
     * setter -> Altera determinado atributo do objeto criado.
     * constructor -> Define atributos padrões no momento da criação do objeto.
     */

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public Caneta(String m) {
        this.setModelo("Bic");
    }

}
