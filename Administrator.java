//CS 280 Assignment 1
//Creator: Nicole Lyu

public class Administrator extends SalariedEmployee{
	
	//instance variables  
	public String title;
	 public String responsibility;
	 public String supervisor;
	 
	 
	 //instance methods 
	 //setters
	 public void setTitle(String title) {
		 if (title==null) {
			 System.out.println("Invalid; please enter a new title:");
			 System.exit(0);
		 }
		 else
			 this.title=title;
	 }
	 
	 public void setResponsibility(String responsibility) {
		 if (responsibility==null) {
			 System.out.println("Invalid; please enter a new area of responsibility:");
			 System.exit(0);
		 }
		 else	 
			 this.responsibility=responsibility; 
	 }
	 
	 public void setSupervisor(String supervisor) {
		 if (supervisor==null) {
			 System.out.println("Invalid; please enter a new immediate supervisor:");
			 System.exit(0);
		 }
		 else	
			 this.supervisor=supervisor; 
	 }
	 
	 //getters
	 public String getTitle() {
		 return this.title;
	 }
	 
	 public String getResponsibility() {
		 return this.responsibility;
	 }
	 public String getSupervisor() {
		 return this.supervisor;
	 }
	 
	 //convert to String
	 public String toString() {
		 return super.toString()+"\nTitle: "+title+"\nResponsibility area: "+responsibility
				 +"\nImmediate supervisor: "+supervisor;
	 }
	 
	 
	 public boolean equals(Object otherObject)
		{
		    if (otherObject == null)
		        return false;
		    else if (this.getClass( ) != otherObject.getClass( ))
		        return false;
		    else
		    {
		        Administrator otherAdministrator =
		                               (Administrator)otherObject;
		         return (super.equals(otherAdministrator)
		              && (title == otherAdministrator.title)
		              && (responsibility == otherAdministrator.responsibility)
		              && (supervisor == otherAdministrator.supervisor));
		    }
	    }
	 
	//constructors - initialize objects
	//6-argument
		 public Administrator (String name, Date date, double salary, String title,String responsibility, String supervisor) {
			 super(name, date, salary);
			 if (title==null || responsibility== null || supervisor == null) {
				 System.out.println("Fatal error");
				 System.exit(0);
			 }
			 else {
				 this.title = title;
				 this.responsibility = responsibility;
				 this.supervisor = supervisor;
			 }
			 
		 }
	 
	 
	 //3-argument
	 public Administrator (String title,String responsibility, String supervisor) {
		 if (title==null || responsibility== null || supervisor == null) {
			 System.out.println("Fatal error");
			 System.exit(0);
		 }
		 else {
			 this.title = title;
			 this.responsibility = responsibility;
			 this.supervisor = supervisor;
		 }
		 
	 }
	 

}
