import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
/**
 * Created by ydubale on 4/10/15.
 */
public class InfiniteHousePancakes {

    public static int getMinutes(int startingPeople, int[] plates){
        int minutes = 0;

        boolean found4 = false;
        int min = 0;
        for(int numPan : plates){
            if(numPan > 6){

                int n = numPan/4;

                if(numPan % 4 == 0){
                    n--;
                }

                minutes += (n+4);
                found4 = true;
                continue;
            }
            min = numPan;
        }

        if(found4){
            return minutes;
        }
        if(min == 4){
            return 3;
        }
        if(min > 4){
            return 4;
        }
        return min;
    }

    public static void main(String[] args) throws Exception {

        //Scanner scan = new Scanner(new File("pancakesInput.txt"));
        File fin = new File("B-small-attempt0.in");
        File fout = new File("pancakesOutputpiyujoshi.out");
        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fout));


        int numTestCases = Integer.parseInt(br.readLine());

        for(int i=0; i < numTestCases; i++){
            int numPeople = Integer.parseInt(br.readLine());
            int[] plates = new int[numPeople];

			String[] array = br.readLine().split(" ");

            for(int j=0; j < numPeople; j++){
                plates[j] = Integer.parseInt(array[j]);
            }

            bw.write("Case #" + (i+1) + ": " + getMinutes(numPeople, plates));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}