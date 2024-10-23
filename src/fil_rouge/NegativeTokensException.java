package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class NegativeTokensException extends UnsupportedOperationException {
	
	/*
	 * extends UnsupportedOperationException because it can allow us after to not consider try catch every time
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeTokensException() {
		super();
	}
	
	public NegativeTokensException(String s) {
		super(s);
	}
}
