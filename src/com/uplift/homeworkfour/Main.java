package com.uplift.homeworkfour;

import java.util.Scanner;
import com.uplift.homeworkfour.twodim.*;
import com.uplift.homeworkfour.threedim.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("                                                      ");
            System.out.println("=========================================================");
            System.out.println("Select a shape:");
            System.out.println("(1) Circle");
            System.out.println("(2) Square");
            System.out.println("(3) Triangle");
            System.out.println("(4) Sphere");
            System.out.println("(5) Cylinder");
            System.out.println("(6) Cube");
            System.out.println("(7) Cone");
            System.out.println("(8) Exit");
            System.out.println("=========================================================");
            System.out.println("                                                          ");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int shapechoice = scanner.nextInt();
                if (shapechoice == 8) {
                    System.out.println("Thank you for using this application! Goodbye!");
                    break;

                }

                switch (shapechoice) {
                    case 1:
                        System.out.println("=========================================================");
                        System.out.println("Select what you would like to calculate for: ");
                        System.out.println("(1) Area");
                        System.out.println("(2) Perimeter");
                        System.out.println("=========================================================");
                        System.out.print("Enter your choice: ");
                        int circlechoice = scanner.nextInt();
                        if (circlechoice == 1) {
                            System.out.println("Calculating the area of a circle...");
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Circle circle = new Circle(radius);
                            double area = circle.calculateArea();
                            System.out.printf("The area of a circle with a radius of %.2f is %.2f", radius, area);

                        } else if (circlechoice == 2) {
                            System.out.println("Calculating the perimeter of a circle...");
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Circle circle = new Circle(radius);
                            double perimeter = circle.calculatePerimeter();
                            System.out.printf("The perimeter of a circle with a radius of %.2f is %.2f", radius, perimeter);
                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                        break;

                    case 2:
                        System.out.println("========================================================");
                        System.out.println("Select what you would like to calculate for: ");
                        System.out.println("(1) Area");
                        System.out.println("(2) Perimeter");
                        System.out.println("=======================================================");
                        System.out.print("Enter your choice: ");
                        int squarechoice = scanner.nextInt();
                        if (squarechoice == 1) {
                            System.out.println("Calculating the area of a square...");
                            System.out.print("Enter side length: ");
                            double side = scanner.nextDouble();
                            Square square = new Square(side);
                            double area = square.calculateArea();
                            System.out.printf("The area of a square with a side length of %.2f is %.2f", side, area);
                        } else if (squarechoice == 2) {
                            System.out.println("Calculating the perimeter of a square...");
                            System.out.print("Enter side length: ");
                            double side = scanner.nextDouble();
                            Square square = new Square(side);
                            double perimeter = square.calculatePerimeter();
                            System.out.printf("The perimeter of a square with a side length of %.2f is %.2f", side, perimeter);
                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                        break;


                        case 3:
                            System.out.println("========================================================");
                            System.out.println("Select what you would like to calculate for: ");
                            System.out.println("(1) Area");
                            System.out.println("(2) Perimeter");
                            System.out.println("=======================================================");
                            System.out.print("Enter your choice: ");
                            int trianglechoice = scanner.nextInt();
                            if (trianglechoice == 1) {
                                System.out.println("Calculating the area of a triangle...");
                                System.out.print("Enter height: ");
                                double height = scanner.nextDouble();
                                System.out.print("Enter base: ");
                                double base = scanner.nextDouble();
                                Triangle triangle = new Triangle(height,base);
                                double area = triangle.calculateArea();
                                System.out.printf("The area of a triangle with a height of %.2f and a base length of %.2f is %.2f", height,base,area);
                            } else if (trianglechoice == 2) {
                                System.out.println("Calculating the perimeter of a triangle...");
                                System.out.print("Enter side length 1: ");
                                double side1 = scanner.nextDouble();
                                System.out.print("Enter side length 2: ");
                                double side2 = scanner.nextDouble();
                                System.out.print("Enter side length 3: ");
                                double side3 = scanner.nextDouble();
                                Triangle triangle = new Triangle(side1,side2,side3);
                                double perimeter = triangle.calculatePerimeter();
                                System.out.printf("The perimeter of a triangle with side lengths of %.2f, %.2f, and %.2f is %.2f", side1, side2, side3, perimeter);
                            } else {
                                System.out.println("Invalid choice. Try again.");
                            }
                            break;

                    case 4:
                        System.out.println("========================================================");
                        System.out.println("Select what you would like to calculate for: ");
                        System.out.println("(1) Area");
                        System.out.println("(2) Volume");
                        System.out.println("=======================================================");
                        System.out.print("Enter your choice: ");
                        int spherechoice = scanner.nextInt();
                        if (spherechoice == 1) {
                            System.out.println("Calculating the area of a sphere...");
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Sphere sphere = new Sphere(radius);
                            double area = sphere.calculateArea();
                            System.out.printf("The area of a sphere with a radius of %.2f is %.2f", radius, area);
                        } else if (spherechoice == 2) {
                            System.out.println("Calculating the volume of a sphere...");
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Sphere sphere = new Sphere(radius);
                            double volume = sphere.calculateVolume();
                            System.out.printf("The volume of a sphere with a radius of %.2f is %.2f", radius, volume);

                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                        break;

                        case 5:
                            System.out.println("========================================================");
                            System.out.println("Select what you would like to calculate for: ");
                            System.out.println("(1) Area");
                            System.out.println("(2) Volume");
                            System.out.println("=======================================================");
                            System.out.print("Enter your choice: ");
                            int cylinderchoice = scanner.nextInt();
                            if (cylinderchoice == 1) {
                                System.out.println("Calculating the area of a cylinder...");
                                System.out.print("Enter radius: ");
                                double radius = scanner.nextDouble();
                                System.out.print("Enter height: ");
                                double height = scanner.nextDouble();
                                Cylinder cylinder = new Cylinder(radius,height);
                                double area =  cylinder.calculateArea();
                                System.out.printf("The area of a cylinder with a radius of %.2f and a height of %.2f is %.2f", radius, height, area);
                            } else if (cylinderchoice == 2) {
                                System.out.println("Calculating the volume of a cylinder...");
                                System.out.print("Enter radius: ");
                                double radius = scanner.nextDouble();
                                System.out.print("Enter height: ");
                                double height = scanner.nextDouble();
                                Cylinder cylinder = new Cylinder(radius,height);
                                double volume =  cylinder.calculateVolume();
                                System.out.printf("The volume of a cylinder with a radius of %.2f and a height of %.2f is %.2f", radius, height, volume);
                            } else {
                                System.out.println("Invalid choice. Try again.");
                            }
                            break;

                            case 6:
                                System.out.println("========================================================");
                                System.out.println("Select what you would like to calculate for: ");
                                System.out.println("(1) Area");
                                System.out.println("(2) Volume");
                                System.out.println("=======================================================");
                                System.out.print("Enter your choice: ");
                                int cubechoice = scanner.nextInt();
                                if (cubechoice == 1) {
                                    System.out.println("Calculating the area of a cube...");
                                    System.out.print("Enter side length: ");
                                    double side = scanner.nextDouble();
                                    Cube cube = new Cube(side);
                                    double area =  cube.calculateArea();
                                    System.out.printf("The area of a cube with a side length of %.2f is %.2f",side,area);

                                } else if (cubechoice == 2) {
                                    System.out.println("Calculating the volume of a cube...");
                                    System.out.print("Enter side length: ");
                                    double side = scanner.nextDouble();
                                    Cube cube = new Cube(side);
                                    double volume =  cube.calculateVolume();
                                    System.out.printf("The volume of a cube with a side length of %.2f is %.2f",side,volume);
                                } else {
                                    System.out.println("Invalid choice. Try again.");
                                }
                                break;

                                case 7:
                                    System.out.println("========================================================");
                                    System.out.println("Select what you would like to calculate for: ");
                                    System.out.println("(1) Area");
                                    System.out.println("(2) Volume");
                                    System.out.println("=======================================================");
                                    System.out.print("Enter your choice: ");
                                    int conechoice = scanner.nextInt();
                                    if (conechoice == 1) {
                                        System.out.println("Calculating the area of a cone...");
                                        System.out.print("Enter radius: ");
                                        double radius = scanner.nextDouble();
                                        System.out.print("Enter height: ");
                                        double height = scanner.nextDouble();
                                        Cone cone = new Cone(radius,height);
                                        double area = cone.calculateArea();
                                        System.out.printf("The area of a cone with a radius of %.2f and a height of %.2f is %.2f", radius, height, area);
                                    } else if (conechoice == 2) {
                                        System.out.println("Calculating the volume of a cone...");
                                        System.out.print("Enter radius: ");
                                        double radius = scanner.nextDouble();
                                        System.out.print("Enter height: ");
                                        double height = scanner.nextDouble();
                                        Cone cone = new Cone(radius,height);
                                        double volume =  cone.calculateVolume();
                                        System.out.printf("The volume of a cone with a radius of %.2f and a height of %.2f is %.2f", radius, height, volume);
                                    } else {
                                        System.out.println("Invalid choice. Try again.");
                                    }
                                    break;



                }
            } else {
                System.out.println("Invalid choice. Try again.");
                scanner.next();
            }

        }
        scanner.close();
    }

}