package tableTemplate;

/**
 * Template class used as a base for any table. The generic represents what type
 * can be used in the table. Since it usually will need an array we put one as a
 * generic.
 */
public abstract class Table<T> {

	/**
	 * Reference to define a default row for reiterated use.
	 */
	protected final Cell defaultCell = new Cell();
	/**
	 * Reference to define a default row for reiterated use.
	 */
	protected final Row defaultRow = new Row();

	/**
	 * Displays the table using the rowBuilder method as needed. Each table should
	 * implement their own method so one can have different tables. and passing an
	 * array of the type of the table.
	 */
	public abstract void displayTable(T[] arr);

	/**
	 * Displays the table without using parameters. Full control.
	 */
	public abstract void displayTable();

	public Cell getDefaultCell() {
		return defaultCell;
	}

	public Row getDefaultRow() {
		return defaultRow;
	}

}