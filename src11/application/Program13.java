package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program13 {

    public static void main(String[] args) {

	String caminhoArquivo = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\in.txt";

	FileReader fr = null;
	BufferedReader br = null;

	try {
	    fr = new FileReader(caminhoArquivo);
	    br = new BufferedReader(fr);

	    String line = br.readLine();
	    while (line != null) {
		System.out.println(line);
		line = br.readLine();
	    }

	} catch (IOException e) {
	    System.out.println("Error: " + e.getMessage());
	} finally {
	    try {
		if (br != null) {
		    br.close();
		}
		if (fr != null) {
		    fr.close();
		}
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}

    }

}
