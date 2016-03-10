package chain;

public class SpamHandler extends MessageHandler {
    public SpamHandler(MessageHandler next) {
        super(next);
    }

    @Override
    public void handle(Message message) {
        if (isSpam(message)) {
            // handle spam
        } else {
            super.handle(message);
        }
    }

    private boolean isSpam(Message m) {
        // ...
        return true;
    }

    // ...
}