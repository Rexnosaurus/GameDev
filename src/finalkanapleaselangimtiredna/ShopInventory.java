/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalkanapleaselangimtiredna;

public class ShopInventory extends AbstractInventory {
    // CONTENTS GUIDE
    // ItemForSale : Stock
    private int currentFloor = 1;
    PlayerInventory recipientInventory;
    
    public ShopInventory(PlayerInventory recipientInv) {
        recipientInventory = recipientInv;
        restock();
    }
    
    public void updateFloorCount(int amt) {
        currentFloor = amt;
        if(currentFloor % 10 == 0) {
            restock();
        }
    }
    
    public void restock() {
        CONTENTS.put(new Items.PotionSmallHealth(), 2);
        CONTENTS.put(new Items.PotionLargeMana(), 4);
    }
    
    public void updateStock(int index, int amt) {
        Object[] keySet = CONTENTS.keySet().toArray();
        CONTENTS.put((Item) keySet[index], amt);
    }
    
    public PlayerInventory getRecipientInventory() {
        return recipientInventory;
    }
}
