package infrastructure.projects;

import domain.projects.ManageProject;
import domain.projects.ProjectManager;

public class TestProjectCmdAdapter {
    ManageProject projectManager = new ProjectManager();

    public TestProjectCmdAdapter(ManageProject projectManager) {
        this.projectManager = projectManager;
    }


    public void showMeAProjectDate() {
        System.out.println(this.projectManager.getProjectDate("youtube"));
    }
}
