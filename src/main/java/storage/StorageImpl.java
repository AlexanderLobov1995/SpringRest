package storage;

import model.Human;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class StorageImpl implements Storage {
    private List<Human> people = new LinkedList<Human> ();

    public StorageImpl () {
        people.add (new Human ("Aleksandr", 22));
        people.add (new Human ("Ilya", 20));
        people.add (new Human ("Denis", 12));
    }

    public List<Human> getPeople () {
        return people;
    }
}
