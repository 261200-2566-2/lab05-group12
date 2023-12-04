public class Knight extends MeleeCharacter implements MeleeCharacterI{

    public Knight(String name, int level, Sword mainHand) {
        super(name, level,new Sword());
    }
    public Knight(String name, int level,BareHand mainHand) {
        super(name, level,new BareHand());
    }
    public Knight(String name,int level){this(name,level,new BareHand());}
    public Knight(String name){this(name,1);}
    @Override
    public void attack(Character target) {

    }

    @Override
    protected int calculateDmg() {
        return (mainHand.getStr()+str+mainHand.getLevel())*2+dex;
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
}
