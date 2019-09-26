package utils;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class Prueba {

	public static void main(String[] args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		rwcsv.writecsv();
		rwcsv.readcsv();

	}

}
