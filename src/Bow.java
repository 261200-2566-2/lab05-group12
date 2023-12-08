public class Bow extends Range{

    public Bow(String names,int levels,int ammoCapacity){
        super(names, levels);
        this.name = names;
        this.level = levels;
        updateStats();
    }
}
