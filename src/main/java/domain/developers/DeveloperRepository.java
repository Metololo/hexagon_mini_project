package domain.developers;

import java.util.List;

// DRIVEN DEVELOPER PORT ( used by the hexagon and implemented by an adapter )
public interface DeveloperRepository {
    List<Developer> getAllDevelopers();
}
