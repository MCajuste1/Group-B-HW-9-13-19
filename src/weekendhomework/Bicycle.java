package weekendhomework;

public class Bicycle {
    public int cadence;
    public int gear;
    public double speed;


    public Bicycle(int cadence, int gear, double speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;

    }

    public void applyBrake(double x) {
        if (x < speed) {
            speed = speed - x;
            System.out.println(speed);
        } else {
            System.out.println("You would stop");
        }
    }

    public void speedUp (double z ){
        if( z > 0) {
            speed = speed + z;
            System.out.println(speed);
            } else {
            System.out.println("invalid speed");
        }



    }
}


