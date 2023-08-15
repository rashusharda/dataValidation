import java.util.Scanner; //importing Scanner feature

    public class sourceCode {

        public static void dataValidationOne (Scanner keyedInput) {
                       
            String characterStage1 = "";
            int tempStringLength;
            boolean notValid = true;
            
            while (notValid)
            {
                //retrive the required values from the user
                System.out.println("Enter a string that is greater than six characters: ");
                characterStage1 = keyedInput.nextLine();
                
                //determine the number of characters in the string
                tempStringLength = characterStage1.length();
                System.out.println("");
                
                try
                {
                    //if-else statement to see if it follows the condition
                    if (tempStringLength > 6)
                    {
                        //stops the loop
                        notValid = false;
                    }
                    
                    else
                    {
                        //force an error
                        throw new AssertionError();
                    }
                }
                
                catch (AssertionError e) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, the string proivded has less than 6 characters.");
                    System.out.println("");
                }
            }
            
            //tells the user that the string follows the conditions
            System.out.println("...");
            System.out.println(" The " + characterStage1 + "is greater than 6 characters.");
            System.out.println("...");
            System.out.println("...");                      
        }
    
        public static void dataValidationTwo (Scanner keyedInput) {
            //stage 2: enter a string that contains at least one lowercase "a"
            
            //initiazlize the required variables
            String lowercaseStage2 = "";
            boolean tempStringLowercase;
            boolean notValid = true;
            
            while (notValid)
            {
                
                //retrieve the required values from the user
                System.out.println("Enter a string that contains at least one lower 'a'");
                lowercaseStage2 = keyedInput.nextLine();
                
                
                //determines whether the string includes the lowercase letter
                tempStringLowercase = lowercaseStage2.contains("a");
                System.out.println("");
                
                try
                {
                    //if-else stament to see if it follows the condition
                    if (tempStringLowercase == false)
                    {
                        //force an error
                        throw new AssertionError();
                    }
                    else if (tempStringLowercase == true)
                    {
                        //stops the loop
                        notValid = false;
                    }
                }
                catch (AssertionError e) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, string must contain at least one lowercase 'a'.");
                    System.out.println("");
                }
            }
            
            //tells the user that the string follows the conditions
            System.out.println("...");
            System.out.println("The " + lowercaseStage2 + " contains at least one lowercase 'a'.");
            System.out.println("Let's go to the next stage...");
            System.out.println("...");
            System.out.println("...");                       
        }
        
        public static void dataValidationThree (Scanner keyedInput) {
            //stage 3; user must enter a string that is between 5 to 15 characters and does not include 'z'
            
            //initialize the required variables
            String uniqueStage3 = "";
            int tempNumCharacters;
            boolean tempInclCharacter;
            boolean notValid = true;
            
            while (notValid)
            {
                //retrieve the required values from the user
                System.out.println("Enter a string that is between 5 to 15 characters and does not include 'z'");
                uniqueStage3 = keyedInput.nextLine();
                
                
                //determine the number of characters in the string
                tempNumCharacters = uniqueStage3.length();
                
                //determine if the string has 'z'
                tempInclCharacter = uniqueStage3.contains("z");
                
                try 
                {
                    if (tempInclCharacter == false && tempNumCharacters >= 5 && tempNumCharacters <= 15)
                    {
                        //stops the loop
                        notValid = false;
                    }
                    else
                    {
                        //force an error
                        throw new AssertionError();                        
                    }
                }
                
                catch (AssertionError e) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, please enter a string that is between 5 and 15 characters and does not contain 'z'.");
                    System.out.println("");
                }
            }
            
            //tells the user that the string follow the condition
            System.out.println("...");
            System.out.println("The " + uniqueStage3 + " is between 5 to 15 characters and does not include 'z'.");
            System.out.println("Let's go to the next stage...");
            System.out.println("...");
            System.out.println("...");  
        }
        public static void dataValidationFour (Scanner keyedInput) {
            //stage 4: user must enter an integer between 5 and 500
            
            //initialize the required variables
            String userIntString;
            int userInteger = 0;
            
            boolean notValid = true;
            
            while (notValid)
            {
                //retrieve the required values from the user
                System.out.println("Enter an integer between 5 and 500'");
                userIntString= keyedInput.nextLine();
                                
                try 
                {
                    userInteger = Integer.parseInt(userIntString);
                    
                    if (userInteger >=5 && userInteger <+500)
                    {
                        //stops the loop
                        notValid = false;
                    }
                    else
                    {
                        //force an error
                        throw new AssertionError();                        
                    }
                }
                
                //The symbol | allows for multiple Errors/Exceptions
                catch (AssertionError | NumberFormatException e ) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, you must enter an integer that is between 5 and 500.");
                    System.out.println("");
                }
            }
            
            //tells the user that the integer follow the condition
            System.out.println("...");
            System.out.println("The " + userInteger + " is between 5 and 500.");
            System.out.println("Let's go to the next stage...");
            System.out.println("...");
            System.out.println("...");  
        }
        
        public static void dataValidationFive (Scanner keyedInput) {
            //stage 5: user must enter a negative integer
            
            //initialize the required variables
            String userIntString;
            int userNegativeInteger = 0;
                        
            boolean notValid = true;
            
            while (notValid)
            {
                //retrieve the required values from the user
                System.out.println("Enter an integer that is negative");
                userIntString = keyedInput.nextLine();
                
                try 
                {
                    userNegativeInteger = Integer.parseInt(userIntString);
                    if (userNegativeInteger < 0)
                    {
                        //stops the loop
                        notValid = false;
                    }
                    else
                    {
                        //force an error
                        throw new AssertionError();                        
                    }
                }
                
                catch (AssertionError | NumberFormatException e) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, you must enter a negative integer.");
                    System.out.println("");
                }
            }
            
            //tells the user that the integer follow the condition
            System.out.println("...");
            System.out.println("The " + userNegativeInteger + " is negative.");
            System.out.println("Let's go to the next stage...");
            System.out.println("...");
            System.out.println("...");  
        }
        
        public static void dataValidationSix (Scanner keyedInput) {
            //stage 6: user must enter a postive, odd integer
            
            //initialize the required variables
            String userIntString;
            int userPositiveInteger = 0;
            int remainder;
            boolean notValid = true;
            
            while (notValid)
            {
                //retrieve the required values from the user
                System.out.println("Enter an integer that is postive and odd");
                userIntString = keyedInput.nextLine();
                
                try 
                {
                    userPositiveInteger = Integer.parseInt(userIntString); //converts to string
                    
                    //determine if the integer is odd
                    remainder = userPositiveInteger % 2;
                                        
                    if (userPositiveInteger > 0 && remainder == 1)
                    {
                        //stops the loop
                        notValid = false;
                    }
                    else
                    {
                        //force an error
                        throw new AssertionError();                        
                    }
                }
                
                catch (AssertionError | NumberFormatException e) //e (can be any name) is a variable defined in the catch
                {
                    System.out.println("Sorry, you must enter a positive, odd integer.");
                    System.out.println("");
                }
            }
            
            //tells the user that the string follow the condition
            System.out.println("...");
            System.out.println("The " + userPositiveInteger+ " is positive and odd.");
            System.out.println("Congratulations! You have completed all the levels.");
            System.out.println("...");
            System.out.println("...");  
        }
        
        public static void main(String[] args) {
            
            Scanner keyedInput = new Scanner (System.in);
            
            //Validation Step 1
            dataValidationOne (keyedInput);
            
            //Validation Step 2
            dataValidationTwo (keyedInput);
            
            //Validation Step 3
            dataValidationThree (keyedInput);
            
            //Validation Step 4
            dataValidationFour (keyedInput);
            
            //Validation Step 5
            dataValidationFive (keyedInput);
            
            //Validation Step 6
            dataValidationSix (keyedInput);
        }
    }