public class Sword extends Melee{

    public Sword(String names,int levels){
        super(names, levels);
        this.name = names;
        this.level = levels;
        updateStats();
    }
}
