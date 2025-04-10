package TurningonaComputer;

// Facade class
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        String data = hardDrive.read(100, 512);
        memory.load(100, data);
        cpu.execute();
    }
}
