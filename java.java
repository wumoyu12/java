package StudentInfo;

public class Main
{

	public static void main(String[] args)
	{
		CollectInfo student1 = new CollectInfo();
		System.out.println("-------------------------------------------------------");
		CollectInfo student2 = new CollectInfo();
		System.out.println("-------------------------------------------------------");
		CollectInfo student3 = new CollectInfo();
		System.out.println("-------------------------------------------------------");
	}

}





package StudentInfo;

import java.util.Scanner;

public class CollectInfo
{
	String sfname, slname, ans;
	int sgrade = 0;
	int PreGPA = 0;
	int CurGPA = 0;
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		System.out.println("Enter your first name: ");
		sfname = allinput.nextLine(); 
		System.out.println("Enter your last name: ");
		slname = allinput.nextLine(); 
		System.out.println("Enter your grade level: ");
		sgrade = allinput.nextInt();
		System.out.println("Enter your GPA from last year(0-100): ");
		PreGPA = allinput.nextInt();
		System.out.println("Enter your GPA from this year(0-100): ");
		CurGPA = allinput.nextInt();
		
		PersonInfo studentinfo = new PersonInfo(sfname, slname, sgrade, PreGPA, CurGPA);
		
		System.out.println("Student Name:" + studentinfo.GetName());
		System.out.println("Grade Level:" + sgrade);
		System.out.println("Previous GPA:" + PreGPA);
		System.out.println("Previous GPA:" + studentinfo.GetGPA());
		System.out.println("Current GPA:" + CurGPA);
		System.out.println("Current GPA:" + studentinfo.GetGPA());
		System.out.println("Update GPA (100 scale):" + studentinfo.updateGPA100());
		System.out.println("Update GPA (4 scale):" + studentinfo.updateGPA());
	
	
	if (studentinfo.isHonorRoll() == true)
	{
		System.out.println("You are in Honor Roll");
	}
	
	if (studentinfo.promote() == true)
	{
		System.out.println("You are in grade " + studentinfo.GetGrade() + " right now.");
	}
	
	else
	{
		System.out.println("You are still in grade " + sgrade + ", because your GPA is below the 65.");
	}
	
	}
}


















package StudentInfo;

public class PersonInfo
{
	private String firstname, lastname;
	private int grade;
	private int pGPA;
	private int cGPA;
	
	public PersonInfo(String fname, String lname, int grade, int cGPA, int pGPA)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.grade = grade;
		this.pGPA = pGPA;
		this.cGPA = cGPA;
	}
	
	public String GetName()
	{
		String fullname = firstname + " " + lastname;
		return fullname;
	}
	
	public Integer GetGrade()
	{
		grade = grade + 1;
		return grade;
	}
	
	public Double GetGPA()
	{
		double fourScale = cGPA / 100 * 4;
		return fourScale;
	}
	
	public Double updateGPA100()
	{
		double avgerage = (pGPA + cGPA) / 2;
		return avgerage;
	}
	
	public Double updateGPA()
	{
		double averageGPA = updateGPA100() / 100 * 4;
		return averageGPA;
	}
	
	public Boolean promote()
	{
		boolean ifPromote = false;
		if (GetGPA() >= 2.6)
		{
			ifPromote = true;
		}
		return ifPromote;
	}
	
	public Boolean isHonorRoll()
	{
		boolean ifHoorRoll = false;
		if (updateGPA() >= 3.5)
		{
			ifHoorRoll = true;
		}
		
		return ifHoorRoll;
		
	}
}
