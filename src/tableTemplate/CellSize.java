package tableTemplate;
/**
 *  An Enum to define and set the sizes of the Cell. 
 */
public enum CellSize{
	/**
	 * A cell of size 1
	 */
	ONE(1),
	/**
	 * A cell of size 2
	 */
	TWO(2),
	/**
	 * A cell of size 4
	 */
	FOUR(4),
	/**
	 * A cell of size 8
	 */
	EIGHT(8),
	/**
	 * A cell of size 12
	 */
	TWELVE(12),
	/**
	 * A cell of size 16
	 */
	SIXTEEN(16),
	/**
	 * A cell of size 24
	 */
	TWENTYFOUR(24),
	/**
	 * A cell of size 32
	 */
	THIRTYTWO(32),
	/**
	 * A cell of size 64
	 */
	SIXTYFOUR(64),
	/**
	 * A cell of size 128
	 */
	ONEHUNDREDTWENTYEIGHT(128);
	
	/**
	 * The value that corresponds to the enum variable
	 */
	private final int value;
	
	/**
	 * Constructor of CellSize that defines an int value for use.
	 * @param newValue defines the value for the enum variables.
	 */
	CellSize(int newValue){
		this.value = newValue;
	}
	
	/**
	 * Getter of the value attribute. Used to get the numeric value of the Enum variable.
	 * @return value. Returns the value of the enum variable.
	 */
	public int getValue() {
		return value;
	}
}
