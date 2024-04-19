package Programming;

public class Profile {
	
	private String firstName;
	private int age;
	public Profile()
	{
		
	}
	public Profile(String f, int a)
	{
		firstName = f;
		age = a;
	}
	
	public boolean validAge(int age)
	{
		if(age < 121 && age > 17)
		{
			return true;
		}
		return false;
	}

	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public int getAge()
	{
		return age;
	}
	

}
