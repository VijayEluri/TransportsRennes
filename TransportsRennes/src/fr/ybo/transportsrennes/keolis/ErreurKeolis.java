package fr.ybo.transportsrennes.keolis;

/**
 * Exception sur les traitements associés aux API Keolis.
 *
 * @author ybonnel
 */
public class ErreurKeolis extends RuntimeException {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur avec message.
	 *
	 * @param message message.
	 */
	public ErreurKeolis(final String message) {
		super(message);
	}

	/**
	 * Constructeur avec message et exception.
	 *
	 * @param message message.
	 * @param cause   exception.
	 */
	public ErreurKeolis(final String message, final Throwable cause) {
		super(message, cause);
	}

}