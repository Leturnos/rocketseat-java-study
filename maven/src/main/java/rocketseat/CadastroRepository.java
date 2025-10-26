package rocketseat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CadastroRepository {
    private Connection connection;
    public CadastroRepository(){
        connection = FabricaConexao.getConnection();
    }

    public void salvar(Cadastro cadastro){
        try{
            String sql = "INSERT INTO public.cadastro(nome, idade) VALUES(?,?);";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setInt(2, cadastro.getIdade());

            preparedStatement.execute();
            System.out.println("Cadastro inserido com sucesso");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Cadastro> listar(){
        List<Cadastro> list = new ArrayList<>();
        try{
            String sql = "SELECT id, nome, idade FROM public.cadastro;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");

                Cadastro cadastro = new Cadastro();
                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);
                list.add(cadastro);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public void atualizar(Cadastro cadastro){
        try{
            String sql = "UPDATE public.cadastro SET nome=?, idade=? WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setInt(2, cadastro.getIdade());
            preparedStatement.setInt(3, cadastro.getId());

            preparedStatement.execute();
            System.out.println("Cadastro atualizado com sucesso");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluir(Integer id){
        try{
            String sql = "DELETE FROM public.cadastro WHERE id=?;";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.execute();
            System.out.println("Cadastro excluido com sucesso");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cadastro buscar(Integer id){
        Cadastro cadastro = null;
        try{
            String sql = "SELECT id,nome,idade FROM public.cadastro WHERE id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");

                cadastro = new Cadastro();
                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return cadastro;
    }
}
