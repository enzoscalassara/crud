package tabelas;

public class Mercadoria_venda {
    private int id_mercadoria_venda;
    private String nota_fiscal;

    public Mercadoria_venda() {
    }

    public Mercadoria_venda(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public int getId_mercadoria_venda() {
        return id_mercadoria_venda;
    }

    public void setId_mercadoria_venda(int id_mercadoria_venda) {
        this.id_mercadoria_venda = id_mercadoria_venda;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getTabela(){
        return "mercadorias_venda";
    }

    public String getColunas(){
        return "nota_fiscal";
    }
    
    public static String getID_nome(){
        return "id_mercadoria_venda";
    }

    public String getValores(){
        return "'" + getNota_fiscal() + "'";
    }
}
