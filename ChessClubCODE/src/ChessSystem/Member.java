public class Member{ 
   //Mangler metode til memberNumber creation.
   
   private int memberNumber;
   private String firstName; 
   private String lastName;
   private String birthDay;
   private String gender; 
   private int cpr; 
   private int phonenNumber; 
   private String email; 
   private String dateOfCreation; 
   private boolean paymentStatus = false; 
   
   Member(){}  
   Member(InputHandler input){
      this.memberNumber = 1; 
      System.out.print("FirstName: ");
      this.firstName = input.readString();
      System.out.print("LateName: ");
      this.lastName = input.readString();
      System.out.print("BirthDate: ");
      this.birthDay = input.readString();
      System.out.print("Gender: ");
      this.gender = input.readString();
      System.out.print("CPR: ");
      this.cpr = input.readInt();
      System.out.print("PhoneNumber: ");
      this.phoneNumber = input.readInt();
      System.out.print("Email: ");
      this.email = input.readString();
      System.out.print("Date Of Creation: ");
      this.dateOfCreation = input.readString();  
   }
   public String toStirng(){
      return memberNumber + ";" + firstName + ";" + lastName + ";" + birthDay + ";" + gender + ";" + cpr + ";" + phoneNumber + ";" + email + ";" + dateOfCreation;
   }   
}  
