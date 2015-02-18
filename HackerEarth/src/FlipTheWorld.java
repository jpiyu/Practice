

import java.io.*;

class FlipTheWorld {
	private static PrintStream logger = System.out;
	public static void main(String[] args) throws IOException{

		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			Integer totalTestCases= Integer.parseInt(br.readLine());
			while(totalTestCases-- > 0){
				int[] rowcols = split(br.readLine(),2,false);
				int row = rowcols[0];int cols = rowcols[1];
				int matrix[][] = new int[row][cols];
				for(int i=0;i<row;i++){//populate the matrix values
					matrix[i] = split(br.readLine(),cols,true);
				}
				int minmoves = 0;
				//1. Traverse from southeast corner
				for(int i=row-1;i>=0;i--){
					for(int j=cols-1;j>=0;j--){
						if(matrix[i][j] == 0){ //2. indulge in flipping only if zero is found
							for(int tx=0;tx<=i;tx++){
								for(int ty=0;ty<=j;ty++){
									matrix[tx][ty] = (matrix[tx][ty] == 1)?0:1; //3. alright! flip now
								}
							}
							minmoves++; //4. Oh, count the flips
						}
					}
				}
				log(minmoves);
			}
		}finally{
			if(br!=null)
				br.close();
		}
	}
	private static int[] split(String value,int noofsplits, boolean isdigit){
		int[] splitValue = new int[0];
		if(value != null){
			String[] splits = !isdigit ? value.split(" ",noofsplits): value.split("(?!^)");
			if(splits.length == noofsplits){
				splitValue = new int[noofsplits];
				int i=0;
				for(String split:splits){
					splitValue[i++] = Integer.parseInt(split.trim());
				}
			}
		}
		return splitValue;
	}
	private static void log(final Object c){
		logger.println(c);
	}
}

