package ToBeTested;

public class Books {
	
public Books() {
}

	public int numBooks(int[]numberOfBooks) {
		int answer = 0;
		int max = 5;
		int min = 1;
		
		if(numberOfBooks.length<= max || numberOfBooks.length >= min) {
			System.out.println(numberOfBooks.length);
			answer = numberOfBooks.length;
		}
		System.out.println(answer);
		return answer;
	}
}