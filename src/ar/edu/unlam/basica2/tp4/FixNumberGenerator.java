package ar.edu.unlam.basica2.tp4;

public class FixNumberGenerator implements NumberGenerator{
	
	int valorInicial;

	/* Este generador devolverá siempre number cuando se llame al método generate() 
	*/ 
	public FixNumberGenerator (Integer number) {
		this.valorInicial = number;
	} 
	/* post: devuelve el número de posición en la que se 
	* encuentra el Tambor. Es un valor comprendido 
	* entre 1 y 10. 
	*/ 
	public Integer generate() {
		return valorInicial;
	} 
}
