package by.nc.khoroneko.exception;

public class NegativeDiscriminantException extends Exception {
    public NegativeDiscriminantException() {
        super();
    }

    public NegativeDiscriminantException(String message) {
        super(message);
    }

    public NegativeDiscriminantException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeDiscriminantException(Throwable cause) {
        super(cause);
    }
}
