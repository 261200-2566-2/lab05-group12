public class Knight extends MeleeCharacter implements MeleeCharacterI{
    protected Melee mainHand;
    protected String mainHandType;
    public Knight(String name,int level,Melee mainHand){
        super(name,level,new Melee(mainHand.getName(), mainHand.getLevel()));
        mainHandType = String.valueOf(mainHand.getClass());
        this.mainHand = new Melee(mainHand.getName(), mainHand.getLevel());
    }
    public Knight(String name, int level) {
        super(name, level,new BareHand());
    }
    public Knight(String name) {
        this(name,1);
    }

    @Override
    public void attack(Character target) {

    }

    @Override
    protected int calculateDmg() {
        return /*(mainHand.getStr()+str+mainHand.getLevel())*2+*/dex;
    }

    @Override
    public void stance() {

    }

    @Override
    public void updateStats() {
        baseStatsUpdate();
        str = 10+(2*level);
        def = str;
        dex = 8+level;
    }

    @Override
    public void defensiveStance() {

    }
    @Override
    public void statsDisplay(){
        System.out.println("Name : "+name+"\nClass : Knight lvl."+level);
        baseStatsDisplay();
        System.out.println("Strength\t: "+str);
        System.out.println("Agility \t: "+ dex);
        System.out.println("Defense \t: "+def+"\n");
    }

    @Override
    public void mainHandStats() {
        mainHand.statsDisplay(mainHandType);
    }
}
