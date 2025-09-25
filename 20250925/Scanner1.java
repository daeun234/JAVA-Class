import java.util.Scanner;

public class Scanner1 {  
         public static void main(String[] args) {

        //Scanner 객체 생성하기
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 자기소개 프로그램 ==="); 
        System.out.print("이름을 입력하세요: ");
        
        String name = scanner.nextLine();  // 변수명을 name으로 변경

        // 나이 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 키 입력받기
        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        // 결과 출력하기
        System.out.println("\n=== 당신의 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");

        // 인사말
        System.out.println("\n안녕하세요, " + name + "님! 반갑습니다! 🎉");


        add_method(scanner);
        circle_area_circumference(scanner);

        //Scanner 객체 닫기
        scanner.close();

        
     }
     
   public static void add_method(Scanner scanner1){
      int result;
      System.out.print("첫번째 숫자를 입력하세요: ");
        int number1 = scanner1.nextInt();
        
        System.out.print("두번째 숫자를 입력하세요: ");
        int number2 = scanner1.nextInt();
        result = number1 + number2;

        System.out.println("\n=== 간단한 덧셈 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
   }

     public static void circle_area_circumference(Scanner scanner1) {
        
        System.out.print("반지름을 입력하세요: ");
        double radius = scanner1.nextDouble();
        double arear = radius * radius * Math.PI;
        double circumference = 2.0 * Math.PI *&radius;

       System.out.println("\n=== 원의 면적과 원의 길이 계산 ===");
      }
}


       