package tableTemplate;
/** 
 * a Cell class that defines any cell inside a table.
 * It returns strings such as: 
 *  - "%12s"
 *  - "%-32s"
 *  - "%4d"
 */
public class Cell {
	
	/**
	 * The return value for the Cell after calculating all that needs to be calculated.
	 */
	private String cellString;
	/**
	 * The numeric value of the Cell. Returns a number used in the construction of cellString
	 */
	private int cellNumericValue;
	/**
	 *  The default format type of a cell. It's value is derived from CellFormat enum.
	 *  Change this variable to change the default behaviour.
	 */
	private final CellFormat defaultCellFormat = CellFormat.s ;
	/**
	 * The default Cell size of a Cell. It's value is derived from CellSize enum.
	 * Change this variable to change the default behaviour.
	 */
	private  final CellSize defaultCellSize = CellSize.SIXTEEN;

	/**
	 * Constructor that defines every aspect of the Cell object.
	 * @param separator The separator used in the table. It's derived from the Row Class.
	 * @param size The size of the Cell. Defined in CellSize.
	 * @param format The format of the Cell. Defined in CellFormat.
	 * @param invert Defines if the extra space is on the right or the left.
	 */
	
	public Cell(String separator, CellSize size, CellFormat format, boolean invert) {
		this.cellBuilder(size, format, invert);
	}

	/**
	 * Default constructor. 
	 * Uses the default values defined above.
	 */
	
	public Cell() {
		this.cellBuilder();
	}

	/**
	 * Default Constructor that can invert the value.
	 * @param invert Defines if the extra space is on the right or the left.
	 */
	public Cell(boolean invert) {
		this.cellBuilder(invert);
	}

	/**
	 * Default Constructor that defines a size of the cell.
	 * @param size The size of the Cell. Defined in CellSize.
	 */
	public Cell(CellSize size) {
		this.cellBuilder(size);
	}

	/**
	 * Constructor that defines the size and polarity of the cell.
	 * @param size The size of the Cell. Defined in CellSize.
	 * @param invert Defines if the extra space is on the right or the left.
	 */
	public Cell(CellSize size, boolean invert) {
		this.cellBuilder(size, invert);
	}
	
	/**
	 * Constructor that defines size and format of the cell.
	 * @param size The size of the Cell. Defined in CellSize.
	 * @param format The format of the Cell. Defined in CellFormat.
	 */


	public Cell(CellSize size, CellFormat format) {
		this.cellBuilder(size, format);
	}

	/**
	 * Getter of cellString attribute.
	 * @return cellString. Returns the String built after calculations. 
	 */
	public String getCellString() {
		return cellString;
	}

	/**
	 * Getter of cellNumericValue.
	 * @return cellNumericValue. Returns the numeric value of the Cell.
	 */
	
	public int getCellNumericValue() {
		return cellNumericValue;
	}

	private void cellBuilder() {
		this.cellString = "%" + defaultCellSize.getValue() + defaultCellFormat;
		this.cellNumericValue = defaultCellSize.getValue();
	}

	private void cellBuilder(boolean invert) {
		if (invert == true) {
			this.cellString = "%" + defaultCellSize.getValue() + defaultCellFormat;
			this.cellNumericValue = defaultCellSize.getValue();
		} else {
			this.cellString = "%-" + defaultCellSize.getValue() + defaultCellFormat;
			this.cellNumericValue = defaultCellSize.getValue();
		}
	}

	private void cellBuilder(CellSize size) {
		this.cellString = "%" + size.getValue() + defaultCellFormat;
		this.cellNumericValue = size.getValue();
	}

	private void cellBuilder(CellSize size, CellFormat format) {
		this.cellString = "%" + size.getValue() + format;
		this.cellNumericValue = size.getValue();
	}

	private void cellBuilder(CellSize size, boolean invert) {
		if (invert == true) {
			this.cellString = "%-" + size.getValue() + defaultCellFormat;
			this.cellNumericValue = size.getValue();
		} else {
			this.cellString = "%" + size.getValue() + defaultCellFormat;
			this.cellNumericValue = size.getValue();
		}
	}

	private void cellBuilder(CellSize size, CellFormat format, boolean invert) {
		if (invert == true) {
			this.cellString = "%-" + size.getValue() + format;
			this.cellNumericValue = size.getValue();
		} else {
			this.cellString = "%" + size.getValue() + format;
			this.cellNumericValue = size.getValue();
		}
	}

}
