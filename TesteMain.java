package br.unirio.spellCHEK;

import java.util.List;

public class TesteMain {

	public static void main(String[] args) {
		ArvoreBK tree = new ArvoreBK();

		String[] palavras = { "teste", "palavra", "testando", "Filipe", "palavras", "muitas", "poucas", ".", "[", "^",
				"parecidas", "diferentes", "iguais", "palavra", "continuando", "numero", "número", "1", "2", "12", ":",
				";", "F", "muitos", " " };

		tree.adicionaListaDeNo(palavras);
		for (int i = 0; i < 10; i++) {
			List<String> results = tree.busca("amuitas", i);
			System.out.println("i:" + i + "\n" + results);
		}

	}
}
