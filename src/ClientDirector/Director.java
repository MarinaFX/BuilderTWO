package ClientDirector;

import Builders.AbstractBuilders.AbstractContatoBuilder;
import ClassesContatos.ContatoCompleto;
import ClassesContatos.ContatoInternet;
import ClassesContatos.ContatoTelefone;

public class Director {
    private AbstractContatoBuilder builder;

    public void setBuilderContato(AbstractContatoBuilder builder, String nome, String email, String endereco, int telefone){
        this.builder = builder;

        try {
            this.builder.buildContato(nome,email,endereco,telefone);
            this.builder.buildContato(nome,email,endereco,telefone);
            this.builder.buildContato(nome,email,endereco,telefone);
        } catch (IllegalArgumentException f){
            System.err.println(f.getMessage());
        }
    }

    public AbstractContatoBuilder getBuilder(){
        return builder;
    }

}
