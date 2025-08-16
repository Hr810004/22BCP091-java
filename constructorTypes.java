public class constructorTypes {
	constructorTypes() {
		System.out.println("This is an example of default constructor.");
	}
	constructorTypes(String name) {
		System.out.println("Welcome "+name+"\nThis is an example of parameterized constructor.");
	}
	public static void main(String[] args) {
		constructorTypes d = new constructorTypes();
		constructorTypes p = new constructorTypes("Harsh");
	}
}
