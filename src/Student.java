import java.util.Random;

class Student
{
	
	String name;
	String SSN;
	private static int id=7498;
	
	public Student(String name,String SSN)
	{
		this.name=name;
		this.SSN=SSN;
		//System.out.println("name "+name+ " and " +"SSN "+SSN);
		
	}
	
	public void CreateEmail()
	{
		System.out.println("email id "+name+"@gmail.com");
		
	}
	
	public void GenerateUserId()
	{
		int number = (int) (Math.random()*10000);
		String User=SSN.substring(5);
		System.out.println("user id of student "+id+number+User);
		
	}
	
}


