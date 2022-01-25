package learn.console.BadriJava.oop;

public class DemoHierarchy 
{
	public static void main(String[] args) 
	{
//		PlayStore play=new PlayStore("badrigugai@gmail.com","badrinath","badri",8765567834L);
//		play.download("VLC", "badri@gmail.com", "badri");
//		play.download("Instagram", "badrigugai@gmail.com", "badri");
//		play.download("Orkut", "badrigugai@gmail.com", "badri");
//		System.out.println(play);
//		
//		Drive dv=new Drive("umadevi@gmail.com", "SriUmaDevi", "uma", 876545678L);
//		dv.share("UML", "kumaraganeshan@gmail.com");
//		dv.share("SRS", "razakmohamed@yahoo.com");
//		dv.share("Scrum", "rasheedha@gmail.com");
//		System.out.println(dv);
		
		// Parent obj=new DeriveClass();
		Google g=new PlayStore("razakmohamed@gmail.com", "Razak Mohamed", "razak", 87656789876L);
		System.out.println(g);
		
		g=new Drive("razakmohamed@gmail.com", "Razak Mohamed", "razak", 87656789876L);
		System.out.println(g);
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
	String[] files= {"Daily Report","FRS","SRS","UML","Test Plan","Test Design","Test Report","User Story","Epic","Bug Report","Test Summary"};
	
	public Drive() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Drive(String username, String fullname, String password, Long contact) {
		super(username, fullname, password, contact);
		// TODO Auto-generated constructor stub
	}



	public void share(String specific,String to)
	{
		for(int index=0;index<files.length;index++)
		{
			if(specific.equalsIgnoreCase(files[index]))
			{
				System.out.println(files[index]+" found ");
				if(to.endsWith("@gmail.com"))
				{
					System.out.println(files[index]+" shared to "+to+" by "+getUsername());
					return;
				}
				else
				{
					System.out.println(to+" address is invalid");
					return;
				}
			}
		}
		System.out.println(specific+" not found in "+ getUsername() +" drive");
	}
}