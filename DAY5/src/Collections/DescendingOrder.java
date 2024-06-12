package Collections;
import java.util.Comparator;
public class DescendingOrder {
	String Brand;
	String model;
	int price;
	int rating;
	DescendingOrder(String Brand,String model, int price, int rating ){
		this.Brand=Brand;
		this.model=model;
		this.price=price;
		this.rating=rating;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String Brand) {
		this.Brand=Brand;
	}
	public String getmodel() {
	return model;}
	public void setmodel(String model) {
		this.model=model;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price ) {
		this.price=price;
	}
	public int getrating() {
		return rating;
	}
	public void setrating(int rating) {
		this.rating=rating;
	}
	public String toString() {
		return"DescendingOrder[Brand="+Brand+",model="+model+",price="+price+",rating="+rating+"]";
	}
	public int compareTo(DescendingOrder DO) {
	   return this.price-DO.price;
	}
	}
     
