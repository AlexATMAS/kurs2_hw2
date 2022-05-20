public class HufflepuffData extends HogwartsPersonData{

    private int diligence;
    private int loyalty;
    private int honest;

    public HufflepuffData(String name, int forceMagic, int transgression, int diligence, int loyalty, int honest) {
        super(name, forceMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }
}
