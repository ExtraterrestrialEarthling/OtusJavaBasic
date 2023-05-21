package homework5;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Золотце");

        //Создаем счета
        Client client = new Client("Иван Иванов", 18);
        bank.createAccount(client, BigDecimal.valueOf(15));
        bank.createAccount(client, BigDecimal.valueOf(7));

        // Поиск
        Account someAccount = bank.getAccountById(2);
        System.out.println("Поиск клиента... Клиент найден: \n" + bank.findClient(someAccount));
        System.out.println("Поиск всех счетов клиента... Счета найдены:");
        for (Account account : bank.getAccounts(client)) {
            System.out.println(account);
        }

    }
}