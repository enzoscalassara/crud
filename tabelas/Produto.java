package tabelas;

public class Produto {
    private int id_produto;
    private int id_carregamento_entrada;
    private String nome;
    private double qtd_kg;
    private String data_val;

    public Produto() {
    }

    public Produto(int id_carregamento_entrada, String nome, double qtd_kg, String data_val) {
        this.id_carregamento_entrada = id_carregamento_entrada;
        this.nome = nome;
        this.qtd_kg = qtd_kg;
        this.data_val = data_val;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_carregamento_entrada() {
        return id_carregamento_entrada;
    }

    public void setId_carregamento_entrada(int id_carregamento_entrada) {
        this.id_carregamento_entrada = id_carregamento_entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtd_kg() {
        return qtd_kg;
    }

    public void setQtd_kg(double qtd_kg) {
        this.qtd_kg = qtd_kg;
    }

    public String getData_val() {
        return data_val;
    }

    public void setData_val(String data_val) {
        this.data_val = data_val;
    }

    public String getTabela(){
        return "produtos";
    }

    public String getColunas(){
        return "id_carregamento_entrada, nome, qtd_kg, data_val";
    }
    
    public static String getID_nome(){
        return "id_produto";
    }

    public String getValores(){
        return getId_carregamento_entrada() + ", '" + getNome() + "', " + getQtd_kg() + ", '" + getData_val() + "'";
    }
}
