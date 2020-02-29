package Aula14;

/* Crie à partir da master uma branch com o seu nome-carnaval (EX: braulio-carnaval). 
 * 
 * Na sua nova branch desenvolva um programa principal capaz de interagir com as classes referentes  aos funcionários da nossa empresa 
 * 
 * nela crie um menu aonde é possível cadastrar e controlar 
 
 * (aumentar salário,
 *  mostrar o salário, 
 *  mostrar os dados(para este caso seria interessante criar um método que printa na tela os dados referentes ao funcionário)) 
 *  até 10 funcionários. 
 *  
 *  Crie também um submenu para trabalhar com os TechLeads (cadastro e remoção de programadores). 
 *  
 *  Não se esqueça de commitar no repositório remoto sua atividade.
 */

public class ProgramaCargos {

	public static void main(String[] args) {
	
	Programador jeni = new Programador("Jenifer", "12022183672", 10000, 25, "Java", "Junior", "Back-End");
		
		System.out.println(jeni.getSalario());
		jeni.aumentaSalario(3000);
		System.out.println(jeni.getSalario());
		
		jeni.diminuiCargaHoraria(30);
		System.out.println(jeni.getNome());
		jeni.setNome("João Almeida");
		System.out.println(jeni.getNome());
		
		TechLead je = new TechLead(" Je ", "00000213444", 50000, 35, "Java", "Pleno", "Back-End");
		
		System.out.println(je.adicionaProgramador(jeni));
		System.out.println(je.removeProgramador("12022184331"));
		
	}
}
