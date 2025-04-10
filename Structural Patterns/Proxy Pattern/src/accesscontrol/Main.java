package accesscontrol;

// Client
public class Main {
    public static void main(String[] args) {
        DirectoryAccess adminAccess = new DirectoryProxy("admin");
        adminAccess.create("Projects");
        adminAccess.rename("Projects", "FinalProjects");
        adminAccess.delete("FinalProjects");

        System.out.println();

        DirectoryAccess userAccess = new DirectoryProxy("user");
        userAccess.create("Notes");
        userAccess.rename("Notes", "StudyNotes");
        userAccess.delete("Notes");
    }
}
