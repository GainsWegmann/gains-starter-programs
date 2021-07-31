package wheeloffoodApp;

//foodTypes class creation, static name and count
class foodTypes {
	private String name;
	public static int count = 0;

	// Creates integer for amount of types
	public int typecount;
	
	
	public String getName() {
		return name;
	}
	// Counts number of types
	public foodTypes(String name) {
		typecount = count;
		count++;
		System.out.println(typecount);
		this.name = name;
		// Count is used in random integer generation to retrieve a random foodType
//*******NEED TO CREATE RESTAURANT CLASS FOR EACH FOODTYPE. CREATE SIMPLE ARRAY FOR EACH CATEGORY?*********
	}
}