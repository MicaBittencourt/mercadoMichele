import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Estoque {

    private static Map<Produto,Integer> listaProdutos = new HashMap<>();

    public static Map<Produto, Integer> getListaProdutos() {
        return listaProdutos;
    }

    public static void setListaProdutos(Map<Produto, Integer> listaProdutos) {
        Estoque.listaProdutos = listaProdutos;
    }

    public static void adicionarProduto(Produto produto){
        Estoque.listaProdutos.put(produto,1);
    }

    public static void adicionarProduto(int quantidade, Produto produto){
        int quantidadeEstoque = Estoque.quantidadeEstoque(produto);
        if (quantidadeEstoque>0){
            int novaQuantidade = quantidadeEstoque + quantidade;
            Estoque.listaProdutos.put(produto,novaQuantidade);
        } else{
            Estoque.listaProdutos.put(produto, quantidade);
        }
    }

    public static void retirarProduto(Produto produto){
        Estoque.listaProdutos.remove(produto);
    }

    public static void retirarProduto(int quantidade, Produto produto)throws Exception{
        int quantidadeEstoque = Estoque.quantidadeEstoque(produto);
        if (quantidadeEstoque>0 && quantidadeEstoque>=quantidade){
            int novaQuantidade = quantidadeEstoque - quantidade;
            Estoque.listaProdutos.put(produto,novaQuantidade);
        } else {
            throw new Exception("Quantidade em estoque insuficiente!");
        }
    }

    public static Produto retirarProduto(int quantidade, int codigo)throws Exception{

        Set<Produto> produtos = Estoque.listaProdutos.keySet();
        for (Produto p : produtos){
            if (p.getCodigo() == codigo){
                retirarProduto(quantidade,p);
                return p;
            }
        }

        System.out.println("Produto não encontrado!");
        return null;
    }

    public static int quantidadeEstoque(Produto produto){
        return Estoque.listaProdutos.getOrDefault(produto, 0);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "listaProdutos=" + listaProdutos +
                '}';
    }


}
