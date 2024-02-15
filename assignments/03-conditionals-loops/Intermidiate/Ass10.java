import java.util.*;
public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int n = sc.nextInt();
        double gradesum = 0, sumhours = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the grade for subject "+(i+1)+" : ");
            String grade = sc.next();
            if(grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("A+")){
                gradesum += 4*Math.ceil(4);
                sumhours += Math.ceil(4);
            }
            else if(grade.equalsIgnoreCase("A-")){
                gradesum += 3.7*Math.ceil(3.7);
                sumhours += Math.ceil(3.7);
            }
            else if(grade.equalsIgnoreCase("B+")){
                gradesum += 3.3*Math.ceil(3.3);
                sumhours += Math.ceil(3.3);
            }
            else if(grade.equalsIgnoreCase("B")){
                gradesum += 3*Math.ceil(3);
                sumhours += Math.ceil(3);
            }
            else if(grade.equalsIgnoreCase("B-")){
                gradesum += 2.7*Math.ceil(2.7);
                sumhours += Math.ceil(2.7);
            }
            else if(grade.equalsIgnoreCase("C+")){
                gradesum += 2.3*Math.ceil(2.3);
                sumhours += Math.ceil(2.3);
            }
            else if(grade.equalsIgnoreCase("C")){
                gradesum += 2*Math.ceil(2);
                sumhours += Math.ceil(2);
            }
            else if(grade.equalsIgnoreCase("C-")){
                gradesum += 1.7*Math.ceil(1.7);
                sumhours += Math.ceil(1.7);
            }
            else if(grade.equalsIgnoreCase("D")){
                gradesum += 1*Math.ceil(1);
                sumhours += Math.ceil(1);
            }
            else if(grade.equalsIgnoreCase("F")){
                gradesum += 0*Math.ceil(0);
                sumhours += Math.ceil(0);
            }
        }
        System.out.printf("CGPA : %.2f\n",(gradesum/sumhours));
        sc.close();
    }
}
