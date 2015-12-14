



/**
 * Write a description of class RestaurantAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestaurantAccount extends User
{
   
    private Menu menu;
    private Operator calendar;
    private String phoneNum;
    private String address;
   

    
    public RestaurantAccount ( String name, String logIn, String passWord, boolean isARest, Menu menu, Operator calendar, String phoneNum, String address)
    {
      
        super(name, logIn, passWord, isARest);
      
        this.menu = menu;
        this.calendar = calendar;
        this.phoneNum = phoneNum;
        this.address = address;
       
     
    }

        public Menu getMenu()
    {
        return menu;
    }
    
    public Operator getCalendar()
    {
        return calendar;
    }

    public void  setMenu(Menu menu)
    {
        this.menu= menu;
    }
    
    public void  setCalendar(Operator calendar)
    {
        this.calendar = calendar;
    }
   
   

     /**
      * This method gets the phone number of a rest
      * @return phoneNum
      */
     public String getPhoneNum()
     {
         return phoneNum;
     }
     /** 
      * This method gets the address 
      * @return address
      */
     public String getaddress()
     {
         return address;
     }
    /**
     * This method gets the review that is related to the account
     * @return review 
     */

     /**
      * This method sets the name of the restaurant
      * @param name
      * @return nothing
      */
 
     /**
      * Sets the phonenumber 
      * @param phoneNum
      * @return nothing
      */
     public void setPhoneNum(String phoneNum)
     {
         this.phoneNum = phoneNum;
     }
     /**
      * sets the address
      * @param address
      * @return nothing 
      */
     public void setAddress( String address)
     {
         this.address= address;
     }
     
     public String toString()
     {
    	 return name + " " + phoneNum;
     }
     }

   
 


