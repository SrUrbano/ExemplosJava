package Aula03.classes;

public class Endereco{

    private String rua;
    private String bairro;
    private String numero;

    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco(String rua, String bairro, String numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco [bairro=" + bairro + ", numero=" + numero + ", rua=" + rua + "]";
    }

    




    
}