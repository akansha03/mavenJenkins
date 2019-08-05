
public class subString1 {

	public static void main(String[] args) {
	
		String str = "Akansha";
		String str1 = "sha";
		StringBuilder str2 = new StringBuilder();
	
		char []ch1 = str.toCharArray();
		char []ch2 = str1.toCharArray();
		char []ch3 = {};
		int k = 0;
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					for(k=i;k<ch1.length;k++)
					{
						System.out.println("Index is :" + k);
						str2 =  str2.append(ch1[k]);
					}
				}
				else
					break;
			}
		}
		
		if(str1.equals(str2.toString()))
		{
			System.out.println(str1 + " is the substring of " + str);
		}

	}

}
