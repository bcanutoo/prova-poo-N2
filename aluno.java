public class Aluno {
    private int codigo;
    private int idade;
    private String nome;
    private String cpf;
    private String endereco;
    private boolean sexo;
    private Notas notas;

    public Aluno(int cod, int i, String n, String cpf, String end, boolean s, Notas ntes) {
        this.codigo = cod;
        this.idade = i;
        this.nome = n;
        this.cpf = cpf;
        this.endereco = end;
        this.sexo = s;
        this.notas = ntes;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public boolean isSexo() { return sexo; }
    public void setSexo(boolean sexo) { this.sexo = sexo; }

    public Notas getNotas() { return notas; }
    public void setNotas(Notas notas) { this.notas = notas; }

    public String getSituacao() {
        if (notas == null) {
            return "Reprovado";
        }
        if (notas.getMedia() >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public String toString() {
        return "Aluno{codigo=" + codigo + ", nome='" + nome + "', media=" +
                (notas != null ? notas.getMedia() : 0) + ", situacao=" + getSituacao() + "}";
    }
}
