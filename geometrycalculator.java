import java.util.Scanner; // import scanner property
import java.lang.Math; // import math property
public class geometrycalculator{
    public static void main(String[] args){
    System.out.println("Please choose one of several options below");
    System.out.println("1 calculate the pythagorean theorem");
    System.out.println("2 calculate the area of circle");
    System.out.println("3 calculate the area of square");
    System.out.println("4 calculate the area of rectangular");
    System.out.println("5 calculate the area of trapezoid");
    System.out.println("6 calculate the area of triagle");
    System.out.println("7 calculate the volume of cube");
    System.out.println("8 calculate the volume of beam");
    System.out.println("9 calculate the volume of cone");
    System.out.println("10 calculate the volume of sphere");
    System.out.println("11 calculate the volume of cylinder");
    System.out.println("12 calculate the volume of triangular prism");
    System.out.println("13 calculate the sine of an angle");
    System.out.println("14 calculate the cosine of an angle");
    System.out.println("15 calculate the tangent of an angle");
    int option;
    Scanner x = new Scanner(System.in);
    option = x.nextInt();
    if(option == 1){
        System.out.println("Please enter two smallest sides");
        double a;
        double b;
        double c;
        a = x.nextDouble();
        b = x.nextDouble();
        c = Math.sqrt(a*a + b*b);
        System.out.println("The result is" + c);
    }
    else if(option == 2){
        System.out.println("Please enter the radius of the circle");
        double r;
        r = x.nextDouble();
        double Acircle;
        Acircle = Math.PI * r * r;
        System.out.println("The area of circle is" + Acircle);
    }
    else if(option == 3){
        System.out.println("Please enter the side length of the square");
        double s;
        s = x.nextDouble();
        double Asquare;
        Asquare = Math.pow(s,2);
        System.out.println("The area of the square is" + Asquare);
    }
    else if(option == 4){
        System.out.println("Please enter the width and length of the rectangular");
        double width;
        double length;
        width = x.nextDouble();
        length = x.nextDouble();
        double Arect;
        Arect = width * length;
        System.out.println("The area of the rectangular is" + Arect);
    }
    else if(option == 5){
        System.out.println("Please enter the upper base, lower base, and height of the trapezoid");
        double ubase;
        double lbase;
        double h;
        ubase = x.nextDouble();
        lbase = x.nextDouble();
        h = x.nextDouble();
        double Atrapezoid;
        Atrapezoid = ((ubase + lbase)/2) * h;
        System.out.println("The area of the trapezoid is" + Atrapezoid);
    }
    else if(option == 6){
        System.out.println("Please enter the base and height of the triangle");
        double base;
        double height;
        base = x.nextDouble();
        height = x.nextDouble();
        double Atriangle;
        Atriangle = (base * height)/2;
        System.out.println("The area of the triangle is" + Atriangle);
    }
    else if(option == 7){
        System.out.println("Please enter the radius of the cube");
        double radius;
        radius = x.nextDouble();
        double Vcube;
        Vcube = radius * radius * radius;
        System.out.println("The volume of the cube is Vcube" + Vcube);
    }
    else if(option == 8){
        System.out.println("Please enter the width,length,and height");
        double wBeam;
        double lBeam;
        double hBeam;
        wBeam = x.nextDouble();
        lBeam = x.nextDouble();
        hBeam = x.nextDouble();
        double Vbeam;
        Vbeam = wBeam * lBeam * hBeam;
        System.out.println("The volume of the beam is" + Vbeam);
    }
    else if(option == 9){
        System.out.println("Please enter the radius and height of the cone");
        double rCone;
        double hCone;
        rCone = x.nextDouble();
        hCone = x.nextDouble();
        double Vcone;
        Vcone = Math.PI * rCone * rCone * hCone * 1/3;
        System.out.println("The volume of the cone is" + Vcone);
    }
    else if(option == 10){
        System.out.println("Please enter the radius of the sphere");
        double rSphere;
        rSphere = x.nextDouble();
        double Vsphere;
        Vsphere = Math.PI * rSphere * rSphere * rSphere * 4/3;
        System.out.println("The volume of the sphere is" + Vsphere);
    }
    else if(option == 11){
        System.out.println("Please enter the radius and height of the cylinder");
        double rC;
        double hC;
        rC = x.nextDouble();
        hC = x.nextDouble();
        double Vcylinder;
        Vcylinder = Math.PI * rC * rC * hC;
        System.out.println("The volume of the cylinder is" + Vcylinder);
    }
    else if(option == 12){
        System.out.println("Please enter the b, h, H of the prism");
        double bP;
        double hP;
        double HP;
        bP = x.nextDouble();
        hP = x.nextDouble();
        HP = x.nextDouble();
        double Vprism;
        Vprism = bP * hP * HP * 1/2;
        System.out.println("The volume of the triangular prism is" + Vprism);
    }
    else if(option == 13){
        System.out.println("Please enter the angle that is intended to be converted to sine");
        double asine;
        asine = x.nextDouble();
        double sine;
        sine = Math.sin(asine);
        System.out.println("The angle is sine is" + sine);
    }
    else if(option == 14){
        System.out.println("Please enter the angle that is intended to be converted to cosine");
        double acosine;
        acosine = x.nextDouble();
        double cosine;
        cosine = Math.cos(acosine);
        System.out.println("The angle is cosine is" + cosine);
    }
    else if(option == 15){
        System.out.println("Please enter the angle that is intended to be converted to tangent");
        double atangent;
        atangent = x.nextDouble();
        double tangent;
        tangent = Math.tan(atangent);
        System.out.println("The angle is cosine is" + tangent);
    }
    System.out.println("Thanks for using this geometry calculator, hope you like it !");
}
}
        
        
        

   
        