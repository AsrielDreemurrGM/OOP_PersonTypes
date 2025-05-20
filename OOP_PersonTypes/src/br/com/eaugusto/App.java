package br.com.eaugusto;

public class App {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		
		NaturalPerson person1 = new NaturalPerson();
		
		System.out.println("Pessoa Física");
		person1.setName("Eduardo");
		person1.setCpf("123.456.789-10");
		person1.setEmail("email@gmail.com");
		person1.setAddress("Rua Java - Nº 404");
		person1.setGender("Masculino");
		person1.setMaritalStatus("Solteiro");
		
		person1.displayInfo();
		
		System.out.println("------------------------------");
		
		LegalEntity company1 = new LegalEntity();
		
		System.out.println("Pessoa Jurídica");
		company1.setCorporateName("Empresa");
		company1.setCnpj("12.345.678/910-11");
		company1.setEmail("companyEmail@gmail.com");
		company1.setAddress("Rua Java - Nº 404");
		company1.setCompanyType("MEI");

		company1.displayInfo();
	}
}
