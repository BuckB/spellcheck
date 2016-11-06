package br.unirio.spellCHEK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipInputStream;

public class LeitorDeArquivo {

	public ArrayList<String> LerArquivo() {

		ArrayList<String> palavras = new ArrayList<String>();

		try {
			FileInputStream fis = new FileInputStream("dictionary_pt-br.zip");

			ZipInputStream zipIn = new ZipInputStream(fis);

			/* ZipEntry entry = zipIn.getNextEntry(); */

			StringBuilder sb = new StringBuilder();
			while (zipIn.available() > 0) {
				sb.append((char) zipIn.read());

			}
			palavras.add(sb.toString());
			sb = null;
		} catch (IOException e) {

			e.printStackTrace();
		}

		return palavras;
	}
}
