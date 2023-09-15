package Atividade2;

class Ave extends Animal {
    public Ave() {

    }

    @Override
    public void mostrarAnimal() {

        System.out.println(" ");
        System.out.println("Ave");
        System.out.println("Espécie da ave: " + getEspecie());
        System.out.println("Peso da ave: " + getPeso());
        System.out.println("Idade da ave: " + getIdade());
        System.out.println("Sexo da ave: " + getSexo());

    }
}