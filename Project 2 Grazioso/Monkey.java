public class Monkey extends RescueAnimal {
	//Attributes
	private String breed;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	//Constructor
	public Monkey(String name, String breed, String gender, String age, String weight, 
	String tailLength, String height, String bodyLength, String acquisitionDate, 
	String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
        setBreed(breed);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

	//Getters & Setters
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String monkeyBreed) {
		breed = monkeyBreed;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
}