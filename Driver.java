
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;



public class Driver
{
   public Scanner input = new Scanner( System.in);
   public String user_input;
   public ArrayList<User> users = new ArrayList<User>();
  /**
   * This method takes in an arraylist of a login and password. the scanner asks the user for input 
   * and it checks it against what is in the arraylist, then it checks to see if the input is vaild
   * it uses the gotLogin and the getPassword methods from the user class
   * @param araaylist<user>
   * @return user or null
   */  
  
   
   public User login(ArrayList<User> listOfUsers) //return boolean to check if vaild login
   {
       
       System.out.println("Sage ");
       
       String userName;
       String password;
      
       System.out.println("Enter Log In" );
       userName = input.next();
       
       //check for valid username 
      
        
       System.out.println("Enter Password: ");
       password = input.next();
       
       
       for (int x=0; x < listOfUsers.size(); x++)
       { 
           User user = listOfUsers.get(x);
           if(user.getLogIn().equals(userName) && user.getPassword().equals( password  ))
           {
               //displayprofile(user);
               return user;
            }
            
           
            
        }
      
        //System.out.println("Not a user");
       return null;
       
    }
   /**
    * This method prints the user's profile it uses the getLogin method to know which profile to print 
    * @param user
    * @return profile
    */ 
    // Precodition: user must have a user profile 
    public void displayprofile(User userProfile) //ArrayList<RestaurantAccount> rAccount)
    {
    
       
        System.out.println(userProfile.getLogIn());
     /*for (int y = 0; y < rAccount.size(); y++ )
     {
        // RestaurantAccount restAccount = rAccount.get(y);
         
        // if (restAccount.getUser() == userProfile)// if it is a resturant print this
        // {
            // System.out.println();
        }
        else // if not a restaurnat print this
        {
        }
     //check if restaurant
     
     
    }*/ //post condition is the printed profile 
   }
   /**
    * This method is an if/else statement that uses the method .getRest. What this method is checking for is the
    * boolean value that tells the method if the user login is a normal user or restaurant user. if it is a 
    * restaurant it sends you to the RestMenu class and it if isn't it sends you to the UserMenu class
    * @param user
    * @return type of user 
    */
   public void ReturnMenu(User user)
   {
       //System.out.println("To get menu type menu");
       
       //String Userinput = input.next();
       if(user.getRest())
       {
           RestMenu(user);
        }
        else
        {
            UserMenu(user);
        }
        
        
      
    }
    /**
     * This method prints "Printed Resturant Menu" it also gives the option to edit the menu. If the user 
     * chooses to edit the menu they are able to
     * @param user
     * @return edited menu
     */
    public void RestMenu(User user) throws IllegalArgumentException
    {
       boolean validInput = false; 
        while(!validInput){
         try{
        //precondition
        if(user == null)
        {
            System.out.println("Not a restaruant user");
        }
       System.out.println("1. See Resturant Menu");
       System.out.println("2. Edit Menu");
       System.out.println("3. See Reviews");
       System.out.println("4. Delete User");
       String Userinput = input.next();
       if(Userinput.equals("1") || Userinput.equals("2") ||Userinput.equals("3") || Userinput.equals("4"))
       {
           validInput= true; 
           switch(Userinput)
           {
               case "1": seeMenu();
               break;
               case "2": editMenu();
               break;
               case "3": seeReviews(user);
               break;
               case "4": deleteUser(user);
               break;
            }
        }
        else{   
           throw new IllegalArgumentException("Invalid input");
        }
    }
    catch(IllegalArgumentException e){
        
    }
        /* System.out.println(" ");
        System.out.println("Printed Restaurant Menu");
        
        System.out.println("To edit menu type edit");
        
        String Userinput = input.next();
        if (Userinput.equals("edit"))
        {
            System.out.println("The menu is edited");
        }*/
    }
}
    /**
     * this method prints out the user profile there is an option to search for a restaurant and that is how the user can see a restaurant's menu there is 
     * the option to search for a resetaruant that that is how the user can see a restaurant's menu. There is the option to write a review that gets saved
     *gives consumer user a menu and throws and exception if invalid input
     *@param user
     * @return review
     */
    public void UserMenu(User user) throws IllegalArgumentException
    {
       boolean validInput = false;
      while(!validInput){
           
          try{ 
        System.out.println("1. Search for Restaurant");
        System.out.println("2. Write Review");
        System.out.println("3. Delete User");
        String Userinput = input.next();
        if(Userinput.equals("1") || Userinput.equals("2") || Userinput.equals("3"))
        {validInput = true;
           switch(Userinput)
        {
            case "1": search();
                break;
            case "2": writereview(user);
                break;
            case "3": deleteUser(user);
                break;
        }  
        }
         else{
         throw new IllegalArgumentException("Invalid input");
        }
    } 
    catch(IllegalArgumentException e){
        
    }}
        /*  System.out.println(" ");
       * 
        System.out.println("The User's profile");
        System.out.println("Search for a Restaurant: ");
        String Userinput = input.next();
        if (Userinput.equals("BlackBean"))
        {
            System.out.println("Black bean's menu");
        }
        System.out.println("Type yes to write a review");
        
        Userinput = input.next();
        if (Userinput.equals("yes"))
        {
            userReview(user);
        }
       */ 
        
    }
    public void search()
    {
    	
    	    	String searchingFor;
    	    	
    	    	System.out.println("Enter Resturant Name You Are Searching For" );
    	    	String x= input.next();
    	        searchingFor = input.nextLine();
    	        searchingFor = x + searchingFor;
    	        boolean found = false;
    	        for(User u: users )
    	        {
    	        	 String name = u.getName().trim();
    	        	if(name.equals(searchingFor) && u.getRest())
    	        	{
    	        		
    	        		found = true;
    	        		System.out.println("Resturant found");
    	        		
    	        	}
    	        	else
    	        	{
    	        		found = false;
    	        		System.out.println("Not found");
    	        	}
    	        	
    	        }
    	    
    	       // if(found)
    	        //{
    	       // System.out.println("Resturant found");
    	      //  }
    	    
    	    }
    
