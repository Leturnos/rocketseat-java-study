package rocketseat;

import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();

        String opt = "0";
        while (!opt.equals("6")){
            System.out.println("=============");
            System.out.println("O que deseja?");
            System.out.println("1-Adicionar");
            System.out.println("2-Listar");
            System.out.println("3-Atualizar");
            System.out.println("4-Excluir");
            System.out.println("5-Buscar");
            System.out.println("6-Sair");
            System.out.println("=============");
            opt = scanner.nextLine();

            if (opt.equals("1")){
                System.out.println("Digite seu nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite sua idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Cadastro cadastro = new Cadastro(nome,idade);
                repository.salvar(cadastro);
            }
            else if (opt.equals("2")){
                List<Cadastro> cadastros = repository.listar();
                System.out.println("ID  Nome  Idade");
                for(Cadastro c: cadastros){
                    System.out.println(c.getId() + "-" + c.getNome() + "-" + c.getIdade());
                }
            }
            else if (opt.equals("3")){
                System.out.println("Digite o Id do item a ser atualizado:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o NOVO nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite a NOVA idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Cadastro cadastro = new Cadastro(nome, idade);
                cadastro.setId(id); // Define o ID do objeto para o WHERE
                repository.atualizar(cadastro);

            }
            else if (opt.equals("4")){
                System.out.println("Digite o Id do item desejado");
                int id = scanner.nextInt();
                scanner.nextLine();
                repository.excluir(id);
            }
            else if (opt.equals("5")){
                System.out.println("Digite o Id do item desejado");
                int id = scanner.nextInt();
                scanner.nextLine();
                Cadastro cadastro = repository.buscar(id);
                if(cadastro!=null){
                    System.out.println(cadastro.getId() + "-" + cadastro.getNome() + "-" + cadastro.getIdade());
                }
                else{
                    System.out.println("Não foi encontrado ninguém com esse Id");
                }
            }
        }
    }
}