package vehicle;

public class Vehicle {
	public int chasisNo;
	public String uniqueid;
	public Enum color;
	public int price;
	public double pollutionLevel;
	public Vehicle(int chasisNo,String uniqueid,Enum color,int price,double pollutionLevel) {
		this.chasisNo=chasisNo;
		this.uniqueid=uniqueid;
		this.color=color;
		this.price=price;
		this.pollutionLevel=pollutionLevel;
	}
	public int getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getPollutionLevel() {
		return pollutionLevel;
	}
	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}
	public Enum getColor() {
		return color;
	}
	public void setColor(Enum color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "chasisNo: "+chasisNo+"uniqueid"+uniqueid+"Color: "+color+"price: "+price+"pollutionLevel"+pollutionLevel;
	}
	

}
