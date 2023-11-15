// Restaurant: Create a class called ""Dish"" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called ""Restaurant"" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

import java.util.Scanner;

class Dish {
  private String name;
  private String ingredients;
  private int price;

  public void setName(String name) {
    this.name = name;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getIngredients() {
    return ingredients;
  }

  public int getPrice() {
    return price;
  }
}

class Restaurant {
  Dish d[];
  int i = 0;

  Restaurant(int size) {
    d = new Dish[size];
  }

  public void addDish(Dish dish) {
    d[i] = dish;
    i++;
  }

  public void removeDish(String remove) {
    for (int j = 0; j < i; j++) {
      if (d[j].getName().equals(remove)) {
        for (int pos = j; pos < i - 1; pos++) {
          d[pos] = d[pos + 1];
        }
        d[i - 1] = null;
        i--;
      }
    }
  }

  public void print() {
    for (int j = 0; j < i; j++) {
      System.out.println(d[j].getName() + " " + d[j].getIngredients() + " " + d[j].getPrice());
    }
  }
}

public class Restaurant2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of dishes: ");
    int numDishes = scanner.nextInt();
    Dish d[] = new Dish[numDishes];
    Restaurant r = new Restaurant(numDishes);

    for (int i = 0; i < numDishes; i++) {
      d[i] = new Dish();
      System.out.print("Enter dish name: ");
      d[i].setName(scanner.next());
      System.out.print("Enter ingredients: ");
      d[i].setIngredients(scanner.next());
      System.out.print("Enter price: ");
      d[i].setPrice(scanner.nextInt());
      r.addDish(d[i]);
    }

    System.out.print("Enter dish name to remove: ");
    String dishToRemove = scanner.next();
    r.removeDish(dishToRemove);

    System.out.println("Dishes after removal:");
    r.print();
  }
}