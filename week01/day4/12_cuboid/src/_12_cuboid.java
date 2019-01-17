public class _12_cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        // Surface Area: 600
        // Volume: 1000
        double a = 8;
        double b = 6;
        double c = 7;

        double volume = a * b * c;
        double surfaceArea = 2 * (a*b + b*c + a*c);

        System.out.println("The volume of the cuboid is " + volume + " cm3");
        System.out.println("The surface area of the cuboid is " + surfaceArea + " cm2");
    }
}
