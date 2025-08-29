package WebScrapingExample;

import java.util.*;

class contact {
    String name;
    String phone;
    String email;
    
    public contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " , Phone: " + phone + " , Email: " + email;     
    }
}

public class contactManagementSystem {
    static final String FILE_NAME = "contacts.txt";
    static ArrayList<contact> contacts = new ArrayList<>();
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n---contact Management System ---");
            System.out.println("1. Add contact");
            System.out.println("2. View contacts");
            System.out.println("3. Edit contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); //consume newline
            
            switch (choice) {
                case 1: addcontact(sc);
                break;
                case 2: viewcontacts();
                break;
                case 3: editcontact(sc);
                break;
                case 4: deletecontact(sc);
                break;
                case 5: 
                
        System.out.println("contacts saved. Exiting...");
                break;
            default:
            
        System.out.println("Invalid choice.");
         }
      } while (choice != 5);
    }  
    
    static void addcontact(Scanner sc)
{
       System.out.print("Enter Name: ");
       String name = sc.nextLine();
       System.out.print("Enter Phone: ");
       String phone = sc.nextLine();
       System.out.print("Enter Email: ");
       String email = sc.nextLine();
       contacts.add(new contact(name, phone, email));
       System.out.println("contact Added!");
    }
    
    static void viewcontacts() {
        if (contacts.isEmpty()) { 
            System.out.println("No contacts found!");
        } else {
            System.out.println("\n---contact List ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }
    
    static void editcontact(Scanner sc)
{
      viewcontacts();
      if (contacts.isEmpty()) return;
      System.out.print("Enter contact number to edit: ");
      int index = sc.nextInt() - 1;
      sc.nextLine();
      if (index >= 0 && index < contacts.size()) {
          System.out.print("Enter New Name: ");
          String name = sc.nextLine();
          System.out.print("Enter New Phone: ");
          String phone = sc.nextLine();
          System.out.print("Enter New Email: ");
          String email = sc.nextLine();
          contacts.set(index, new contact(name, phone, email));
          System.out.println("Contact Updated!");
      } else {
          System.out.println("Invalid contact number!");
        }
    }
    
    static void deletecontact(Scanner sc) {
        viewcontacts();
        if (contacts.isEmpty()) return;
        System.out.print("Enter contact number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact Deleted!");
        } else { 
            System.out.println("Invalid contact number!");
        }
    }
}
        
    
         
            
        
          
      

            
        
    
       
       

    
    
    
    
