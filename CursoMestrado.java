import java.util.ArrayList;

public class CursoMestrado extends Curso {
    private boolean strictoSensu;
    private double adicionalDiploma;

    public CursoMestrado(int cod, int ch, int sala, String n, String nP, double v,
                         ArrayList<Aluno> alunos, boolean sS) {
        super(cod, ch, sala, n, nP, v, alunos);
        this.strictoSensu = sS;
        setAdicionalDiploma();
    }

    public void setAdicionalDiploma() {
        int qt = getAlunos().size();
        double taxa;

        if (qt <= 5) taxa = 45;
        else if (qt <= 15) taxa = 43;
        else if (qt <= 30) taxa = 40;
        else taxa = 36;

        this.adicionalDiploma = taxa * qt;
    }

    public String toString() {
        return "CursoMestrado{" + super.toString() +
                ", adicional=" + adicionalDiploma + "}";
    }
}
