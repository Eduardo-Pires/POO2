import listener.Aeroporto;
import listener.Agricultor;
import listener.Jornal;
import publisher.PrevisaoTempo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aeroporto> aeroportos = new ArrayList<>();
        List<Jornal> jornais = new ArrayList<>();
        List<Agricultor> agricultores = new ArrayList<>();
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();

        Scanner scanf = new Scanner(System.in);
        int escolha;

        while (true)
        {
            System.out.println("""
                    tecle 1 - para adicionar um listener para um aeroporto
                    tecle 2 - para adicionar um listener para um agricultor
                    tecle 3 - para adicionar um listener para um jornal
                    tecle 4 - para remover um listener de um aeroporto
                    tecle 5 - para remover um listener de um jornal
                    tecle 6 - para remover um listener de um agricultor
                    tecle 7 - para executar a previsão do tempo
                    """);

            escolha = scanf.nextInt();

            switch (escolha){
                case 1:
                    aeroportos.add(new Aeroporto());
                    previsaoTempo.subscribe(aeroportos.get(aeroportos.size()-1));
                    System.out.println(aeroportos.get(aeroportos.size()-1).getCodigo()+ "(aeroporto) adicionado");
                    break;
                case 2:
                    agricultores.add(new Agricultor());
                    previsaoTempo.subscribe(agricultores.get(agricultores.size()-1));
                    System.out.println(agricultores.get(agricultores.size()-1).getCodigo()+ "(agricultor) adicionado");
                    break;
                case 3:
                    jornais.add(new Jornal());
                    System.out.println(jornais.get(jornais.size()-1).getCodigo()+ "(Jornal) adicionado");
                    previsaoTempo.subscribe(jornais.get(jornais.size() - 1));
                    break;
                case 4:
                    for (int i = previsaoTempo.size()-1; i > 0 ; i--) {
                        if (previsaoTempo.getListener(i) instanceof Aeroporto)
                        {
                            System.out.println("Ultimo aeroporto adicionado removido");
                            previsaoTempo.unsubscribe(previsaoTempo.getListener(i));
                            break;
                        }
                    }
                    break;
                case 5:
                    for (int i = previsaoTempo.size()-1; i > 0 ; i--) {
                        if (previsaoTempo.getListener(i) instanceof Jornal)
                        {
                            System.out.println("Ultimo jornal adicionado removido");
                            previsaoTempo.unsubscribe(previsaoTempo.getListener(i));
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = previsaoTempo.size()-1; i >= 0 ; i--) {
                        if (previsaoTempo.getListener(i) instanceof Agricultor)
                        {
                            System.out.println("Ultimo agricultor adicionado removido");
                            previsaoTempo.unsubscribe(previsaoTempo.getListener(i));
                            break;
                        }
                    }
                    break;
                case 7:
                    previsaoTempo.executar();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
    }
}
