package Atividade2;

class Cachorro extends Mamifero {
    public Cachorro(){

    }
    @Override
    public void mostrarAnimal() {

        System.out.println(" ");
        System.out.println("Cachorro");
        System.out.println("Espécie do cachorro: " + getEspecie());
        System.out.println("Peso do cachorro: " + getPeso());
        System.out.println("Idade do cachorro: " + getIdade());
        System.out.println("Sexo do cachorro: " + getSexo());

    }

}