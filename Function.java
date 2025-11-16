public class Function {
    static void main(String[] args) {
//        greeting();
        rightHalfPyramid();
        reverseRightHalfPyramid();
        reverseLeftHalfPyramid();
        leftHalfPyramid();

    }
    public static void rightHalfPyramid(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
    public static void reverseRightHalfPyramid(){
        System.out.println("* * * * *");
        System.out.println("* * * * ");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.println("* ");
    }
    public static void reverseLeftHalfPyramid(){
        System.out.println("* * * * *");
        System.out.println("  * * * *");
        System.out.println("    * * *");
        System.out.println("      * *");
        System.out.println("        *");
    }
    public static void leftHalfPyramid(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
    public static void greeting(){
        System.out.println("Good morning");
    }
}
