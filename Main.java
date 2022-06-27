import java.util.Scanner;



class Main 
{
	public static void main(String[] args) 
	{
    //attributes
    String fullname;
    String phrase;

    	//ask user for your name and partner's name
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your fullname: ");
      fullname = sc.nextLine();
      System.out.println("Enter a phrase: ");
      phrase = sc.nextLine();
    	
    	//create Speaking Object
    	Speaking talk = new Speaking(fullname);
      talk.getFirstName();
      talk.getLastName();
      talk.getInitials();
      talk.makePassword();
      talk.bompton(phrase);
	}
}
/*
Sample Output:


Enter your first name and last name, separated by a space: 
Jonathan Virak
Enter a phrase: 
Give papa a proper cup of coffee in a copper coffee cup.

Your first name is Jonathan
Your last name is Virak
Your initials are JV

Your new password: 8JonaVirakrak5

Give papa a proper bup of boffee in a bopper boffee bup */