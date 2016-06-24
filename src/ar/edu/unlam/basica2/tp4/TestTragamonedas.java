package ar.edu.unlam.basica2.tp4;

import static org.junit.Assert.*;
//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void testCrearUnTragamonedasEnPosicionUno() {
		
		Tragamonedas maquina1 = new Tragamonedas();
		assertTrue(maquina1.tambor1.getPosicion()==1 && maquina1.tambor2.getPosicion()==1 && maquina1.tambor3.getPosicion()==1);
		
	}
	
	@Test
	public void testPruebaRandomNumberUnoADiez() {
		
		Integer numeroGenerado;
		RandomNumberGenerator random1a10 = new RandomNumberGenerator();
		numeroGenerado = random1a10.generate();
		assertTrue(numeroGenerado >= 1 && numeroGenerado <=10);
		
	}
	
//	@Test
//	public void testPruebaEnConsola(){
//		
//		Tragamonedas maquina1 = new Tragamonedas();
//		
//		System.out.println(maquina1.tambor1.getPosicion());
//		System.out.println(maquina1.tambor2.getPosicion());	
//		System.out.println(maquina1.tambor3.getPosicion());
//		System.out.println("----------------------------------------------");
//		System.out.println("El traga monedas se inicio correctamente.");
//		System.out.println("Dale play y comienza a ganar :)");
//		System.out.println("");
//
//		do {
//			maquina1.activar();
//			System.out.println(maquina1.tambor1.getPosicion());
//			System.out.println(maquina1.tambor2.getPosicion());	
//			System.out.println(maquina1.tambor3.getPosicion());
//			System.out.println("----------------------------------------------");
//			
//			if (maquina1.entregaPremio()) {
//				System.out.println("You Win!...");
//				JOptionPane.showMessageDialog(null, "En hora buena. Ganaste!...");
//			}
//			else{
//				System.out.println("You lose!... Try again.");
//				JOptionPane.showMessageDialog(null, "Intenta nuevamente");
//			}
//			
//			
//		} while (!maquina1.entregaPremio());
//	}		
		

}
