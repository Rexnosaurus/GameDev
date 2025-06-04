/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package finalkanapleaselangimtiredna;


public class Items extends Item{

    public Items(int itemId, String itemName, int itemQuantity, String itemDescription, int itemPrice, int itemSellCost) {
        super(itemId, itemName, itemQuantity, itemDescription, itemPrice, itemSellCost);
        
        this.itemId = itemId;
        this.itemName = itemName;
    }
    
    public static class potionSmallHealth extends Item{

        public potionSmallHealth() {
            super(0, 
                    "Health Potion", 
                    0, 
                    "A potion that will restore a health of an active character", 
                    150, 
                    75);    
        }
        
        @Override
        public void usage(Entity activeCharacter){
            activeCharacter.hp += 150;
            
        }
        
    }    
    
    public static class potionLargeHealth extends Item{

        public potionLargeHealth() {
            super(1, 
                    "Health Potion", 
                    0, 
                    "A potion that will greatly restore hp of an active character", 
                    150, 
                    75);    
        }
        
        @Override
        public void usage(Entity activeCharacter){
            activeCharacter.hp += 300;
            
        }
        
    }

    public static class potionSmallMana extends Item{

        public potionSmallMana() {
            super(2, 
                    "Health Potion", 
                    0, 
                    "A potion that will restore a mana of an active character", 
                    150, 
                    75);    
        }
        
        @Override
        public void usage(Entity activeCharacter){
            activeCharacter.mana += 150;
            
        }
        
    }   
    
    public static class potionLargeMana extends Item{

        public potionLargeMana() {
            super(3, 
                    "Mana Potion", 
                    0, 
                    "A potion that will greatly restor mana of an active character", 
                    150, 
                    75);    
        }
        
        @Override
        public void usage(Entity activeCharacter){
            activeCharacter.mana += 300;
            
        }
        
    }    

    
}
