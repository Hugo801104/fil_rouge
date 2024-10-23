package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class Place {
	
	private int tokens;
	
	public Place() {
		this(0);
	}
	
	/**
	 * @param tokens
	 */
	//@requires tokens >= 0;
	public Place(int tokens) throws NegativeTokensException {
		if (tokens<0) throw new NegativeTokensException("Place can't have tokens<=0!");
		this.tokens = tokens;
	}

	/**
	 * @return the tokens
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * @param tokens the tokens to set
	 */
	
	//@requires tokens >= 0;
	public void setTokens(int tokens) throws NegativeTokensException {
		if (tokens<0) throw new NegativeTokensException("Place can't have tokens<=0!");
		this.tokens = tokens;
	}
	
	//@requires tokens >= 0;
	public void addTokens(int tokens) throws NegativeTokensException {
		if (tokens<0) throw new NegativeTokensException("Can't have parameter tokens<=0!");
		this.tokens += tokens;
	}
	
	//@requires tokens >= 0;
	//@requires tokens <= this.tokens;
	public void remTokens(int tokens) throws NegativeTokensException {
		if (tokens<0) throw new NegativeTokensException("Can't have parameter tokens<=0!");
		//normally, we always have tokens<=this.tokens (else isTrig = false)
		this.tokens -= tokens;
	}
}
