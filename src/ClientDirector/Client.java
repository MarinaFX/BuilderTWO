package ClientDirector;

import Builders.AbstractBuilders.AbstractContatoBuilder;
import Builders.ConcreteBuilders.ConcreteContatoCompletoBuilder;
import Builders.ConcreteBuilders.ConcreteContatoInternetBuilder;
import Builders.ConcreteBuilders.ConcreteContatoTelefoneBuilder;
import ClassesContatos.ContatoCompleto;
import ClassesContatos.ContatoInternet;
import ClassesContatos.ContatoTelefone;

public class Client {
    private Director director;
    private ContatoInternet contatoInternet;
    private ContatoTelefone contatoTelefone;
    private ContatoCompleto contatoCompleto;
    private ConcreteContatoInternetBuilder contatoInternetBuilder;
    private ConcreteContatoTelefoneBuilder contatoTelefoneBuilder;
    private ConcreteContatoCompletoBuilder contatoCompletoBuilder;

    public Client(){
        contatoInternetBuilder = new ConcreteContatoInternetBuilder();
        contatoTelefoneBuilder = new ConcreteContatoTelefoneBuilder();
        contatoCompletoBuilder = new ConcreteContatoCompletoBuilder();
        director = new Director();
    }

    public void main(String nome, String email, String endereco, int telefone){
        director.setBuilderContato(contatoInternetBuilder,nome, email, endereco, telefone);
        director.setBuilderContato(contatoTelefoneBuilder,nome, email, endereco, telefone);
        director.setBuilderContato(contatoCompletoBuilder,nome, email, endereco, telefone);
    }

    public void imprimeContatos(){
        AbstractContatoBuilder builder = director.getBuilder();
        String str;

        contatoInternet = contatoInternetBuilder.getContato();
        contatoTelefone = contatoTelefoneBuilder.getContato();
        contatoCompleto = contatoCompletoBuilder.getContato();

        try {
            str = contatoInternet.toString();
            System.out.println(str);
            System.out.println();
            Thread.sleep(1000);
            str = contatoTelefone.toString();
            System.out.println(str);
            System.out.println();
            Thread.sleep(1000);
            str = contatoCompleto.toString();
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
