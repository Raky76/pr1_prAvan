package es.uji.al415617;

import java.util.ArrayList;
import java.util.List;

public class Table {

    public List<String> headers;
    public List<Row> filas;
    public Table(List<String> listaDeHeaders){ //Constructor. Crea una Tabla con sus cabeceras o headers.
        headers = listaDeHeaders;
        filas = new ArrayList<>();
    }

    public void addRow(Row fila){
        filas.add(fila);
    } //Añade una columna o Row a la tabla.

    public Row getRowAt(int rowNumber){ //Devuelve la columna o Row de la tabla dado su índice en la misma.
        return filas.get(rowNumber);
    }

}
