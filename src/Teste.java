import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Clube c1 = new Clube();
		Clube c2 = new Clube();
		Clube c3 = new Clube();
		Clube c4 = new Clube();
		c1.nome = "Barbalha";
		c2.nome = "Santa Cruz";
		c3.nome = "Cruzeiro";
		c4.nome = "Santos";
		c1.pontos = 0;
		c2.pontos = 0;
		c3.pontos = 0;
		c4.pontos = 0;		
		c1.saldoGols = 0;
		c2.saldoGols = 0;
		c3.saldoGols = 0;
		c4.saldoGols = 0;
		
		Campeonato jogo = new Campeonato();
		jogo.inserenaLista(c1);
		jogo.inserenaLista(c2);
		jogo.inserenaLista(c3);
		jogo.inserenaLista(c4);

		//Com os times já criados e no array, tá na hora de botar eles para jogar.
		//Por ser estilo ida e volta, existirá diferenciação entre time 1 x time 2, e time 2 versus time 1
		
		//TODOS OS TIMES SE ENFRENTAM

		jogo.jogarCampeonato();
		
		//Mostrar o Vencedor
		
		jogo.getCampeao();

		
	}
}