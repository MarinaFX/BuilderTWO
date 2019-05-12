package Builders.AbstractBuilders;

public interface AbstractContatoInternetBuilder extends AbstractContatoBuilder {
    @Override
    void buildContato(String nome, String email, String endereco, int telefone);
}
