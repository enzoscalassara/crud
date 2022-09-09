package tabelas;

public class Carregamento_entrada {
    private int id_carregamento_entrada;
    private int id_fornecedor;
    private String data_chegada;
    private String transportadora;
    private String motorista;

    public Carregamento_entrada() {
    }

    public Carregamento_entrada(int id_fornecedor, String data_chegada, String transportadora, String motorista) {
        this.id_fornecedor = id_fornecedor;
        this.data_chegada = data_chegada;
        this.transportadora = transportadora;
        this.motorista = motorista;
    }
    
    public Carregamento_entrada(int id_carregamento_entrada, int id_fornecedor, String data_chegada, String transportadora, String motorista) {
        this.id_fornecedor = id_fornecedor;
        this.data_chegada = data_chegada;
        this.transportadora = transportadora;
        this.motorista = motorista;
        this.id_carregamento_entrada = id_carregamento_entrada;
    }

    public int getId_carregamento_entrada() {
        return id_carregamento_entrada;
    }

    public void setId_carregamento_entrada(int id_carregamento_entrada) {
        this.id_carregamento_entrada = id_carregamento_entrada;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(String data_chegada) {
        this.data_chegada = data_chegada;
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

    public static String getTabela(){
        return "carregamentos_entrada";
    }

    public static String getColunas(){
        return "id_fornecedor, data_chegada, transportadora, motorista";
    }
    
    public static String getColunasID(){
        return "id_carregamento_entrada, id_fornecedor, data_chegada, transportadora, motorista";
    }
    
    public static String getID_nome(){
        return "id_carregamento_entrada";
    }

    public static String getColumns_equal_values(int id_fornecedor, String data_chegada, String transportadora, String motorista){
        return "id_fornecedor = " + id_fornecedor + ", data_chegada = '" + data_chegada + "', transportadora = '" + transportadora + "', motorista = '" +
                motorista + "'";
    }
    
    public String getValores(){
        return getId_fornecedor() + ", '" + getData_chegada() + ", '" + getTransportadora() + ", '"
                + getMotorista() + "'";
    }
}
