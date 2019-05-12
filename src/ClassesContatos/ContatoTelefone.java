package ClassesContatos;

public class ContatoTelefone extends Contato{
    private int telefone;

    public ContatoTelefone(String name, int telefone) {
        super(name);
        this.telefone = telefone;
    }

    public int getNumero() {
        return telefone;
    }

    public void setNumero(int numero) {
        this.telefone = numero;
    }


    @Override
    public String toString() {
        return "ContatoTelefone: \n" +
                "Nome -> " + super.getName() + "\n"+
                "telefone -> " + telefone;
    }
}
