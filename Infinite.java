import java.util.*;
import java.io.*;
public class Infinite {

		private static int T = 0;
		private static PrintWriter out = null;

		public static void main(String[] args) throws Exception{
			List<String> input = readFile("B-small-attempt0.in");
			out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));

			T = Integer.parseInt(input.get(0));
			for(int i=1,j=1;j<=T;i+=2,j++){
				process(input.get(i),input.get(i+1),j);
			}

			out.close();
			System.exit(0);
		}

		private static void process(String dinerCount,String in, int t){
			long start = System.currentTimeMillis();
			String[] ins = in.split(" ");

			List<Integer> diners = new ArrayList<>();
			for(String diner : ins){
				diners.add(Integer.parseInt(diner));
			}

			int pass = pass(diners,0);
			out.println("Case #"+t+": " + pass);
			System.out.println("Processing " + t + " took " + (System.currentTimeMillis() - start));

		}

		/**
		 * Two options 1) Reduce every thing, 2) Move
		 * Recursivily evaluate these options and return the best.
		 *
		 * @return
		 */
		private static int pass(List<Integer> diners, int pass){
			System.out.println(pass);
			int pos = findLargest(diners, false);
			int largest = diners.get(pos);
			if(largest<=3){
				return pass + largest;
			}

			//option1
			List<Integer> dinersCopy = new ArrayList<>(diners);
			findLargest(dinersCopy, true);
			int option1 = pass(dinersCopy,pass+1);

			//option2
			List<Integer> moveList = new ArrayList<>(diners);
			int newLarge = largest-3;
			moveList.set(pos, newLarge);
			moveList.add(largest - newLarge);
			int option2 = pass(moveList,pass+1);

			//option 3
			moveList = new ArrayList<>(diners);
			newLarge = largest/2;
			moveList.set(pos, newLarge);
			moveList.add(largest - newLarge);
			int option3 = pass(moveList,pass+1);

			int small = option1;
			if(option2 < small){
				small = option2;
			}
			if(option3 < small){
				small = option3;
			}

			return small;
		}

		/**
		 * Eat and return the largest left
		 */
		private static int findLargest(List<Integer> diners,boolean reduce){
			int largest = 0;
			int pos = 0;

			for(int i=0;i<diners.size();i++){
				Integer din = diners.get(i);

				if(din > largest){
					largest = din;
					pos = i;
				}

				if(reduce){
					diners.set(i, --din);
				}
			}
			return pos;
		}

		private static boolean shouldPass(List<Integer> diners){
			for(Integer din : diners){
				if(din > 0){
					return true;
				}
			}
			return false;
		}

		private  static final List<String> readFile(String fileName) throws Exception{
			List<String> ret = new ArrayList<String>();
			File file = new File(fileName);

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String in = null;
			while ((in=br.readLine())  != null){
				ret.add(in);
			}
			br.close();

			return ret;
		}

	}