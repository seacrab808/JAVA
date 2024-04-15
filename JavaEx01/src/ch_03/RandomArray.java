package ch_03;

public class RandomArray {
	// 2차원 정수 배열 선언
	// intArray에 3x4 정수 배열 생성
	// 12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
	// 행 번호
	// 열 번호
	// 0~9 랜덤 정수
	
	// 3x4 배열을 출력한다.
	// length를 이용하라
	// length를 이용하라.
	// 원소 [i][j] 출력
	//다음 줄로 넘어감
	
	// 3x4 배열의 합을 구하여 출력한다.
	
	// 3개의 각 행에 대해 반복
	// for 구문 사용
	// 합 누적하기
	// i 변수 증가
	// 합은

	public static void main(String[] args) {
		int intArray[][];
		intArray = new int[3][4];
		for(int i = 0; i < 3; i++)
			for (int j =0 ; j < 4; j++)
				intArray[i][j] = (int)(Math.random() * 10);
		
		for(int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println();
		}
			
		int i = 0, sum = 0;
		while(i < 3)
		{
			for(int j = 0; j < 4; j++)
				sum += intArray[i][j];
			i++;
		}
		
		System.out.println("합은 : " + sum);
	}
}
