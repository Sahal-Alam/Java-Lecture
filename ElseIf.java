public class ElseIf {
    static void main(String[] args) {
        boolean isSeniorCitizen = false;
        boolean isAdult = true;

        if (isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }
        else {
            if (isAdult){
                System.out.println("Hello Adult");
            }else {
                System.out.println("Hello child");
            }
        }
        boolean isSeniorCitizen2 = true;
        boolean isAdult2 = false;

        if (isSeniorCitizen2){
            System.out.println("Hello Senior Citizen");
        } else if (isAdult2) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Child");
        }
    }
}
