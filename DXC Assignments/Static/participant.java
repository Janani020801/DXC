package example;

class participant {
	private static int counter;
	private String registrationId, name, city;
	private long contactNumber;
	
	static {
		counter = 10000;
	}
	public participant(String name, long contactNumber, String city ) {
		this.registrationId = "D"+ ++counter;
		this.name = name;
		this.city = city;
		this.contactNumber = contactNumber;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public static void main(String[] args) {
		participant participant1 = new participant("Franklin", 7656784323L, "Texas");
		participant participant2 = new participant("Merina", 7890423112L, "New York");
		//Create more objects and add them to the participants array for testing your code
		participant[] participants = { participant1, participant2 };
		for (participant participant : participants) {
		System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}
	}
}