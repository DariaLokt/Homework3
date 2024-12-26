public class Main {
    public static void main(String[] args) {
        //Task 1
        int a1 = 50000;
        byte a2 = 30;
        short a3 = 30000;
        long a4 = 30000000;
        double a5 = 1.9;
        float a6 = 1.9f;
        System.out.println("Значение переменной a1" + " с типом int" + " равно " + a1);
        System.out.println("Значение переменной a2" + " с типом byte" + " равно " + a2);
        System.out.println("Значение переменной a3" + " с типом short" + " равно " + a3);
        System.out.println("Значение переменной a4" + " с типом long" + " равно " + a4);
        System.out.println("Значение переменной a5" + " с типом double" + " равно " + a5);
        System.out.println("Значение переменной a6" + " с типом float" + " равно " + a6);

        //Task 2
        float b1 = 27.12f;
        long b2 = 987678965549L;
        float b3 = 2.786f;
        short b4 = 569;
        short b5 = -159;
        short b6 = 27897;
        byte b7 = 67;

        //Task 3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short paper = 480;
        int sheets = paper / (lpStudents + asStudents + eaStudents);
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        //Task 4
        byte outputIn2Minutes = 16;
        int result20Minutes = outputIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела " + result20Minutes + " штук бутылок");
        short day = 24 * 60 / 2;
        int resultDay = outputIn2Minutes * day;
        System.out.println("За сутки машина произвела " + resultDay + " штук бутылок");
        int result3Days = outputIn2Minutes * day * 3;
        System.out.println("За 3 дня машина произвела " + result3Days + " штук бутылок");
        int resultMonth = outputIn2Minutes * day * 30;
        System.out.println("За 1 месяц машина произвела " + resultMonth + " штук бутылок");

        //Task 5
        byte cans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int classes = cans / cansPerClass;
        int white = classes*whitePerClass;
        int brown = classes*brownPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //Task 6
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        float totalWeightKg = (float) totalWeight / 1000;
        System.out.println("Вес завтрака " + totalWeight + " гр. Или " + totalWeightKg + " кг.");

        //Task 7
        byte kgToLose = 7;
        short toLose = (short) (kgToLose * 1000);
        short loosing1 = 250;
        short loosing2 = 500;
        short days1 = (short) (toLose / loosing1);
        short days2 = (short) (toLose / loosing2);
        short daysMedium = (short) ((days1 + days2) / 2);
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он похудеет за " + days1 + " дней. Если спортсмен будет терять каждый день по 500 грамм, то за " + days2 + ". В среднем понадобится " + daysMedium + " день.");

        //Task 8
        int mashaMonthOld = 67760;
        int denisMonthOld = 83690;
        int chrisMonthOld = 76230;
        double mashaMonthNew = mashaMonthOld * 1.1;
        double denisMonthNew = denisMonthOld * 1.1;
        double chrisMonthNew = chrisMonthOld * 1.1;
        int mashaYearOld = mashaMonthOld * 12;
        int denisYearOld = denisMonthOld * 12;
        int chrisYearOld = chrisMonthOld * 12;
        double mashaYearNew = mashaMonthNew * 12;
        double denisYearNew = denisMonthNew * 12;
        double chrisYearNew = chrisMonthNew * 12;
        double mashaDiff = mashaYearNew - mashaYearOld;
        double denisDiff = denisYearNew - denisYearOld;
        double chrisDiff = chrisYearNew - chrisYearOld;
        System.out.println("Маша теперь получает " + mashaMonthNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        System.out.println("Денис теперь получает " + denisMonthNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        System.out.println("Кристина теперь получает " + chrisMonthNew + " рублей. Годовой доход вырос на " + chrisDiff + " рублей");
    }
}