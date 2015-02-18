

/* IMPORTANT: class must not be public. */


//* uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;


class NextLucky2 {
	public static void main(String args[] ) throws Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String ans=" ";
		int T = Integer.parseInt(line);
		while(T-->0)
		{
			int flag=0;
			int temp=0;
			line=br.readLine();
			int l=line.length();
			for(int i=0;i<l;i++)
			{
				if((line.charAt(i)!='3')&&(line.charAt(i)!='5'))
				{
					flag=1;
					temp=i;
					break;
				}
			}
			if(flag==1){
				char a=line.charAt(0);
				if(a>'5'&&a<='9')
					for(int i=0;i<=l;i++)
					{
						System.out.print(3);	
					}
				if(a=='5')
				{
					if(line.charAt(temp)=='0'||line.charAt(temp)=='1'||line.charAt(temp)=='2')	
					{
						for(int i=0;i<temp;i++)
						{
							System.out.print(line.charAt(i));
						}
						for(int i=temp;i<l;i++)
						{
							System.out.print(3);	
						}
					}
					else if(line.charAt(temp)=='4')
					{
						for(int i=0;i<temp;i++)
						{
							System.out.print(line.charAt(i));
						}
						System.out.print(5);
						for(int i=temp+1;i<l;i++)
						{
							System.out.print(3);	
						}
					}
					else if(line.charAt(temp)>'5')
					{
						if(line.charAt(temp-1)=='3')
						{
							for(int i=0;i<temp-1;i++)
							{
								System.out.print(line.charAt(i));
							}
							System.out.print(5);
							for(int i=temp;i<l;i++)
							{
								System.out.print(3);	
							}	
						}
						else
						{
							int i;
							for( i=temp-1;i>=0;i--)
							{if(line.charAt(i)=='3')
							{
								break;
							}};
							if(i<0)
							{
								System.out.print(3);
								for(int p=0;p<l;p++)
								{
									System.out.print(3);	
								}
							}
							else
							{
								for(int j=0;j<i;j++)
								{
									System.out.print(line.charAt(j));	
								}
								System.out.print(5);
								for(int j=i+1;j<l;j++)
								{
									System.out.print(3);
								}
							}
						}	
					}	
				}
				if(a=='4')
				{
					System.out.print(5);	
					for(int i=1;i<l;i++)
					{
						System.out.print(3);
					}
				}
				if(a=='3')
				{
					if(line.charAt(temp)=='0'||line.charAt(temp)=='1'||line.charAt(temp)=='2')	
					{
						for(int i=0;i<temp;i++)
						{
							System.out.print(line.charAt(i));
						}
						for(int i=temp;i<l;i++)
						{
							System.out.print(3);	
						}
					}
					else if(line.charAt(temp)=='4')
					{
						for(int i=0;i<temp;i++)
						{
							System.out.print(line.charAt(i));
						}
						System.out.print(5);
						for(int i=temp+1;i<l;i++)
						{
							System.out.print(3);	
						}
					}
					else if(line.charAt(temp)>'5')
					{
						if(line.charAt(temp-1)=='3')
						{
							for(int i=0;i<temp-1;i++)
							{
								System.out.print(line.charAt(i));
							}
							System.out.print(5);
							for(int i=temp;i<l;i++)
							{
								System.out.print(3);	
							}	
						}
						else
						{
							int i;
							for( i=temp-1;i>=0;i--)
							{
								if(line.charAt(i)=='3')
								{
									break;	
								}
							}
							if(i<0)
							{
								System.out.print(3);
								for(int p=0;p<l;p++)
								{
									System.out.print(3);	
								}
							}
							else
							{
								for(int j=0;j<i;j++)
								{
									System.out.print(line.charAt(j));	
								}
								System.out.print(5);
								for(int j=i+1;j<l;j++)
								{
									System.out.print(3);
								}
							}
						}	
					}	
				}
				else if(a=='0'||a=='1'||a=='2')
				{
					for(int i=0;i<l;i++)	
					{	
						System.out.print(3);	
					}	
				}
				System.out.println();
			}
			else
			{
				ans="";
				int j=l-1;
				while(j>=0&&line.charAt(j)=='5')
				{
					ans='3'+ans;
					j--;
				}
				if(j==-1)
				{
					ans='3'+ans;
				}
				else{
					ans='5'+ans;
					j--;
					while(j>=0)
					{
						ans=line.charAt(j)+ans;
						j--;
					}}
				System.out.println(ans);
			}
		}
	}
}
