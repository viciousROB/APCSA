import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
   setCount(1);
   setName("");
	}
	public Toy( String nam )
	{
   setCount(1);
   setName(nam);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
      this.count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nam )
	{
		this.name = nam;
	}

	public String toString()
	{
	   return "" + name + " " + count;
	}
}