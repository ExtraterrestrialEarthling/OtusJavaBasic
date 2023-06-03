package homework5;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Золотишко");

        //Создаем счета
        Client client = new Client("Иван Иванов", 18, 1);
        bank.createAccount(client, BigDecimal.valueOf(15));
        bank.createAccount(client, BigDecimal.valueOf(7));

        // Поиск
        Client someClient = new Client("Иван Иванов", 18, 1);
        Account someAccount = new Account(someClient, BigDecimal.valueOf(15));

        System.out.println("Поиск клиента... Клиент найден: \n" + bank.findClient(someAccount));
        System.out.println("Поиск всех счетов клиента... Счета найдены:");
        for (Account account : bank.getAccounts(someClient)) {
            System.out.println(account);
        }

    }
}