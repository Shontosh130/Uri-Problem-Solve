package uribeginner;
public class OneFiveSix {
    public static void main(String[] args) {
        double s,sum=0;
        for (double i =1 ; i <=39; i=i+2) {
            for (double j = 1; j <= 39; j=j*2) {
                s=i/j;
                sum=sum+s;
                System.out.printf("%.2f",sum);
                System.out.println();
            }
        }
        System.out.printf("%.2f",sum);
        System.out.println();
    }
    
}
