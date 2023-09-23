package com.company;

import com.company.classes.*;

import java.util.*;

public class ZodiacSignGuesser {
    static double aquariusPercentage = 0,ariesPercentage = 0,cancerPercentage = 0,capricornPercentage = 0,geminiPercentage = 0,leoPercentage = 0,libraPercentage = 0,
            piscesPercentage = 0,sagittariusPercentage = 0,scorpioPercentage = 0,taurusPercentage = 0,virgoPercentage = 0;
    static Boolean willPowerBool,patientBool,passionBool,enthusiasmBool,confidenceBool,communicationBool,signsBool,intelliBool,introBool,loverBool,loyaltyBool;
    static HashMap<Double, String> map = new HashMap<>();
    public static void main(String[] args) {
        interfaceInit();
       logicInit();

    }
    private static void logicInit() {
        Aquarius aquarius = new Aquarius(true,false,true,false,true,false,
                true,false,true,false, true);
        Aries aries = new Aries(false,false,true,true,false,false,true,true,
                false,false,true);
        Cancer cancer = new Cancer(true,true,false,false,true,true,
                false,false,true,true,false);
        Capricorn capricorn = new Capricorn(false,false,false, false,true,true,true,
                true,false,false, false);
        Gemini gemini = new Gemini(true,true,true,true,false,false,false,false,
                true,true,true);
        Leo leo = new Leo(true,false,true,false,true,false,true,false,
                true,false,false);
        Libra libra = new Libra(false,true,true,true,false,false,true,false,false,
                false,true);
        Pisces pisces = new Pisces(true,true,true,false,true,false,true,
                false,true,true,false);
        Sagittarius sagittarius = new Sagittarius(false,false,false,false,false,true,true,
                true,true,true,true);
        Scorpio scorpio = new Scorpio(true,true,false,false,true,false,true,
                false,true,true,true);
        Taurus taurus = new Taurus(false,false,false,true,false,false,
                true,true,true,false,true);
        Virgo virgo = new Virgo(true,false,true,true,true,false,false,
                true,false,true,true);

        AnswerScore userAnswers = new AnswerScore(willPowerBool,patientBool,passionBool,enthusiasmBool,confidenceBool,communicationBool,signsBool,
                intelliBool,introBool,loverBool,loyaltyBool);

        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == aquarius.getAll().get(i)){
                aquariusPercentage += 10.9;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == aries.getAll().get(i)){
                ariesPercentage += 8.3;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == cancer.getAll().get(i)){
                cancerPercentage += 9.4;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == capricorn.getAll().get(i)){
                capricornPercentage += 9.5;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == gemini.getAll().get(i)){
                geminiPercentage += 9.2;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == leo.getAll().get(i)){
                leoPercentage += 8.9;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == libra.getAll().get(i)){
                libraPercentage += 9.7;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == pisces.getAll().get(i)){
                piscesPercentage += 9.9;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == sagittarius.getAll().get(i)){
                sagittariusPercentage += 9.1;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == scorpio.getAll().get(i)){
                scorpioPercentage += 10.3;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == taurus.getAll().get(i)){
                taurusPercentage += 9.6;
            }
        }
        for (int i = 0; i < userAnswers.getAll().size(); i++) {
            if (userAnswers.getAll().get(i) == virgo.getAll().get(i)){
                virgoPercentage += 8.4;
            }
        }

        System.out.println("Aqu: " + aquariusPercentage + "Arie: " + ariesPercentage + "Cancer: "+ cancerPercentage +
                "Capricorn: " + capricornPercentage + " Gemini: " + geminiPercentage + "Leo: " + leoPercentage +
                "Libra: " + libraPercentage + " Pisces : " + piscesPercentage + " Sagittarius: " + sagittariusPercentage +
                " Scorpio: " + scorpioPercentage + " Taurus: " + taurusPercentage + " Virgo: " +virgoPercentage);

        map.put(aquariusPercentage, "Aquarius");
        map.put(ariesPercentage, "Aries");
        map.put(cancerPercentage, "Cancer");
        map.put(capricornPercentage, "Capricorn");
        map.put(geminiPercentage, "Gemini");
        map.put(leoPercentage, "Leo");
        map.put(libraPercentage, "Libra");
        map.put(piscesPercentage, "Pisces");
        map.put(sagittariusPercentage, "Sagittarius");
        map.put(scorpioPercentage, "Scorpio");
        map.put(taurusPercentage, "Taurus");
        map.put(virgoPercentage, "Virgo");

        double[] percentage = {aquariusPercentage,ariesPercentage,capricornPercentage,cancerPercentage,geminiPercentage,
                leoPercentage,libraPercentage,piscesPercentage,sagittariusPercentage,scorpioPercentage,taurusPercentage,virgoPercentage};
        System.out.println("the highest is: " + getLarge(percentage,percentage.length));
        System.out.println("the second highest is: " + getSecondLarge(percentage,percentage.length));
        System.out.println(userAnswers.getAll());

        map.forEach((key, value) -> {
            if (Objects.equals(Collections.max(map.keySet()), key)){
                System.out.println("you are: " + value);
            }
        });
    }

    private static void interfaceInit() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi there What is your name?");
        System.out.println("hello there " + userInput.nextLine());
        System.out.println("This is our zodiac guesser please enjoy");
        System.out.println("Please answer the following question correctly YES / NO");
        System.out.println("1. Do you have a strong will power?");
        String willPower = userInput.nextLine().toLowerCase();
        //willPowerBool an boolean is equal to a boolean expression which can be true or false if it is equal to yes it is true if it's not it is false
        willPowerBool = willPower.equals("yes");
        System.out.println("2. Are you are patient person?");
        String patient = userInput.nextLine().toLowerCase();
        patientBool = patient.equals("yes");
        System.out.println("3. Would you say you are a passionate person?");
        String passion = userInput.nextLine().toLowerCase();
        passionBool = passion.equals("yes");
        System.out.println("4. Are you very confidence about yourself?");
        String confidence = userInput.nextLine().toLowerCase();
        confidenceBool = confidence.equals("yes");
        System.out.println("5. Are you a very enthusiastic person?");
        String enthusiasm = userInput.nextLine().toLowerCase();
        enthusiasmBool = enthusiasm.equals("yes");
        System.out.println("5. Do you have good communication skills");
        String communication = userInput.nextLine().toLowerCase();
        communicationBool = communication.equals("yes");
        System.out.println("7. Are you a fan of zodiac signs?");
        String signs = userInput.nextLine().toLowerCase();
        signsBool = signs.equals("yes");
        System.out.println("8. Are you a very intelligent person?");
        String intelligence = userInput.nextLine().toLowerCase();
        intelliBool = intelligence.equals("yes");
        System.out.println("9. Are you an introverted person?");
        String intro_extro = userInput.nextLine().toLowerCase();
        introBool = intro_extro.equals("yes");
        System.out.println("10. Are you a very romantic lover?");
        String lover = userInput.nextLine().toLowerCase();
        loverBool = lover.equals("yes");
        System.out.println("11. Do you think of your self as a loyal person?");
        String loyalty = userInput.nextLine().toLowerCase();
        loyaltyBool = loyalty.equals("yes");
    }

    public static double getLarge(double[]a,int total){
        Arrays.sort(a);
        return a[total-1];
    }
    public static double getSecondLarge(double[]a,int total){
        Arrays.sort(a);
        return a[total-2];
    }
}
