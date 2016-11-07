package br.unirio.spellCHEK;

public class Util {
	/**
	 * Calculo da distancia de Levenshtein entre 2 strings
	 *
	 * @return int
	 */
	public static int distanciaDeLevenshtein(String string1, String string2) {

		if (string1.length() == 0) {
			return string2.length();
		}
		if (string2.length() == 0) {
			return string1.length();
		}

		int igualdadePosicao0 = (string1.charAt(0) == string2.charAt(0)) ? 0 : 1;

		// Recursão comparando a primeira substring diminuindo a primeira
		// posicao
		int adicao = distanciaDeLevenshtein(string1.substring(1), string2) + 1;
		// Recursão comparando a segunda substring diminuindo a primeira posicao
		int delecao = distanciaDeLevenshtein(string1, string2.substring(1)) + 1;

		int mudanca = distanciaDeLevenshtein(string1.substring(1), string2.substring(1)) + igualdadePosicao0;

		return Math.min(mudanca, Math.min(adicao, delecao));
	}
}
