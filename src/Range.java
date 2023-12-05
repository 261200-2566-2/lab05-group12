public class Range extends Weapon implements RangeI{
    protected int ammo,maxAmmo;
    public Range(String name,int level,int ammocapa) {
        super(name, level);
        this.ammo = ammocapa;
        this.maxAmmo = ammocapa;
        updateStats();
    }
    public void updateStats(){
        str = (int)(0.5*level+5);
        dex = (int)(2.0*level);
        def = (int)(0.6*level+4);
    }
    public void shoot(){
        ammo--;
        System.out.println("Current ammo : "+ammo+"/"+maxAmmo);
    }
    public void reload() {
        ammo = maxAmmo;
    }

    public int getAmmo() {return ammo;}
    public int getMaxAmmo() {return maxAmmo;}
}
