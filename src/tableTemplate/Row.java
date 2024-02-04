package tableTemplate;

/**
 * A Row Class that can be instantiated to define the style of the table and build the table for the use in printf.
 */
public class Row {
	
	/**
	 * The final value of the Row.
	 */
	private String rowString;
	
	/**
	 * The string built that uses the parameters of printf
	 */
	private String rowData;
	
	/**
	 * The strings that separate each rowData. It's the top and bottom of the row.
	 */
	private String rowBoundary;
	
	
	/**
	 *  Value used to dinamically calculate the length of a row based on the cellString of the Cell Class.
	 */
	private int rowLength;
	
	/**
	 * String used to separate the columns / cells of the row
	 */
	private String separator;
	/**
	 * String used in the corner of the table.
	 */
	private String corner;
	/**
	 * String used in the top and bottom of the row.
	 */
	private String boundary;

	/**
	 * Default Constructor used to initialize a Row with default values.
	 * Default values are either empty or defined in RowConfigurations.
	 */
	public Row() {
		this.rowString = "";
		this.rowData = "";
		this.rowBoundary = "";
		this.rowLength = 0;
		this.separator = RowConfiguration.SEPARATOR.getValue();
		this.corner = RowConfiguration.CORNER.getValue();
		this.boundary = RowConfiguration.BOUNDARY.getValue();
	}

	/**
	 * Method that construct a row based on the cells passed. This table can have cells with different sizes. It's perfect for non homogenous tables.
	 * 
	 * @param cells An array of Cells passed when invoking printf. 
	 * @return String used in the first paremeter of printf.
	 */
	public String rowBuilder(Cell... cells) {
		int numberOfCells = -1;
		// Build the data and format of the Row based of n cells.
		for (Cell cell : cells) {
			this.rowLength += cell.getCellNumericValue() + 2;
			this.rowData += this.separator + " " + cell.getCellString() + " ";
			numberOfCells++;
		}
		this.rowData += this.separator + "%n";
		this.rowString += this.rowBoundaryBuilder(numberOfCells);
		this.rowString += this.rowData;
		this.rowString+=this.rowBoundaryBuilder(numberOfCells);
		return rowString;
	}
	
	/**
	 * This method is used to construct homogenous tables. Perfect for matrixs and such. Every cell will have the same Size and Format.
	 * 
	 * @param cell A Cell definition that's used for building the row.
	 * @param numberOfCells Number of columns or cells that a row will have.
	 * @param numberOfRows Number of Rows that the table will have
	 * @return Returns a string used in the display table method of Table.
	 * 
	 */
	public String rowBuilder(Cell cell,int numberOfCells, int numberOfRows) {
		
	
	 for(int k = 0; k < numberOfRows; k++) {
		this.resetDefaults();
		for (int i = 0; i < numberOfCells; i++) {
			this.rowLength += cell.getCellNumericValue() + 2;
			this.rowData += this.separator + " " + cell.getCellString() + " ";
		}
		this.rowData += this.separator + "%n";
		this.rowString += this.rowBoundaryBuilder(numberOfCells-1);
		this.rowString += this.rowData;
	 	}

	 	this.rowString+=this.rowBoundaryBuilder(numberOfCells-1);
		return rowString;
	}
	
	private void resetDefaults() {
		this.rowData = "";
		this.rowBoundary = "";
		this.rowLength = 0;
	}
	
	// Build the boundary of the row. Internal Use only.
	private String rowBoundaryBuilder(int numberOfCells) {
		return this.rowBoundary += this.corner + this.boundary.repeat(this.rowLength+numberOfCells) + this.corner + "\n";
	}

	/**
	 * Method to set Configuration on runtime.
	 * 
	 * @param separator Sets the separator of the table
	 * @param corner Sets the corner of the table
	 * @param boundary Sets the boundary of the table
	 */
	public void setConfiguration(String separator, String corner, String boundary) {
		this.separator = separator;
		this.corner = corner;
		this.boundary = boundary;
	}

	/**
	 * Method to set an specific configuration of the Row on runtime.
	 * 
	 * @param value The value to set the configuration to
	 * @param config The option of RowConfiguration to set the value of.
	 */
	public void setConfiguration(String value, RowConfiguration config) {
		switch (config) {
			case BOUNDARY:
				this.boundary = value;
				break;
			case CORNER:
				this.corner = value;
				break;
			case SEPARATOR:
				this.separator = value;
				break;
			default:
				break;
		}
	}
}
