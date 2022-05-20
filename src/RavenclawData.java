public class RavenclawData extends HogwartsPersonData{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;


    public RavenclawData(String name, int forceMagic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, forceMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
