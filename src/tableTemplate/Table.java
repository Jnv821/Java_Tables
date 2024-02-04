package tableTemplate;

/**
 * Template class used as a base for any table.
 */
public abstract class Table {
	
	/**
	 * Reference to define a default row for reiterated use.
	 */
	Cell defaultCell;
	/**
	 * Reference to define a default row for reiterated use.
	 */
	Row defaultRow;
	
	/**
	 * Displays the table using the rowBuilder method as needed. Each table should implement their own method so one can have different tables.
	 */
	
	public abstract void displayTable();
}
