import java.time.LocalDate;

public class Produto {

    private String nome;
    private int codigo;
    private float preco;
    private LocalDate validade;
    private Promocao promocao;
    private Categoria categoria;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Promocao getPromocao() {return promocao;}

    public void setPromocao(Promocao promocao) {this.promocao = promocao;}

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", validade=" + validade +
                ", promocao=" + promocao +
                ", categoria=" + categoria+
                "}\n";
    }

    public Produto(String nome, int codigo, float preco, LocalDate validade, Promocao promocao, Categoria categoria){

        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.validade = validade;
        this.promocao = promocao;
        this.categoria = categoria;
    }
}

