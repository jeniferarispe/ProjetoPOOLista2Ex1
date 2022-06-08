package model;

public class Retangulo {
	private float area;
	private float perimetro;

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float calcularArea(float l1, float l2) {
		return this.area = l1 * l2;
		

	}

	public float calcularPerimetro(float l1, float l2) {
	return this.perimetro = (l1 * 2) + (l2 * 2);
		
	}
}
