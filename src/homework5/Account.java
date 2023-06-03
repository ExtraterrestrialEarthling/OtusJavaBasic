package homework5;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private final Client client;
    private BigDecimal gold;

    public Account(Client client, BigDecimal gold) {
        this.client = client;
        this.gold = gold;
    }


    @Override
    public String toString() {
        return "Золотых монет: " + gold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(client, account.client) && Objects.equals(gold, account.gold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, gold);
    }
}