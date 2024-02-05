# Java Tables

A simple package for wrtting console tables in Java. Used along `printf()` method of `System.out` to generate tables and display contents.

## Usage

The usage of the libray consists of extending the **Table** class and overriding the abstract method _displayTable()_ with instances of **Cell** and **Row** classes.
Using the builders provided ( Cell constructors and the rowBuilder method. )

### Building an heterogeneous Row

In order to build an heterogenous row one must call the rowBuilder method with different types of cells.

```java
//...

System.out.printf( rowBuilder(
    new Cell(CellSize.TWO, CellFormat.d, false),
    new Cell(CellSize.FOUR, true),
    new Cell(CellSize.SIXTEEN)
), 30, "ABCD", "Backstreet Boys" )

//...
```

### Building a homogenous row

In order to build an homogenous row when it comes to data types the `rowBuilder()` method can be used for that too. You will need to pass the number of **Cells** and the number of **Rows** you want.

```java
//...

System.out.printf( rowBuilder( new Cell( CellSize.SIXTEEN, CellFormat.S, true), 2, 3),
"Country", "Capital City",
"Spain", "Madrid"
"France", "Paris",
 )

//...
```
