package domain.developers;

import infrastructure.developers.DeveloperRepositoryDBAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    List<String> expectedDevs = List.of(
            "John","Marc","Kevin"
    );
    @Test
    @DisplayName("Should return all developers when asking for developer list")
    void shouldReturnDeveloperListWhenAskingForDevList() {
        // here the driving adapter is the test
        ManageDeveloper devManager = new DevManager();

        assertEquals(expectedDevs,devManager.getAllDevelopersNames());
    }

    @Test
    @DisplayName("Dev repository should return all developers when asking for it")
    void DevRepositoryShouldReturnAllDevs(){
        // instanciate right adapter
        DeveloperRepository devRepo = new DeveloperRepositoryDBAdapter();
        // instanciate hexagon using DeveloperRepositoryAdapter
        ManageDeveloper devManager = new DevManager(devRepo);

        assertEquals(List.of("john","amber","toto"),devManager.getAllDevelopersNames());
    }
}