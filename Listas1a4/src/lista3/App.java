package lista3;

public class App {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("joao", 10);
		Pessoa p2 = new Pessoa("ana", 12);
		Pessoa p3 = new Pessoa("paulo", 9);
		
		
		Pessoa[] todos = {p1, p2, p3};
		Pessoa maisVelho = new Pessoa(null, 0);
		
		for (Pessoa i: todos) {
			if (i.idade > maisVelho.idade) {
				maisVelho = i;
			}
		}
		System.out.println(maisVelho.nome);
		
	}

}
