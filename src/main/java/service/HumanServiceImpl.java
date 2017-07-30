package service;

import model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import storage.Storage;

import java.util.List;

@Service
public class HumanServiceImpl implements HumanService {

    @Autowired
    Storage storage;

    public List<Human> getPeople () {
        return storage.getPeople ();
    }
}
