import java.util.Scanner;
public class City {
	
	private static Person[] cityPeople = {new Kid(), new Police(), new Teacher(),
				new Kid(), new Police(), new Teacher(), 
				new Kid(), new Police(), new Teacher(),
				new Kid(), new Police(), new Teacher(),};
	private static Building[] cityBuildings = {new CityHall(), new School()};
	
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
		
		cityPeople[1].setRank("Patrol");
		cityPeople[4].setRank("Sergeant");
		cityPeople[7].setRank("Captain");
		cityPeople[10].setRank("Chief");
		
		cityBuildings[0].setName("CityHall");
		cityBuildings[1].setName("Whitworth");
		
		System.out.printf("Here are the names of all the residents in the city:\n");
		getNamesOfResidents();
		System.out.printf("Here are the names of all the buildings in the city:\n");
		getNamesOfBuildings();
		
		placePeople(cityBuildings[0]);
		placePeople(cityBuildings[1]);
		System.out.printf("Here are the names of all the residents in CityHall:\n");
		listPeopleinBuilding(cityBuildings[0]);
		System.out.printf("Here are the names of all the residents in School:\n");
		listPeopleinBuilding(cityBuildings[1]);
		
		System.out.printf("You can also pay the people who are employees, here is the Savings of a certain Person:\n");
		System.out.println(cityPeople[1].getSavings());
		System.out.printf("Here is that same Person's Savings after getting paid:\n");
		payEmployees(cityPeople[1]);
		System.out.println(cityPeople[1].getSavings());
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
