class Machine {
	public void start() {
		System.out.println("Machine starting");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine machine = new Machine() {
			@Override 
			public void start() {
				System.out.println("Camera starting");
			}
		};
		
		machine.start();
		
		Plant plant = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growing");
			}
		};
		
		plant.grow(); 
	}

}
