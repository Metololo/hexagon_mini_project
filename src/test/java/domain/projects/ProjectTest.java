package domain.projects;

import infrastructure.projects.ProjectRepositoryDBAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {
    @Test
    void shouldReturnCreationDateOfAProjectWhenAsking() {
        // instanciate hexagon
        ManageProject projectManager = new ProjectManager();
        assertEquals("12/03/2020",projectManager.getProjectDate("youtube"));
    }

    @Test
    void shouldReturnAProjectWhenUsingProjectRepository() {
        // instanciate projectRepository adapter
        ProjectRepository projectRepositoryAdapter = new ProjectRepositoryDBAdapter();
        // instanciate the hexagon and plug the adapter
        ManageProject projectManager = new ProjectManager(projectRepositoryAdapter);
        assertEquals("10/12/2023",projectManager.getProjectDate("my super app"));
    }
}