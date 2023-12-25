import domain.developers.DevManager;
import domain.developers.DeveloperRepository;
import domain.developers.ManageDeveloper;
import domain.projects.ManageProject;
import domain.projects.ProjectManager;
import domain.projects.ProjectRepository;
import infrastructure.developers.DeveloperRepositoryDBAdapter;
import infrastructure.developers.TestDevCmdAdapter;
import infrastructure.projects.ProjectRepositoryDBAdapter;
import infrastructure.projects.TestProjectCmdAdapter;

public class Main {
    public static void main(String[] args) {

        // instanciate the right side adapters
        ProjectRepository projectRepository = new ProjectRepositoryDBAdapter();
        DeveloperRepository developerRepository = new DeveloperRepositoryDBAdapter();

        // instanciate the hexagons
        ManageProject projectManager = new ProjectManager(projectRepository);
        ManageDeveloper developerManager = new DevManager(developerRepository);

        // instanciate the left side
        TestProjectCmdAdapter projectController = new TestProjectCmdAdapter(projectManager);
        TestDevCmdAdapter devController = new TestDevCmdAdapter(developerManager);

        // use-case of dev hexagon
        System.out.println("We can ask for all developers names in the developer hexagon : ");
        devController.showMeDevelopers();

        // use-case of dev hexagon
        System.out.println("We can also ask for a project date in the project hexagon : ");
        projectController.showMeAProjectDate();

    }
}
