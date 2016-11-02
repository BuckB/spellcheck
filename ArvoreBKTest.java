
package br.unirio.spellCHEK;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class ArvoreBKTest extends TestCase {
	public void test() {

		ArvoreBK arvoreBK = new ArvoreBK();
		arvoreBK.adicionaNo("test");
		arvoreBK.adicionaNo("free");
		List<String> resultados = arvoreBK.busca("teste", 0);
		assertEquals(0, resultados.size());

		resultados = arvoreBK.busca("teste", 1);
		assertEquals(1, resultados.size());

	}

	public void testMultipleReturnValues() {
		ArvoreBK arvoreBK = new ArvoreBK();
		arvoreBK.adicionaNo("test");
		arvoreBK.adicionaNo("test1");
		List<String> resultados = arvoreBK.busca("teste", 1);
		assertEquals(2, resultados.size());
		assertEquals("test", resultados.get(0));
	}

	public void testRepeatingSameValue() {
		ArvoreBK arvoreBK = new ArvoreBK();
		arvoreBK.adicionaListaDeNo(Arrays.asList("test", "test", "test"));
		List<String> resultados = arvoreBK.busca("teste", 1);
		assertEquals(1, resultados.size());
		assertEquals("test", resultados.get(0));
	}

	public void testGivenExample() {
		ArvoreBK arvoreBK = new ArvoreBK();
		arvoreBK.adicionaNo("apple");
		arvoreBK.adicionaNo("orange");
		arvoreBK.adicionaNo("pear");
		arvoreBK.adicionaNo("kiwi");
		arvoreBK.adicionaNo("cantaloupe");
		arvoreBK.adicionaNo("strawberry");
		List<String> resultados = arvoreBK.busca("cantelope", 2);
		assertEquals(1, resultados.size());
		assertEquals("cantaloupe", resultados.get(0));
	}
}
