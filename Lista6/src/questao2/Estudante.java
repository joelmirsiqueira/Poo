package questao2;

public class Estudante {
    private int matricula;
    private String nome;
    private float notas[] = new float[2];
    
    public Estudante(int matricula, String nome, float[] notas) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}
    public float[] getNotas() {
		return notas;
	}
    public void setNotas(float[] notas) {
		this.notas = notas;
	}
    public float media() {
    	float media = (this.notas[0] + this.notas[1]) / 2;
    	return media;
    }
}
