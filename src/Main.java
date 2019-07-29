import java.util.Scanner;

public class Main {
    public static void triangle(int side1, int side2, int side3) throws IllegalTriangleExeption {
        if(side1<=0|| side2<=0 ||side3<=0){
            throw new IllegalTriangleExeption("Invalid side - smaller than zero");
        }else if(side1+side2<=side3|| side1+side3<=side2||side2+side3<=side1){
            throw new IllegalTriangleExeption("Not a triangle");
        }else{
            System.out.println("Chu vi tam giac la: "+ (side1+side2+side3));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 triangle sides!");
        System.out.print("Length of first side: ");
        int side1 = input.nextInt();
        System.out.print("Length of second side: ");
        int side2=input.nextInt();
        System.out.println("Length of third side: ");
        int side3=input.nextInt();
        try {
            triangle(side1,side2,side3);
        } catch (IllegalTriangleExeption e){
            System.out.println(e.getString());
        }

    }

}
