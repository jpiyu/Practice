import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Administrator on 2015/4/11.
 */

 abstract class CodeJamCase {

     protected abstract void runCase();

     protected void parseInput(File file, InputCaseLineParser lineParser) {
         try {
             BufferedReader bufferReader = new BufferedReader(new FileReader(file));
             String line = bufferReader.readLine();
             int lineNumber = 0;

             while (line != null) {
                 lineParser.parseLine(++lineNumber, line);
                 line = bufferReader.readLine();
             }
             bufferReader.close();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

     protected void parseInput(File file, InputCaseBlockParser blockParser) {
         try {
             BufferedReader bufferReader = new BufferedReader(new FileReader(file));
             String[] caseContent = new String[blockParser.getCaseLineNumber()];
             int lineCount = 0;
             int tmpIndex = 0;
             int caseIndex = 0;
             String caseNumber = bufferReader.readLine();
             String line = bufferReader.readLine();
             int caseLineNumber = blockParser.getCaseLineNumber();

             while (line != null) {
                 tmpIndex = (++lineCount) % caseLineNumber;
                 if (tmpIndex == 0) {
                     tmpIndex = caseLineNumber;
                 }
                 caseContent[tmpIndex - 1] = line;
                 if (tmpIndex == caseLineNumber) {
                     blockParser.parseLine(++caseIndex, caseContent);
                 }
                 line = bufferReader.readLine();
             }
             bufferReader.close();
         } catch (Exception e) {
             e.printStackTrace();
         }

     }

     protected void parseAdaptiveInput(File file, InputCaseBlockParser blockParser) {
         try {
             BufferedReader bufferReader = new BufferedReader(new FileReader(file));
             int lineCount = 0;
             int tmpIndex = 0;
             int caseIndex = 0;
             String caseNumber = bufferReader.readLine();
             String line = bufferReader.readLine();
             int caseLineNumber = Integer.parseInt(line);
             String[] caseContent = new String[caseLineNumber];

             line = bufferReader.readLine();
             while (line != null) {
                 tmpIndex = (++lineCount) % caseLineNumber;
                 if (tmpIndex == 0) {
                     tmpIndex = caseLineNumber;
                 }
                 caseContent[tmpIndex - 1] = line;
                 if (tmpIndex == caseLineNumber) {
                     blockParser.parseLine(++caseIndex, caseContent);
                     line = bufferReader.readLine();
                     if(line == null)
                         break;
                     caseLineNumber = Integer.parseInt(line);
                     caseContent = new String[caseLineNumber];
                     lineCount = 0;
                 }
                 line = bufferReader.readLine();
             }
             bufferReader.close();
         } catch (Exception e) {
             e.printStackTrace();
         }

     }

     protected void acceptInput(CaseInputReader caseInputReader) {

     }

     protected void parseInput(File file) {
         try {
             BufferedReader bufferReader = new BufferedReader(new FileReader(file));
             acceptInput(CaseInputReader.build(bufferReader));
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

}

public class New extends CodeJamCase {

    private int getSmallestTime(List<Integer> p, int D) {

        TreeMap<Float, Integer> pOrderMap = new TreeMap<Float, Integer>();
        for (Integer pNum : p) {
            if (!pOrderMap.containsKey((float) pNum)) {
                pOrderMap.put((float) pNum, 1);
            } else {
                pOrderMap.put((float) pNum, pOrderMap.get((float) pNum) + 1);
            }
        }

        // ?????????
        int accuMoveSpend = 0;
        float smallestTime = pOrderMap.lastKey();
        while (true) {

            Float maxP = pOrderMap.lastKey();
            Integer maxPNum = pOrderMap.get(maxP);
            pOrderMap.remove(maxP);

            float secondMaxP = 0f;
            if (pOrderMap.size() > 0) {
                secondMaxP = pOrderMap.lastKey();
            }
            float newMaxP = Math.max((maxP / 2), secondMaxP);
            accuMoveSpend += maxPNum;
            float spendTime = newMaxP + accuMoveSpend;
            if (spendTime <= smallestTime) {
                smallestTime = spendTime;
                pOrderMap.put(maxP / 2, maxPNum * 2);
            } else {
                return (int) Math.ceil(smallestTime);
            }
        }

    }


    @Override
    protected void runCase() {
        parseInput(new File("C:\\Users\\Administrator\\Downloads\\B-small-attempt1.in"
        ), new InputCaseBlockParser() {
            @Override
            public void parseLine(int caseIndex, String[] line) {
                int D = Integer.parseInt(line[0]);

                List<Integer> p = new ArrayList<Integer>();
                for (String pStr : line[1].split(" ")) {
                    p.add(Integer.parseInt(pStr));
                }

                int smallestTime = getSmallestTime(p, D);
                System.out.println(String.format("Case #%d: %d",caseIndex,smallestTime));
            }

            @Override
            public int getCaseLineNumber() {
                return 2;
            }
        });
    }

    public static void main(String[] args) {
        new InfinitePancakes().runCase();
    }
}