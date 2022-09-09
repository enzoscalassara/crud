package tabelas;

public class Fornecedor {
    private int id_fornecedor;
    private String nome;
    private String cnpj;
    private String tel;
    private String nome_contato;
    private String email_contato;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String cnpj, String tel, String nome_contato, String email_contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.tel = tel;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
    }
    
    public Fornecedor(int id_fornecedor, String nome, String cnpj, String tel, String nome_contato, String email_contato) {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tel = tel;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public static String getTabela(){
        return "fornecedores";
    }

    public static String getColunas(){
        return "nome, cnpj, tel, nome_contato, email_contato";
    }
    
    public static String getColunasID(){
        return "id_fornecedor, nome, cnpj, tel, nome_contato, email_contato";
    }
    
    public static String getID_nome(){
        return "id_fornecedor";
    }
    
    public static String getColumns_equal_values(String parnome, String parcnpj, String partel, String parnome_contato, String paremail_contato){
        return "nome = '" + parnome + "', cnpj = '" + parcnpj + "', tel = '" +
                partel + "', nome_contato = '" + parnome_contato + "', email_contato = '" + paremail_contato + "'";
    }

    public String getValores(){
        return "'" + getNome() + "', '" + getCnpj() + "', '" +  getTel() + "', '" +  getNome_contato()
                + "', '" +  getEmail_contato() + "'";
    }

}
