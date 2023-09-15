package Atividade2;

class Mamifero extends Animal {
    public Mamifero() {

    }

    @Override
    public void mostrarAnimal() {

        System.out.println(" ");
        System.out.println("Mamífero");
        System.out.println("Espécie do mamífero: " + getEspecie());
        System.out.println("Peso do mamífero: " + getPeso());
        System.out.println("Idade do mamífero: " + getIdade());
        System.out.println("Sexo do mamífero: " + getSexo());

    }
}