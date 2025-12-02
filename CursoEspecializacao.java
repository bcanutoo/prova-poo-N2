import java.util.ArrayList;

public class CursoEspecializacao extends Curso {
    private boolean latoSensu;
    private double adicionalDiploma;

    public CursoEspecializacao(int cod, int ch, int sala, String n, String nP, double v,
                               ArrayList<Aluno> alunos, boolean lS) {
        super(cod, ch, sala, n, nP, v, alunos);
        this.latoSensu = lS;
        setAdicionalDiploma();
    }

    public void setAdicionalDiploma() {
        int qt = getAlunos().size();
        double taxa;

        if (qt <= 10) taxa = 25;
        else if (qt <= 30) taxa = 20;
        else taxa = 18;

        this.adicionalDiploma = taxa * qt;
    }

    public String toString() {
        return "CursoEspecializacao{" + super.toString() +
                ", adicional=" + adicionalDiploma + "}";
    }
}
