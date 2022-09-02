import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class problem4 {
    public static String[][] allList = new String[9999][3];
    public static int listSize = 0;

    public static void main(String[] args) {
        int cmd = 100;
        String text = "";

        while (cmd != 0) {
            System.out.printf("1.전체리스트  2.등록  0.종료>");
            Scanner sc = new Scanner(System.in);
            cmd = sc.nextInt();

            if (cmd == 1){
                System.out.println("== 게시물 리스트 ==");
                System.out.printf("%4s %-20s %s %n", "no","     title"," date");
                for (int i = 0; i < listSize; i++) {
                    System.out.printf("%4d %-20s %s %n", i+1, "    "+allList[i][0], allList[i][2]);
                }
            }
            else if (cmd == 2) {
                System.out.printf("제목:");
                sc = new Scanner(System.in);
                text = sc.nextLine();
                registerTitle(text);

                System.out.printf("작성자:");
                sc = new Scanner(System.in);
                text = sc.nextLine();
                registerAuthor(text);

                System.out.println("글이 추가 되었습니다.");
            }
            else {
                continue;
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }

    public static void registerTitle(String text) {
        allList[listSize][0] = text;
    }
    public static void registerAuthor(String text) {
        allList[listSize][1] = text;

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedNow = now.format(formatter);

        allList[listSize][2] = formattedNow;
        listSize++;
    }
}
