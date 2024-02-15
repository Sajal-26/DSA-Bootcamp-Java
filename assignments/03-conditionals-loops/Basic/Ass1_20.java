import java.util.*;
class Area{
    public double circle(int r){
        return Math.PI*r*r;
    }
    public double triangle(int b, int h){
        return 0.5*b*h;
    }
    public double rectangle(int l, int b){
        return l*b;
    }
    public double eqtri(int s){
        return (Math.sqrt(3)/4)*(s*s);
    }
}

class Perimeter{
    public double circle(int r){
        return 2*Math.PI*r;
    }
    public double eqtri(int s){
        return 3*s;
    }
    public double rectangle(int l, int b){
        return 2*(l+b);
    }
    public double square(int s){
        return 4*s;
    }
}

class Volume{
    public double cone(int r, int h){
        return (1/3)*Math.PI*r*r*h;
    }
    public double prism(int h, int b, int i){
        return 0.5*b*h*i;
    }
    public double cylender(int r, int h){
        return Math.PI*r*r*h;
    }
    public double sphere(int r){
        return (4/3)*Math.PI*r*r*r;
    }
    public double pyramid(int b, int h){
        return (1/3)*b*h;
    }
}

class SurfaceArea{
    public double cylender(int r, int h){
        return 2*Math.PI*r*h;
    }
    public double cube(int s){
        return 6*s*s;
    }
}

public class Ass1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area\n2. Perimeter\n3. Volume\n4. Surface Area\nEnter : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                Area a = new Area();
                System.out.print("1. Area Of Circle\r\n" + //
                                "2. Area Of Triangle\r\n" + //
                                "3. Area Of Rectangle Program \r\n" + //
                                "4. Area Of Isosceles Triangle \r\n" + //
                                "5. Area Of Parallelogram\r\n" + //
                                "6. Area Of Rhombus\r\n" + //
                                "7. Area Of Equilateral Triangle\r\n" + //
                                "Enter : ");
                int c1 = sc.nextInt();
                switch(c1){
                    case 1:
                        System.out.print("Radius : ");
                        System.out.println(a.circle(sc.nextInt()));
                        break;
                    case 2:
                        System.out.print("Base and Height : " );
                        System.out.println(a.triangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 3:
                        System.out.println("Length and Bredth : ");
                        System.out.println(a.rectangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 4:
                        System.out.print("Base and Height : " );
                        System.out.println(a.triangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 5:
                        System.out.print("Base and Height : " );
                        System.out.println(a.rectangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 6:
                        System.out.print("Diagonals : ");
                        System.out.println(a.triangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 7:
                        System.out.print("Enter the side : ");
                        System.out.println(a.eqtri(sc.nextInt()));
                        break;
                    default:
                        System.out.println("Wrong output!");
                }
                break;
            case 2:
                Perimeter p = new Perimeter();
                System.out.print("1. Perimeter Of Circle\r\n" + //
                                "2. Perimeter Of Equilateral Triangle\r\n" + //
                                "3. Perimeter Of Parallelogram\r\n" + //
                                "4. Perimeter Of Rectangle\r\n" + //
                                "5. Perimeter Of Square\r\n" + //
                                "6. Perimeter Of Rhombus\r\n" + //
                                "Enter : ");
                int c2 = sc.nextInt();
                switch(c2){
                    case 1:
                        System.out.print("Radius : ");
                        System.out.println(p.circle(sc.nextInt()));
                        break;
                    case 2:
                        System.out.println("Side : ");
                        System.out.println(p.eqtri(sc.nextInt()));
                        break;
                    case 3:
                        System.out.println("Length and Bredth : ");
                        System.out.println(p.rectangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 4:
                        System.out.println("Length and Bredth : ");
                        System.out.println(p.rectangle(sc.nextInt(), sc.nextInt()));
                        break;
                    case 5:
                        System.out.println("Side : ");
                        System.out.println(p.square(sc.nextInt()));
                        break;
                    case 6:
                        System.out.println("Side : ");
                        System.out.println(p.square(sc.nextInt()));
                        break;
                    default:
                        System.out.println("Wrong Choice!");
                }
                break;
            case 3:
                Volume v = new Volume();
                System.out.print("1. Volume Of Cone\r\n" + //
                                "2. Volume Of Prism\r\n" + //
                                "3. Volume Of Cylinder\r\n" + //
                                "4. Volume Of Sphere\r\n" + //
                                "5. Volume Of Pyramid\r\n" + //
                                "Enter : ");
                int c3 = sc.nextInt();
                switch(c3){
                    case 1:
                        System.out.print("Radius and Height : ");
                        System.out.println(v.cone(sc.nextInt(), sc.nextInt()));
                        break;
                    case 2:
                        System.out.print("Base, Height and Length");
                        System.out.println(v.prism(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                        break;
                    case 3:
                        System.out.print("Radius and Height : ");
                        System.out.println(v.cylender(sc.nextInt(), sc.nextInt()));
                        break;
                    case 4:
                        System.out.print("Radius : ");
                        System.out.println(v.sphere(sc.nextInt()));
                        break;
                    case 5:
                        System.out.print("Base and height");
                        System.out.println(v.pyramid(sc.nextInt(), sc.nextInt()));
                        break;
                    default:
                        System.out.println("Wrong Choice!");
                }
                break;
            case 4:
                SurfaceArea sa = new SurfaceArea();
                System.out.print("1. Curved Surface Area Of Cylinder\r\n" + //
                                "2. Total Surface Area Of Cube\r\n" + //
                                "Enter : ");
                int c4 = sc.nextInt();
                switch(c4){
                    case 1:
                        System.out.print("Radius and Height : ");
                        System.out.println(sa.cylender(sc.nextInt(), sc.nextInt()));
                        break;
                    case 2:
                        System.out.print("Side : ");
                        System.out.println(sa.cube(sc.nextInt()));
                        break;
                    default:
                        System.out.println("Wrong Choice!");
                }
                break;
            default:
                System.out.println("Wrong Choice!");
        }
        sc.close();
    }
}
