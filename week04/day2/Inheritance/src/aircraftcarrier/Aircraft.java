//
//    Create a class that represents an aircraft
//    There are 2 types of aircrafts: F16 and F35
//    Both aircraft should track how many ammo it has
//
//F16
//
//    Max ammo: 8
//    Base damage: 30
//
//F35
//
//    Max ammo: 12
//    Base damage: 50
//
//All the aircrafts should be created with empty ammo store
//Methods:
//fight
//
//    It should use all the ammos (set it to 0) and it should return the damage it deals
//    The damage is the multiplication of the base damage and the ammos
//
//refill
//
//    It should take a number as parameter and substract as much ammo as possibe
//    It can't have more ammo than the number or the max ammo
//    (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
//    It should return the remaining ammo
//    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and
//    would return the remaining 288
//
//getType
//
//    It should return it's type as a string
//
//getStatus
//
//    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
//
//isPriority
//
//    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16

package aircraftcarrier;

public class Aircraft {

    int currentAmmo;
    int maxAmmo;
    int baseDamage;
    String type;

    public Aircraft(int currentAmmo, int maxAmmo, int baseDamage, String type){
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.currentAmmo = currentAmmo;
        this.type = type;
    }

    public void fight(){
        int fightDamage = this.currentAmmo * baseDamage;
        this.currentAmmo = 0;
        System.out.println("Total damage is: " + fightDamage);
    }

    public String getType(){
        return type;
    }
    //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    public String getStatus(){
        return "Type " + type + " Ammo: " + currentAmmo + " Base Damage: " + baseDamage + " All damage: " + ".....MISSING....." ;
    }

    public int refill (int quantityOfAmmoToFill){
        if (quantityOfAmmoToFill > maxAmmo){
            currentAmmo = maxAmmo;
            return (quantityOfAmmoToFill - currentAmmo);
        } else {
            currentAmmo = quantityOfAmmoToFill;
            return 0;
        }
    }
    //isPriority
//
//    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    public boolean isPriority() {
        if (type.equals("F35")) {
            return true;
        } else {
            return false;
        }
    }
}
