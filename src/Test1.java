
public class Test1 {
    public static void main(String[] args) {
        //Задача 1
        byte speed = 100;
        short line = 200;
        int radius = 1000;
        long diametr = 10000;
        float width = 12.2222f;
        double restored = 100.99999999;
        System.out.println("Значение переменной speed с типом byte равно " + speed);
        System.out.println("Значение переменной line с типом short равно " + line);
        System.out.println("Значение переменной radius с типом int равно " + radius);
        System.out.println("Значение переменной diametr с типом long равно " + diametr);
        System.out.println("Значение переменной width с типом float равно " + width);
        System.out.println("Значение переменной restored с типом double равно " + restored);

        //Задача 2
        float a = 27.12f;
        long b = 987_678_965_549L;
        byte c = 2;
        short d = 786;
        boolean e = false;
        int f = 569;
        short g = -159;
        int h =27897;
        double i = 67.;

        //Задача 3
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short sheetsOfPaper = 480;
        short toEach = (short) (sheetsOfPaper/(studentsAS+studentsEA+studentsLP));
        System.out.println("На каждого ученика рассчитано "+ toEach+" листов бумаги.");


        //Задача 4
        int bottle = 16;
        int time =2;
        int performance = bottle/time;
        int performance20= 20*performance;
        int performanceDay= performance*24*60;
        int performance3Day= performanceDay*3;
        int performanceMonth=performanceDay*30;
        System.out.println("За 20 минут машина произвела бутылок " + performance20+ " штук ");
        System.out.println("За сутки машина произвела бутылок " + performanceDay+ " штук ");
        System.out.println("За 3 дня машина произвела бутылок " + performance3Day+ " штук ");
        System.out.println("За 1 месяц машина произвела бутылок " + performanceMonth+ " штук ");


        //Задача 5
        byte sum = 120;
        byte white =2;
        byte braun =4;
        int numberOfClasses= sum/(white+braun);
        int sumWhite= white*numberOfClasses;
        int sumBraun= braun*numberOfClasses;
        System.out.println("В школе, где "+ numberOfClasses+ " классов, нужно "+ sumWhite+" банок белой краски и "+ sumBraun+" банок коричневой краски.");


        //Задача 6
        short banana =5;
        short milk = 200;
        short icecream= 2;
        short eggs = 4;
        short weightBanana= (short) (80*banana);
        short weightMilk= (short) (1.05*milk);
        short weightIcecream= (short) (icecream*100);
        short weightEggs= (short) (70* eggs);
        short summa= (short) (weightMilk+weightEggs+weightBanana+weightIcecream);
        float summaKg= summa/1000f;
        System.out.println (summaKg);

        //Задача 7
        double sumGr = 7000f;
        short gr250=250;
        short gr500=500;
        short day250= (short) (sumGr/gr250);
        short day500= (short) (sumGr/gr500);
        System.out.println("При сбрасывании по 250 грамм в день потребуется " + day250);
        System.out.println("При сбрасывании по 500 грамм в день потребуется " + day500);
        double averageGr = ((gr250+gr500)/2f);
        double averageDay= sumGr/averageGr;
        System.out.println("При среднем сбрасывании грамм в день потребуется " + averageDay);

        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis= 83690;
        int salaryKristina=76230;
        int newSalaryMasha = (int) (salaryMasha+ salaryMasha*0.1);
        int newSalaryDenis = (int) (salaryDenis+ salaryDenis*0.1);
        int newSalaryKristina = (int) (salaryKristina+ salaryKristina*0.1);
        System.out.println("Маша теперь получает "+ newSalaryMasha+ " рублей. Годовой доход вырос на " + (newSalaryMasha*12-salaryMasha*12) +" рублей");
        System.out.println("Денис теперь получает "+ newSalaryDenis+ " рублей. Годовой доход вырос на " + (newSalaryDenis*12-salaryDenis*12) +" рублей");
        System.out.println("Кристина теперь получает "+ newSalaryKristina+ " рублей. Годовой доход вырос на " + (newSalaryKristina*12-salaryKristina*12) +" рублей");

























    }
}