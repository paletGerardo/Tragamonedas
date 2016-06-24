package ar.edu.unlam.basica2.tp4;


	public class Tambor {
			
			
			Integer posicion;
			
			public Tambor(NumberGenerator generator) {
				this.posicion = generator.generate();
			} 
			 
			/* post: devuelve el número de posición en la que se 
			* encuentra el Tambor. Es un valor comprendido 
			* entre 1 y 10. 
			 */
			
			public Integer getPosicion() {
				
				return this.posicion;
			} 
			 
			/* post: hace girar el tambor y luego se detiene en 
			* una posición comprendida entre 1 y 10. 
			*/ 
			public	void girar() {
				
				RandomNumberGenerator numeroAleatorio = new RandomNumberGenerator();
				this.posicion = numeroAleatorio.generate();
			}
	}
