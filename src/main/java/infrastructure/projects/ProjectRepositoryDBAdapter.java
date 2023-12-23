package infrastructure.projects;

import database.FakeDatabase;
import domain.projects.Project;
import domain.projects.ProjectRepository;

// RIGHT ADAPTERS
public class ProjectRepositoryDBAdapter implements ProjectRepository {

    FakeDatabase db = new FakeDatabase();
    @Override
    public Project getProjectByName(String name) {
        for(Project p : db.projects) {
            if(p.name.equals(name)) return p;
        }

        return null;
    }
}
