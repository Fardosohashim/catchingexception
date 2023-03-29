package cathingexception;

public class ThrowingUncheckedException {
    public static void Validate(int age){
        if(age<18){

            throw new ArithmeticException("person is not eligible to vote: ");

        }else{
            System.out.println("person is eligible to vote! ");
        }

    }
    public static void main(String[] args) {
        Validate(18);
        System.out.println("rest of the code ");

    }
}
