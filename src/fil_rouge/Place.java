package fil_rouge;

public class Place {
	
	private int jetons;
	
	/**
	 * @param jetons
	 */
	//@requires jetons >= 0;
	public Place(int jetons) throws NegativeJetonsException {
		if (jetons<=0) throw new NegativeJetonsException("Place cant have jetons<=0!");
		this.jetons = jetons;
	}

	/**
	 * @return the jetons
	 */
	public int getJetons() {
		return jetons;
	}

	/**
	 * @param jetons the jetons to set
	 */
	
	//@requires jetons >= 0;
	public void setJetons(int jetons) throws NegativeJetonsException {
		if (jetons<=0) throw new NegativeJetonsException("Place cant have jetons<=0!");
		this.jetons = jetons;
	}
	
	//@requires i >= 0;
	public void addJetons(int jetons) throws NegativeJetonsException {
		if (jetons<=0) throw new NegativeJetonsException("Cant have parameter jetons<=0!");
		this.jetons = this.jetons + jetons;
	}
	
	//@requires i >= 0;
	//@requires i <= this.jetons;
	public void remJetons(int jetons) throws NegativeJetonsException {
		if (jetons<=0) throw new NegativeJetonsException("Cant have parameter jetons<=0!");
		//normally, we always have i<=this.jetons
		this.jetons = this.jetons - jetons;
	}
}
