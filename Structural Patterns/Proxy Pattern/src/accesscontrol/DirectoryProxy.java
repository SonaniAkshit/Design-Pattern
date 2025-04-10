package accesscontrol;

// Proxy
public class DirectoryProxy implements DirectoryAccess {
    String role;
    RealDirectory real;

    DirectoryProxy(String role) {
        this.role = role;
        real = new RealDirectory();
    }

    public void create(String name) {
        real.create(name);
    }

    public void rename(String oldName, String newName) {
        if (role.equals("admin")) {
            real.rename(oldName, newName);
        } else {
            System.out.println("Access denied: Only admin can rename directories.");
        }
    }

    public void delete(String name) {
        if (role.equals("admin")) {
            real.delete(name);
        } else {
            System.out.println("Access denied: Only admin can delete directories.");
        }
    }
}
