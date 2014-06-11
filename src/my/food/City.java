package my.food;

public enum City {
	BEIJING("Bei Jing"),
	SHANGHAI("Shang Hai"),
	GUANGZHOU("Guang Zhou");
		
	 private String context;
     public String getContext(){
    	return this.context;
     }
     private City(String context){
    	this.context = context;
     }
}
