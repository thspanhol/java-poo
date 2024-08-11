public final class Bolsista extends Aluno {

    @Override
    protected void pagarMensalidade() {
        System.out.println("Mensalidade grátis.");
    }

   /*
   @Override  // Método final não pode ser sobreposto.
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada.");
    }
    */

}
