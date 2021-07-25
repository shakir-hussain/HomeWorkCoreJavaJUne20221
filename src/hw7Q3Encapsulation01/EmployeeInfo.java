package hw7Q3Encapsulation01;

public class EmployeeInfo {



	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Shakir");
		employee.setAge(30);
		employee.setSex('M');
		employee.setUsCitizen(true);
		
		System.out.println("Name: "+employee.getName()+"\n"+"Age:"+
		employee.getAge()+"\n"+"Sex:"+employee.getSex()+"\n"+"USCITIZEN:"+employee.isUsCitizen());

	}

}
