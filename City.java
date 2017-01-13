import java.util.HashMap;
import java.util.Scanner;
public class City {
	
	private static Person[] cityPeople = {new Kid(), new Police(), new Teacher(),
				new Kid(), new Police(), new Teacher(), 
				new Kid(), new Police(), new Teacher(),
				new Kid(), new Police(), new Teacher(),};
	private static Building[] cityBuildings = {new CityHall(), new School()};
	private static HashMap<Integer, String> Search = new HashMap<Integer, String>(); 
	
	public static void main(String[] args)
	{
		cityPeople[0].setName("Tim");
		cityPeople[1].setName("Rick");
		cityPeople[2].setName("Jane");
		cityPeople[3].setName("John");
		cityPeople[4].setName("Susan");
		cityPeople[5].setName("Mike");
		cityPeople[6].setName("Ally");
		cityPeople[7].setName("Ross");
		cityPeople[8].setName("Tom");
		cityPeople[9].setName("Grant");
		cityPeople[10].setName("Alex");
		cityPeople[11].setName("Dean");
		cityBuildings[0].setName("CityHall");
		cityBuildings[1].setName("Whitworth");
		
		cityPeople[1].setID(1112);
		cityPeople[2].setID(1113);
		cityPeople[4].setID(1114);
		cityPeople[5].setID(1115);
		cityPeople[7].setID(1116);
		cityPeople[8].setID(1117);
		cityPeople[10].setID(1118);
		cityPeople[11].setID(1119);
		
		placePeople(cityBuildings[0]);
		placePeople(cityBuildings[1]);
		
		System.out.printf("Welcome to the City Simulation.\n");
		System.out.printf("Here are your options: \n");
		System.out.printf("Press 1 to see the names of the all the residents in the city.\n");
		System.out.printf("Press 2 to see the names of the all the buildings in the city.\n");
		System.out.printf("Press 3 to see the names of the residents in each building.\n");
		System.out.printf("Press 4 to pay an Employee.\n");
		System.out.printf("Press 5 to search for an Employees name by entering their ID.\n");
		System.out.printf("Press 6 to quit:\n");
		
		int z = 0;
		do{
			Scanner Choice = new Scanner(System.in);
			int x = Choice.nextInt();
			z = x;
			if(x == 1)
			{
				System.out.printf("Here are the names of all the residents in the city:\n");
				getNamesOfResidents();
			}
			else if(x ==2)
			{
				System.out.printf("Here are the names of all the buildings in the city:\n");
				getNamesOfBuildings();
			}
			else if(x == 3)
			{
				System.out.printf("Here are the names of all the residents in CityHall:\n");
				listPeopleinBuilding(cityBuildings[0]);
				System.out.printf("Here are the names of all the residents in School:\n");
				listPeopleinBuilding(cityBuildings[1]);
			}
			else if(x == 4)
			{
			
				System.out.printf("Choose a City Person by entering 1, 2, 4, 5, 7, 8, 10, or 11");
			
				Scanner Choice1 = new Scanner(System.in);
				int i = Choice1.nextInt();
			
				System.out.printf("Here is that Person's Savings before they were paid:\n");
				System.out.println(cityPeople[i].getSavings());
				System.out.printf("Here is that same Person's Savings after getting paid:\n");
				payEmployees(cityPeople[i]);
				System.out.println(cityPeople[1].getSavings());
			}
			else if(x == 5)
			{
				System.out.printf("Enter an Employee's ID: \n");
				Scanner input = new Scanner(System.in);
				int y = input.nextInt();
				loadHashMap();
				System.out.printf(SearchByID(y));
			}
			else
			{
				System.out.printf("Invalid input \n");
			}
		} while(z != 6);
		
	}
	
	public static void loadHashMap()
	{
		for(int i = 0; i < 12; i ++)
		{
			if(cityPeople[i] instanceof Teacher || cityPeople[i] instanceof Police)
			{
				Search.put(cityPeople[i].getEmployeeID(), cityPeople[i].getName());
			}
		}
	}
	
	public static String SearchByID(int ID)
	{
		return Search.get(ID);
	}
	
	public static void getNamesOfResidents()
	{
		for (Person p : cityPeople)
		{
			System.out.printf(p.getName());
			System.out.printf("\n");
		}
	}
	
	public static void getNamesOfBuildings()
	{
		for (Building b : cityBuildings)
		{
			System.out.printf(b.getName());
			System.out.printf("\n");
		}
	}
	
	public static void placePeople(Building b)
	{
		if(b instanceof CityHall)
		{
			for (Person p : cityPeople)
			{
				if(p instanceof Police)
				{
					b.addOccupants(p);
				}
			}
		}
		else
		{
			for (Person p : cityPeople)
			{
				if(p instanceof Kid || p instanceof Teacher)
				{
					b.addOccupants(p);
				}
			}
		}
	}
	
	public static void listPeopleinBuilding(Building b)
	{
		b.listOccupants();
	}
	
	public static void payEmployees(Person p)
	{
		p.payEmployee();
	}
}
