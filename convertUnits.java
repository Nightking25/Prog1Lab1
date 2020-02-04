public class convertUnits {

    public static void main(String[] args) {
        double distanceInMeters, distanceInFeet;
        final double factor = 3.28084;

        distanceInMeters =  5;
        distanceInFeet = factor * distanceInMeters;

        System.out.println("\n" + distanceInMeters + " meters is equal to "
                            + distanceInFeet + " feet.");
    }
}
