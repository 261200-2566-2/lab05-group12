public class Melee extends Weapon implements  MeleeI{
    public Melee(String name,int level) {
        super(name, level);
        updateStats();
    }
    public void updateStats(){
        str = (int)(0.7*level+5);
        dex = (int)(0.5*level);
        def = (int)(0.6*level+4);
    }
}
