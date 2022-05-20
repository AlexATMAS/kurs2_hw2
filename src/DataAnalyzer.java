public class DataAnalyzer {


    public static void winStudentFaculty (HogwartsPersonData[] hogwartsPersonData){
        int win = hogwartsPersonData[0].getSumParametrsStudent();
        String name = hogwartsPersonData[0].getName();
        String nameList = hogwartsPersonData[0].getNameList();

        for (HogwartsPersonData hogwartsPersonDatum : hogwartsPersonData) {
            if (win < hogwartsPersonDatum.getSumParametrsStudent()) {
                win = hogwartsPersonDatum.getSumParametrsStudent();
                name = hogwartsPersonDatum.getName();
                nameList = hogwartsPersonDatum.getNameList();

            }
        }
        System.out.println(("Лучший студент факультета - " + nameList + ": " + name + " " + " Колличество очков: " + win));

    } // Лучший ученик выбранного факультета;
    public static void searchAndSeeStunent(HogwartsPersonData[] hogwartsPersonData,String name){

        if (searchStudentInput(hogwartsPersonData,name)) {
            for (HogwartsPersonData hogwartsPersonDatum : hogwartsPersonData) {
                if (hogwartsPersonDatum.getName().equals(name)) {
                    System.out.println(hogwartsPersonDatum);
                    return;
                }
            }
        }else
            throw new RuntimeException("Ошибка поиска студента! Повторите ввод!");

    } ///Поиск и вывод по имени ученика;


    ////////// метод проверки //////
    public static boolean searchStudentInput(HogwartsPersonData[] hogwartsPersonData,String name){
        boolean a = false;
        for (HogwartsPersonData hogwartsPersonDatum : hogwartsPersonData) {
            if (hogwartsPersonDatum.getName().equals(name)) {
                a = true;
                break;
            }
        } return a;
    } ///Поиск и сравнение вводимых данных с БД по имени;


    //////// методы сравнения навыков ( одинаковые "под капотом" );

    public static void studentsVs (HogwartsPersonData[] hogwartsPersonData,String name1,String name2){
        int student1 = 0;
        String student1Name = "";
        int student2 = 0;
        String student2Name = "";

        if (searchStudentInput(hogwartsPersonData,name1) && searchStudentInput(hogwartsPersonData,name2)) {
            for (HogwartsPersonData hogwartsPersonDatum : hogwartsPersonData) {
                if (hogwartsPersonDatum.getName().equals(name1)) {
                    student1 = hogwartsPersonDatum.getSumParametrsStudent();
                    student1Name = hogwartsPersonDatum.getName();
                } else if (hogwartsPersonDatum.getName().equals(name2)) {
                    student2 = hogwartsPersonDatum.getSumParametrsStudent();
                    student2Name = hogwartsPersonDatum.getName();
                }
            }
        }else
            throw new RuntimeException("Ошибка поиска студента! Повторите ввод!");

        if ( student1 > student2){
            System.out.println("В этой паре сильнейший: " + student1Name + " Колличество очков: " + student1);
        } else {
            System.out.println("В этой паре сильнейший: " + student2Name + " Колличество очков: " + student2);
        }


    } // Сравнение навыков 2х любых учеников школы;


    public static void studentsVsStudentFaculty (HogwartsPersonData[] hogwartsPersonData,String name1,String name2){
        int student1 = 0;
        String student1Name = "";
        int student2 = 0;
        String student2Name = "";

        if (searchStudentInput(hogwartsPersonData,name1) && searchStudentInput(hogwartsPersonData,name2)) {
            for (HogwartsPersonData hogwartsPersonDatum : hogwartsPersonData) {
                if (hogwartsPersonDatum.getName().equals(name1)) {
                    student1 = hogwartsPersonDatum.getSumParametrsStudent();
                    student1Name = hogwartsPersonDatum.getName();
                } else if (hogwartsPersonDatum.getName().equals(name2)) {
                    student2 = hogwartsPersonDatum.getSumParametrsStudent();
                    student2Name = hogwartsPersonDatum.getName();
                }
            }
        }else
            throw new RuntimeException("Ошибка поиска студента! Повторите ввод!");

        if ( student1 > student2){
            System.out.println("В этой паре сильнейший: " + student1Name + " Колличество очков: " + student1);
        } else {
            System.out.println("В этой паре сильнейший: " + student2Name + " Колличество очков: " + student2);
        }


    } // Сравнение навыков 2х  учеников Факультета;






}
