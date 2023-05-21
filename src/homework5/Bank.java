package homework5;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private String name;
    private Map<Account, Client> accountToClient;
    private Map<Client, List<Account>> clientToAccount;

    public Bank(String name) {
        this.name = name;
        this.accountToClient = new HashMap<>();
        this.clientToAccount = new HashMap<>();
    }

    public void createAccount(Client client, BigDecimal gold) {
        Account account = new Account(gold);
        accountToClient.put(account, client);

        client.addAccount(account);
        clientToAccount.put(client, client.getAccounts());

    }

    public Account getAccountById(int id) {
        for (var entry : accountToClient.entrySet()) {
            if (id == entry.getKey().getId()) {
                return entry.getKey();
            }
        }
        return null;
    }

    //поиск аккаунтов - скорость O(1)
    public List<Account> getAccounts(Client client) {
        return clientToAccount.get(client);
    }


    //Поиск клиента - скорость O(1)
    public Client findClient(Account account) {
        return accountToClient.get(account);
    }


}


