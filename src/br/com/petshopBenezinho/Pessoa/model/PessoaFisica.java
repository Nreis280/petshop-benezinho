package br.com.petshopBenezinho.Pessoa.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa{


    private String cpf;
    private Sexo sexo;

    private Collection<PessoaFisica> filhos = new Vector<>();

    public PessoaFisica addFilho(PessoaFisica filho) {
        this.filhos.add(filho);
        return this;
    }

    public  PessoaFisica removeFilho(PessoaFisica filho){
        this.filhos.remove(filho);
        return this;
    }

    public Collection<PessoaFisica>getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }


    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, Sexo sexo, Collection<PessoaFisica> filhos) {
        this.cpf = cpf;
        this.sexo = sexo;
        this.filhos = filhos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}
