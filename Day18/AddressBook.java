//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.

import java.util.*;
class Contact {
  private String name;
  private int phoneNumber;
  private String email;
  public Contact(String name,int phoneNumber, String email) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email= email;
  }
  public String getName() {
    return name;
  }
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getPhoneNumber() {
    return phoneNumber;
  }
  public String getEmail() {
    return email;
  }
  public String toString() {
    return "Name: " + name + ", Phone number: " + phoneNumber + ", Email: " + email;
  } 
}
class AddressBook {
  private Map<String, Contact> contacts;

  public AddressBook() {
    contacts = new HashMap<>();
  }
  public void addContact(String name, int phoneNumber, String email) {
    Contact contact = new Contact(name, phoneNumber, email);
    contacts.put(name, contact);
  }
  public void editContact(String name, int newPhoneNumber, String newEmail) {
    if(contacts.containsKey(name)) {
      Contact contact = contacts.get(name);
      contact.setPhoneNumber(newPhoneNumber);
      contact.setEmail(newEmail);
      System.out.println("Contact updated successfully ");
    }
    else {
      System.out.println("Contact not found");
    }
  }
  public void deleteContact(String name) {
    if(contacts.containsKey(name)) {
      contacts.remove(name);
      System.out.println("Contact deleted successfully");
    } else {
      System.out.println("Contact not found");
    }
  }
  public Contact searchContact(String name) {
    return contacts.get(name);
  }
  public void displayContacts() {
    System.out.println("Contacts in the address book:");
    for(Contact contact : contacts.values()) {
      System.out.println(contact);
    }
  }
}
public class AddressBook {
  public static void main(String args[]) {
    AddressBook addressBook = new AddressBook();
    addressBook.addContact("Shreeja", 123456, "shree@gmail.com");
    addressBook.addContact("Nidhu", 234567, "nidhu@gmail.com");
    addressBook.displayContacts();
    addressBook.editContact("Shreeja", 112233,"shree@gmail.com");
    addressBook.displayContacts();
    addressBook.deleteContact("Nidhu");
    addressBook.displayContacts();
    Contact contact = addressBook.searchContact("Shreeja");
    if(contact != null) {
      System.out.println("Contact found: " + contact);
    }
    else {
      System.out.println("Contact not found");
    }
  }
}
