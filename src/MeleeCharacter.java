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
}
