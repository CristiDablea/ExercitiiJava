public class PrimaMeaClasa {

    public static void main(String[] args) {

        if (20 > 18) {
            System.out.println("20 este mai mare decat 18");
        }

        int x = 30;
        int y = 28;
        if (x > y) {
            System.out.println("x este mai mare decat y");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Buna dimineata!");
        } else if (time < 20) {
            System.out.println("Buna ziua!");
        } else {
            System.out.println("Buna seara!");
        }
// Afiseaza "Buna seara!"

        int ceas = 17;
        String rezultat = (ceas < 18) ? "Buna ziua!" : "Buna seara!";
        System.out.println(rezultat);

        int ziua = 4;
        switch (ziua) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
        }
// Afiseaza "Joi" (ziua 4)

        int day = 3;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Asteptam weekendul!");
        }
// Afiseaza "Looking forward to the weekend!"

    }

}
