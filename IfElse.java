public class IfElse {
    static void main(String[] args) {
        boolean isMale = true;
        String name = "Mim";

        System.out.println("Before if");

        if (isMale){
            System.out.println("Mr. "+name+" is male");
        }
        System.out.println("After if");
        boolean ismale2 = false;
        String name2 = "Mim";
        System.out.println("Before if");
        if (ismale2){
            System.out.println("Mr. "+name2+" is male");
        }
        else {
            System.out.println("Ms. "+name2+" is female");
        }
        {
            System.out.println("After if");
        }
    }
}
