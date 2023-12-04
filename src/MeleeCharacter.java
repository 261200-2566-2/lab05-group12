public abstract class MeleeCharacter extends Character{
    protected Melee mainHand;
    public MeleeCharacter(String name, int level) {
        super(name, level);
        this.mainHand = new BareHand();
    }
}
