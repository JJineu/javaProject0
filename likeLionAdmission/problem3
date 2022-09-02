import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        System.out.print("금액을 넣으세요:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] money_type = {50000,10000,5000,1000,500,100,50,10};

        for (int j = 0; j < money_type.length; j++) {
            int cnt = 0;
            while (money/money_type[j] > 0){
                money -= money_type[j];
                cnt++;
            }
            System.out.println(money_type[j]+"원"+cnt+"개");
        }
    }
}
