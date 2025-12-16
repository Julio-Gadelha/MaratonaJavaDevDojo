package DevDojoMaratonandoJava.IntroducaoMetodos.Test;

import DevDojoMaratonandoJava.IntroducaoMetodos.Dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Vosky";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Bielzn";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);



        impressora.imprime(estudante02);

    }
}
