package model;

public class Circulo {

	private float raio;
	private float areaDisco;
	private float circunferencia;
	private float superficie;
	private float volume;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAreaDisco() {
		return areaDisco;
	}

	// public void setAreaDisco(float areaDisco) {
	// this.areaDisco = areaDisco;
	// }
	public float getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(float circunferencia) {
		this.circunferencia = circunferencia;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float calcularAreaDisco() {
		// A = π x r²
		return this.areaDisco = (float) (3.14159265359 * (raio * raio));
		

	}

	public float calcularCircunferencia() {
		//C = 2·π·r
		return this.circunferencia = (float) (2 * 3.141 * raio);
		
	}

	public float calcularSuperficie() {
	
	return 	this.superficie = (float) (4 * 3.141 * (raio*raio));
		

	}

	public float calcularVolume() {
		return this.volume = (float) ( 3.141 *( raio*raio)*circunferencia);
		 //π r² h

	}

}
