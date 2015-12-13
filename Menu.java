
	import java.util.*;
	import java.io.*;
	/**
	 * Write a description of class Menu here.
	 * 
	 * @author (your name) 
	 * @version (a version number or a date)
	 */
	public class Menu
	{
	   private File menuFile;
	    
	  public Menu(String menuName)
	  {
	      this.menuFile = new File (menuName + ".txt");
	  }
	  public void readMenu()
	  {
	      BufferedReader myReader;
	        try {
	        	System.out.println(this.menuFile);
	            myReader = new BufferedReader(new FileReader(menuFile));
	            String myMenu;
	            while ((myMenu = myReader.readLine()) != null) {
	                System.out.println(myMenu);
	            }
	            myReader.close();
	        }
	        catch(FileNotFoundException e) {
	            System.out.println("file not there!");
	        }
	        catch(IOException e) {
	            System.out.println("File not found");
	        }
	      
	      
	     
	   }
	   
	  /** public FoodItem[] getFoodList()
	   {
	       return foodList;
	    }
	    
	    public void setFoodList(FoodItem[] foodList)
	    {
	        this.foodList = foodList;
	    */
	   public static void main(String args[]){
	       Menu menu = new Menu("readmenu");
	       menu.readMenu();
	    }
	}



