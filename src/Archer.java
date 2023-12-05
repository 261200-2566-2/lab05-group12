public class Archer extends RangeCharacter implements RangeCharacterI{
    protected Range mainHand;
    protected String mainHandType;
    public Archer(String name,int level,Range mainHand){
        super(name,level,new Range(mainHand.getName(), mainHand.getLevel(), mainHand.getMaxAmmo()));
        mainHandType = String.valueOf(mainHand.getClass());
        this.mainHand = new Range(mainHand.getName(), mainHand.getLevel(), mainHand.getMaxAmmo());

    }
    public Archer(String name, int level) {
        super(name, level,new BareHand());
    }
    public Archer(String name) {
        this(name,1);
    }
    @Override
    protected int calculateDmg() {
        return (mainHand.getDex()+dex+mainHand.getLevel())*2+str;
    }

    protected int calculateDef() {return (int)(0.4*(mainHand.getDef()+def+ mainHand.getLevel()));}
    @Override
    public void stance() {

    }

    @Override
    public void updateStats() {
        baseStatsUpdate();
        str = 6+(level);
        def = (int)(str*1.5+5);
        dex = 10+(2*level);
    }

    @Override
    public void statsDisplay() {
        System.out.println("Name : "+name+"\nClass : Archer lvl."+level);
        baseStatsDisplay();
    }

    @Override
    public void mainHandStats() {
        System.out.println();
        mainHand.statsDisplay(mainHandType);
        System.out.println("Ammo\t: "+mainHand.getAmmo()+"/"+mainHand.getMaxAmmo());
    }

    public void reload() {
        System.out.println(this.mainHand.getAmmo());
        mainHand.setAmmo(mainHand.maxAmmo);
    }
}
