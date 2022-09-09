package tabelas;

public class Produto_venda {
    private int id_produto_venda;
    private int id_produto;
    private int id_mercadoria_venda;
    private double qtd_kg;

    public Produto_venda() {
    }

    public Produto_venda(int id_produto, int id_mercadoria_venda, double qtd_kg) {
        this.id_produto = id_produto;
        this.id_mercadoria_venda = id_mercadoria_venda;
        this.qtd_kg = qtd_kg;
    }

    public int getId_produto_venda() {
        return id_produto_venda;
    }

    public void setId_produto_venda(int id_produto_venda) {
        this.id_produto_venda = id_produto_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_mercadoria_venda() {
        return id_mercadoria_venda;
    }

    public void setId_mercadoria_venda(int id_mercadoria_venda) {
        this.id_mercadoria_venda = id_mercadoria_venda;
    }

    public double getQtd_kg() {
        return qtd_kg;
    }

    public void setQtd_kg(double qtd_kg) {
        this.qtd_kg = qtd_kg;
    }

    public String getTabela(){
        return "produtos_venda";
    }

    public String getColunas(){
        return "id_produto, id_mercadoria_venda, qtd_kg";
    }
    
    public static String getID_nome(){
        return "id_produto_venda";
    }

    public String getValores(){
        return getId_produto() + ", " + getId_mercadoria_venda() + ", " + getQtd_kg();
    }
}
