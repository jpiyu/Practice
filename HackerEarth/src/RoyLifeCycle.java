import java.util.Scanner;


class RoyLifeCycle {
    public static void main(String[] args) {
        int N;
        int X = 0, Y = 0;
        DailyLog[] dailyLogs;
        Log log;
        Scanner scanner = new Scanner(System.in);
        //----
        N = scanner.nextInt();
        scanner.nextLine();
        dailyLogs = new DailyLog[N];
        for (int i = 0; i < N; i++) {
            dailyLogs[i] = new DailyLog(scanner.nextLine());
        }
        //----
        for (int i = 0; i < N; i++) {
            X = (X > dailyLogs[i].findLongestSequenceC() ? X : dailyLogs[i].findLongestSequenceC());
        }

        log = new Log(dailyLogs);
        Y = log.findLongestSequenceC();
        //----
        System.out.println(X + " " + Y);
    }

    static class DailyLog {
        private String content;

        public DailyLog(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int findLongestSequenceC() {
            int amount = 0, tmp = 0;
            int i = 0;
            while (i < content.length()) {
                if (content.charAt(i) == 'C') {
                    tmp++;
                } else {
                    amount = (amount > tmp ? amount : tmp);
                    tmp = 0;
                }
                i++;
            }
            if (content.charAt(content.length()-1) == 'C') {
                amount = (amount > tmp ? amount : tmp);
            }
            return amount;
        }
    }

    static class Log {
        DailyLog[] dailyLogs;

        public Log(DailyLog[] dailyLogs) {
            this.dailyLogs = dailyLogs;
        }

        public int findLongestSequenceC() {
            String str = "";
            for (int i = 0; i < dailyLogs.length; i++) {
                str += dailyLogs[i].getContent();
            }
            DailyLog specialDailyLog = new DailyLog(str);
            return specialDailyLog.findLongestSequenceC();
        }
    }

}
