public class DVD
{
   //Declare the class variables.
   
   /** the title of the DVD */

   /** the number of available copies */

   private int copies;
   
   
   private String title;
   /** Constructs a DVD object and sets the number of copies
    *  to 1.
    *  @param t the title of the DVD
    */
    
   public DVD(String t)
   {
      title = t;
   }
   
   /** Increments the number of available copies of this DVD.
    */
   public void incrementCopies()
   {
      copies += 1;
   }
   
   /** Decrements the number of available copies of this DVD.
    */
   public void decrementCopies()
   {
      copies -= 1;
   }
   
   /** Gets the title of this DVD.
    *
    *  @return the title of the DVD.
    */
   public String getTitle()
   {
      return title;
   }
   
   /** Gets the number of available copies for this DVD.
    *
    *  @return the number of available copies.
    */
   public int getNumCopies()
   {
      return copies;
   }
   
   /** Returns a representation of this DVD object as a
    *  String in the format <title> copies: <num. copies>.
    *
    *  @return the String representation of the DVD.
    */
    
   public String toString()
   {
      return title + copies;
   }
   
}
