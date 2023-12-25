package domain.developers;

import java.util.ArrayList;
import java.util.List;

// THE HEXAGON THAT IMPLEMENT ManageDeveloper port
public class DevManager implements ManageDeveloper{

    public DevManager() {

    }
    DeveloperRepository repository;
    public DevManager(DeveloperRepository repository) {
        this.repository = repository;
    }

    public List<String> getAllDevelopersNames() {

        if(this.repository == null) {
            return List.of(
                    "John","Marc","Kevin"
            );
        }

        List<Developer> devs = this.repository.getAllDevelopers();
        List<String> devsNames = new ArrayList<>();

        for(Developer dev : devs) {
            devsNames.add(dev.name);
        }

        return devsNames;
    }
}
