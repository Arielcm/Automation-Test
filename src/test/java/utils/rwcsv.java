package utils;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class rwcsv {

	private static final String database = "./src/test/resources/personas.csv";

	public static void writecsv() throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		try {
			Writer writer = Files.newBufferedWriter(Paths.get(database), StandardCharsets.UTF_8);

			StatefulBeanToCsv<AddPersonas> beanToCsv = new StatefulBeanToCsvBuilder<AddPersonas>(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();

			List<AddPersonas> personas = new ArrayList<>();
			personas.add(new AddPersonas());
			personas.add(new AddPersonas());
			personas.add(new AddPersonas());
			beanToCsv.write(personas);
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}


	public static void readcsv() {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(database));
			CsvToBean<AddPersonas> csvToBean = new CsvToBeanBuilder<AddPersonas>(reader)
                    .withType(AddPersonas.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
			
			Iterator<AddPersonas> csvUserIterator = csvToBean.iterator();
			while (csvUserIterator.hasNext()) {
				AddPersonas persona = csvUserIterator.next();
                System.out.println("Name : " + persona.getName());
                System.out.println("Email : " + persona.getEmail());
                System.out.println("PhoneNo : " + persona.getPhone());
                System.out.println("Country : " + persona.getCity());
                System.out.println("==========================");
            }
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}