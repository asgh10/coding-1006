import java.util.Scanner;

class Car{
	private int num;
	private double gas;

	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸겠습니다");
	}
	public void show() {
		System.out.println("차향 번호는 " + num + "입니다");
		System.out.println("연료량은 " + gas + "입니다");
	}
}

public class Code72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("정수를 2개 입력 하시오");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1 + "와(과) " + num2 + " 중에서 큰 쪽은 " + ans + "입니다");
		*/
		
		
		
		Car[] cars;
		cars = new Car[3];
		
		for(int i = 0; i<cars.length; i++) {
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for(int i = 0; i<cars.length; i++) {
			cars[i].show();
		}
	}

}
