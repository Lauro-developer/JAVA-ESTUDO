public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.nome = "topGun";
        meuFilme.tema = "Acao";
        meuFilme.anoDeLancamento = 1986;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoDoFilme = 60;
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegarMedia());

    }
}
