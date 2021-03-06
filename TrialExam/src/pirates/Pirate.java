// Pirate:
//
// - A pirate has a name, an amount of gold and health points, the default value of which is 10.
// - A pirate might be a captain and may have a wooden leg.
// - You must create the following methods:
//
// - if a pirate is a captain:
//    - `work()` which increases the amount of gold possessed by that pirate by 10 and decrease the HP by 5.
//    - `party()` which increases the HP by 10.
// - if the pirate is not a captain:
//    - `work()` which increases the amount of gold by 1 and decreases the HP by 1.
//    - `party()` which increases the HP by 1.
//
// - if the pirate has a wooden leg, then the string that is returned by the function must look like this:
//    - Hello, I'm Jack. I have a wooden leg and 20 golds.
// -  If not:
//    - Hello, I'm Jack. I still have my real legs and 20 golds.
package pirates;

public class Pirate {

    String name;
    boolean hasLeg;
    boolean isCaptian;
    int gold;
    int hp;



    public Pirate(String name, boolean isCaptian, boolean hasLeg, int gold) {
        this.name = name;
        this.hasLeg = hasLeg;
        this.isCaptian = isCaptian;
        this.gold = gold;
        this.hp = 10;
    }

    public Pirate(String name, boolean isCaptian, boolean hasLeg, int gold, int hp) {
        this.name = name;
        this.hasLeg = hasLeg;
        this.isCaptian = isCaptian;
        this.gold = gold;
        this.hp = hp;
    }

    public void work() {
        gold += 1;
        hp -= 1;
    }

    public void party() {
        hp += 1;
    }

    public String legOfPirate(String leg) {
        if (leg == "wooden") {
            return "- Hello, I'm Jack. I have a wooden leg and 20 golds.";
        }
        return "Hello, I'm Jack. I still have my real legs and 20 golds.";
    }
}