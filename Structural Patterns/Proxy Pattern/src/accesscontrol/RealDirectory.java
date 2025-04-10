package accesscontrol;

// RealSubject
public class RealDirectory implements DirectoryAccess {
    public void create(String name) {
        System.out.println("Directory '" + name + "' created.");
    }

    public void rename(String oldName, String newName) {
        System.out.println("Directory renamed from '" + oldName + "' to '" + newName + "'.");
    }

    public void delete(String name) {
        System.out.println("Directory '" + name + "' deleted.");
    }
}