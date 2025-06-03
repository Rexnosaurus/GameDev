/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package finalkanapleaselangimtiredna;


public class Item {
    int itemId;
    String itemName;
    int itemQuantity;
    String itemDescription;
    int itemPrice;
    int itemSellCost;

    public Item(int itemId, String itemName, int itemQuantity, String itemDescription, int itemPrice, int itemSellCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemSellCost = itemSellCost;
    }
    
    public void usage(Entity activeCharacter){
        
    }
    
    public void description(){
        
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public int getItemPrice(){
        return itemPrice;
    }
    
    
    
}
