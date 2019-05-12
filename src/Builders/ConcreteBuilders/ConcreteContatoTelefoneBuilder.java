package Builders.ConcreteBuilders;

import Builders.AbstractBuilders.AbstractContatoTelefoneBuilder;
import ClassesContatos.Contato;
import ClassesContatos.ContatoTelefone;

public class ConcreteContatoTelefoneBuilder implements AbstractContatoTelefoneBuilder {
    private ContatoTelefone contato;

    @Override
    public void buildContato(String nome, String email, String endereco, int telefone) {
        if ((nome.equals(null)) || (nome.equals("")))
            throw new IllegalArgumentException("ERR_NOME_INVÁLIDO");

        if (telefone < 0)
            throw new IllegalArgumentException("ERR_TELEFONE_INVÁLIDO");

        contato = new ContatoTelefone(nome, telefone);

    }

    public ContatoTelefone getContato() {
        return contato;
    }
}
