
public class Car 
{
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model)
	{
		/*here model is passed as a parameter to our function.But we also have a model which is a data member 
		  of our class. So how do we distinguish between the two ?
		 */
	  /* 'this' keyword is used when we want to access the class fields.*/
		this.model = model;
		
		//this.model = class field
		//model = parameter
		
	}
	public String getModel()
	{
		return this.model;
	}
	
	

}
