package infrastructure.developers;

import domain.developers.DevManager;
import domain.developers.ManageDeveloper;

import java.util.List;

public class TestDevCmdAdapter {
    ManageDeveloper devManager = new DevManager();


    public TestDevCmdAdapter(ManageDeveloper devManager) {
        this.devManager = devManager;
    }

    public void showMeDevelopers() {
        List<String> devsName = this.devManager.getAllDevelopersNames();

        for(String name : devsName){
            System.out.println(name);
        }
    }
}
