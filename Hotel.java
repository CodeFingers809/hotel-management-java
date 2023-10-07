import java.lang.*;
import java.util.*;



public class Hotel {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    x:while(true){
      System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
      int option = sc.nextInt();
      switch(option){
        case 1:
          // display room details
          break;
        case 2:
          // display room availability
          break;
        case 3:
          // Book rooms
          break;
        case 4:
          //order food
          break;
        case 5:
          // checkout guest
          break;
        case 6:
          break x;
      }
    }
  }
}
