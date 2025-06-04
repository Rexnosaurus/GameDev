/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package finalkanapleaselangimtiredna;

// TEMPLATE GUIDE
/*
super(
    id
    name
    description
    buy cost
    sell price
)
*/

public class Items {
    public static class PotionSmallHealth extends Item{
        public PotionSmallHealth() { 
            super(
                0,
                "Small Health Potion",
                "A potion that slightly restores the user's HP",
                100,
                50
            );
        }
        
        @Override
        public void use(Entity activeCharacter){
            activeCharacter.hp += 150;
        }
        
    }    
    
    public static class PotionLargeHealth extends Item{
        public PotionLargeHealth() {
            super(
                1, 
                "Large Health Potion", 
                "A potion that will greatly restore hp of an active character", 
                150, 
                75
            );    
        }
        
        @Override
        public void use(Entity activeCharacter){
            activeCharacter.hp += 300;
            
        }
        
    }

    public static class PotionSmallMana extends Item{

        public PotionSmallMana() {
            super(
                2, 
                "Small Mana Potion", 
                "A potion that restores a small amount of mana for the user", 
                100, 
                50
            );    
        }
        
        @Override
        public void use(Entity activeCharacter){
            activeCharacter.mana += 150;
            
        }
        
    }   
    
    public static class PotionLargeMana extends Item{
        public PotionLargeMana() {
            super(
                1, 
                "Large Mana Potion", 
                "A potion that will greatly restore hp of an active character", 
                150, 
                75);    
            }
        
        @Override
        public void use(Entity activeCharacter){
            activeCharacter.mana += 300;
            
        }
    }    
}
