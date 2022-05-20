public class GryffindorData extends HogwartsPersonData {
    private int nobility;
    private int honor;
    private int bravery;


    public GryffindorData(String name, int forceMagic,int transgression, int nobility, int honor, int bravery) {
        super(name,forceMagic,transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
