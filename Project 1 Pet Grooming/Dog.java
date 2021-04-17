public class Dog {
	private int dogSpaceNumber;
	private int dogWeight;
	private boolean grooming;
	
	public Dog() {
		grooming = false;
		dogSpaceNumber = 0;
		dogWeight = 0;
	}
	
	public Dog(boolean grooming, int dogSpaceNumber, int dogWeight) {
		this.grooming = grooming;
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
	}
	public static void main(String[] args) {}

	public int getDogWeight(int dogWeight) {
		return dogWeight;
	}
	
	public void setDogWeight(int dogWeight) {
		this.dogWeight = dogWeight;
	}

	public int getDogSpaceNumber(int dogSpaceNumber) {
		return dogSpaceNumber;
	}
	
	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}

	public boolean getGrooming(boolean grooming) {
		return grooming;
	}
	
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
}
