//Create a class called Phonebook that stores a collection of phone numbers and names in an array. Implement a method that uses linear search algorithm to search for a name based on the phone number and another method that uses binary search algorithm to search for a phone number based on the name.

public class PhoneBook{
  private String[] names;
  private String[] phoneNumbers;
  private int size;
  public PhoneBook(int capacity){
    names=new String[capacity];
    phoneNumbers=new String[capacity];
    size=0;
  }
  public void addEntry(String name, String phoneNumber){
    if(size<names.length){
      names[size]=name;
      phoneNumbers[size]=phoneNumbers;
      size++;
      System.out.println("Entry added sucessfully:" +name+ "-" +phoneNumber):
    }
    else{
      System.out.println("PhoneBook is full. Cannot add");
    }
  }
  public String searchNameByPhoneNumber(String phoneNumber){
    for(int i=0; i<size, i++){
      if(phoneNumbers[i].equals(phoneNumber){
      return names[i];
      }
    }
   return "Name not found"; 
  }
  public String searchPhoneNumberByName(String name){
    int left=0;
    int right=size-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      int compareResult=names[mid].compareTo(name);
      if(compareResult==0){
        return phoneNumbers[mid];
      }
      else if(compareResult<0){
        left=mid+1;
      }
      else{
        right=mid-1;
      }
    }
    return "Phonenumber not found";
  }
  public static void main(String[] args){
   phonebook.addEntry("a", "1234567890");
   phonebook.addEntry("b", "9876543210");
   phonebook.addEntry("c", "1112223333");
    System.out.println("Name found: " + phonebook.searchNameByPhoneNumber("9876543210"));
    System.out.println("Phone number found: " + phonebook.searchPhoneNumberByName("b"));
  }
}