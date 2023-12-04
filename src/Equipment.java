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
    public abstract void statsDisplay(String type);
}
