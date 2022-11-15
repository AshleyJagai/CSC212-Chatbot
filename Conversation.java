import java.util.Scanner;
import java.util.*;

/** Creates a conversation between the computer and the user
* @author Janice Salazar and Ashley Jagai
* @version January 2022
*/

class Conversation {
  static String generic = "Interesting... How's your day";

  public static void main(String[] arguments) {
    //* You will start the conversation here. Recieves input of rounds
    List<String> conversation = new ArrayList<String>();
    System.out.println("How many rounds");
    conversation.add("How many rounds");
    Scanner sc = new Scanner(System.in);
    String rounds = sc.next();
    conversation.add(rounds);
  
    Boolean found = false;
    int i;
    int round = Integer.parseInt(rounds);
    System.out.println("Hi there! What's on your mind?");
    conversation.add("Hi there! What's on your mind?");
    Scanner input = new Scanner(System.in);
    String response = input.nextLine();

  //* A while loop that repeats the conversation while the rounds input is not equal to 0
  while (round != 0)  
   {
     //if statements keep track of mirroring and replacing the words found in the input String of conversation
      conversation.add(response);
      if(response.contains("Me "))
      {
        response = response.replace("Me", "you");
        found = true;
      }
      if(response.contains("me "))
      {
        response = response.replace("me", "you");
        found = true;
      }

      if(response.contains("Am "))
      {
        response = response.replace("Am", "are");
        found = true;
      } 
      if(response.contains("am "))
      {
        response = response.replace("am", "are");
        found = true;
      } 

      if(response.contains("You "))
      {
        response = response.replace("You", "I");
        found = true;
      }
      if(response.contains("you "))
      {
        response = response.replace("you", "I");
        found = true;
      }

      if(response.contains("I " ))
      {
        response = response.replace("I", "you");
        found = true;
      } 
      if(response.contains("i " ))
      {
        response = response.replace("i", "you");
        found = true;
      } 

      if(response.contains("My "))
      {
        response = response.replace("My", "your");
        found = true;
      } 
      if(response.contains("my "))
      {
        response = response.replace("my", "your");
        found = true;
      } 

      if(response.contains("Your "))
      {
        response = response.replace("Your", "my");
        found = true;
      } 
      if(response.contains("your "))
      {
        response = response.replace("your", "my");
        found = true;
      } 

      if(! found)
      {
        response = generic;
      }
      
      System.out.println(response + "?");
      conversation.add(response + "?");
      response = input.nextLine();
      
      found = false;

      round --;
   }
      if(round == 0)
      {
        conversation.add(response);
        conversation.add("Bye!");
        System.out.println("Bye!");
      }
      
      
 // Assuming conversation is an ArrayList object String
      for (i=0; i<conversation.size(); i++) 
      {  
        // Do something with the current element here
       String current = conversation.get(i); 
       System.out.println("Transcript: " + current);
      }
    input.close();
    sc.close();
  }
}
