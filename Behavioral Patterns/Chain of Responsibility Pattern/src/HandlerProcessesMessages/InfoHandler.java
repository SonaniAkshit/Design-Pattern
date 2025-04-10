package HandlerProcessesMessages;

// Concrete Handlers
class InfoHandler extends Handler {
    void handle(String level, String message) {
        if (level.equals("INFO")) {
            System.out.println("Info: " + message);
        } else if (next != null) {
            next.handle(level, message);
        }
    }
}
