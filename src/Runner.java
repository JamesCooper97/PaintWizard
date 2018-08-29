
public class Runner {
	public static void main(String[] args) {
		
		Paint CM = new Paint("CheapoMax", 20, 19.99d, 10);
		Paint AJ = new Paint("AverageJoes", 15,17.99d,11);
		Paint DP = new Paint("DuluxourousPaint",10,25d,20);
		
		int room = 2000;
		
		Room rooms = new Room();
		
		rooms.addToPaints(CM);
		rooms.addToPaints(AJ);
		rooms.addToPaints(DP);
		
		rooms.paintCalculator(room);
	}
}
