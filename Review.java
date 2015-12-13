

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class Review here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Review
{
	   private File reviewFile;
	    
	  public Review(String reviewFile)
	  {
	      this.reviewFile = new File (reviewFile + ".txt");
	  }
	  public void readReview()
	  {
	      BufferedReader myReader;
	        try {
	        	System.out.println(this.reviewFile);
	            myReader = new BufferedReader(new FileReader(reviewFile));
	            String myReview;
	            while ((myReview = myReader.readLine()) != null) {
	                System.out.println(myReview);
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
	   
}






