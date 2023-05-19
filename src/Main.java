import br.com.petshopBenezinho.Pessoa.model.Pessoa;
import br.com.petshopBenezinho.Pessoa.model.PessoaFisica;
import br.com.petshopBenezinho.Pessoa.model.PessoaJuridica;
import br.com.petshopBenezinho.Pessoa.model.Sexo;
import br.com.petshopBenezinho.animal.model.Animal;
import br.com.petshopBenezinho.documento.model.Documento;
import br.com.petshopBenezinho.servico.model.Servico;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static PessoaFisica novaPessoa(Long id, String nome, String cpf, Sexo sexo){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setCpf(cpf);
        pf.setSexo(sexo);

        return pf;
    }

    public static Sexo novosexo(String tipo){
        Sexo sx = new Sexo();
        sx.setTipo(tipo);
        return sx;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String CNPJ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setCNPJ(CNPJ);

        return pj;
    }


    public static Animal novoAnimal(Long id, String nome, String raca, String descricao, String observacao, Pessoa dono){
        Animal an = new Animal();
        an.setId(id);
        an.setNome(nome);
        an.setRaca(raca);
        an.setDescricao(descricao);
        an.setObservacao(observacao);
        an.setDono(dono);
        return an;

    }

    public static Documento novoDocumento(int id,String numero,Pessoa pessoa){
        Documento doc = new Documento();
        doc.setId(id);
        doc.setNumero(numero);
        doc.setPessoa(pessoa);
        return doc;
    }

    public static Servico novoServico(Long id,String nome,double valor,String descricao,String observacao,Animal animal){
        Servico sv = new Servico();
        sv.setId(id);
        sv.setNome(nome);
        sv.setValor(valor);
        sv.setDescricao(descricao);
        sv.setObservacao(observacao);
        sv.setAnimal(animal);

        return sv;
    }


    public static void main(String[] args) {

        Sexo sxc = novosexo(JOptionPane.showInputDialog("Qual é seu sexo? "));
        Sexo nvSx = novosexo("Masculino");

        PessoaFisica cliente = novaPessoa(1234L,
                JOptionPane.showInputDialog("Digite Seu nome: "),
                        JOptionPane.showInputDialog("Digite seu CPF: "), sxc);
        PessoaFisica clienteFilho = novaPessoa(1234L,"Lucas", "123432654-09", nvSx );

        PessoaJuridica petBenezinho = novaPessoaJuridica
                (9876L, "PetShop do Benezinho", "12.123.123/0001-03");

        Documento newDoc = novoDocumento(1234,"1220",cliente);

        Animal newAnimal = novoAnimal(98766L,JOptionPane.showInputDialog("Digite o nome do seu pet: "),
                JOptionPane.showInputDialog("Qual é a raça? "), JOptionPane.showInputDialog("Descreva seu Pet: "),
                JOptionPane.showInputDialog("Observações: "),cliente);

        Servico newServico =  novoServico(191019L, JOptionPane.showInputDialog("Digite o serviço desejado:"),
                35.00 ,"Alguma preferencia? ", "tem Alguma observação a fazer?",newAnimal);

        System.out.println(newServico);









    }
}