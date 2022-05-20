public class SlytherinData extends HogwartsPersonData{

    String nameList = "Слизарин";

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public SlytherinData(String name, int forceMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, forceMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public String getNameList() {
        return nameList;
    }

    public int getSumParametrsStudent(){
        return getAmbition() + getCunning() + getDetermination() + getResourcefulness() + getThirstForPower();
    }

    @Override
    public String toString() {
        return "Факультет: Слизерин, " + "Имя: "
                + super.getName() + ", Магическая сила: "
                + super.getForceMagic() + ", Трансгрессия: "
                + super.getTransgression() +
                ", cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", thirstForPower = " + thirstForPower + ".";
    }
}
