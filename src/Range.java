public class Range extends Weapon implements RangeI{
    public Range(String name,int level) {
        super(name, level);
        updateStats();
    }
    public void updateStats(){
        str = (int)(0.5*level+5);
        dex = (int)(2.0*level);
        def = (int)(0.6*level+4);
    }
}
