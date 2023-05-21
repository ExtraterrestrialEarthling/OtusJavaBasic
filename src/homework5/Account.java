package homework5;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private int id;
    private BigDecimal gold;
    private static int counter;

    public Account(BigDecimal gold) {
        counter++;
        this.id = counter;
        this.gold = gold;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID аккаунта: " + id +
                ", золотых монет: " + gold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(gold, account.gold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gold);
    }
}