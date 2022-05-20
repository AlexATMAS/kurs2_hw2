public class HogwartsPersonData {

    String nameList = "Ученик школы";

    private final String name;
    private final int forceMagic;
    private final int transgression;



    public  HogwartsPersonData(String name,int forceMagic,int transgression){
        this.name = name;
        this.forceMagic = forceMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getForceMagic() {
        return forceMagic;
    }

    public int getTransgression() {
        return transgression;
    }
    public int getSumParametrsStudent(){
        return getForceMagic() + getTransgression();
    }

    public String getNameList() {
        return nameList;
    }

    @Override
    public String toString() {
        return nameList +
                ": Имя: " + name +
                ", Магия: " + forceMagic +
                ", Трансгрессия: " + transgression;
    }
}
