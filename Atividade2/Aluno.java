package Atividade2;

class Aluno extends Pessoa {
    private String matriculaAluno;
    private String serieAluno;

    public Aluno() {

    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getSerieAluno() {
        return serieAluno;
    }

    public void setSerieAluno(String serieAluno) {
        this.serieAluno = serieAluno;
    }

    @Override
    public void mostrarPessoa() {

        System.out.println(" ");
        System.out.println("Aluno");
        System.out.println("Nome do aluno: " + getNomePessoa());
        System.out.println("Idade do aluno: " + getIdadePessoa());
        System.out.println("Gênero do aluno: " + getGeneroPessoa());
        System.out.println("Matrícula do aluno: " + getMatriculaAluno());
        System.out.println("Série do aluno: " + getSerieAluno());

    }
}