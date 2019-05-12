package Builders.ConcreteBuilders;

import Builders.AbstractBuilders.AbstractContatoCompletoBuilder;
import ClassesContatos.Contato;
import ClassesContatos.ContatoCompleto;

public class ConcreteContatoCompletoBuilder implements AbstractContatoCompletoBuilder {
    private ContatoCompleto contato;

    @Override
    public void buildContato(String nome, String email, String endereco, int telefone) {
        if ((nome.equals(null)) || (nome.equals("")))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");

        if ((email.equals(null)) || (email.equals("")))
            throw new IllegalArgumentException("ERR_EMAIL_INVÁLIDO");

        if ((endereco.equals (null)) || (endereco.equals("")))
            throw new IllegalArgumentException("ERR_ENDEREÇO_INVÁLIDO");

        if (telefone < 0)
            throw new IllegalArgumentException("ERR_TELEFONE_INVÁLIDO");


        contato = new ContatoCompleto(nome,email,endereco,telefone);

    }

    public ContatoCompleto getContato(){
        return contato;
    }
}
