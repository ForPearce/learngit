class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	
	private String username;
	private String password;
	private int age;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}
