/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class WeAreOnFire {
	public static final int MAX = 1000;
	public static int N, M;
	public static int aliveCountry = 0;
	public static boolean[][] map = new boolean[MAX][MAX];
	
	public static void fireTo(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= M || map[x][y] == false) {
			return;
		}
		map[x][y] = false;
		aliveCountry --;
		fireTo(x - 1, y);
		fireTo(x + 1, y);
		fireTo(x, y - 1);
		fireTo(x, y + 1);
	}
	
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int Q = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	int cell = sc.nextInt();
            	if (cell == 1) {
            		map[i][j] = true;
            		aliveCountry ++;
            	} else {
            		map[i][j] = false;
            	}
            }
        }
        
		for (int i = 0; i < Q; i ++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			fireTo(x, y);
			System.out.println(aliveCountry);
		}
		
    }
}
