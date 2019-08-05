
public class subString {

	public static void main(String[] args) {
	
		String str = "Akansha";
		String str1 = "sha";
		StringBuilder str2 = new StringBuilder();
	
		char []ch1 = str.toCharArray();
		char []ch2 = str1.toCharArray();
	
		int k = 0; int l = 0;
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(str.charAt(i)=='s')
				{
					l = i;
				}
				
				if(ch1[i]==ch2[j])
				{
					for(k=i;k<ch1.length;k++)
					{
						str2 =  str2.append(ch1[k]);
					}
				}
				else
					break;
			}
		}
		
		System.out.println("Charcter starts from"+" = "+ l);
		
		if(str1.equals(str2.toString()))
		{
			System.out.println(str1 + " is the substring of " + str);
		}

	}

}
