
public class CookieOrder {
	// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/exercises/cookie-orders.md

	// Instance Variables
	private String variety;
	private int numBoxes;

	// Constructor
	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		// why do we use "this."? It essentially creates a new variable, sort of.
		// Highlight a "variety" and notice that it doesn't highlight the other "variety"
		// variables, only a few of them.
		// The "this." distinguishes the two. In theory you could name the right side
		// "variety" variables lacking a "this." something different and the code would do the same thing.
		// (i.e) variety = varietyTwo
		// BUT that is not considered clean code. So don't do it.
		this.numBoxes = numBoxes;

	}

	// Getters - You can automatically generate this by clicking "Source" > "Generate Getters and Setters". BOOM BABY!
	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}
	
	@Override  //This annotation tells the compiler that I know there's a toString() method but I don't what it to do what it normally does
	// The default toString() method prints out gibberish gobblydoo gook (It's not actually gibberish. It's the location of the data...I think.) 
	// This makes it print out what you want.
	//Why don't we just create another class instead or rewriting an established one? Good question. Google the answer...it's this whole thing...
	public String toString() {
		return "Variety: " + this.variety + "\tBoxes:" + this.numBoxes;
	}
}
