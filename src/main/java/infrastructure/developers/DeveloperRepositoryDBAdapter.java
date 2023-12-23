package infrastructure.developers;

import database.FakeDatabase;
import domain.developers.Developer;
import domain.developers.DeveloperRepository;

import java.util.List;


// RIGHT ADAPTER
public class DeveloperRepositoryDBAdapter implements DeveloperRepository {

    //simulate a connection to database
    FakeDatabase db = new FakeDatabase();

    @Override
    public List<Developer> getAllDevelopers() {
        // should map database rows to domain objects ( use a DAO ? )
        return db.developers;
    }
}
