package domain.developers;

import java.util.List;

// DRIVEN DEVELOPER PORT ( used by the hexagon and implemented by an adapter )
// the adapter can get the rows from the developer table in a sql database
// and map them with the domains objects
public interface DeveloperRepository {
    List<Developer> getAllDevelopers();
}
