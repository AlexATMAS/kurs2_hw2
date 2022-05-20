public class Main {

    public static void main(String[] args) {
        HogwartsPersonData[] hogwartsPersonDataFull = {
                new GryffindorData("Гарри Поттер",90,100,50,35,65),
                new GryffindorData("Гермиона Грейнджер",80,100,50,35,65),
                new GryffindorData("Рон Уизли",65,65,50,35,65),
                new HufflepuffData("Захария Смит",12,98,45,45,4),
                new HufflepuffData("Седрик Диггори",67,65,54,65,2),
                new HufflepuffData("Джастин Финч-Флетчли",3,43,33,67,12),
                new RavenclawData("Чжоу Чанг",43,10,12,76,90,6),
                new RavenclawData("Падма Патил",9,54,32,6,89,11),
                new RavenclawData("Маркус Белби",51,33,78,98,1,100),
                new SlytherinData("Драко Малфой",85,100,43,43,6,50,12),
                new SlytherinData("Грэхэм Монтегю",45,60,2,80,90,32,91),
                new SlytherinData("Грегори Гойл",35,55,50,100,43,67,90),
        };
        HogwartsPersonData[] hogwartsPersonData = {
                new HogwartsPersonData("Гарри Поттер",90,100),
                new HogwartsPersonData("Гермиона Грейнджер",80,80),
                new HogwartsPersonData("Рон Уизли",65,65),
                new HogwartsPersonData("Чжоу Чанг",44,87),
                new HogwartsPersonData("Падма Патил",43,32),
                new HogwartsPersonData("Маркус Белби",67,76),
                new HogwartsPersonData("Захария Смит",12,98),
                new HogwartsPersonData("Седрик Диггори",67,65),
                new HogwartsPersonData("Джастин Финч-Флетчли",3,43),
                new HogwartsPersonData("Драко Малфой",98,54),
                new HogwartsPersonData("Грэхэм Монтегю",43,43),
                new HogwartsPersonData("Грегори Гойл",90,10),
        };

        GryffindorData[] gryffindorData = {
                new GryffindorData("Гарри Поттер",90,100,50,35,65),
                new GryffindorData("Гермиона Грейнджер",80,100,50,35,65),
                new GryffindorData("Рон Уизли",65,65,50,35,65),
        };

        HufflepuffData[] hufflepuffData = {
                new HufflepuffData("Захария Смит",12,98,45,45,4),
                new HufflepuffData("Седрик Диггори",67,65,54,65,2),
                new HufflepuffData("Джастин Финч-Флетчли",3,43,33,67,12),
        };

        RavenclawData[] ravenclawData = {
                new RavenclawData("Чжоу Чанг",43,10,12,76,90,6),
                new RavenclawData("Падма Патил",9,54,32,6,89,11),
                new RavenclawData("Маркус Белби",51,33,78,98,1,100),
        };

        SlytherinData[] slytherinData = {
                new SlytherinData("Драко Малфой",85,100,43,43,6,50,12),
                new SlytherinData("Грэхэм Монтегю",45,60,2,80,90,32,91),
                new SlytherinData("Грегори Гойл",35,55,50,100,43,67,90),
        };



        DataAnalyzer.searchAndSeeStunent(hogwartsPersonDataFull,"Захария Смит"); // поиск и вывод по имени ученика из общей базы;



        DataAnalyzer.winStudentFaculty(gryffindorData); // Лучший ученик  факультета Грифендор;
        DataAnalyzer.winStudentFaculty(hufflepuffData); // Лучший ученик  факультета Пуфендуй;
        DataAnalyzer.winStudentFaculty(ravenclawData); // Лучший ученик  факультета Когтевран;
        DataAnalyzer.winStudentFaculty(slytherinData); // Лучший ученик  факультета Слизарин;



        ///методы "под капотом" одинаковые , разница лишь в перегрузке методов при выборе разных массивов из разных классов. Нужны ли оба метода ? мне кажется нет.
        DataAnalyzer.studentsVs(hogwartsPersonData,"Грегори Гойл","Гарри Поттер"); /// Сравниваем навыки 2х учеников школы;
        DataAnalyzer.studentsVsStudentFaculty(slytherinData,"Драко Малфой","Грэхэм Монтегю"); //Сравниваем навыки 2х учеников Факультета;





    }





}