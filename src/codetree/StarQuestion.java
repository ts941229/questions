package codetree;

import java.util.Scanner;

public class StarQuestion {
	
	Scanner sc = new Scanner(System.in);
	
	// 정수 n의 값을 입력받아 별표로 정사각형을 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star1() {
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	// 정수 n과 m의 값을 입력받아 별표로 이루어진 직사각형을 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star2() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 정수 n이 주어졌을 때, 다음과 같은 형식으로 * 로 이루어진 n x n 크기의 정사각형을 두 개 출력합니다.
	public void star3() {
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	// 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star4() {
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	// 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star5() {
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star6() {
		int n = sc.nextInt();
		int m = n;
		for(int i=0; i<n; i++) {
			
			for(int j=n; j>i; j--) {
				
				for(int k=0; k<m; k++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			m--;
		}
	}
	
	// 정수 n이 주어졌을 때, 아래 예를 참고하여 * 로 이루어진 직각삼각형을 출력하는 프로그램을 작성해보세요.
	public void star7() {
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			printStar((2*i)-1);
		}
	}
	public void printStar(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void star7_review() {
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int cnt = (i*2)-1;
			for(int j=1; j<=cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star8() {
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++) {
			
			for(int j=0; j<1+i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	// 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
	public void star9() {
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
}
