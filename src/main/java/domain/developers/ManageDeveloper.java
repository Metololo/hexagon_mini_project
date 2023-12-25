package domain.developers;

import java.util.List;

// DRIVING DEVELOPER PORT ( used by client )
// it is implemented by the hexagon and offer differents methods to the adapters that implement it
// the adapter can be a rest controller, a CLI, a test class...
public interface ManageDeveloper {
    public List<String> getAllDevelopersNames();
}
