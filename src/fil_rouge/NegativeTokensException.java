package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class NegativeTokensException extends UnsupportedOperationException {
	
	/*
	 * extends UnsupportedOperationException because it allows us to not consider try catch every time then
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor with no argument
	 */
	public NegativeTokensException() {
		super();
	}
	
	/**
	 * Constructor with an argument
	 * 
	 * @param s String
	 */
	public NegativeTokensException(String s) {
		super(s);
	}
}
