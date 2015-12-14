# semester-project2
This is my semester project for professor Anderson


My project runs in the driver class. When you first run the program the name of my app is printed, it is called Sage, and it asks the user to Enter Log In. To log in as a consumer accout you use the user name: Reagan and the password: yourawesome once you have logged in you will see the consumer menu. If you choose to log in as a restaurant account you use the user name: BlackBean1 and password: 1234 . There is a try-catch in the main method that prints an error "User not found" if you use incorrect log in information. 

#Logged in as a consumer:
When you are logged in as the consumer there is a switch menu that appears. The user has the ability to 1. Search for Restaurant, 2. Write Review and 3. Delete User. 
If you choose 1 then you can search for any restaurant in my arrayList. So far I only have Black Bean in the arrayList. The challenge with this method was the white spaces but I just had to add input.NextLine(). If you find the restaurant the code 
prints "Resurant found", if you search anything not in the arrayList it prints "Not found". 

If you choose 2. Write Review, the program asks you to type yes if you want to write a review. After you type yes it gives you the option to type a review. It saves the review and writes it to a find called reviews.txt. 

If you choose 3. Delete User you can delete your account. 


#Logged in as a restaurant 

The restaurant switch menu has 4 options. The first options is See Resturant Menu. The resturant's menu is haved in a txt file called readmenu. The readmenu method is in the menu class. In the class there is a try catch that says file not found if something goes wrong. The menu file is a variable that can be easily changed. 

The second option is to edit the menu. When you do this the changes are written to the menu file. 

The third option is to see reviews. This returns the reviews that were written the in the review.txt. 

The forth option is the delete user function. It is the same that is in the consumer login. 
