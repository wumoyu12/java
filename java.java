package StudentInfo;

import java.util.Scanner;

public class CollectInfo
{
	String sfname, slname, ans;
	int grade = 0;
	int lgrade = 0;
	int tgrade = 0;
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
		grade = allinput.nextInt();
		System.out.println("Enter your average grade from last year(0-100): ");
		lgrade = allinput.nextInt();
		System.out.println("Enter your average grade from this year(0-100): ");
		tgrade = allinput.nextInt();
		
		PersonInfo studentinfo = new PersonInfo(sfname, slname, grade, lgrade, tgrade);
		
		System.out.println("Student Name:" + studentinfo.GetName());
		System.out.println("Grade Level:" + grade);
		
		System.out.println("Average from last year:");
		System.out.println("100 scale-" + lgrade);
		System.out.println("4 scale-" + studentinfo.GetGPA());
		
		System.out.println("Average from this year:");
		System.out.println("100 sacle-" + tgrade);
		System.out.println("4 sacle-" + studentinfo.GetGPA());
		
		System.out.println("Current GPA:" );
		System.out.println("100 scale-" + studentinfo.updateGPA100());
		System.out.println("4 scale-" + studentinfo.updateGPA());
		
	
	
	if (studentinfo.isHonorRoll() == true)
	{
		System.out.println("Congratulations! You are in Honor Roll!");
	}
	
	if (studentinfo.promote() == true)
	{
		System.out.println("You are going to grade " + studentinfo.GetGrade() + ".");
	}
	
	else
	{
		System.out.println("You are still in grade " + grade + ", because your GPA is below the 65.");
	}
	
	}
}














package StudentInfo;

public class Main
{

	public static void main(String[] args)
	{
		CollectInfo student1 = new CollectInfo();
		System.out.println("==========================================================");
		CollectInfo student2 = new CollectInfo();
		System.out.println("==========================================================");
		CollectInfo student3 = new CollectInfo();
		System.out.println("==========================================================");
	}

}








package StudentInfo;

public class PersonInfo
{
	private String firstname, lastname;
	private int grade, lastgrade, thisgrade;
	
	public PersonInfo(String fname, String lname, int grade, int cGPA, int pGPA)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.grade = grade;
		this.lastgrade = pGPA;
		this.thisgrade = cGPA;
	}
	
	public String GetName()
	{
		String fullname = firstname + " " + lastname;
		return fullname;
	}
	
	public Double GetGPA()
	{
		double fourScale = thisgrade / 100 * 4;
		return fourScale;
	}
	
	public Double updateGPA100()
	{
		double avgerage = (thisgrade + lastgrade) / 2;
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
	
	public int GetGrade()
	{
		grade = grade + 1;
		return grade;
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




