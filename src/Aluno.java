public class Aluno {
    private String nome;
    private String ra;
    int nota1;
    int nota2;
    int nota3;

    public Aluno(String nome, String ra, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularTotal() {
        return (nota1 + nota2 + nota3);
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

}
