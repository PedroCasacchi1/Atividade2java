package Atividade2;

class Diretor extends Funcionario {
    public Diretor() {

    }

    @Override
    public void mostrarFuncionario() {

        System.out.println(" ");
        System.out.println("Diretor");
        System.out.println("Nome: " + getNomeFuncionario());
        System.out.println("Idade: " + getIdadeFuncionario());
        System.out.println("Gênero: " + getGeneroFuncionario());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário: " + getSalario());

    }

}


