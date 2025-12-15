package DevDojoMaratonandoJava.ProgamacaoOrientadaAObjetos.Teste;

import DevDojoMaratonandoJava.ProgamacaoOrientadaAObjetos.dominio.Professor;

public class ProfessorTest1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Wiliam";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }

}
