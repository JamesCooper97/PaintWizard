import java.util.ArrayList;

public class Room {
	private ArrayList<Paint> paints = new ArrayList<Paint>();
	public void addToPaints(Paint paint) {
		paints.add(paint);
	}
	
	public void paintCalculator(int roomSize) {
		double totalPrice;
		int numberOfPots;
		double cheapestPrice = 10000d;
		String cheapestPaint = "PAINT";
		for (Paint i : paints) {
			numberOfPots = (roomSize/i.fullCoverage())+1;
			totalPrice = i.getCost()*numberOfPots;
			if (totalPrice < cheapestPrice) {
				cheapestPrice = totalPrice;
				cheapestPaint = i.getPaint();
			}
		}
		System.out.println("The best paint to buy is" + cheapestPaint);
	}
}
