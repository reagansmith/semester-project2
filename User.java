

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
	 private String name;
    private String logIn;
    private String passWord;
    private boolean isARest; 
    
    public User (String name, String logIn, String passWord, boolean rest)
    {
    	this.name = name;
        this.logIn = logIn;
        this.passWord = passWord;
        this.isARest= rest;
    }
    /**
     * gets user input for login
     * @return logIn
     */
    public String getName()
    {
        return name;
    }
    
    public String getLogIn()
    {
       return logIn;
    }
    /**
     * gets user input for password 
     * @param user input
     * @return password
     */
    public String getPassword()
    {
       return passWord; 
    }
    /**
     * Checks to see if user is a restaurant or not
     * @param user
     * @return boolean value
     */
   public boolean getRest()
    {
        return isARest;
    }
    /**
     * sets user login 
     * @param logIn
     * @return nothing
     */
    public void setLogIn(String logIn)
   {
        this.logIn = logIn;
   }
    /**
     * Sets the password
     * @param password
     * @return nothing
     */
    public void setPassword(String passWord)
    {
        this.passWord= passWord;
    }
    public void setName(String name)
    {
        this.name = name;
    }


}


/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
