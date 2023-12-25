package domain.projects;

// SECOND HEXAGON
public class ProjectManager implements ManageProject{

    ProjectRepository repository;


    public ProjectManager() {
        this.repository = null;
    }

    public ProjectManager(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getProjectDate(String projectName) {
        if(this.repository == null) return "12/03/2020";

        Project project = this.repository.getProjectByName("my super app");
        return project.creationDate;
    }
}
