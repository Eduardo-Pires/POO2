import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício 1

        Scanner scanner = new Scanner(System.in);
        int escolha;


        System.out.print("Digite o número de personagens: ");
        int numeroPersonagens = scanner.nextInt();


        Character.CharacterBuilder personagem = new Character.CharacterBuilder();
        Character[] character = new Character[numeroPersonagens];
        boolean execution = true;
        for (int i = 0; i < numeroPersonagens ;i++)
        {
            while (execution)
            {
                System.out.printf("personagem %d\n", i+1);
                System.out.println(
                        """ 
                                (Tecle 1) para digitar o Nome
                                (Tecle 2) para selecionar a Profissão
                                (Tecle 3) para selecionar o Equipamento
                                (Tecle 4) para definir a Inteligência
                                (Tecle 5) para atribuir a Força
                                (Tecle 6) para estabelecer a Velocidade
                                (Tecle 7) para determinar a Saúde
                                (Tecle 8) para Rolar Atributos Aleatoriamente
                                (Tecle 9) para encerrar e criar personagem
                                """);
                escolha = scanner.nextInt();
                scanner.nextLine();
                switch (escolha) {
                    case 1 -> {
                        System.out.print("Digite o nome do personagem: ");
                        String name = scanner.nextLine();
                        personagem.name(name);
                    }
                    case 2 -> {
                        System.out.println("Selecione a profissão do personagem: ");
                        System.out.println("1. Arqueiro");
                        System.out.println("2. Ladino");
                        System.out.println("3. Cavaleiro");
                        int profissaoOpcao = scanner.nextInt();
                        scanner.nextLine();
                        String job;
                        switch (profissaoOpcao) {
                            case 1 -> job = "Arqueiro";
                            case 2 -> job = "Ladino";
                            case 3 -> job = "Cavaleiro";
                            default -> {
                                System.out.println("Opção inválida!");
                                job = null;
                            }
                        }
                        personagem.job(job);
                    }
                    case 3 -> {
                        System.out.println("Selecione o equipamento do personagem: ");
                        System.out.println("1. Espada");
                        System.out.println("2. Arco");
                        System.out.println("3. Adaga");
                        int equipamentoOpcao = scanner.nextInt();
                        scanner.nextLine();
                        String equipment;
                        switch (equipamentoOpcao) {
                            case 1 -> equipment = "Espada";
                            case 2 -> equipment = "Arco";
                            case 3 -> equipment = "Adaga";
                            default -> {
                                System.out.println("Opção inválida!");
                                equipment = null;
                            }
                        }
                        personagem.equipment(equipment);
                    }
                    case 4 -> {
                        System.out.print("Defina a inteligência do personagem: ");
                        int intelligence = scanner.nextInt();
                        personagem.intelligence(intelligence);
                    }
                    case 5 -> {
                        System.out.print("Defina a força do personagem: ");
                        int strength = scanner.nextInt();
                        personagem.strength(strength);
                    }
                    case 6 -> {
                        System.out.print("Defina a velocidade do personagem: ");
                        int speed = scanner.nextInt();
                        personagem.speed(speed);
                    }
                    case 7 -> {
                        System.out.print("Defina a saúde do personagem: ");
                        int health = scanner.nextInt();
                        personagem.health(health);
                    }
                    case 8 -> {
                        System.out.println("Gerados atributos aleatórios para Inteligencia, força, saúde e velocidade");
                        personagem.randomAtributes();
                    }
                    case 9 -> {
                        character[i] = personagem.build();
                        System.out.println("Status do personagem:");
                        System.out.println(character[i].toString());
                        System.out.println("Criação do personagem encerrada.");
                        execution = false;
                    }
                }

            }
            execution = true;
        }

        System.out.println("\n\n Fim da criação de Personagens \n\n");

        //exercício 3
        if (character.length > 1)
        {
            while (execution)
            {
                int personagem1Pontos = 0;
                int personagem2Pontos = 0;

                System.out.println("----------------------Batalha de personagens----------------------");
                System.out.printf("escolha o indice de dois personagens (1 á %d): \n", character.length);
                System.out.print("personagem 1: ");
                int personagem1 = scanner.nextInt();
                System.out.print("personagem 2: ");
                int personagem2 = scanner.nextInt();

                if (character[personagem1 - 1].GetMediaAtributos() > character[personagem2 - 1].GetMediaAtributos())
                {
                    personagem1Pontos = 50;
                }
                else if (character[personagem1 - 1].GetMediaAtributos() < character[personagem2 - 1].GetMediaAtributos())
                {
                    personagem2Pontos = 50;
                }

                if(Objects.equals(character[personagem1 - 1].getJob(), "Arqueiro") && Objects.equals(character[personagem1 - 1].getEquipment(), "Arco"))
                {
                    personagem1Pontos += 50;
                }
                else if(Objects.equals(character[personagem1 - 1].getJob(), "Ladino") && Objects.equals(character[personagem1 - 1].getEquipment(), "Adaga"))
                {
                    personagem1Pontos += 50;
                }
                else if(Objects.equals(character[personagem1 - 1].getJob(), "Espada") && Objects.equals(character[personagem1 - 1].getEquipment(), "Cavalheiro"))
                {
                    personagem1Pontos += 50;
                }

                if(Objects.equals(character[personagem2 - 1].getJob(), "Ladino") && Objects.equals(character[personagem2 - 1].getEquipment(), "Adaga"))
                {
                    personagem2Pontos += 50;
                }
                else if(Objects.equals(character[personagem2 - 1].getJob(), "Arqueiro") && Objects.equals(character[personagem2 - 1].getEquipment(), "Arco"))
                {
                    personagem2Pontos += 50;
                }
                else if(Objects.equals(character[personagem2 - 1].getJob(), "Espada") && Objects.equals(character[personagem2 - 1].getEquipment(), "Cavalheiro"))
                {
                    personagem2Pontos += 50;
                }

                if (personagem1Pontos > personagem2Pontos)
                {
                    System.out.println("personagem 1 venceu");
                }
                else if (personagem1Pontos < personagem2Pontos)
                {
                    System.out.println("personagem 2 venceu");
                }
                else
                {
                    System.out.println("Empate");
                }
                scanner.nextLine();
                String resposta;

                do {
                    System.out.println("outra batalha? (sim ou não)");
                    resposta = scanner.nextLine();
                }while (!Objects.equals(resposta, "sim") && !Objects.equals(resposta, "não"));

                execution = Objects.equals(resposta, "sim");
            }
        }
    }
}
