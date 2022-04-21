package Iterator;

import java.util.Iterator;

public class Presenca {

    public static Integer alunosPresentesAula(Aula aula) {
        int quantidade = 0;
        for (Aluno aluno : aula) {
            if (aluno.isPresent()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer totalAlunosMatriculados(Aula aula) {
        int quantidade = 0;
        for (Iterator a = aula.iterator(); ((Iterator<?>) a).hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
