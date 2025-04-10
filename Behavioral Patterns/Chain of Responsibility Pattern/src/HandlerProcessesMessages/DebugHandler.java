package HandlerProcessesMessages;

// Concrete Handlers
class DebugHandler extends Handler {
    void handle(String level, String message) {
        if (level.equals("DEBUG")) {
            System.out.println("Debug: " + message);
        } else if (next != null) {
            next.handle(level, message);
        }
    }
}
