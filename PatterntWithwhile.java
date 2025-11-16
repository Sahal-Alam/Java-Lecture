public class PatterntWithwhile {
    static void main(String[] args) {
        patternPrint();
    }
    public static void patternPrint(){
      /*  System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");*/

        int pattern = 0;
        while(pattern < 5){
            System.out.print("*");
            int i = 0;
            while (i < pattern){
                System.out.print(" *");
                i++;
            }
            pattern++;
            System.out.println();
        }
    }
}
