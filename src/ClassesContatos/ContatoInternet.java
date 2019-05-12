package ClassesContatos;

public class ContatoInternet extends Contato{
    private String email;

    public ContatoInternet(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoInternet: \n" +
                "Nome -> " + super.getName() + "\n"+
                "email -> " + email;
    }
}
