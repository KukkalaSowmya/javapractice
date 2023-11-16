//Shopping CartCreate a class called Product with properties like productId, name, price, and quantityInStock. Use an ArrayList to store multiple product objects. Implement methods to:• Add products to the shopping cart.• Remove products from the shopping cart.•Calculate the total cost of the products in the shopping cart.• Display the products in the shopping cart.

import java.util.*;

class Product {
  private int productId;
  private String name;
  private double price;
  private int quantityInStock;

  public Product(int productId, String name, double price, int quantityInStock) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    this.quantityInStock = quantityInStock;
    }
  public int getProductId(){
    return productId;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQunatityInStock(){
    return quantityInStock;
  }
}

class ShoppingCart {
 private ArrayList <Product> p = new ArrayList<>();
  public void addProduct(Product p){
    p.add(p);
    System.ot.println("Product added");
  }
  public void removeProduct(int productId){
    for(int i=0; i<3; i++){
      if(p.get(i).getProductId()==productId)
      {
        p.remove(i);
        System.out.println("Product removed");
        break;
      }
    }
  }
  public double calculateTotalCost(){
    double totalCost = 0;
    for(Product p:p){
      totalCost += p.getPrice();
    }
    return totalCost;
  }
  public void displayProducts(){
    System.out.println("Products in shopping cart");
    for(Product p:p){
      System.out.println(p.getProductId() +" " + p.getName() + " " + p.getPrice + " " + p.getQuantityInStock);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ShoppingCart s = new ShoppingCart();
    System.out.println("Shopping Cart");
    s.addProduct();
    s.removeProduct();
    s.calculateTotalCost();
    s.displayProducts();
    sc.close();
  }
}
