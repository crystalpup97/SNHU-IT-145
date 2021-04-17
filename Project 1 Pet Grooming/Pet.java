public class Pet {
	// Declare private variables
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private int amountDue;
	
	// Default constructor
	public Pet() {
		petType = "none";
		petName = "none";
		petAge = 0;
		dogSpaces = 0;
		catSpaces = 0;
		daysStay = 0;
		amountDue = 0;
	}
	
	// Another constructor
	public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, int amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpaces = dogSpaces;
		this.catSpaces = catSpaces;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}
	
	public static void main(String[] args) {}
	
	//Accessors and Mutators
	public String getPetType(String petType) {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}	
	public String getPetName(String petName) {
		return petName;
	}	
	public void setPetName(String petName) {
		this.petName = petName;
	}	
	public int getPetAge(int petAge) {
		return petAge;
	}	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}	
	public int getDogSpaces(int dogSpaces) {
		return dogSpaces;
	}	
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}	
	public int getCatSpaces(int catSpaces) {
		return catSpaces;
	}	
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}	
	public int getDaysStay(int daysStay) {
		return daysStay;
	}	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}	
	public int getAmountDue(int amountDue) {
		return amountDue;
	}	
	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
}