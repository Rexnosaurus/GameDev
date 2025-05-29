/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package finalkanapleaselangimtiredna;


public class Entity {
    
    int level;
    String name;
    int hp;
    int maxHp;
    int mana;
    int maxMana;
    int defense;
    int baseAttack;
    int critDamage;
    double critRate;
    int dodgeCooldown;
    int skill1Cooldown;
    int skill2Cooldown;

    public Entity(int level, int experiencePoints, String name, int hp, int maxHp, int mana, int maxMana, int defense, int baseAttack, int critDamage, double critRate, int dodgeCooldown, int skill1Cooldown, int skill2Cooldown) {
        this.level = level;
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.mana = mana;
        this.maxMana = maxMana;
        this.defense = defense;
        this.baseAttack = baseAttack;
        this.critDamage = critDamage;
        this.critRate = critRate;
        this.dodgeCooldown = dodgeCooldown;
        this.skill1Cooldown = skill1Cooldown;
        this.skill2Cooldown = skill2Cooldown;
    }

    public void basicAttack(){
        
    }
    
    public void dodge(){
        
    }
    
    public void skill1(){
        
    }
    
    public void skill2(){
        
    }
    
    
    public void reduceCooldown(){
        
        if (dodgeCooldown > 0) {
            dodgeCooldown --;
        }
        
        if (skill1Cooldown > 0) {
            skill1Cooldown --;
        }
        
        if (skill2Cooldown > 0) {
            skill2Cooldown --;
        }
        
    }
    
    public void getStats(){
        
    }
    
}
