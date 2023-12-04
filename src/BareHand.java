public class BareHand extends Weapon implements WeaponI{
    public BareHand(){
        super("Bare Hand",0);
    }

    @Override
    public void upLevel() {

    }

    @Override
    public void updateStats() {
        str = 1;
        dex = 1;
        def = 0;
    }

    public int getStr(){
        return 0;
    }
    @Override
    public int getStats() {
        return 0;
    }

}
