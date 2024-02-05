package tableTemplate;

/**
 * Defines the possible configurations for a Row. - Separator: The character
 * between each column of the table. - Corner: The corners of the table -
 * Boundary: The upper and lower boundary of the row.
 */
public enum RowConfiguration {
	/**
	 * The character between each column of the table.
	 */
	SEPARATOR("|"),
	/**
	 * Corner: The corners of the table
	 */
	CORNER("*"),
	/**
	 * The upper and lower boundary of the row.
	 */
	BOUNDARY("-");

	/**
	 * The value that corresponds to the enum variable
	 */
	private final String value;

	/**
	 * Constructor to specify the value of enum variables of type String.
	 * 
	 * @param newValue defines the value for the enum variables.
	 */
	RowConfiguration(String newValue) {
		this.value = newValue;
	}

	/**
	 * Getter to get the value of these enum variables.
	 * 
	 * @return value. Returns the value of the enum variable.
	 */
	public String getValue() {
		return value;
	}
}
