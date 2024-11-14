package Aggregation;

public class AggregationSample2 {
	
	String name;
	int pin;
	String city;
	
	AggregationSample add;
	
	public AggregationSample2(String name,int pin,String city,AggregationSample add) {
		this.name=name;
		this.pin=pin;
		this.city=city;
		this.add=add;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(pin);
		System.out.println(city);
		System.out.println(add.name);
		System.out.println(add.number);
		System.out.println(add.pincode);
	}

	public static void main(String[] args) {
		AggregationSample obj = new AggregationSample("sree",987,695123);
		
		AggregationSample2 obj1 = new AggregationSample2("richu",23,"trivandram",obj);
		obj1.show();
		
	}

}
