import java.util.*;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the username and password Generator!");
        
        System.out.println("Please enter your first name:");
        String FirstName = input.nextLine();
        
        System.out.println("Please enter your last name:");
        String LastName = input.nextLine();
        
        System.out.println("Please enter your favorite word:");
        String FavWord = input.nextLine();
        
       //Username generator
       
       String LastName2 = LastName + "*" + "*" + "*" + "*" + "*" + "*" + "*";
       int Index = 0;
       String FirstName2 = FirstName.substring(Index , 1);
       int EndLine = LastName.length();
       
       String LastName3 = LastName2.substring(Index ,7 );
       Random generator = new Random();
       int Num1 = generator.nextInt(100);
       FirstName2 = FirstName2.toLowerCase();
       LastName3 = LastName3.toLowerCase();
       
       String UserName = " ";
       UserName = UserName +FirstName2;
       UserName = UserName +LastName3;
       UserName = UserName +Num1;
       
       System.out.println("Thanks " + FirstName + " your user name is" +UserName );
       
       //First Password
       String FirstName3 = FirstName.toLowerCase();
       String LastName4 = LastName.toLowerCase();
       
       FirstName3 = FirstName3.replace('a' , '@');
       FirstName3 = FirstName3.replace('o' , '0');
       FirstName3 = FirstName3.replace('l' , '1');
       FirstName3 = FirstName3.replace('s' , '$');
       FirstName3 = FirstName3.replace('t' , '7');
       FirstName3 = FirstName3.replace('e' , '3');
       
       LastName4 = LastName4.replace('a' , '@');
       LastName4 = LastName4.replace('o' , '0');
       LastName4 = LastName4.replace('l' , '1');
       LastName4 = LastName4.replace('s' , '$');
       LastName4 = LastName4.replace('t' , '7');
       LastName4 = LastName4.replace('e' , '3');
       int Num2 = generator.nextInt(100);
       
       String Pass1 = " ";
       Pass1 = Pass1 + FirstName3; 
       Pass1 = Pass1 + Num2;
       Pass1 = Pass1 + LastName4;
       
       System.out.println("Password 1:" + Pass1);
       
       //Second Password
       
       int acronym1 = FirstName.length();
       int acronym2 = LastName.length();
       int acronym3 = FavWord.length();
       
       String FirstName4 = FirstName.substring(Index , Index + 1);
       FirstName4 = FirstName4.toLowerCase();
       String FirstName5 = FirstName.substring(acronym1 -1 , acronym1);
       FirstName5 = FirstName5.toUpperCase();
       String LastName5 = LastName.substring(Index , Index + 1);
       LastName5 = LastName5.toLowerCase();
       String LastName6 = LastName.substring(acronym2 -1 , acronym2);
       LastName6 = LastName6.toUpperCase();
       String FavWord2 = FavWord.substring(Index , Index + 1);
       FavWord2 = FavWord2.toLowerCase();
       String FavWord3 = FavWord.substring(acronym3 -1 , acronym3);
       FavWord3 = FavWord3.toUpperCase();
       
       String Pass2 = " ";
       Pass2 = Pass2 + FirstName4 + FirstName5 + LastName5 + LastName6 + FavWord2 + FavWord3;
       
       System.out.println("Password 2:" + Pass2);
       
       //Last Password
       
       int Portion = FirstName.length();
       int RFN = generator.nextInt(Portion);
       String FirstName6 = FirstName.substring('0' , RFN);
       
       System.out.println(FirstName6);
        
        
    }
}
        