class Diamond{
    static void printP(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printP2(int n){

        // Upper part
        for(int i = n; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for(int i = 2; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        printP(5);
        printP2(5);

        System.out.println("* * * * * * * * *");
        System.out.println("* * * *   * * * *");
        System.out.println("* * *       * * *");
        System.out.println("* *           * *");
        System.out.println("*               *");
        System.out.println("* *           * *");
        System.out.println("* * *       * * *");
        System.out.println("* * * *   * * * *");
        System.out.println("* * * * * * * * *");
  
    }
}