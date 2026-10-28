public class User {
    private String login;
    private String password; // błąd projektowy - password było public
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public void setPassword(String password) { this.password = password; }
    public boolean cmpPassword(String password) { return this.password == password; }

    public String getLogin() { return this.login; }
    public void setLogin(String login) { this.login = login; }

    public int getAge() { return this.age; }
    public void setAge(int age) {
        if (0 < age && age < 194)
            this.age = age;
    }

    public void showUser() {
        // error, bo login, password nie są statyczne, a showUser było
        System.out.println(
                "Login: " + login
                + ", hasło: " + password
                + ", wiek: " + age
        );
    }
}