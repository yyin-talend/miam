package my.food;

public class Country {

	static Country instance;
	public static Country getInstance() {
		return instance;
	}
	public String getCountryForChaShaoBao(){
		return "ChaShaoBao-USA";
	}
	
	public String getCountryForDanDanMian(){
		return "DanDanMian-USA";
	}
	public String getCountryForPizza(){
		return "Pizza-USA";
	}
}
