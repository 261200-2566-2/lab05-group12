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
    //getter
    //methods
    public String getName() {return name;}
    protected abstract int calculateDmg();
    protected abstract int calculateDef();
    protected void beingAttack(int dmg){
        int calDef = calculateDef();
        int rawDmg = dmg-calDef;
        System.out.println(name + " take that with "+calDef+" defense units");
        if(rawDmg>0)
            if(health<rawDmg)   health=0;
            else    health-=rawDmg;
        else rawDmg=0;
        System.out.println(name + " got damaged "+rawDmg+" units");
        System.out.println(name+"'s Health : "+health+"/"+maxHp);
        if(health<=0){
            alive = false;
            System.out.println(name + " has been slain. . .");
        }
        System.out.println();
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
        System.out.println("Speed : "+speed+"\tStatus : "+(alive?"ALIVE":"DEAD"));
        statsWithWeapon();
    }
    protected abstract void statsWithWeapon();
    public void upLevel(int lvl){
        if(lvl==1) System.out.println(name+" level up");
        else System.out.println(name+" level up "+lvl+" levels");
        level+=lvl;
        updateStats();
    }
    public void upLevel(){upLevel(1);}
    public abstract void mainHandStats();
}
