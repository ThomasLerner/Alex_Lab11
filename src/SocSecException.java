
public class SocSecException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2484142775952443501L;
	
	public SocSecException(String error) {
		super("Invalid social security number");
	}
}
