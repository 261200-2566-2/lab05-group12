public abstract class Equipment {
    //fields
    protected String name;
    protected int str,dex,def;
    //constructor
    public Equipment(String name){
        this.name = name;
    }
    //methods
    public String getName() {
        return name;
    }
    public int getStr(){return str;}
    public int getDex(){return dex;}
    public int getDef() {return def;}
    public abstract void statsDisplay(String type);
}
