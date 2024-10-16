package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class NegativeJetonsException extends UnsupportedOperationException {
	
	/*
	 * extends UnsupportedOperationException because it can allow us after to not consider try catch every time
	 */
	
	public NegativeJetonsException() {
		super();
	}
	
	public NegativeJetonsException(String s) {
		super(s);
	}
}
