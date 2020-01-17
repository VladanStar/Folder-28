package singlton;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance = null;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Object connection = null;

    private void connect() {

        if (connection == null) {
            System.out.println("Uspostavljam konekciju");
            connection = "konekcija";
        }

    }

    public List<Object> query(String sqlQuery) {
        connect();
        System.out.println("Izvrsavam upit...");
        ArrayList<Object> rezultati = new ArrayList<>();
        rezultati.add(new String("Rezultat je 1"));
        rezultati.add(new String("Rezultat je 2"));
        rezultati.add(new String("Rezultat je 3"));
        return rezultati;
    }
}
