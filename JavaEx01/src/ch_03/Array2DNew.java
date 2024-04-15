package ch_03;

public class Array2DNew {
	public static void main(String[] args) {
		double score[][] = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
			};
		double sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
		}
		
		int n = score.length;
		int m = score[0].length;
		
		System.out.printf("4년 전체 평점 평균은 %.3f",  sum / (n*m));
	}
}
