package database;

import domain.developers.Developer;
import domain.projects.Project;

import java.util.HashMap;
import java.util.List;

public class FakeDatabase {
    public List<Developer> developers = List.of(
            new Developer("john"),
            new Developer("amber"),
            new Developer("toto")
    );

    public List<Project> projects = List.of(
            new Project("youtube","02/01/1999"),
            new Project("uber eat","10/01/2014"),
            new Project("my super app","10/12/2023")
    );
}
