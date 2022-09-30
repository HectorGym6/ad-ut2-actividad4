package exception;

public class FileWithoutExtensionException extends Exception {

    /**
     * Serial version ID
     */
    private static final long serialVersionUID = 5995400511304261724L;

    /**
     * Constructor por defecto
     */
    public FileWithoutExtensionException() {
        super();
    }

    /**
     * Constructor con un mensaje
     * @param message
     */
    public FileWithoutExtensionException(String message) {
        super(message);
    }

    /**
     * Contructor añadiendo la causa como {@link Throwable}
     * @param cause
     */
    public FileWithoutExtensionException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor
     *
     * @param message Mensaje
     * @param cause Causa {@link Throwable}
     */
    public FileWithoutExtensionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     *
     * @param message Mensaje
     * @param cause Causa {@link Throwable}
     * @param enableSuppression Si suppression está habilitado o deshabilitado
     * @param writableStackTrace Si el stack trace debería ser escribible
     */
    public FileWithoutExtensionException(String message, Throwable cause, boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}