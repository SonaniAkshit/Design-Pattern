package HandlerProcessesMessages;

// Concrete Handlers
class ErrorHandler extends Handler {
    void handle(String level, String message) {
        if (level.equals("ERROR")) {
            System.out.println("Error: " + message);
        } else if (next != null) {
            next.handle(level, message);
        }
    }
}
