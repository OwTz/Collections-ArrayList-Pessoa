
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import pessoa.ComparatorPorAltura;
import pessoa.ComparatorPorIdade;
import pessoa.Pessoa;



public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();


        boolean ativo = true;
        while(ativo == true){
            System.out.println("adicionando Pessoas: ");
            System.out.println("\n menu: \n 1 - adicionar \n 2 - ordenar \n 3- fechar");
            int opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("digite o nome: ");
                    String nome = scan.next();
                    System.out.println("digite a idade: ");
                    int idade = scan.nextInt();
                    System.out.println("digite a altura: ");
                    Float altura =  scan.nextFloat();

                    listaDePessoas.add(new Pessoa(nome, idade, altura));
                    break;
                case 2:
                  System.out.println("escolha: 1 - idade \n 2 - altura \n 3- nome \n para ordernar: ");
                    int opc2 = scan.nextInt();
                    switch (opc2) {
                        case 1:
                                 Collections.sort(listaDePessoas, new ComparatorPorIdade());
                                 for (Pessoa pessoa: listaDePessoas) {
                                    System.out.println( pessoa.toString());   
                                }
                            break;
                        case 2: 
                                Collections.sort(listaDePessoas, new ComparatorPorAltura());
                                for (Pessoa pessoa: listaDePessoas) {
                                    System.out.println("pessoa: "+pessoa.getNome()+ " tem a altura: " +pessoa.getAltura());
                                }
                                break;
                        
                        case 3:
                                break;
                        default:
                        System.out.println("opcao nao encontrada");
                            break;
                    }

                case 3:
                    System.out.println("programa fechado");
                    ativo = false;
                    break;
                default: 
                System.out.println("opcao não encontrada.");
                    break;
            }
        }
    }
}
