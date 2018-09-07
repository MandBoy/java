public class Book {
   int bookISBN;
   String bookName;
   String bookAuthor;
   int bookCount;
   String bookGenre;
   
   
   public int getBookCount() {
      return bookCount;
   }
   public void loanBook(int customerID){
      if (getBookCount() < 1) {
         System.out.println("Book not available");
      }
      else {
         System.out.println("Bookcount is: " + bookCount);
         System.out.println("Book are now loaned by CustomerID: " + customerID);
         bookCount--;
         System.out.println("Bookcount is now: " + bookCount);
         System.out.println("store in database");
         
      }
   }   
}
