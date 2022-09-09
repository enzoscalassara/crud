package tabelas;

public class Palete {
    private int id_palete;
    private int id_produto;
    private String identificador_nome;
    private int identificador_numerico;
    private int camara;
    private int caixas;

    public Palete() {
    }

    public Palete(int id_produto, String identificador_nome, int identificador_numerico, int camara, int caixas) {
        this.id_produto = id_produto;
        this.identificador_nome = identificador_nome;
        this.identificador_numerico = identificador_numerico;
        this.camara = camara;
        this.caixas = caixas;
    }

    public int getId_palete() {
        return id_palete;
    }

    public void setId_palete(int id_palete) {
        this.id_palete = id_palete;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getIdentificador_nome() {
        return identificador_nome;
    }

    public void setIdentificador_nome(String identificador_nome) {
        this.identificador_nome = identificador_nome;
    }

    public int getIdentificador_numerico() {
        return identificador_numerico;
    }

    public void setIdentificador_numerico(int identificador_numerico) {
        this.identificador_numerico = identificador_numerico;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getCaixas() {
        return caixas;
    }

    public void setCaixas(int caixas) {
        this.caixas = caixas;
    }

    public String getValores() {
        return getId_produto() + ", '" + getIdentificador_nome() + "', " + getIdentificador_numerico() + ", "
                + getCamara() +  ", " + getCaixas();
    }

    public static String getColunas() {
        return "id_produto, identificador_nome, identificador_numerico, camara, caixas";
    }
    
    public static String getID_nome(){
        return "id_palete";
    }

    public static String getTabela() {
        return "paletes";
    }
}
