package Exercise.test08;

public class NoLifeValueException extends RuntimeException{
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLifeValueException(Throwable cause) {
        super(cause);
    }

    public NoLifeValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
