package lesson2.demo3_extends;

public final class SuperUser extends User { //final забороняє змінювати клас у майбутньому
    private String login;
    private String password;
    private final String dconst = "dconst"; // динамічна недоконстанта

    public SuperUser() {
    }

    public SuperUser(int id, String name, String login, String password) {
        super(id, name);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }

    @Override
    public final void greeting() {
        System.out.println("hello!!");
    } //забороняє змінювати функцію
}
