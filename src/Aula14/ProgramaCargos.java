package Aula14;

/* Crie � partir da master uma branch com o seu nome-carnaval (EX: braulio-carnaval). 
 * 
 * Na sua nova branch desenvolva um programa principal capaz de interagir com as classes referentes  aos funcion�rios da nossa empresa 
 * 
 * nela crie um menu aonde � poss�vel cadastrar e controlar 
 
 * (aumentar sal�rio,
 *  mostrar o sal�rio, 
 *  mostrar os dados(para este caso seria interessante criar um m�todo que printa na tela os dados referentes ao funcion�rio)) 
 *  at� 10 funcion�rios. 
 *  
 *  Crie tamb�m um submenu para trabalhar com os TechLeads (cadastro e remo��o de programadores). 
 *  
 *  N�o se esque�a de commitar no reposit�rio remoto sua atividade.
 */

public class ProgramaCargos {

	public static void main(String[] args) {
	
	Programador jeni = new Programador("Jenifer", "12022183672", 10000, 25, "Java", "Junior", "Back-End");
		
		System.out.println(jeni.getSalario());
		jeni.aumentaSalario(3000);
		System.out.println(jeni.getSalario());
		
		jeni.diminuiCargaHoraria(30);
		System.out.println(jeni.getNome());
		jeni.setNome("Jo�o Almeida");
		System.out.println(jeni.getNome());
		
		TechLead je = new TechLead(" Je ", "00000213444", 50000, 35, "Java", "Pleno", "Back-End");
		
		System.out.println(je.adicionaProgramador(jeni));
		System.out.println(je.removeProgramador("12022184331"));
		
	}
}
