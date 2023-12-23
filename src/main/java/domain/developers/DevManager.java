package domain.developers;

import java.util.List;

public class DevManager implements ManageDeveloper{
    public List<String> getAllDevelopersNames() {
        return List.of(
                "John","Marc","Kevin"
        );
    }
}
