package cathingexception;

public class Exeptest {
    public static void main(String[] args) {
//        try{
//            int a[]=new int [2];
//            System.out.println("Access element three "+ a[3]);
//
//
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception thrown: " + e);
//
//        }
//        System.out.println("out of block");



        try{
            int a = 1;
            int b = 0;

            int c= a/b;

            int d=b/a;

            //System.out.println(d);
            System.out.println(c);

        }catch (ArithmeticException e){
            System.out.println("Undefined:");
        }

    }





}
