package Atividade2;

class Secretaria extends Funcionario {
    public Secretaria() {

    }
    @Override
    public void mostrarFuncionario() {

        System.out.println(" ");
        System.out.println("Secretaria");
        System.out.println("Nome: " + getNomeFuncionario());
        System.out.println("Idade: " + getIdadeFuncionario());
        System.out.println("Gênero: " + getGeneroFuncionario());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário: " + getSalario());
    }
}