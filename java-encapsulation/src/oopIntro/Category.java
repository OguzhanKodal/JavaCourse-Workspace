package oopIntro;

public class Category {
	
	private int id;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public void setId( int id) {
		this.id = id;
		
	}
	
	public String getName() {
		// return this.name; yerine
		return name + "!"; //yaptığın an tüm string ifadelerin yanına !ünlem ekler.
	}

	public void setName(String name) {
		this.name = name;
	}
}