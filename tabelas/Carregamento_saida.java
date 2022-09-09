package tabelas;

public class Carregamento_saida {
    private int id_carregamento_saida;
    private int id_produto_venda;
    private int id_mercadoria_venda;
    private int id_comprador;
    private String data_saida;
    private String transportadora;
    private String motorista;
    private String lacre_sif;
    private String fiscal_sif;
    private String responsavel_cdc;
    private String despachante;

    public Carregamento_saida() {
    }

    public Carregamento_saida(int id_produto_venda, int id_mercadoria_venda, int id_comprador, String data_saida,
                              String transportadora, String motorista, String lacre_sif, String fiscal_sif,
                              String responsavel_cdc, String despachante) {
        this.id_produto_venda = id_produto_venda;
        this.id_mercadoria_venda = id_mercadoria_venda;
        this.id_comprador = id_comprador;
        this.data_saida = data_saida;
        this.transportadora = transportadora;
        this.motorista = motorista;
        this.lacre_sif = lacre_sif;
        this.fiscal_sif = fiscal_sif;
        this.responsavel_cdc = responsavel_cdc;
        this.despachante = despachante;
    }

    public int getId_carregamento_saida() {
        return id_carregamento_saida;
    }

    public void setId_carregamento_saida(int id_carregamento_saida) {
        this.id_carregamento_saida = id_carregamento_saida;
    }

    public int getId_produto_venda() {
        return id_produto_venda;
    }

    public void setId_produto_venda(int id_produto_venda) {
        this.id_produto_venda = id_produto_venda;
    }

    public int getId_mercadoria_venda() {
        return id_mercadoria_venda;
    }

    public void setId_mercadoria_venda(int id_mercadoria_venda) {
        this.id_mercadoria_venda = id_mercadoria_venda;
    }

    public int getId_comprador() {
        return id_comprador;
    }

    public void setId_comprador(int id_comprador) {
        this.id_comprador = id_comprador;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getLacre_sif() {
        return lacre_sif;
    }

    public void setLacre_sif(String lacre_sif) {
        this.lacre_sif = lacre_sif;
    }

    public String getFiscal_sif() {
        return fiscal_sif;
    }

    public void setFiscal_sif(String fiscal_sif) {
        this.fiscal_sif = fiscal_sif;
    }

    public String getResponsavel_cdc() {
        return responsavel_cdc;
    }

    public void setResponsavel_cdc(String responsavel_cdc) {
        this.responsavel_cdc = responsavel_cdc;
    }

    public String getDespachante() {
        return despachante;
    }

    public void setDespachante(String despachante) {
        this.despachante = despachante;
    }

    public String getTabela(){
        return "carregamentos_saida";
    }

    public String getColunas(){
        return "id_produto_venda, id_mercadoria_venda, id_comprador, data_saida, transportadora, motorista, lacre_sif," +
                " fiscal_sif, responsavel_cdc, despachante";
    }
    
    public static String getID_nome(){
        return "id_carregamento_saida";
    }

    public String getValores(){
        return getId_produto_venda() + ", " + getId_mercadoria_venda() + ", " + getId_comprador() + ", '"
                + getData_saida() + "', '" + getTransportadora() + "', '" + getMotorista() + "', '" + getLacre_sif()
                + "', '" + getFiscal_sif() + "', '" + getResponsavel_cdc() + "', '" + getDespachante() + "'";
    }
}
