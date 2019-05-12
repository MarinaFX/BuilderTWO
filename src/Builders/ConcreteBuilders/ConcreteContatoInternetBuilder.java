package Builders.ConcreteBuilders;

import Builders.AbstractBuilders.AbstractContatoInternetBuilder;
import ClassesContatos.ContatoInternet;

public class ConcreteContatoInternetBuilder implements AbstractContatoInternetBuilder {
    private ContatoInternet contato;

    @Override
    public void buildContato(String nome, String email, String endereco, int telefone) {
        if ((nome.equals(null)) || (nome.equals("")))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");

        if ((email.equals(null)) || (email.equals("")))
            throw new IllegalArgumentException("ERR_EMAIL_INVÁLIDO");

        contato = new ContatoInternet(nome, email);

    }

    public ContatoInternet getContato(){
        return contato;
    }
}
