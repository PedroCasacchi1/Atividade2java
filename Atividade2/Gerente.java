package Atividade2;

class Gerente extends Funcionario {
    public Gerente() {

    }

    @Override
    public void mostrarFuncionario() {

        System.out.println(" ");
        System.out.println("Gerente");
        System.out.println("Nome: " + getNomeFuncionario());
        System.out.println("Idade: " + getIdadeFuncionario());
        System.out.println("Gênero: " + getGeneroFuncionario());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário: " + getSalario());

    }
}