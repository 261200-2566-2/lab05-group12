public abstract class Character {
    //fields
    protected String name;
    protected int health,maxHp,mana,maxMp,speed,maxSp,str,def, dex,level;
    protected boolean alive;
    protected Ring ringSlot1,ringSlot2;
    protected Glove glove;
    //constructors
    public Character(String name,int level){
        this.name = name;
        this.level = level;
        alive = true;
        updateStats();
    }
    public Character(String name){this(name,1);}

    //getter
    //methods
    public void attack(Character target){
        target.beingAttack(calculateDmg());
    }
    protected abstract int calculateDmg();
    protected void beingAttack(int dmg){

    }
    public abstract void updateStats();
    protected void baseStatsUpdate(){
        maxHp = 100+(10*level);
        maxMp = 50+(10*level);
        maxSp = 10+level;
        health = maxHp;
        mana = maxMp;
        speed = maxSp;
    }
    public abstract void statsDisplay();
    protected void baseStatsDisplay(){
        System.out.println("Health : "+health+"/"+maxHp+"\t Mana : "+mana+"/"+maxMp);
        System.out.println("Speed : "+speed);
    }
    public void upLevel(int lvl){
        if(lvl==1) System.out.println(name+" level up");
        else System.out.println(name+" level up "+lvl+" levels");
        level+=lvl;
        updateStats();
    }
    public void upLevel(){upLevel(1);}
}
