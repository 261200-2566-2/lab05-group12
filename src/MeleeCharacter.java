public abstract class MeleeCharacter extends Character{
    protected Melee mainHand;

    public MeleeCharacter(String name, int level,Melee mainHand) {
        super(name, level);
        this.mainHand = mainHand;
    }
    public MeleeCharacter(String name,int level,BareHand mainHand){
        super(name, level);
        this.mainHand = new Melee("Bare Hand",0);
    }

    @Override
    protected void statsWithWeapon() {
        System.out.println("\t\t\tBASE\tWEAPON\tSUM");
        System.out.println("Strength\t: "+str+"  \t+ "+mainHand.getStr()+"\t; "+(str+ mainHand.getStr()));
        System.out.println("Dexterity\t: "+dex+" \t+ "+mainHand.getDex()+"\t; "+(dex+ mainHand.getDex()));
        System.out.println("Defense \t: "+def+" \t+ "+mainHand.getDef()+"\t; "+(def+ mainHand.getDef())+"\n");
    }

    public void attack(Character target){
        System.out.println(name+" Attack "+target.getName()+" with "+ mainHand.getNameLvl()+"\nInflict Damage "+calculateDmg()+" units");
        target.beingAttack(calculateDmg());
    }
}
