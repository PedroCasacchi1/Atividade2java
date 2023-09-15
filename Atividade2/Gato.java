package Atividade2;

class Gato extends Mamifero {

    public Gato() {

    }
    @Override
    public void mostrarAnimal() {

        System.out.println(" ");
        System.out.println("Gato");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }

}