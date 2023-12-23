package domain.developers;

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
        ManageDeveloper devManager = new DevManager();

        assertEquals(expectedDevs,devManager.getAllDevelopersNames());
    }
}