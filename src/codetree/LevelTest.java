package codetree;

import java.util.Scanner;

public class LevelTest {
	
	Scanner sc = new Scanner(System.in);
	
	// a, b 두 자연수를 입력받아 a부터 b까지 3의 배수의 합을 구해 출력하는 프로그램을 작성해보세요.
	public void question1(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	// 1이상 100이하의 수로만 이루어져 있는 n * n 크기의 격자 정보가 주어집니다. 
	// 이후 (r1, c1), (r2, c2) 값이 주어졌을 때, (r1, c1) 에서 (r2, c2) 내에 있는 수들의 총합을 출력하는 프로그램을 작성해보세요.
	public void question2() {
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] num_arr = new String[n];
		
		for(int i=0; i<num_arr.length; i++) {
			num_arr[i] = sc.nextLine();
		}
		
		String r1c1 = sc.nextLine();
		String r2c2 = sc.nextLine();
		
		System.out.println("n :"+n);
		
		for(int i=0; i<n; i++) {
			System.out.println("num_arr : "+num_arr[i]);
		}
		
		System.out.println("r1c1 :"+r1c1);
		System.out.println("r2c2 :"+r2c2);
		
	}
	
	// 정수 n이 주어졌을 때, n에 따라 아래와 같은 모양을 출력하는 프로그램을 작성해보세요.
	// n이 4인 경우의 모양은 다음과 같습니다.
	// 1 2 3 4
	// 1 2 3 4
	// 1 2 3 4
	// 1 2 3 4
	public void question3() {
		int n = sc.nextInt();
		
		int[] n_arr = new int[n];
		
		String answer = "";
		
		for(int i=1; i<=n_arr.length; i++) {
			answer = answer+" "+i;
		}
		
		if(answer.startsWith(" ")) {
			answer = answer.substring(1);
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(answer);
		}
		
	}
	
	// a, b, c 세 자연수를 입력받아 a부터 b까지 c의 약수의 합을 구해 출력하는 프로그램을 작성해보세요.
	public void question4() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			if(c%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	
	// n개의 수로 이루어진 수열 a, b가 있습니다.
	// 이 때, 수열 b의 짝수번째 수들을 순서대로 출력한 뒤 수열 a의 홀수번째 수들을 순서대로 출력하는 프로그램을 작성해보세요.
	public void question5() {
		int n = sc.nextInt();
		sc.nextLine();
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = a.replace(" ", "");
		b = b.replace(" ", "");
		
		String answer = "";
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				answer = answer + " "+Character.toString(a.charAt(i));
			}
		}
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(Character.toString(a.charAt(i)))%2!=0) {
				answer = answer + " " + Character.toString(a.charAt(i));
			}
		}
		
		System.out.println(answer.substring(1));
		
	}
	
	
}
