import java.util.Random;
public abstract class Person {
	
	protected String cityName;
	protected String name;
	protected int age;
	protected int phoneNumber;
	private static int lastNumber = 1111111;
	private Random random = new Random();
	int x = 0; int y = 0;
	
	public Rank rank;
	
	public enum Rank
	{
		Patrol, Sergeant, Captain, Chief
	}
	
	
	public Person(){
		cityName = "Spokane";
		name = "name";
		age = random.nextInt(100);
		phoneNumber = lastNumber;
		lastNumber++;
	};
	
	abstract public int getX();
	abstract public int getY();
	abstract public void setX(int x);
	abstract public void setY(int y);
	abstract public String getName();
	abstract public void setName(String n);
	abstract public void payEmployee();
	abstract public int getSavings();
	abstract public void setRank(String r);
	abstract public String getRank();
}
