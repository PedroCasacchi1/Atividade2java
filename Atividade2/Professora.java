package Atividade2;

class Professora extends Pessoa {
    private String disciplinaProfessora;
    private double salario;
    public Professora() {

    }

    public String getDisciplinaProfessora() {
        return disciplinaProfessora;
    }

    public void setDisciplinaProfessora(String disciplinaProfessora) {
        this.disciplinaProfessora = disciplinaProfessora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarPessoa() {

        System.out.println(" ");
        System.out.println("Professora");
        System.out.println("Nome: " + getNomePessoa());
        System.out.println("Idade: " + getIdadePessoa());
        System.out.println("Gênero: " + getGeneroPessoa());
        System.out.println("Disciplina: " + getDisciplinaProfessora());
        System.out.println("Salário: " + getSalario());

    }
}