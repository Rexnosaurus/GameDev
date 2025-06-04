/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalkanapleaselangimtiredna;

public class PlayerInventory extends AbstractInventory {
    private int money;
    public PlayerInventory() {
        super();
        money = 0;
    }
    
    public void useItem(Item item, Player user) {
        item.use(user);
    }
    
    public void useItem(String itemName, Player user) {
        try {
            Object[] contentsKeySet = CONTENTS.keySet().toArray();
            for(int i = 0; i < contentsKeySet.length; i++) {
                Item currentItem = (Item) contentsKeySet[i];
                if(currentItem.getItemName().equalsIgnoreCase(itemName)) {
                    int currentItemAmount = CONTENTS.get(currentItem);
                    if(currentItemAmount-1 == 0) {
                        currentItem.use(user);
                    }
                    else {
                        CONTENTS.put(currentItem, currentItemAmount-1);
                    }
                }
            }
        }
        catch(Exception e) {
            
        }
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setMoney(int amt) {
        money = amt;
    }
}
