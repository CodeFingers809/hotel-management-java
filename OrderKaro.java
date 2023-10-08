/*
In Java, when a class implements the Serializable interface,
it indicates that instances of that class can be serialized. 
Serialization is the process of converting an object's state (its fields and data) into a stream of bytes. 
This stream of bytes can then be saved to a file,
sent over a network, or otherwise stored or transmitted,
and later deserialized to reconstruct the original object.
*/
import java.io.Serializable;
import java.util.Scanner;

class OrderKaro implements Serializable {
    int ItemNumber;
    float Price;
    int Quantity;

    public OrderKaro(int ItemNumber, int Quantity) {
        this.ItemNumber = ItemNumber;
        this.Quantity = Quantity;

        switch (ItemNumber) {
            case 1:
                Price = Quantity * 10.10f;
                break;
            case 2:
                Price = Quantity * 50.50f;
                break;
            case 3:
                Price = Quantity * 100.10f;
                break;
            case 4:
                Price = Quantity * 150.15f;
                break;
            case 5:
                Price = Quantity * 10.10f;
                break;
            case 6:
                Price = Quantity * 500.50f;
                break;
            case 7:
                Price = Quantity * 1000.10f;
                break;
            case 8:
                Price = Quantity * 150.15f;
                break;
        }
    }

    static void Order(int roomNo, int roomType) {
        int I, Q;
        char Wish;
        Scanner m = new Scanner(System.in);

        try {
            System.out.println("\n =============================== \n Menu:  \n        ==================       \n\n1.Sandwich\tRs.10.10\n2.Pasta\t\tRs.50.50\n3.Noodles\tRs.100.10\n4.Coke\t\tRs.150.15\n\n\n5.KhamanDhokla\tRs.10.10\n6.PuranPoli\t\tRs.500.50\n7.WaranBattti\tRs.1000.10\n8.JalebiPhapda\t\tRs.150.15\n");
            do {
                System.out.print("Enter the item number: ");
                I = m.nextInt();
                System.out.print("Enter the quantity: ");
                Q = m.nextInt();

                switch (roomType) {
                    case 1:
                        hotelSelect.luxury_doublerrom[roomNo].OrderKaro.add(new Foodigo(I, Q));
                        break;
                    case 2:
                        hotelSelect.deluxe_doublerrom[roomNo].OrderKaro.add(new Foodigo(I, Q));
                        break;
                    case 3:
                        hotelSelect.luxury_singleerrom[roomNo].OrderKaro.add(new Foodigo(I, Q));
                        break;
                    case 4:
                        hotelSelect.deluxe_singleerrom[roomNo].OrderKaro.add(new Foodigo(I, Q));
                        break;
                    default:
                        System.out.println("Invalid room type.");
                        break;
                }

                System.out.print("Do you want to order anything else? (y/n): ");
                Wish = m.next().charAt(0);
            } while (Wish == 'y' || Wish == 'Y');
        } catch (NullPointerException e) {
            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }
}

class hotelSelect {
    static Doubleroom Luxury_doublerrom[] = new Doubleroom[100]; 
    static Doubleroom Deluxe_doublerrom[] = new Doubleroom[200]; 
    static Singleroom Luxury_singleerrom[] = new Singleroom[100]; 
    static Singleroom Deluxe_singleerrom[] = new Singleroom[200]; 
}

class SingleRoom {
    String name;
    String contactNo;
    String gender;
    int age;
    int numberOfConsumers;

  
    Singleroom(){

        
        this.Name="";
    }
    Singleroom( String Name,
    String ContactNo,
    String gender
     ){
   this.Name=Name;
        this.gender=Gender;
        this.ContactNo=ContactNo;

    }
ArrayList<order> OrderKaro = new ArrayList<>();

}class DoubleRoom {
    String name1;
    String name2;
    String contactNo1;
    String contactNo2;
    String gender1;
    String gender2;
    int age1;
    int age2;
    int numberOfConsumers1;
    int numberOfConsumers2;


    Doubleroom(){

        this.Name2="";
        this.Name="";
    }
    Doubleroom( String Name,
    String ContactNo,
    String gender,
     String Name2,
    String ContactNo2,
    String gender2){
   this.Name=Name;
        this.gender=Gender;
        this.ContactNo=ContactNo;

        this.Name2=Name2;
        this.gender2=Gender2;
        this.ContactNo2=ContactNo2;
    }
ArrayList<order> OrderKaro = new ArrayList<>();

    

}


class NotAvailable extends Exception {

 public String toString() {
 return "Not Available !";
 }
}

