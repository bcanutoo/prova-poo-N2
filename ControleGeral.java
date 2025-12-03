import java.util.ArrayList;

public class ControleGeral {

    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<CursoEspecializacao> espec = new ArrayList<>();
    private ArrayList<CursoMestrado> mest = new ArrayList<>();

    public void popularExemplos() {
        Notas n1 = new Notas(8,7,6);
        Notas n2 = new Notas(5,6,4);

        Aluno a1 = new Aluno(1,20,"Henrique","12345678901","Rua A",false,n1);
        Aluno a2 = new Aluno(2,22,"Beatriz","09876543210","Rua B",true,n2);

        alunos.add(a1);
        alunos.add(a2);

        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);

        cursos.add(new Curso(10,60,2,"POO","Luiz",500,lista));

        espec.add(new CursoEspecializacao(20,120,3,"Esp Java","Mario",1200,lista,true));
        mest.add(new CursoMestrado(30,200,1,"Mestrado AI","Carlos",5000,lista,true));
    }

    public void mostrar(int op) {
        if (op == 1) {
            for (Aluno a : alunos) System.out.println(a);
        } else if (op == 2) {
            for (Curso c : cursos) System.out.println(c);
        } else if (op == 3) {
            for (CursoEspecializacao ce : espec) System.out.println(ce);
        } else if (op == 4) {
            for (CursoMestrado cm : mest) System.out.println(cm);
        }
    }

    public void buscarNomeCurso(String nome) {
        boolean ok = false;

        for (Curso c : cursos)
            if (c.getNome().equalsIgnoreCase(nome)) { System.out.println("É curso"); ok = true; }

        for (CursoEspecializacao c : espec)
            if (c.getNome().equalsIgnoreCase(nome)) { System.out.println("É especialização"); ok = true; }

        for (CursoMestrado c : mest)
            if (c.getNome().equalsIgnoreCase(nome)) { System.out.println("É mestrado"); ok = true; }

        if (!ok) System.out.println("Nome não identificado.");
    }
}
