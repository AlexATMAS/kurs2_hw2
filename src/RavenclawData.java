public class RavenclawData extends HogwartsPersonData{

    String nameList = "Когтевран";

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;


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

    public String getNameList() {
        return nameList;
    }

    public int getSumParametrsStudent(){
        return getCreativity() + getMind() + getWisdom() + getWit();
    }

    @Override
    public String toString() {
        return "Факультет: Когтевран, " + "Имя: "
                + super.getName() + ", Магическая сила: "
                + super.getForceMagic() + ", Трансгрессия: "
                + super.getTransgression() +
                " mind = " + mind +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creativity = " + creativity + ".";
    }
}
