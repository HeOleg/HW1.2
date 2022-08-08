import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        //Задание1

        byte books=1;
        short pig=8;
        int age=19;
        long stars=654L;
        double waterWeight=2.3;
        float bodyWeight=5.1f;
        boolean isAdult=age>=18;
        char cars=53;

        //Задание 2
        double boxer1=78.2;
        double boxer2=82.7;
        double weightAllBoxers=boxer1+boxer2;
        double differenceWeight=boxer2-boxer1;
        System.out.println(differenceWeight);

        //Задание 3
        int bananas=5;
        short weightOneBananas=80;
        int weightAllBananas=weightOneBananas*bananas;
        short milk=200;
        int weightAllMilk=milk/100*105;
        int iceCream=2;
        int weightOneIceCream=100;
        int weightIceCream=iceCream*weightOneIceCream;
        double eggs=4.000;
        double weightOneEgg=70;
        double weightAllEggs=eggs*weightOneEgg;
        double weightCoctaile=weightAllBananas+weightAllMilk+weightIceCream+weightAllEggs;
        double weigthtCoctaileInKg=weightCoctaile/1000;
        System.out.println(weigthtCoctaileInKg);

        //Задание 4
        int needToLoseWeightKg=7;
        int needToLoseWeightG=needToLoseWeightKg*1000;
        int weightLossInDayMin=250;
        int weightLossInDayMax=500;
        int daysToLoseWeightMin=needToLoseWeightG/weightLossInDayMin;
        int daysToLoseWeightMax;
        daysToLoseWeightMax = needToLoseWeightG/weightLossInDayMax;
        System.out.println("Минимальный вес похудения "+daysToLoseWeightMin);
        System.out.println("Максимальный вес похудения "+daysToLoseWeightMax);
    }
}