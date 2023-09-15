package Atividade2;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Criação de Animais");

        int maxAnimais = 100;
        Animal[] animais = new Animal[maxAnimais];
        int numAnimais = 0;

        int maxAlunos = 100;
        Aluno[] alunos = new Aluno[maxAlunos];
        int numAlunos = 0;

        int maxProfessor = 100;
        Professora[] professoras = new Professora[maxProfessor];
        int numProfessoras = 0;

        int maxGerentes = 100;
        Gerente[] gerentes = new Gerente[maxGerentes];
        int numGerentes = 0;

        int maxDiretores = 100;
        Diretor[] diretores = new Diretor[maxDiretores];
        int numDiretores = 0;

        int maxSecretarias = 100;
        Secretaria[] secretarias = new Secretaria[maxSecretarias];
        int numSecretarias = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar animal");
            System.out.println("2. Criar pessoa");
            System.out.println("3. Mostrar animais criados");
            System.out.println("4. Mostrar pessoas criadas");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 5) {
                System.out.println("Saindo do programa.");
                break;
            }

            switch (escolha) {
                case 1:
                    if (numAnimais < maxAnimais) {
                        System.out.println("\nEscolha o tipo de animal que deseja criar:");
                        System.out.println("1. Mamífero");
                        System.out.println("2. Ave");


                        int tipoAnimal = scanner.nextInt();
                        String tipoAni = "";
                        scanner.nextLine();

                        Animal animal = null;

                        if (tipoAnimal == 1) {
                            System.out.println("\nEscolha o tipo de mamífero que deseja criar:");
                            System.out.println("1. Cachorro");
                            System.out.println("2. Gato");
                            System.out.println("3. Outro Mamífero");

                            int tipoMamifero = scanner.nextInt();
                            scanner.nextLine();

                            if (tipoMamifero == 1) {
                                animal = new Cachorro();
                                tipoAni = "Cachorro";
                            } else if (tipoMamifero == 2) {
                                animal = new Gato();
                                tipoAni = "Gato";
                            } else if (tipoMamifero == 3) {
                                animal = new Mamifero();
                                tipoAni = "Mamifero";
                            } else {
                                System.out.println("Escolha entre 1 e 3.");
                            }
                        } else if (tipoAnimal == 2) {
                            animal = new Ave();
                            tipoAni = "Ave";
                        } else {
                            System.out.println("Escolha entre 1 e 3.");
                        }

                        if (animal != null) {
                            System.out.print("Espécie: ");
                            String especie = scanner.nextLine();
                            System.out.print("Peso: ");
                            float peso = scanner.nextFloat();
                            System.out.print("Idade: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Sexo: ");
                            String sexo = scanner.nextLine();

                            animal.setEspecie(especie);
                            animal.setPeso(peso);
                            animal.setIdade(idade);
                            animal.setSexo(sexo);
                            animais[numAnimais] = animal;
                            numAnimais++;

                            System.out.println(" ");
                            System.out.println("Animal Criado");
                            System.out.println("Tipo de animal: " + tipoAni);
                            System.out.println("Espécie: " + animal.getEspecie());
                            System.out.println("Peso: " + animal.getPeso());
                            System.out.println("Idade: " + animal.getIdade());
                            System.out.println("Sexo: " + animal.getSexo());
                        }
                    } else {
                        System.out.println("Não Não Não, faz menos ai.");
                    }
                    break;
                case 2:
                    System.out.println("\nEscolha o tipo de pessoa que deseja criar:");
                    System.out.println("1. Aluno");
                    System.out.println("2. Professora");
                    System.out.println("3. Diretor");
                    System.out.println("4. Gerente");
                    System.out.println("5. Secretária");

                    int tipoPessoa = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoPessoa == 1) {
                        Aluno aluno = new Aluno();

                        System.out.print("Nome: ");
                        String nomeAluno = scanner.nextLine();
                        aluno.setNomePessoa(nomeAluno);

                        System.out.print("Idade: ");
                        int idadeAluno = scanner.nextInt();
                        scanner.nextLine();
                        aluno.setIdadePessoa(idadeAluno);

                        System.out.print("Gênero: ");
                        String generoAluno = scanner.nextLine();
                        aluno.setGeneroPessoa(generoAluno);

                        System.out.print("Matrícula: ");
                        String matriculaAluno = scanner.nextLine();
                        aluno.setMatriculaAluno(matriculaAluno);

                        System.out.print("Série: ");
                        String serieAluno = scanner.nextLine();
                        aluno.setSerieAluno(serieAluno);

                        alunos[numAlunos] = aluno;
                        numAlunos++;

                        System.out.println(" ");
                        System.out.println("Aluno Criado");
                        System.out.println("Nome: " + aluno.getNomePessoa());
                        System.out.println("Idade: " + aluno.getIdadePessoa());
                        System.out.println("Gênero: " + aluno.getGeneroPessoa());
                        System.out.println("Matrícula: " + aluno.getMatriculaAluno());
                        System.out.println("Série: " + aluno.getSerieAluno());

                    } else if (tipoPessoa == 2) {
                        Professora professora = new Professora();

                        System.out.print("Nome: ");
                        String nomeProfessora = scanner.nextLine();
                        professora.setNomePessoa(nomeProfessora);

                        System.out.print("Idade: ");
                        int idadeProfessora = scanner.nextInt();
                        scanner.nextLine();
                        professora.setIdadePessoa(idadeProfessora);

                        System.out.print("Gênero: ");
                        String generoProfessora = scanner.nextLine();
                        professora.setGeneroPessoa(generoProfessora);

                        System.out.print("Disciplina: ");
                        String disciplinaProfessora = scanner.nextLine();
                        professora.setDisciplinaProfessora(disciplinaProfessora);

                        System.out.print("Salário: ");
                        double salarioProfessora = scanner.nextDouble();
                        professora.setSalario(salarioProfessora);

                        professoras[numProfessoras] = professora;
                        numProfessoras++;

                        System.out.println(" ");
                        System.out.println("Professora Criada");
                        System.out.println("Nome: " + professora.getNomePessoa());
                        System.out.println("Idade: " + professora.getIdadePessoa());
                        System.out.println("Gênero: " + professora.getGeneroPessoa());
                        System.out.println("Disciplina: " + professora.getDisciplinaProfessora());
                        System.out.println("Salário: " + professora.getSalario());

                    } else if (tipoPessoa == 3) {
                        Diretor diretor = new Diretor();

                        System.out.print("Nome: ");
                        String nomeDiretor = scanner.nextLine();
                        diretor.setNomeFuncionario(nomeDiretor);

                        System.out.print("Idade: ");
                        int idadeDiretor = scanner.nextInt();
                        scanner.nextLine();
                        diretor.setIdadeFuncionario(idadeDiretor);

                        System.out.print("Gênero: ");
                        String generoDiretor = scanner.nextLine();
                        diretor.setGeneroFuncionario(generoDiretor);

                        System.out.print("Setor: ");
                        String setorDiretor = scanner.nextLine();
                        diretor.setSetor(setorDiretor);

                        System.out.print("Salário: ");
                        double salarioDiretor = scanner.nextDouble();
                        diretor.setSalario(salarioDiretor);

                        diretores[numDiretores] = diretor;
                        numDiretores++;

                        System.out.println(" ");
                        System.out.println("Diretor Criado");
                        System.out.println("Nome: " + diretor.getNomeFuncionario());
                        System.out.println("Idade: " + diretor.getIdadeFuncionario());
                        System.out.println("Gênero: " + diretor.getGeneroFuncionario());
                        System.out.println("Setor: " + diretor.getSetor());
                        System.out.println("Salário: " + diretor.getSalario());

                    } else if (tipoPessoa == 4) {

                        Gerente gerente = new Gerente();

                        System.out.print("Nome: ");
                        String nomeGerente = scanner.nextLine();
                        gerente.setNomeFuncionario(nomeGerente);

                        System.out.print("Idade: ");
                        int idadeGerente = scanner.nextInt();
                        scanner.nextLine();
                        gerente.setIdadeFuncionario(idadeGerente);

                        System.out.print("Gênero: ");
                        String generoGerente = scanner.nextLine();
                        gerente.setGeneroFuncionario(generoGerente);

                        System.out.print("Setor: ");
                        String setorGerente = scanner.nextLine();
                        gerente.setSetor(setorGerente);

                        System.out.print("Salário: ");
                        double salarioGerente = scanner.nextDouble();
                        gerente.setSalario(salarioGerente);

                        gerentes[numGerentes] = gerente;
                        numGerentes++;

                        System.out.println(" ");
                        System.out.println("Gerente Criado");
                        System.out.println("Nome: " + gerente.getNomeFuncionario());
                        System.out.println("Idade: " + gerente.getIdadeFuncionario());
                        System.out.println("Gênero: " + gerente.getGeneroFuncionario());
                        System.out.println("Setor: " + gerente.getSetor());
                        System.out.println("Salário: " + gerente.getSalario());

                    } else if (tipoPessoa == 5) {
                        Secretaria secretaria = new Secretaria();

                        System.out.print("Nome: ");
                        String nomeSecretaria = scanner.nextLine();
                        secretaria.setNomeFuncionario(nomeSecretaria);

                        System.out.print("Idade: ");
                        int idadeSecretaria = scanner.nextInt();
                        scanner.nextLine();
                        secretaria.setIdadeFuncionario(idadeSecretaria);

                        System.out.print("Gênero: ");
                        String generoSecretaria = scanner.nextLine();
                        secretaria.setGeneroFuncionario(generoSecretaria);

                        System.out.print("Setor: ");
                        String setorSecretaria = scanner.nextLine();
                        secretaria.setSetor(setorSecretaria);

                        System.out.print("Salário: ");
                        double salarioSecretaria = scanner.nextDouble();
                        secretaria.setSalario(salarioSecretaria);

                        secretarias[numSecretarias] = secretaria;
                        numSecretarias++;

                        System.out.println(" ");
                        System.out.println("Secretária Criada");
                        System.out.println("Nome: " + secretaria.getNomeFuncionario());
                        System.out.println("Idade: " + secretaria.getIdadeFuncionario());
                        System.out.println("Gênero: " + secretaria.getGeneroFuncionario());
                        System.out.println("Setor: " + secretaria.getSetor());
                        System.out.println("Salário: " + secretaria.getSalario());

                    } else {
                        System.out.println("Escolha entre 1 e 5.");
                    }
                    break;
                case 3:
                    if (numAnimais == 0) {
                        System.out.println("\nNenhum animal foi criado ainda.");
                    } else {
                        System.out.println("\nAnimais Criados:");
                        for (int i = 0; i < numAnimais; i++) {
                            Animal a = animais[i];
                            a.mostrarAnimal();
                        }
                    }
                    break;
                case 4:
                    if (numAlunos == 0 && numProfessoras == 0 && numGerentes == 0 && numDiretores == 0 && numSecretarias == 0) {
                        System.out.println("\nNenhuma pessoa foi criada ainda.");
                    } else {
                        System.out.println("\nPessoas Criadas:");
                        for (int i = 0; i < numAlunos; i++) {
                            Aluno aluno = alunos[i];
                            aluno.mostrarPessoa();
                        }
                        for (int i = 0; i < numProfessoras; i++) {
                            Professora professora = professoras[i];
                            professora.mostrarPessoa();
                        }
                        for (int i = 0; i < numGerentes; i++) {
                            Gerente gerente = gerentes[i];
                            gerente.mostrarFuncionario();
                        }
                        for (int i = 0; i < numDiretores; i++) {
                            Diretor diretor = diretores[i];
                            diretor.mostrarFuncionario();
                        }
                        for (int i = 0; i < numSecretarias; i++) {
                            Secretaria secretaria = secretarias[i];
                            secretaria.mostrarFuncionario();
                        }
                        break;
                    }
                default:
                    System.out.println("Escolha entre 1 e 4.");
            }
        }
        scanner.close();
    }
}


