package ar.edu.unlam.basica2.tp4;

public class RandomNumberGenerator implements NumberGenerator{
	
	public Integer generate(){
		return (int)(Math.random()*10+1);
	}

}
