package questao2;

public class Retangulo {
	private float base;
	private float altura;
	

	
	public Retangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float area() {
		return base * altura;
	}
	public float perimetro() {
		return 2 * base + 2 * altura;
	}
	
}
