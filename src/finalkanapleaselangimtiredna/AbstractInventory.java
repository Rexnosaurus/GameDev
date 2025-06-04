/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package finalkanapleaselangimtiredna;

import java.util.HashMap;


public abstract class AbstractInventory {
    protected final HashMap<Item, Integer> CONTENTS;
    
    public AbstractInventory() {
        CONTENTS = new HashMap<>();
    }
    
    public HashMap<Item, Integer> getContents() {
        return CONTENTS;
    }
    
    public void addItem(Item item, int amount) {
        if(CONTENTS.containsKey(item)) {
            CONTENTS.put(item, CONTENTS.get(item)+amount);
        }
        else {
            CONTENTS.put(item, amount);
        }
        System.out.println(CONTENTS);
    }
    
    public void removeItemEntry(Item item) {
        CONTENTS.remove(item);
    }
    
    public void removeItem(Item item, int amount) {
        try {
            int currentItemAmount = CONTENTS.get(item);
            if(currentItemAmount-amount == 0) {
                removeItemEntry(item);
            }
            else {
                CONTENTS.put(item, currentItemAmount-amount);
            }
        }
        catch(Exception e) {
            
        }
    }
    
    public void removeItem(String itemName, int amount) {
        try {
            Object[] contentsKeySet = CONTENTS.keySet().toArray();
            for(int i = 0; i < contentsKeySet.length; i++) {
                Item currentItem = (Item) contentsKeySet[i];
                if(currentItem.getItemName().equalsIgnoreCase(itemName)) {
                    int currentItemAmount = CONTENTS.get(currentItem);
                    if(currentItemAmount-amount == 0) {
                        removeItemEntry(currentItem);
                    }
                    else {
                        CONTENTS.put(currentItem, currentItemAmount-amount);
                    }
                }
            }
        }
        catch(Exception e) {
            
        }
    }
    
    public Item getItemAt(int index) {
        try {
            Object[] keySet = CONTENTS.keySet().toArray();
            Item item = (Item) keySet[index];
            return item;
        } 
        catch (Exception e) {
            return null;
        }
    }
}
