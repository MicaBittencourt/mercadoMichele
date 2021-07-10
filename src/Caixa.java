import java.util.ArrayList;
import java.util.List;

public class Caixa {

        public void registrarVenda (int quantidade, int codigo) {
                try {
                        Produto p = Estoque.retirarProduto(quantidade,codigo);
                        if (p != null){
                                Venda v = new Venda(quantidade, p);
                                vendaCaixa.add(v);
                        }

                } catch (Exception e){
                        System.out.println(e.getMessage());
                }

        }

        private List<Venda> vendaCaixa = new ArrayList<>();

        public void totalPorProduto (){
                for (Venda v : vendaCaixa) {
                      float totalProduto =  v.getQuantidade()*v.getProduto().getPreco();
                        System.out.println(v.getProduto().getNome() + " - " + v.getQuantidade() + " X " + v.getProduto().getPreco() + " = " + totalProduto);
                }

        }

        public float subTotalVenda(){
                float total = 0;
                for (Venda v : vendaCaixa) {
                        float totalProduto = v.getQuantidade()*v.getProduto().getPreco();
                        total = total + totalProduto;
                }
                return total;
        }

        public float totalDesconto(){
                float total = 0;
                for (Venda v : vendaCaixa) {
                        float desconto = 0;
                        if (v.getProduto().getCategoria() == Categoria.bebidas){
                                desconto = 0.2f;
                        }

                        float totalProduto = v.getQuantidade()*v.getProduto().getPreco()*desconto;
                        total = total + totalProduto;
                }
                return total;

        }

        public float totalVenda(){
                return subTotalVenda()-totalDesconto();
        }

}
