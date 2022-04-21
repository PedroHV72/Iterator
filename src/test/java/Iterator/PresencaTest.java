package Iterator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PresencaTest {

    @Test
    void deveContarAlunosPresentesAula() {
        Aula aula = new Aula(
                new Aluno("Pedro", true),
                new Aluno("Jucilei", true),
                new Aluno("Romualdo", false),
                new Aluno("Irineu", true)
        );
        assertEquals(3, Presenca.alunosPresentesAula(aula));
    }

    @Test
    void deveContarTotalAlunosMatriculados() {
        Aula aula = new Aula(
                new Aluno("Pedro", true),
                new Aluno("Jucilei", true),
                new Aluno("Romualdo", false),
                new Aluno("Irineu", true)
        );
        assertEquals(4, Presenca.totalAlunosMatriculados(aula));
    }

}
