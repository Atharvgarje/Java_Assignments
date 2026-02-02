package assignment.week1;

public class CompressString {
	
	public static void main(String[] args) {
		String input="aaabbcccdd";
		
		StringBuilder compressed= new StringBuilder();
		int count=1;
		
		for(int i=0;i<input.length();i++)
		{
			if(i+1<input.length() && input.charAt(i)== input.charAt(i+1))
			{
				count++;
			}
			else
			{
				compressed.append(input.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(compressed);
		
	}

}
