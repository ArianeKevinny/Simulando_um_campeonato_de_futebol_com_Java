import java.util.ArrayList;
import java.util.Random;

public class Campeonato {

		public ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		Clube campeao;
		int empate;
		
		public void inserenaLista(Clube a) {
			clubes.add(a);
		}
		
		public void jogarCampeonato() {
			
			for(int i = 0; i < clubes.size(); ++i) {
				for(int j = 0; j < clubes.size(); ++j) {
					if(i != j) {
						jogarPartida(clubes.get(i), clubes.get(j));						
					}else {
						continue;
					}

				}
			}
			
		}
		
		private void jogarPartida(Clube m, Clube v) {
			
			Random random = new Random();
			int placarM = random.nextInt(5);
			int placarV = random.nextInt(5);
			
			if (placarM > placarV) {
				m.ganhar(placarM);
				v.perder(placarV);
			}
			
			if (placarM == placarV) {
				m.empatar();
				v.empatar();
			}

			if (placarM < placarV) {
				m.perder(placarM);
				v.ganhar(placarV);
			}
			
		}
		
		void getCampeao() {
			campeao = clubes.get(0);		
			
			for(int i = 0; i < clubes.size()-1; ++i) {
				if (clubes.get(i).pontos < campeao.pontos) {
					continue; 
				}
				else if (clubes.get(i).pontos > campeao.pontos){
						campeao = clubes.get(i);
				}
				else {
					if (clubes.get(i).saldoGols < campeao.saldoGols) {
						campeao = clubes.get(i+1);
					}
					else if (clubes.get(i).saldoGols > campeao.saldoGols){
						campeao = clubes.get(i);
					}
					else {
						empate = i;
					}
				}
			}
				
			if (campeao == clubes.get(empate)) {
				System.out.println("Ocorreu um empate técnico em números de Saldo de Gols e Pontuação!");

			}
			else {
					System.out.println("Time Vencedor");
					System.out.println("------------------------------------------------------------");
					System.out.println("Nome: " + clubes.get(empate).nome);
					System.out.println("Pontos " + clubes.get(empate).pontos);
					System.out.println("Saldo de Gols: " + clubes.get(empate).saldoGols);
					System.out.println("------------------------------------------------------------");

				}
			
			}
				
}

