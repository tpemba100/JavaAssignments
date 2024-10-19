public class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

  class FireMonster extends Monster {
      public FireMonster(String name) {
          super(name);  // Call the constructor of the superclass
      }
      @Override
      public String attack(){
         return name +" The Fire Monster breathes Fire";
     }
 }
 class WaterMonster extends Monster {
     public WaterMonster(String name) {
         super(name);  // Call the constructor of the superclass
     }
     @Override
     public String attack(){
         return name +" The Water Monster breathes Water";
     }
 }
 class StoneMonster extends Monster {
     public StoneMonster(String name) {
         super(name);  // Call the constructor of the superclass
     }
     @Override
     public String attack(){
         return name + " The Stone Monster breathes Stone";
     }
 }

