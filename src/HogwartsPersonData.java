public class HogwartsPersonData {

    private String name;
    private int forceMagic;
    private int transgression;



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
}
