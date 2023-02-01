import java.util.Scanner;
public class Popeye {

    public static void main(String[] args) {

        Scanner distance = new Scanner(System.in);
        System.out.println("Enter the distance to travel in nautical miles: ");
        double nauticalmiles = distance.nextDouble();
        System.out.println("Enter the top speed of the boat in knots: ");
        double ktopspeed = distance.nextDouble();
        System.out.println("Enter the average speed of the boat in knots: ");
        double kavgspeed = distance.nextDouble();
        double regularmiles = nauticalmiles * 1.1508;
        double bestcasetime = nauticalmiles / ktopspeed;
        double avgtime = nauticalmiles / kavgspeed;

        System.out.println("\nThe distance to travel in regular miles is: " + regularmiles + " miles" + "\nThe best case travel time is: " + bestcasetime + " hours at " + ktopspeed + " knots" + "\nThe average case travel time is: " + avgtime + " hours at " + kavgspeed + " knots");


    }



}

