/**
 * Program which shows an example of a method from teh textbook chapter five section two
 * @author(Isaiah Magana)
 * Main.java
 */

public class Main {
    /**
     * Computes the volume of a cube
     * @param sideLength the sidelength of the cube
     * @return the volume of the cube
     */
    public static double cubeVolume(double sideLength) {
        double volume = sideLength * sideLength * sideLength;
        return (volume);
    }
    /**
     * Main method to run program
     */
    public static void main(String[] args) {
        double sideLength = 12.5;
        double cubeOne = cubeVolume(sideLength);
        System.out.println("The volume of a cube with a side-length of " + sideLength + " is " + cubeOne);
    }
}