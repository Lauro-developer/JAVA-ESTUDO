public class Filme {
    String nome;
    String tema;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;
    int duracaoDoFilme;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.print("NOME DO FILME: "+nome); // ACESSAR ATTRIBUTED DO OBJETO
        System.out.print("TEMA DO FILME: "+tema);
        System.out.print("ANO DE LANCAMENTO: "+anoDeLancamento);
        System.out.print("ESTÁ INCLUIDO NO PLANO: " + incluidoNoPlano);
        System.out.print("QUANTIDADE DE AVALIACOES: " + totalDeAvaliacao);
        System.out.print("TOTAL DE AVALIACAO: "+ somaAvaliacao);
        System.out.print("DURACAO DO FILME: "+duracaoDoFilme+" MIN");
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    double pegarMedia(){
        return somaAvaliacao / totalDeAvaliacao;
    }
}

// PRIVATE = NAO DEIXA LER E NEM ALTERAR AQUELA INFORMACAO;