import java.util.Scanner;
class circle{
    public static void main(String[] args){
        double c,d;
        Scanner ac=new Scanner(System.in);
        double r=ac.nextDouble();
        c=3.14*r*r;
        d=2*3.14*r;
        System.out.println("area of circle:"+c);

        System.out.println("perimeter of circle:"+d);
    }
    
    
}
