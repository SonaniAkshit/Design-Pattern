package HandlerProcessesMessages;

// Handler (Abstract)
abstract class Handler {
    Handler next;

    void setNext(Handler nextHandler) {
        next = nextHandler;
    }

    abstract void handle(String level, String message);
}
