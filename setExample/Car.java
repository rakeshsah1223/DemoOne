package setExample;

public class Car {
	String canName;
	double carprice;
	int manu_year;
	public Car(String canName, double carprice, int manu_year) {
		super();
		this.canName = canName;
		this.carprice = carprice;
		this.manu_year = manu_year;
	}
	public String getCanName() {
		return canName;
	}
	public void setCanName(String canName) {
		this.canName = canName;
	}
	public double getCarprice() {
		return carprice;
	}
	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}
	public int getManu_year() {
		return manu_year;
	}
	public void setManu_year(int manu_year) {
		this.manu_year = manu_year;
	}
	@Override
	public String toString() {
		return "[carName=" + canName + ", carprice=" + carprice + ", manu_year=" + manu_year + "]";
	}
	
}
