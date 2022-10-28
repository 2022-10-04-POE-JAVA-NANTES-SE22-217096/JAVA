package Exceptions;

public class CalculerException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    public CalculerException( String message ) {
        super( message );
    }

    public CalculerException( String message, Throwable cause ) {
        super( message, cause );
    }

    public CalculerException( Throwable cause ) {
        super( cause );
    }

}
