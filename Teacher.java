
public class Teacher extends Person 
	implements Employee {
	private
	int Savings;
	int gradeLevel;
	String certification;
	int EmployeeID = 1111;
	
	public void payEmployee() {
		int newSavings = Savings + 100;
		Savings = newSavings;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public void setID(int x)
	{
		EmployeeID = x;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int grade) {
		gradeLevel = grade;
	}
	
	public String getCertification()
	{
		return certification;
	}
	
	public void setCertification(String cert)
	{
		certification = cert;
	}
	
	public int getSavings()
	{
		return Savings;
	}
}
