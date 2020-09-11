import java.util.Random;
public class StudentDb 
{

	public static void main(String[] args) 
	
	{
		Student inf = new Student("sachin","12345678");
		Student inf1 = new Student("anu","98765432");
		Student inf2 = new Student("rajesh","98765453");
		inf.CreateEmail();
		inf.GenerateUserId();
		inf1.CreateEmail();
		inf1.GenerateUserId();
		inf2.CreateEmail();
		inf2.GenerateUserId();
	}

}