    /**
     * propts user to write a review 
     * @ param user
     * @return user
     */
    public void writereview(User user)
    { 
        System.out.println("Type yes to write a review");
        String Userinput = input.next();
        if (Userinput.equals("yes"))
        {
            
            String r = userReview(user);
            saveReview(r);
        }
    }
        
  
   public void seeMenu()
    	    {
    	    	Menu menu = new Menu("readmenu");
    	        menu.readMenu();
    	    }
    
        
  
   public void editMenu()
    	    {
    	    	FileWriter myWriter = null;
    	        
    	        try {
    	            myWriter = new FileWriter("menu.txt");
    	            System.out.println("Type edits here:");
    	            String userInput = input.next();
    	            myWriter.write(userInput);
    	        }
    	            
    	        catch (IOException e) {
    	            System.err.println(e);
    	        } 
    	        finally{
    	            try {
    	            myWriter.close();
    	        } catch (IOException e) {
    	            System.err.println(e);
    	    }
    	}
    	    }
    
    

    public void seeReviews(User user){
    	Review review = new Review("reviews");
        review.readReview();
    	
       
    }
    /**
     * This method prompts the user for the review 
     * @param user
     * @return printed review
     */
    public String userReview(User user)
    {
        System.out.println("");
        System.out.println("Type Review here");
        String userInput = input.next();
        //precondition here for what the review should have 
        ArrayList<Review> review = new ArrayList<Review>();
        review.add(new Review(userInput));
        System.out.println("Review accepted");
        return userInput;
        
    }
    
    public void saveReview(String r)
    {
        FileWriter myWriter = null;
            
        try {
            myWriter = new FileWriter("reviews.txt");
            System.out.println("Review Saved: ");
            myWriter.write(r);
        }
            
        catch (IOException e) {
            System.err.println(e);
        } 
        finally{
            try {
            myWriter.close();
        } catch (IOException e) {
            System.err.println(e);
    }
}}
    /**
     * This method holds the arraylist of all the users by (username, password, boolean value). THe boolean determines what tupe of user it is
     * @param user
     * @return users
     */
    public ArrayList<User> tester()
    {
        

        users.add(new User("name", "logIn", "passsWord", true));
        users.add(new RestaurantAccount("Black Bean", "BlackBean1", "1234",true, null, null, "8648848611", "429 King St"));
        users.add(new User("Reagan", "Reagan", "yourawesome", false));
        return users;
        
    }
    
   /* public ArrayList<RestaurantAccount> tester2(ArrayList<User> user)
    {
        ArrayList<RestaurantAccount> rAccount = new ArrayList<RestaurantAccount>();
        rAccount.add(new RestaurantAccount(user.get(1), null, null));
        return rAccount;
    }*/
    /** 
     * This method deletes a user from the array
     * has an assert 
     * @param user
     * @return deletes user 
     * 
     */
    
   public void deleteUser(User user)
   {
       Iterator<User> iter = users.iterator();
       int d = 0;
       boolean isFound = false;
       while (!isFound)
       { User deleteduser = iter.next();
          if(deleteduser == user)
          {
              
              isFound = true;

            }
            d++;
        }
        users.remove(user);
        System.out.println("User was deleted");
        assert !users.contains(user);
        }
     /** 
     * This method takes in the list of users and calls all of the methods. It also has a try.catch in case the users input for their login and password what wrong It throws an exception
     * @param args
     * @return user or user not found
     */ 
   public static void main(String[] args) throws Exception
   {
      
       Driver driver = new Driver();
       //test cases
       
       ArrayList<User> listOfUsers = driver.tester();
       //Restaurant r = new Restaurant();
       User aUser = driver.login(listOfUsers);
       

       try{
           driver.displayprofile(aUser);
           driver.ReturnMenu(aUser);
       
        }
        catch(NullPointerException e){
            System.err.println("User Not Found ");
            
        }
       

      
       /*System.out.println(""); // how to print a restaurant list ?? 
       System.out.println("Pick Restaurant name: ");
       user_input = input.next(); 
       
       System.out.println("");// prints menu of choice */
   }}


      
       /*System.out.println(""); // how to print a restaurant list ?? 
       System.out.println("Pick Restaurant name: ");
       user_input = input.next(); 
       
       System.out.println("");// prints menu of choice */
    








