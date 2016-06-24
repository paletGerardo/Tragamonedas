package ar.edu.unlam.basica2.tp4;

	public class Tragamonedas {
		
				
				Tambor tambor1;
				Tambor tambor2;
				Tambor tambor3;
				
				FixNumberGenerator generator = new FixNumberGenerator(1);
			
				public Tragamonedas() {
					
					this.tambor1 = new Tambor(generator);
					this.tambor2 = new Tambor(generator);
					this.tambor3 = new Tambor(generator);
				}
			
				 
				/* post: activa el Tragamonedas haciendo girar 
				* sus 3 Tambores. 
				*/ 
				public void activar() {
					
					tambor1.girar();
					tambor2.girar();
					tambor3.girar();
				} 
				 
				/* post: indica si el Tragamonedas entrega un premio 
				* a partir de la posición de sus 3 Tambores. 
				*/ 
				public Boolean entregaPremio() {
					if (tambor1.getPosicion() == tambor2.getPosicion() && tambor1.getPosicion() == tambor3.getPosicion()) {
						
						return true;
					}
					else return false;
				}
		
}
