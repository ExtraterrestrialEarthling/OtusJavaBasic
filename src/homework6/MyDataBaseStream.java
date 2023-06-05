package homework6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDataBaseStream implements AutoCloseable{
    public static Map<User, List<Deck>> dataBase = new HashMap<>();

    public void saveUser(User user){
        dataBase.put(user, user.getDecks());
    }

    public List<Deck> retrieveDeck(User user){
        return dataBase.get(user);
    }

    @Override
    public void close(){

    }
}
