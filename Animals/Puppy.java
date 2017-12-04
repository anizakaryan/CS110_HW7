package animals;

public class Puppy {
	  private String name;
	    public Puppy(String name){
	    this.name=name; 
	public String getName(){ // returns the name of the puppy
	return ( "the name of the Puppy is " +this.name); // prints "the name of the Puppy is bla bla "
	}


	//checking
	public static void main(String[] args){
	 Puppy a = new Puppy("Leonard");
	System.out.println(a.getName()); //prints "the name of the Puppy is Le "

	}

}
}