package test.calculadora;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTest {
	private Calculadora calc;
	
	
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		//definir cenário
		int resultadoEsperado = 0;
		
		//executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();
		
		//comparar
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarConstrutorComParametrosValorZero() {
		Calculadora calc1 = new Calculadora(0);
		//executar
		int resultadoObtido1 = calc1.getMemoria();
		//comparar
		assertEquals(0, resultadoObtido1);
	}

	@Test
	public void testarConstrutorComParametrosValorDezNegativo() {
		Calculadora calc2 = new Calculadora(-10);

		int resultadoObtido2 = calc2.getMemoria();

		assertEquals(-10, resultadoObtido2);
	}

	@Test
	public void testarConstrutorComParametrosValorDez() {
		Calculadora calc3 = new Calculadora(10);

		int resultadoObtido3 = calc3.getMemoria();

		assertEquals(10, resultadoObtido3);

	}

	@Test
	public void testarMetodoSomar() {
		calc = new Calculadora(0);

		calc.somar(-10);

		assertEquals(-10, calc.getMemoria());
	}

	@Test
	public void testarMetodoSubtrair() {
		calc = new Calculadora(0);

		calc.subtrair(5);

		assertEquals(-5, calc.getMemoria());
	}

	@Test
	public void testarMetodoMultiplicar() {
		calc = new Calculadora(5);

		calc.multiplicar(5);

		assertEquals(25, calc.getMemoria());
	}

	@Test
	public void testarMetodoDividirValorNegativo() throws Exception {
		Calculadora calc2 = new Calculadora(20);
		
		calc2.dividir(5);

		assertEquals(4, calc2.getMemoria());
	}

	@Test
	public void testarMetodoDividirPorZero() {
		Calculadora calc1 = new Calculadora(10);

		assertThrows(Exception.class,() -> calc1.dividir(0));
	}


	@Test
	public void testarMetodoExponenciar() throws Exception  {
		Calculadora calc2 = new Calculadora(10);

		//calc1.exponenciar(11);
		calc2.exponenciar(2);

		assertEquals(100, calc2.getMemoria());

	}

	@Test
	public void testarMetodoExponenciarMaiorDez() {
		Calculadora calc1 = new Calculadora();

		assertThrows(Exception.class, () -> calc1.exponenciar(11));
	}

	@Test
	public void testarMetodoZerarMemoria() {
		calc = new Calculadora();

		calc.zerarMemoria();

		assertEquals(0, calc.getMemoria());
	}

	
}
