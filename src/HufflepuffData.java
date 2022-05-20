public class HufflepuffData extends HogwartsPersonData{

    String nameList = "Пуфиндуй";

    private final int diligence;
    private final int loyalty;
    private final int honest;

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

    public String getNameList() {
        return nameList;
    }

    public int getSumParametrsStudent(){
        return getDiligence() + getHonest() + getLoyalty();
    }

    @Override
    public String toString() {
        return "Факультет: Пуффендуй, " + "Имя: "
                + super.getName() + ", Магическая сила: "
                + super.getForceMagic() + ", Трансгрессия: "
                + super.getTransgression() +
                ", diligence = " + diligence +
                ", loyalty = " + loyalty +
                ", honest = " + honest + ".";
    }
}
