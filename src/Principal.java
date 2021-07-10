import java.time.LocalDate;
import java.time.Month;

public class Principal {

    public static void main(String[] args) {

        Produto p=new Produto();
        p.setNome("nome");
        p.setCodigo(123);
        p.setPreco(0.3f);
        p.setValidade(LocalDate.of(2021, Month.JANUARY,15));
        p.setPromocao(Promocao.valueOf("sim"));
        p.setCategoria(Categoria.valueOf("alimentos"));

        Produto arroz = new Produto("Arroz", 100, 6.99f, LocalDate.of(2022, Month.JANUARY, 26),Promocao.nao, Categoria.alimentos);
        Produto biscoito = new Produto("Biscoito", 430, 3.29f, LocalDate.of(2021, Month.AUGUST,20), Promocao.nao, Categoria.alimentos);
        Produto cerveja = new Produto("Cerveja", 540, 3.69f, LocalDate.of(2022, Month.APRIL, 16), Promocao.sim, Categoria.bebidas);
        Produto leite = new Produto("Leite", 550, 4.19f, LocalDate.of(2021, Month.SEPTEMBER, 28), Promocao.sim, Categoria.bebidas);
        Produto feijao = new Produto("Feijão", 230, 8.99f, LocalDate.of(2021, Month.DECEMBER, 29), Promocao.nao, Categoria.alimentos);
        Produto oleo = new Produto("Óleo", 260, 6.99f, LocalDate.of(2021, Month.OCTOBER, 26), Promocao.nao, Categoria.alimentos);
        Produto refrigerante = new Produto("Refrigerante", 190, 6.99f, LocalDate.of(2021, Month.AUGUST,25), Promocao.nao, Categoria.bebidas);
        Produto detergente = new Produto("Detergente", 420, 1.29f, LocalDate.of(2022, Month.JUNE, 17), Promocao.nao, Categoria.limpeza);
        Produto manteiga = new Produto("Manteiga", 150, 9.99f, LocalDate.of(2021, Month.JULY, 20), Promocao.nao, Categoria.alimentos);
        Produto papelHigienico = new Produto("Papel Higiênico", 360, 15.99f, LocalDate.of(2023, Month.APRIL, 29), Promocao.nao, Categoria.limpeza);
        Produto suco = new Produto("Suco", 200, 6.99f, LocalDate.of(2021, Month.SEPTEMBER, 22), Promocao.sim, Categoria.bebidas);
        Produto iogurte = new Produto("Iogurte", 900, 4.99f, LocalDate.of(2021, Month.SEPTEMBER, 28), Promocao.sim, Categoria.laticinios);
        Produto batata = new Produto("Batata", 330, 2.99f, LocalDate.of(2021, Month.JULY, 20), Promocao.sim, Categoria.feira);

        Estoque.adicionarProduto(20, arroz);
        Estoque.adicionarProduto(100, biscoito);
        Estoque.adicionarProduto(200, cerveja);
        Estoque.adicionarProduto(300, leite);
        Estoque.adicionarProduto(50, feijao);
        Estoque.adicionarProduto(30, oleo);
        Estoque.adicionarProduto(70, detergente);
        Estoque.adicionarProduto(50, manteiga);
        Estoque.adicionarProduto(60, refrigerante);
        Estoque.adicionarProduto(40, papelHigienico);
        Estoque.adicionarProduto(30, suco);
        Estoque.adicionarProduto(50, iogurte);
        Estoque.adicionarProduto(100, batata);

        Caixa caixa = new Caixa();

        caixa.registrarVenda(3, 100);

         caixa.totalPorProduto();

        System.out.println("-------------------------------------");
        System.out.println("Subtotal = " + caixa.subTotalVenda());
        System.out.println("Desconto = " + caixa.totalDesconto());
        System.out.println("Total = " + caixa.totalVenda());

    }

}
