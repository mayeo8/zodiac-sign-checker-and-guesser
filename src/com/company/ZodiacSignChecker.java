package com.company;
import java.util.Scanner;

public class ZodiacSignChecker {
    static String userName;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to our zodiac sign checker
                What is your name?
                """);
        userName = sc.nextLine();
        System.out.println("Welcome " + userName + " Please fill in your birthday info and lets do the rest");
        System.out.println("What is your Birth month? Enter in digits");
        String userBirthMonth = sc.nextLine();
        System.out.println("What is your birthday?");
        int userBirthDay = sc.nextInt();
        switch (userBirthMonth){
            case "01":
                if (userBirthDay < 20){
                    Capricorn();
                }else if (userBirthDay > 20 && userBirthDay < 31){
                    Aquarius();
                }else System.out.println("please input a correct date");
                break;
            case "02":
                if (userBirthDay < 19 ){
                    Aquarius();
                }else if (userBirthDay > 19 && userBirthDay < 28){
                    Pisces();
                }else System.out.println("please input a correct date");
                break;
            case "03":
                if (userBirthDay < 20){
                    Pisces();
                }else if (userBirthDay > 21 && userBirthDay < 31){
                    Aries();
                }else System.out.println("please input a correct date");
                break;
            case "04":
                if (userBirthDay < 20){
                    Aries();
                }else if (userBirthDay > 20 && userBirthDay < 30){
                    Taurus();
                }else System.out.println("please input a correct date");
                break;
            case "05":
                if (userBirthDay < 20){
                    Taurus();
                }else if (userBirthDay > 20 && userBirthDay < 31){
                    Gemini();
                }else System.out.println("please input a correct date");
                break;
            case "06":
                if (userBirthDay < 21){
                    Gemini();
                }else if (userBirthDay > 21 && userBirthDay < 30){
                    Cancer();
                }else System.out.println("please input a correct date");
                break;
            case "07":
                if (userBirthDay < 23){
                    Cancer();
                }else if (userBirthDay > 23 && userBirthDay < 31){
                    Leo();
                }else System.out.println("please input a correct date");
                break;
            case "08":
                if (userBirthDay < 23){
                    Leo();
                }else if (userBirthDay > 23 && userBirthDay < 31){
                    Virgo();
                }else System.out.println("please input a correct date");
                break;
            case "09":
                if (userBirthDay < 23){
                    Virgo();
                }else if (userBirthDay > 23 && userBirthDay < 30){
                    Libra();
                }else System.out.println("please input a correct date");
                break;
            case "10":
                if (userBirthDay < 23){
                    Libra();
                }else if (userBirthDay > 23 && userBirthDay < 31){
                    Scorpio();
                }else System.out.println("please input a correct date");
                break;
            case "11":
                if (userBirthDay < 22 ){
                    Scorpio();
                }else if (userBirthDay > 22 && userBirthDay < 30){
                    Sagittarius();
                }else System.out.println("please input a correct date");
                break;
            case "12":
                if (userBirthDay < 22){
                    Sagittarius();
                }else if (userBirthDay > 22 && userBirthDay < 31){
                    Capricorn();
                }else System.out.println("please input a correct date");
                break;
            default:
                System.out.println("please try inputting birth month as follows 01 for JAN, 02 for FEB e.t.c");
                break;
        }

    }

    private static void Aquarius() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Aquarius, now lets tell you a little about your Zodiac sign
                Aquarius begins from (Jan 20 - Feb 18)
                it is a air sign Zodiac
                But most times mistaken for a water sign because of the Aqua prefix
                it is also Symbolized by a water bearer
                Aquarius are well known for their innovative approach, humanitarian behaviour there are more likely to sacrifice
                for the greater good and there are rebellious by nature also progressive thinkers
                """);
    }
    private static void Aries()  {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Aries, now lets tell you a little about your Zodiac sign
                Aries begins from (March 21 - April 19)
                it is a fire sign Zodiac
                it's celestial spirit animal is the ram which means there are most likely to leap first before thinking
                Aries are bold by nature there are risk takers, ambitious very direct but they are blind optimists there are singular people
                so there might somethings be misunderstood as selfish because of their (every man for them self mentality)
                they act first before they think and very direct and are most likely sports people
                """);
    }
    private static void Cancer() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Cancer, now lets tell you a little about your Zodiac sign
                Cancer begins from (June 21 - July 22)
                it is a water sign Zodiac
                it's celestial spirit animal is the carb
                Cancer's are very in tuned with their environment, they are self protective and most time misunderstood before you get to know them
                Domestically oriented, they care a lot about family, are very loyal people by nature very committed and are mostly foodie
                """);
    }
    private static void Capricorn() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Capricorn, now lets tell you a little about your Zodiac sign
                Capricorn begins from (Dec 22 - Jan 19)
                it is a earth sign Zodiac
                it's celestial spirit animal is a mythical creature the sea goat
                they are fearless, ambitious,resilient, there are not afraid of challenges and face them head on, hardworking
                there are no stranger to pain and strife, relentless they keep going no matter what quitting is not an option for them
                they are troublemakers, and are very conscious of time
                """);
    }
    private static void Gemini() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Gemini, now lets tell you a little about your Zodiac sign
                Gemini begins from (May 21 - June 20)
                it is a air sign Zodiac
                it is also Symbolized by the celestial twins most time misrepresented as two-faced
                Gemini are well known for their duality, playfulness, intellectual curiosity and their amazing communication skills
                There are wonderful thinkers and visualizers, Gemini get bored easily because of their short attention span
                """);
    }

    private static void Leo() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are leo, now lets tell you a little about your Zodiac sign
                Leo begins from (July 23 - August 22)
                it is a fire sign Zodiac
                it's celestial spirit animal is a lion
                You can find a leo anywhere there is drama they are all about the high life, very passionate they shine better in the spotlight
                They are natural leaders, they like being worshiped, courageous and loyal, consistent and dedicated
                """);
    }
    private static void Libra() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Libra, now lets tell you a little about your Zodiac sign
                Libra begins from (sep 23 - Oct 22)
                it is a water sign Zodiac
                it is symbolized by the scale which is tho only inanimate object in the zodiac they believe in balance and harmony
                There are artistic by nature so there are most likely to be artists of any kind, they have impeccable taste
                They make good partners, they are fashionistas, they are motivated by physical appearance and very indecisive
                """);
    }
    private static void Pisces() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Pisces, now lets tell you a little about your Zodiac sign
                Pisces begins from (Feb 19 - March 20)
                it is a water sign Zodiac
                it is symbolized by two fishes swimming in opposite direction which implies that their attention are most likely to be divided
                There are very emotional, and are said to have a very active imagination that make be too active for them, they tend to be delusional
                or in other words are prone to willful ignorance
                """);
    }
    private static void Sagittarius() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Sagittarius, now lets tell you a little about your Zodiac sign
                Sagittarius begins from (Nov 22 - Dec 21)
                it is a fire sign Zodiac
                it's celestial spirit animal is archer which is a half-man half-horse
                they are adventurers knowledge and thrill seekers, they are very adaptable and flexible beings
                can sometimes be misunderstood as cold because of their blunt honesty but are generally funny
                """);
    }
    private static void Scorpio() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Scorpio, now lets tell you a little about your Zodiac sign
                Scorpio begins from (Oct 23 - Nov 21)
                it is a water sign Zodiac
                it's celestial spirit animal is a scorpion
                they are very seductive by nature and are one of the most sexual zodiac, they like being in control
                and can be power hungry
                """);
    }
    private static void Taurus() {
        System.out.println("Ok " + userName + " We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Taurus, now lets tell you a little about your Zodiac sign
                Taurus begins from (April 20 - May 20)
                it is a earth sign Zodiac
                it's celestial spirit animal is the bull
                They enjoy their peace and quiet so they like peaceful environment soothing sounds and are very sensual
                They like material things, worldly pleasures, they like being pampered and are good investors and savers
                they also make good relationship partners
                """);
    }
    private static void Virgo() {
        System.out.println("Ok " + userName + "We've got your Zodiac sign drum roll please!!!!!");
        System.out.println("""
                Congratulations you are Virgo, now lets tell you a little about your Zodiac sign
                Virgo begins from (August 23 - Sep 22)
                it is a earth sign Zodiac
                it is symbolized by the goddess of wheat and agriculture
                they are very logical and practical, systematic and are also perfectionists but are kind and gentle, diligent
                consistent, supportive and are intelligent
                """);
    }
}
