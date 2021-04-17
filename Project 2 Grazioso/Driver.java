import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    //Create ArrayLists
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();
        
        //Displays menu and accepts user input
        Scanner scnr = new Scanner(System.in);
        displayMenu();
        char userChoice;
        userChoice = scnr.nextLine().charAt(0);
        while (userChoice != 'q') {
        	while (userChoice != '1' && userChoice != '2' && userChoice != '3' && userChoice != '4' && userChoice != '5' && userChoice != '6') {
        		System.out.println("Invalid selection, please reenter selection.");
        		userChoice = scnr.nextLine().charAt(0);
        	}
        	if (userChoice == '1') {
        		intakeNewDog();
        	}
        	if (userChoice == '2') {
        		intakeNewMonkey();
        	}
        	if (userChoice == '3') {
        		reserveAnimal();
        	}
        	if (userChoice == '4') {
        		printAnimals("dog");
        	}
        	if (userChoice == '5') {
        		printAnimals("monkey");
        	}
        	if (userChoice == '6') {
        		printAnimals("available");
        	}
        	if (userChoice == 'q') {
        		break;
        	}
        }
    }

    // Print menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Fred", "Capuchin", "male", "4", "10.4", "10", "20", "20", "05-12-2019", "United States", "intake", false, "United States");
    	monkeyList.add(monkey1);
    }
    
    // Intake new dog
    public static void intakeNewDog() {
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        // Check dog isn't in list
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }
        // Input dog information
        System.out.println("What is the breed?");
        String breed = scnr.nextLine();
        System.out.println("What is the gender?");
        String gender = scnr.nextLine();
        System.out.println("What is the age?");
        String age = scnr.nextLine();
        System.out.println("What is the weight?");
        String weight = scnr.nextLine();
        System.out.println("What is the acquisition date?");
        String acquisitionDate = scnr.nextLine();
        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scnr.nextLine();
        System.out.println("What is the training status?");
        String trainingStatus = scnr.nextLine();
        System.out.println("What is the in service country?");
        String inServiceCountry = scnr.nextLine();
        System.out.println("What is the reservation status? True/false.");
        String reservedString = scnr.nextLine();
        boolean reserved;
        // check value is true or false
        if (reservedString != "true" && reservedString != "false") {
        	System.out.println("Reinput reservation status.");
        	reservedString = scnr.nextLine();
        }
        if (reservedString.toLowerCase() == "true") {
        	reserved = true;
        }
        else {
        	reserved = false;
        }
        // Add to dog ArrayList
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        System.out.println("New dog added.");
        dogList.add(newDog);
        // Return to main
        main(null);
        }
    
    // Intake new monkey
    public static void intakeNewMonkey() {
    	Scanner scnr = new Scanner(System.in);
        System.out.println("What is the monkey's name?");
        String name = scnr.nextLine();
        // Check monkey isn't in list
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            }
        }
        // Input monkey information
        //Check monkey is valid breed
        String breed;
        do {
        	System.out.println("What is the breed?");
            breed = scnr.nextLine();
        }
        while (breed != "Capuchin" && breed != "Guenon" && breed != "Macaque" && breed != "Marmoset" && breed != "Squirrel monkey" && breed != "Tamarin"); {
        	System.out.println("Invalid breed. Please reenter.");
        	breed = scnr.nextLine();
        System.out.println("What is the gender?");
        String gender = scnr.nextLine();
        System.out.println("What is the age?");
        String age = scnr.nextLine();
        System.out.println("What is the weight?");
        String weight = scnr.nextLine();
        System.out.println("What is the tail length?");
        String tailLength = scnr.nextLine();
        System.out.println("What is the height?");
        String height = scnr.nextLine();
        System.out.println("What is the body length?");
        String bodyLength = scnr.nextLine();
        System.out.println("What is the acquisition date?");
        String acquisitionDate = scnr.nextLine();
        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scnr.nextLine();
        System.out.println("What is the training status?");
        String trainingStatus = scnr.nextLine();
        System.out.println("What is the in service country?");
        String inServiceCountry = scnr.nextLine();
        System.out.println("What is the reservation status? True/false.");
        String reservedString = scnr.nextLine();
        boolean reserved;
        // check value is true or false
        if (reservedString != "true" && reservedString != "false") {
        	System.out.println("Reinput reservation status.");
        	reservedString = scnr.nextLine();
        }
        if (reservedString.toLowerCase() == "true") {
        	reserved = true;
        }
        else {
        	reserved = false;
        }
        // Add to monkey ArrayList
        Monkey newMonkey = new Monkey(name, breed, gender, age, weight, tailLength, height, bodyLength, acquisitionDate, acquisitionCountry, 
        trainingStatus, reserved, inServiceCountry);
        monkeyList.add(newMonkey);
        System.out.println("New monkey added.");
        // Return to main
        main(null);}
    }

        //Check if animal can be reserved & reserve animal if it exists
        public static void reserveAnimal() {
        	Scanner scnr = new Scanner(System.in);
            //Find animal type
        	System.out.println("Input animal type.");
            String reserveType = scnr.nextLine();
            //Set to lowercase for validation
            reserveType = reserveType.toLowerCase();
            //Find animal country
            System.out.println("Input animal country.");
            String reserveCountry = scnr.nextLine();
            //Set to lowercase for validation
            reserveCountry = reserveCountry.toLowerCase();
            //Check to see if animal is available and reserve if available
            for (Dog dog : dogList) {
            	if (reserveCountry.equals(dog.getInServiceCountry()) && reserveType.equals("dog")) {
            		System.out.println("A dog in this country is available and has been reserved.");
            		dog.setReserved(true);
            	}
                else {
                	System.out.println("No " + reserveType + "is available in " + reserveCountry + ".");
                }
            }
            for (Monkey monkey : monkeyList) {
            	if (reserveCountry.equals(monkey.getInServiceCountry()) && reserveType.equals("monkey")) {
            		System.out.println("A monkey in this country is available and has been reserved.");
            		monkey.setReserved(true);
            	}
                else {
                	System.out.println("No " + reserveType + "is available in " + reserveCountry + ".");
                }
            }
        }

        // Print the animal name, status, acquisition country and if the animal is reserved.
        public static void printAnimals(String listType) {
            // dog - prints the list of dogs
        	if (listType == "dog") {
            	System.out.println("All dogs: ");
            	for (Dog dog : dogList) {
            		System.out.println("Name: " + dog.getName());
            		System.out.println("Status: " + dog.getTrainingStatus());
            		System.out.println("Acquisition location: " + dog.getAcquisitionLocation());
            		System.out.println("Reserved: " + dog.getReserved());
            	break;	
            	}
            }
        	// monkey - prints the list of monkeys
        	else if (listType == "monkey") {
                System.out.println("All monkeys: ");
            	for (Monkey monkey : monkeyList) {
            		System.out.println("Name: " + monkey.getName());
            		System.out.println("Status: " + monkey.getTrainingStatus());
            		System.out.println("Acquisition location: " + monkey.getAcquisitionLocation());
            		System.out.println("Reserved: " + monkey.getReserved());
            	break;	
            	}
            }
        	// available - prints a combined list of all animals that are fully trained ("in service") but not reserved
        	else if (listType == "available") {
            	System.out.println("All unreserved dogs: ");
            	for (Dog dog : dogList) {
            		if (!dog.getReserved()) {
            			System.out.println("Name: " + dog.getName());
                		System.out.println("Status: " + dog.getTrainingStatus());
                		System.out.println("Acquisition location: " + dog.getAcquisitionLocation());
                		System.out.println("Reserved: " + dog.getReserved());
                	break;	
            		}
            	}
            	System.out.println("All unreserved monkeys: ");
            	for (Monkey monkey : monkeyList) {
            		if (!monkey.getReserved()) {
                		System.out.println("Name: " + monkey.getName());
                		System.out.println("Status: " + monkey.getTrainingStatus());
                		System.out.println("Acquisition location: " + monkey.getAcquisitionLocation());
                		System.out.println("Reserved: " + monkey.getReserved());
                	break;	
            		}
            	}
            }
        }
}