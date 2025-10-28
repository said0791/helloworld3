public class Main { //hello
    public static void main(String[] args) {

        System.out.println("Задача 1 ");

        int a= 25;
        byte b = 100;
        short c = 1000;
        long d = 1000000000L;
        float e = 99.99f;
        double f = 3.14159265359;
        String userName = "Саша";
        System.out.println(("a: " +a));
        System.out.println(("b: " +b));
        System.out.println(("c: " +c));
        System.out.println(("d: " +d));
        System.out.println(("e: " +e));
        System.out.println(("f: " +f));
        System.out.println("Саша");

        double addel = 27.12;
        long sfings = 987678965549L;
        float sher = 2.786f;
        short mig = 569;
        short lof = -159;
        int dayming = 27897;
        byte tim = 67;

        System.out.println("naddel: " + addel);
        System.out.println("sfings: " + sfings);
        System.out.println("sher: " + sher);
        System.out.println("mig: " + mig);
        System.out.println("lof: " + lof);
        System.out.println("dayming: " + dayming);
        System.out.println("tim: " + tim);

        System.out.println("Задача 3 ");

        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna) +" листов бумаги ");

        System.out.println("Задача 4 ");

        int twentyMinutes = 20;
        int water = 8;
        System.out.println("За 20 дней машина произвела " + (twentyMinutes*water)+" штук бутылок" );

        int day = 1440;
        System.out.println("За сутки машина произвела " + (day*water)+" штук бутылок" );

        int threeВays = 4320;
        System.out.println("За 3 дня машина произвела " + (threeВays*water)+" штук бутылок" );

        int month = 43200;
        System.out.println("За месяц машина произвела " + (month*water)+" штук бутылок" );

        System.out.println("Задача 5 ");

        int paints = 120;
        int white = 2;
        int brown = 4;
        int classes = paints/(white+brown);

        System.out.println((white + brown) + " банок красок на один класс");
        System.out.println("В школе " + classes + " классов");

        System.out.println(white * classes + " банок белых красок для всех классов");
        System.out.println(brown * classes + " банок коричневых красок для всех классов");
        System.out.println((white * classes) + (brown * classes) + " банок красок всего");



        System.out.println("Задача 6 ");

        int banana = 80;
        int bananaQuantity = 5;
        int bananaTotal = banana * bananaQuantity;
        System.out.println("Один банан весит " + banana + "гр, а пять бананов весит - " + bananaTotal + " гр");

        int milkMl = 200;
        double milkGramsPerMl = 1.05;
        double milkTotal = milkGramsPerMl * milkMl;
        System.out.println("Молоко весит - " + milkTotal + " гр");

        int iceCreamQuantity = 2;
        int iceCreamGrams = 100;
        int iceCreamTotal = iceCreamQuantity * iceCreamGrams;
        System.out.println("Мороженое-пломбир — " + iceCreamQuantity + " брикета, весит - " + iceCreamTotal + " гр");

        int eggsQuantity = 4;
        int eggGrams = 70;
        int eggsTotal = eggsQuantity * eggGrams;
        System.out.println("Яйца сырые – " + eggsQuantity + " яйца, весит - " + eggsTotal + " гр");

        double totalGrams = bananaTotal + milkTotal + iceCreamTotal + eggsTotal;
        System.out.println("Общий вес завтрака: " + totalGrams + " гр");

        double totalKg = totalGrams / 1000.0;
        System.out.println("Итог спортзавтрака: " + totalKg + " кг");

        System.out.println("Задача 7 ");

        double targetWeightLossKg = 7.0;
        double gramsPerKg = 1000;
        double targetWeightLossGrams = targetWeightLossKg * gramsPerKg;
        System.out.println("Нужно сбросить " + targetWeightLossGrams + " гр");

        int weightLossPerDay1 = 250;
        int daysNeeded1 = (int) (targetWeightLossGrams / weightLossPerDay1);
        System.out.println("За " + daysNeeded1 + " дней нужно сбросить вес");

        int daysPeriod = 28;
        double weightLossInPeriodKg = (weightLossPerDay1 * daysPeriod) / gramsPerKg;
        System.out.println("За " + daysPeriod + " дней спортсмен теряет вес на " + weightLossInPeriodKg + " кг");

        System.out.println("А если спортсмен будет терять вес на 500гр в день: ");

        int weightLossPerDay2 = 500;
        int daysNeeded2 = (int) (targetWeightLossGrams / weightLossPerDay2);
        System.out.println("То спортсмен теряет вес за " + daysNeeded2 + " дней");

        System.out.println("Задача 8 ");

        System.out.println("Миша, зарплата в месяц 67760 руб");

        double misha = 67760;
        double promotion = 10;
        double mishaIncrease = misha / promotion;
        System.out.println("Увеличение зарплаты на " + mishaIncrease + " руб");

        double mishaNewSalary = misha + mishaIncrease;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " + mishaNewSalary + " руб");

        double year = 12;
        double mishaOldYear = misha * year;
        double mishaNewYear = mishaNewSalary * year;
        double mishaYearDiff = mishaNewYear - mishaOldYear;
        System.out.println("Расчет годового дохода до повышения " + mishaOldYear + " руб");
        System.out.println("Расчет годового дохода после повышения " + mishaNewYear + " руб");
        System.out.println("Разница в годовом доходе: " + mishaYearDiff + " руб");

        System.out.println("\nДенис, зарплата в месяц 83690 руб");

        double denis = 83690;
        double denisIncrease = denis / promotion;
        System.out.println("Увеличение зарплаты на " + denisIncrease + " руб");

        double denisNewSalary = denis + denisIncrease;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " + denisNewSalary + " руб");

        double denisOldYear = denis * year;
        double denisNewYear = denisNewSalary * year;
        double denisYearDiff = denisNewYear - denisOldYear;
        System.out.println("Расчет годового дохода до повышения " + denisOldYear + " руб");
        System.out.println("Расчет годового дохода после повышения " + denisNewYear + " руб");
        System.out.println("Разница в годовом доходе: " + denisYearDiff + " руб");

        System.out.println("\nКристина, зарплата в месяц 76230 руб");

        double krestina = 76230;
        double krestinaIncrease = krestina / promotion;
        System.out.println("Увеличение зарплаты на " + krestinaIncrease + " руб");

        double krestinaNewSalary = krestina + krestinaIncrease;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " + krestinaNewSalary + " руб");

        double krestinaOldYear = krestina * year;
        double krestinaNewYear = krestinaNewSalary * year;
        double krestinaYearDiff = krestinaNewYear - krestinaOldYear;
        System.out.println("Расчет годового дохода до повышения " + krestinaOldYear + " руб");
        System.out.println("Расчет годового дохода после повышения " + krestinaNewYear + " руб");
        System.out.println("Разница в годовом доходе: " + krestinaYearDiff + " руб");

        System.out.println("\nИТОГ");
        System.out.println("Миша теперь получает " + mishaNewSalary + " рублей. Годовой доход вырос на " + mishaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + krestinaNewSalary + " рублей. Годовой доход вырос на " + krestinaYearDiff + " рублей");
    }

}

