public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        //imprimindo características do objeto meuFilme (iremos utilizar na Main)
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);

    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // metodo sem void pois retorna decimal
    double pegaMedia(){
        //para pegar um valor, utilizamos RETURN
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
