public abstract class RangeCharacter extends Character{
    protected Range mainHand;
    public RangeCharacter(String name, int level,Range mainHand) {
        super(name, level);
        this.mainHand = mainHand;
    }
    public RangeCharacter(String name,int level,BareHand mainHand){
        super(name, level);
        this.mainHand = new Range("Bare Hand",0);
    }
    @Override
    protected void statsWithWeapon() {
        System.out.println("\t\t\tBASE\tWEAPON\tSUM");
        System.out.println("Strength\t: "+str+"  \t+ "+mainHand.getStr()+"\t; "+(str+ mainHand.getStr()));
        System.out.println("Dexterity\t: "+dex+" \t+ "+mainHand.getDex()+"\t; "+(dex+ mainHand.getDex()));
        System.out.println("Defense \t: "+def+" \t+ "+mainHand.getDef()+"\t; "+(def+ mainHand.getDef())+"\n");
    }
    public void attack(Character target){
        System.out.println("\nRange attack()");
        if(2>0) {
            System.out.println();
            System.out.println(name + " Shoot " + target.getName() + " with " + mainHand.getNameLvl() + "\nInflict Damage " + calculateDmg() + " units");
            //mainHand.shoot();
            target.beingAttack(calculateDmg());
        }else System.out.println("Out of ammo");

    }
}
