package br.com.petshopBenezinho.Pessoa.model;

public class Sexo {

    private String tipo;

    public Sexo() {
    }

    public Sexo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Sexo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
