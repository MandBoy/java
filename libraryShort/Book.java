public class Book {
   private int bookISBN;
   private String bookName;
   private String bookAuthor;
   private int bookCount;
   private String bookGenre;
   
   public Book()
   {
      this.bookISBN = 0;
      this.bookAuthor = "AuthorNotSet";
      this.bookCount = 0;
      this.bookGenre = "GenreNotSet";
   }
   
   public Book(int bookISBN, String bookAuthor, int bookCount, String bookGenre)
   {
      this.bookISBN = bookISBN;
      this.bookAuthor = bookAuthor;
      this.bookCount = bookCount;
      this.bookGenre = bookGenre;
   }
      
   public void printBook() {
      System.out.println("Book ISBN:\t" + bookISBN);
      System.out.println("Book Author:\t" + bookAuthor);
      System.out.println("Book Count:\t" + bookCount);
      System.out.println("Book Genre:\t" + bookGenre);
   } 
     
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
