public class Speaking
{
  //attributes
  String fullname;
  String firstname;
  String lastname;
  
  int space; //you want to let the machine know the location of your space index

  String initials;
  String firstnameFirstLetter;
  String lastnameFirstLetter;
  String thePassword;
  int firstnameLength;
  String firstHalfofFirstname;
  String lastHalfofLastname;
  int lastnameLength;

  String phrase;
  String originalString;
  String revisedPhrase;




  //constructor
  public Speaking (String userFullname){
    fullname = userFullname; 
  }

	//methods
  public void getFirstName (){
    space = fullname.indexOf(' ');
    firstname = fullname.substring(0, space); //if you declare the space variable as "string" data type, the "substring" method won't work, because it'll only take integer 
    
    System.out.println("Your first name is: " + firstname);

  }

  public void getLastName(){
    lastname = fullname.substring(space+1);
    System.out.println("Your last name is: " + lastname);
  }

  public void getInitials(){
    firstnameFirstLetter = firstname.substring(0,1);
    lastnameFirstLetter = lastname.substring(0,1);
    initials = firstnameFirstLetter + lastnameFirstLetter;
    System.out.println("Your initials are: " + initials);
  }

  public void makePassword(){
    firstnameLength = firstname.length();
    lastnameLength = lastname.length();
    firstHalfofFirstname = firstname.substring(0,firstname.length()/2);
    lastHalfofLastname = lastname.substring(lastname.length()/2);
    /* makePassword() - returns a password created by the following:
    length of first name + first half of first name + last name + last half of last name + length of last name */
    System.out.println("The password is " + firstnameLength + firstHalfofFirstname + lastname + lastHalfofLastname + lastnameLength);

  }

  public void bompton(String originalString){
    phrase = originalString;
    revisedPhrase = phrase.replace('c', 'b');
    System.out.println("The revised setence: " + revisedPhrase);




  }






}

