import java.util.Scanner;

public class Clube {

	String nome;
	int pontos;
	int saldoGols;
	
		void ganhar(int saldogols) {
			pontos = pontos + 3;
			saldoGols = saldoGols + saldogols;
			
		}
		
		void empatar() {
			pontos = pontos + 1;
			
		}
		
		void perder(int saldogols) {
			
			saldoGols = saldoGols - saldogols;
		
		}
}
