package accesscontrol;

// Subject
interface DirectoryAccess {
    void create(String name);
    void rename(String oldName, String newName);
    void delete(String name);
}