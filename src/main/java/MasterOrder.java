import java.util.ArrayList;

public class MasterOrder {
	// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/exercises/cookie-orders.md
	ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();

	public void addOrder(CookieOrder order) {
		orders.add(order);
	}

	public int getTotalBoxes() {
		int totalBoxes = 0;
		
		
//		for(int i=0; i<orders.size(); i++) {
//			totalBoxes += orders.get(i).getNumBoxes();  ==> this does the same thing as the enhanced for-loop below
//		}
		
		for(CookieOrder order: orders) {   // this is an enhanced for loop. You should use this when ever you can. 
			totalBoxes += order.getNumBoxes();
		}
return totalBoxes;
	}
	
	public void removeVariety(String variety) { //You remove items from indexes starting at the rear because index numbers would change if you started at the beginning (?)
		for (int i=orders.size()-1; i>=0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
		
	}
	public int getSize() {
		return orders.size();
	}
	public void showOrder() {
		for(CookieOrder order: orders) {
			System.out.println(order);
		}
	}
}


