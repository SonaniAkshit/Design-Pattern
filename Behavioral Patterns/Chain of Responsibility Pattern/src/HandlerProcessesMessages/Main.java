package HandlerProcessesMessages;

// Client
public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler info = new InfoHandler();
        Handler debug = new DebugHandler();
        Handler error = new ErrorHandler();

        // Build the chain
        info.setNext(debug);
        debug.setNext(error);

        // Send messages
        info.handle("INFO", "This is an info message.");
        info.handle("DEBUG", "This is a debug message.");
        info.handle("ERROR", "This is an error message.");
        info.handle("OTHER", "This will not be handled.");
    }
}
