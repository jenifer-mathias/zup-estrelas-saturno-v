package Aula10;

public class ProgramaElevadorProf {
		
		public static void main(String[] args) {
			
			ElevadorProf elevadorDoProf = new ElevadorProf(13, 24);
			
			elevadorDoProf.setCapacidade(26);
			
			System.out.println(elevadorDoProf.getAndarAtual());
			System.out.println(elevadorDoProf.desce());
			System.out.println(elevadorDoProf.getAndarAtual());
			
			elevadorDoProf.entra();
			elevadorDoProf.entra();
			elevadorDoProf.entra();
			elevadorDoProf.entra();
			elevadorDoProf.entra();
			
			System.out.println(elevadorDoProf.getQtdPessoas());
			elevadorDoProf.sai();
			System.out.println(elevadorDoProf.getQtdPessoas());
			
		}

	}