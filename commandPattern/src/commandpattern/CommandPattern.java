/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpattern;

/**
 *
 * @author ehdaaabdallah
 */
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock stock = new Stock();

      BuyStock buyStockOrder = new BuyStock(stock);
      SellStock sellStockOrder = new SellStock(stock);

      Boker broker = new Boker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   
    }
    
}
