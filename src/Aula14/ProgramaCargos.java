package Aula14;

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
