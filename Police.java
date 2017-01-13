
public class Police extends Person 
	implements Employee {
	private
	int Savings = 0;
	String policeRole;
	int EmployeeID = 1111;
	
	public void payEmployee() {
		int newSavings = Savings + 100;
		Savings = newSavings;
	}
	
	public int getEmployeeID() 
	{
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

	public String getPoliceRole() {
		return policeRole;
	}

	public void setPoliceRole(String Role) {
		policeRole = Role;
	}
	
	public int getSavings()
	{
		return Savings;
	}
}
