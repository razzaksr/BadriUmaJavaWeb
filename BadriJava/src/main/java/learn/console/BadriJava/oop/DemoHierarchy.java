package learn.console.BadriJava.oop;

public class DemoHierarchy 
{
	public static void main(String[] args) 
	{
		PlayStore play=new PlayStore("badrigugai@gmail.com","badrinath","badri",8765567834L);
		play.download("VLC", "badri@gmail.com", "badri");
		play.download("Instagram", "badrigugai@gmail.com", "badri");
		play.download("Orkut", "badrigugai@gmail.com", "badri");
	}
}

class PlayStore extends Google
{
	
	public PlayStore() 
	{
		System.out.println("Play store opened");
	}
	
	public PlayStore(String user, String name, String pass, long contact)
	{
		super(user,name,pass,contact);
	}
	
	public Boolean validate(String user,String pass)
	{
		if(user.equals(this.getUsername())&&pass.equals(this.getPassword()))
			return true;
		else
			return false;
	}
	
	static String[] available= {"PUBG","Free Fire","VLC","MX Player","Instagram",
			"Whatsapp","Telegram","Facebook","Youtube",
			"Hotstar","Flipkart","Amazon","Netflix","LinkedIn"};
	
	String[] installed=new String[10];
	
	public void download(String wish, String user,String pass)
	{
		// linear search
		if(validate(user,pass))
		{
			for(int index=0;index<available.length;index++)
			{
				if(available[index].equalsIgnoreCase(wish))
				{
					for(int pos=0;pos<installed.length;pos++)
					{
						if(installed[pos]==null)
						{
							installed[pos]=available[index];
							System.out.println(available[index]+" installed successfully by "+getFullname()+" via "+getUsername());
							return;
						}
					}
					System.out.println("Internal space full");
					return;
				}
			}
			System.out.println(wish+" app not in our playstore");
		}
		else
			System.out.println("Invalid credentials");
	}
}

class Drive extends Google
{
	
}