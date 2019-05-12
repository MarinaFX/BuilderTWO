package Builders.AbstractBuilders;

public interface AbstractContatoTelefoneBuilder extends AbstractContatoBuilder {
    @Override
    void buildContato(String nome, String email, String endereco, int telefone);
}
