package ClassesContatos;

public class ContatoCompleto extends Contato{
    private String email;
    private String endereco;
    private int telefone;

    public ContatoCompleto(String name, String email, String endereco, int telefone) {
        super(name);
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ContatoCompleto: \n" +
                "Nome -> " + super.getName() + "\n"+
                "email -> " + email + "\n" +
                "endereco -> " + endereco + "\n" +
                "telefone -> " + telefone;
    }
}
