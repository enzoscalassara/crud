package tabelas;

public class Comprador {
    private int id_comprador;
    private String nome;
    private String nome_contato;
    private String email_contato;
    private String tel;
    private String cnpj;

    public Comprador() {
    }

    public Comprador(String nome, String nome_contato, String email_contato, String tel, String cnpj) {
        this.nome = nome;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
        this.tel = tel;
        this.cnpj = cnpj;
    }
    
    public Comprador(int id_comprador, String nome, String nome_contato, String email_contato, String tel, String cnpj) {
        this.nome = nome;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
        this.tel = tel;
        this.cnpj = cnpj;
        this.id_comprador = id_comprador;
    }

    public int getId_comprador() {
        return id_comprador;
    }

    public void setId_comprador(int id_comprador) {
        this.id_comprador = id_comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getEmail_contato() {
        return email_contato;
    }

    public void setEmail_contato(String email_contato) {
        this.email_contato = email_contato;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public static String getTabela(){
        return "compradores";
    }

    public static String getColunas(){
        return "nome, nome_contato, email_contato, tel, cnpj";
    }
    
    public static String getColunasID(){
        return "id_comprador, nome, nome_contato, email_contato, tel, cnpj";
    }
    
    public static String getID_nome(){
        return "id_comprador";
    }
    
    public static String getColumns_equal_values(String nome, String cnpj, String tel, String nome_contato, String email_contato){
        return "nome = '" + nome + "', cnpj = '" + cnpj + "', tel = '" +
                tel + "', nome_contato = '" + nome_contato + "', email_contato = '" + email_contato + "'";
    }

    public String getValores(){
        return "'" + getNome() + ", '" + getNome_contato() + ", '" + getEmail_contato() + ", '" + getTel() + ", '"
                + getCnpj() + "'";
    }
}
