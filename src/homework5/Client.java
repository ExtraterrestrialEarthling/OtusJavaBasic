package homework5;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private final String name;
    private int age;
    private final int id;
    private final ArrayList<Account> accounts;

    public Client(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return name + ", возраст: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && id == client.id && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}



