public abstract class Weapon extends Equipment{
    //fields
    protected int level;
    //constructor
    public Weapon(String name,int level){
        super(name);
        this.level = level;
    }
    //methods
    public int getLevel() {
        return level;
    }
    public void statsDisplay(String type) {
        System.out.println("Name\t: "+name+" lvl."+level);
        System.out.println("Type\t: "+type);
        System.out.println("Strength\t: "+str);
        System.out.println("Dexterity\t: "+dex);
        System.out.println("Defense \t: "+def);
    }
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
    public void upLevel() {
        upLevel(1);
    }
    public abstract void updateStats();
    public String getNameLvl(){
        return (getName()+" lvl."+getLevel());
    }
}
