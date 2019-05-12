package Builders.AbstractBuilders;

import ClassesContatos.ContatoCompleto;

public interface AbstractContatoCompletoBuilder extends AbstractContatoBuilder {
    @Override
    void buildContato(String nome, String email, String endereco, int telefone);
}
