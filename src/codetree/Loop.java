package codetree;

import java.util.Scanner;

public class Loop {
	
	Scanner sc = new Scanner(System.in);
	
	// 두 정수 a와 b가 주어지면 a이상 b이하의 홀수를 모두 오름차순으로 출력하는 프로그램을 작성해보세요.
	public void loop1() {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String answer = "";
		
		for(int i=a; i<=b; i++) {
			if(i%2!=0) {
				answer = answer + " " + i;
			}
		}
		System.out.println(answer.substring(1));
		
	}
	
	// 두 정수 b와 a가 주어지면 a이상 b이하의 홀수를 모두 내림차순으로 출력하는 프로그램을 작성해보세요.
	public void loop2() {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i>=b; i-=2) {
			
			System.out.print(i+" ");
			
		}
	}

	// 정수 n이 주어지면 *을 n개의 줄에 걸쳐 한 줄에 하나씩 출력하는 프로그램을 작성해보세요.
	// 단, while 문을 사용하여 해결해봅니다.
	public void loop3() {
		int n = sc.nextInt();
		while(n>0) {
			System.out.println("*");
			n--;
		}
	}
	
	//	정수 a, b이 주어졌을 때, a부터 b까지의 자연수중 짝수만 출력하는 프로그램을 작성해보세요.
	//	단, while문을 사용하여 해결해봅니다.
	public void loop4() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(b>=a) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
	}

	//	두 정수 b와 a가 주어지면 a이상 b이하의 짝수를 모두 내림차순으로 출력하는 프로그램을 작성해보세요.
	//	단, while문을 사용하여 해결해봅니다.
	public void loop5() {
		int b = sc.nextInt();
		int a = sc.nextInt();
		
		while(a<=b) {
			System.out.print(b+" ");
			b-=2;
		}
	}

	//	두 자연수 a, b를 입력받아 a / b 결과를 소수점 20째자리까지 출력하는 프로그램을 작성해보세요.
	public void loop6() {
		double a = sc.nextInt();
		double b = sc.nextInt();
		double result = a/b;
		System.out.printf("%.20f", result);
	}
	
	
	//	정수 a, n이 주어졌을 때, a에 n을 더하는 과정을 n번 반복하려고 합니다.
	//	각 연산 결과값을 순서대로 출력하는 프로그램을 작성해보세요.
	public void loop7() {
		int a = sc.nextInt();
		int n = sc.nextInt();
		int sum = a+n;
		for(int i=0; i<n; i++) {
			System.out.println(sum);
			sum+=n;
		}
		
	}
	
	//	두 정수 a와 b를 입력받아, a가 자연수라면 a를 b번 반복하여 출력하는 프로그램을 작성해보세요.
	public void loop8() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>0) {
			for(int i=0; i<b; i++) {
				System.out.print(a);
			}
		}else {
			System.out.println(0);
		}
		
	}

	// 정수 a부터 b까지 숫자를 출력하는 프로그램을 작성해보세요. a에서 시작하여 조건에 맞춰 수를 변경하다 b보다 커지는 순간에 종료해야 합니다. 숫자가 바뀌는 조건은 다음과 같습니다.
	// 숫자가 홀수인 경우에는 2배가 됩니다.
	// 숫자가 짝수인 경우에는 3만큼 증가합니다.
	public void loop9() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		while(a<=b) {
//		
//			if(a%2!=0 && a<=b) {
//				System.out.print(a+" ");
//				a = a*2;
//			}
//			
//			if(a%2==0 && a<=b) {
//				System.out.print(a+" ");
//				a = a+3;
//			}
//			
//		}
		
		while(a<=b) {
			
			System.out.print(a+" ");
			if(a%2!=0) {
				a = a*2;
			}else {
				a = a+3;
			}
		}
	}
	
	// 자연수 n을 입력받아 1부터 n까지 369 게임을 진행했을 때의 결과를 출력하는 프로그램을 작성해보세요.
	// 369 게임에서는 숫자가 3의 배수이거나 숫자에 3, 6, 9 중 하나라도 들어가있는 경우에는 0을 출력하고,
	// 그렇지 않다면 해당 숫자를 그대로 출력합니다.
	public void loop10() {
		int n = sc.nextInt();
		int a = 0;
		
		String tr =  "";
		
		for(int i=1; i<=n; i++) {
			a = i;
			if(i%3==0) {
				a = 0;
			}
			if(i>=10) {
				tr = i+"";
				if(Integer.parseInt(tr.substring(1))!=0) {
					if(Integer.parseInt(tr.substring(1))%3==0 || Integer.parseInt(Character.toString(tr.charAt(0)))%3==0) {
						a = 0;
					}
				}
			}
			System.out.print(a+" ");
		}
	}
	
	//	n개의 정수가 주어졌을 때, 주어진 숫자 중 홀수이면서 3의 배수인 수들만 순서대로 출력하는 프로그램을 작성해보세요.
	public void loop11() {
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0 && arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	// 0일을 기점으로 2일마다 교실 청소를, 3일마다 복도 청소를, 12일마다 화장실 청소를 합니다.
	// 날짜가 겹치는 날에는 주기가 더 긴 것을 하기로 했습니다.
	// n일간 진행했을 때 각 장소의 청소 횟수를 차례로 출력하는 프로그램을 작성해주세요.
	// 단, 시작 날인 0일에는 청소를 진행하지 않습니다.
	public void loop12() {
		
		int n = sc.nextInt();
		
		int cr = 0;
		int ha = 0;
		int br = 0;
		
		
		for(int i=1; i<=n; i++) {
			
			if(i%12==0) {
				br++;
			}else if(i%3==0) {
				ha++;
			}else if(i%2==0) {
				cr++;
			}
			
		}
		
		System.out.println(cr+" "+ha+" "+br);
		
	}
	
	
	//	n이 주어지면 1년부터 n년까지 윤년이 총 몇 번 있었는지를 구하는 프로그램을 작성해보세요. 윤년일 조건은 다음과 같습니다.
	//	4의 배수라면 윤년입니다.
	//	4의 배수이면서 100의 배수라면 윤년이 아닙니다.
	//	4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년입니다.
	//	나머지 경우에는 윤년이 아닙니다.
	public void loop13() {
		
		
		
	}
	
	
	
}
