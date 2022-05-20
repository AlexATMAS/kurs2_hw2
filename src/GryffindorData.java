public class GryffindorData extends HogwartsPersonData {
    String nameList = "Грифиндор";

    private final int nobility;
    private final int honor;
    private final int bravery;


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



    public int getSumParametrsStudent(){
        return getBravery() + getHonor() + getNobility();
    }

    public String getNameList() {
        return nameList;
    }

    @Override
    public String toString() {
        return  "Факультет: Грифиндор, " + "Имя: "
                + super.getName() + ", Магическая сила: "
                + super.getForceMagic() + ", Трансгрессия: "
                + super.getTransgression() +
                ", Nobility = " + nobility +
                ", Honor = " + honor +
                ", Bravery = " + bravery + ".";
    }
}
