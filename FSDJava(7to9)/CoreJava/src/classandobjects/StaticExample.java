package classandobjects;

public class StaticExample {
	public static void main (String[] args) {
		Employee.ceo="Priyanka";
		Employee.changeCeo("Nisha");
		
		
		Employee e1 = new Employee(101,"Chetan");
		Employee e2 = new Employee(102,"Shriya");
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);
	}

}
