package utils;

import java.util.List;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class Prueba {

	public static void main(String[] args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		rwcsv.writecsv();
		List<AddPersonas> personas = rwcsv.readcsv();
		System.out.println(personas.get(1).toString());

	}

}
