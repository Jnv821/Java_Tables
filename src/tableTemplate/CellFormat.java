package tableTemplate;
/**
 *  An Enum with the format types availables for a Cell.
 */
public enum CellFormat {
	/**
	 * Used for lowercase boolean.
	 */
	b,
	/**
	 * Used for uppercase boolean.
	 */
	B,
	/**
	 * Used for lowercase hexadecimal.
	 */
	h,
	/**
	 * Used for uppercase hexadecimal.
	 */
	H,
	/**
	 * Used for lowercase characters.
	 */
	c,
	/**
	 * Used for uppercase character.
	 */
	C,
	/**
	 * Used for decimal numbers.
	 */
	d,
	/**
	 * Used for octal numbers.
	 */
	o,
	/**
	 * Used for hexadecimal numbers.
	 */
	x,
	/**
	 * Used for hexadecimal numbers.
	 */
	X,
	/**
	 * Used for lowercase scientific notation.
	 */
	e,
	/**
	 * Used for uppercase scientfic notation.
	 */
	E,
	/**
	 * 	The result is formatted as a decimal number
	 */
	f,
	/**
	 * The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.
	 */
	g,
	/**
	 * The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.
	 */
	G,
	/**
	 * 	The result is formatted as a hexadecimal floating-point number with a significand and an exponent. This conversion is not supported for the BigDecimal type despite the latter's being in the floating point argument category.
	 */
	a,
	/**
	 * 	The result is formatted as a hexadecimal floating-point number with a significand and an exponent. This conversion is not supported for the BigDecimal type despite the latter's being in the floating point argument category.
	 */
	A,
	/**
	 * 	Prefix for date and time conversion characters. See Date/Time Conversions.
	 */
	t,
	/**
	 * 	Prefix for date and time conversion characters. See Date/Time Conversions.
	 */
	T,
	/**
	 * if the argument arg is null, then the result is "null". If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString().
	 */
	s,
	/**
	 * if the argument arg is null, then the result is "null". If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString().
	 */
	S
}
