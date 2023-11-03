public class Game
{
	private String name;
	private double plat;

	public Game(String pName, double pPlat)
	{
		name = pName;
		plat = pPlat;
	}

	public Game(Game pGame)
	{
		name = pGame.getName();
		plat = pGame.getPlat();
	}
	
	public Game()
	{
		name = "Persona";
		plat = 10.00;
	}

	public String getName()
	{
		return name;
	}
	
	public double getPlat()
	{
		return plat;
	}
	
	public void setName(String pName)
	{
		name = pName;
	}

	public void setPlat(double pPlat)
	{
		plat = pPlat;
	}
}

