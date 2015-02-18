
    import java.io.ByteArrayInputStream;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.PrintWriter;
    import java.util.ArrayDeque;
    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.InputMismatchException;
    import java.util.Queue;
    public class Main {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";
    static void solve()
    {
    int n = ni(), t = ni(), m = ni();
    int[] u = new int[m];
    int[] v = new int[m];
    int[] s = new int[m];
    int[] e = new int[m];
    for(int i = 0;i < m;i++){
    u[i] = ni()-1; v[i] = ni()-1; s[i] = ni(); e[i] = ni();
    }
    int[][][] g = packWD(n, u, v, s, e);
    for(int i = 0;i < n;i++){
    Arrays.sort(g[i], new Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
    return a[1] - b[1];
    }
    });
    }
    int[][] ss = new int[n][];
    for(int i = 0;i < n;i++){
    ss[i] = new int[g[i].length];
    for(int j = 0;j < g[i].length;j++){
    ss[i][j] = g[i][j][1]*2;
    }
    }
    int low = -1, high = 1000000003;
    while(high - low > 1){
    int w = (high + low) / 2;
    if(canreach(w, g, t, ss)){
    high = w;
    }else{
    low = w;
    }
    }
    if(high > 1000000000){
    out.println(-1);
    }else{
    out.println(high);
    }
    }
    static boolean canreach(int w, int[][][] g, int dead, int[][] ss)
    {
    int n = g.length;
    Queue<int[]> q = new ArrayDeque<int[]>();
    boolean[][] ved = new boolean[n][]; // end
    int[][] next = new int[n][];
    for(int i = 0;i < n;i++){
    ved[i] = new boolean[g[i].length];
    next[i] = new int[g[i].length];
    for(int j = 0;j < g[i].length;j++){
    next[i][j] = j+1;
    }
    }
    for(int i = 0;i < g[0].length;i++){
    if(g[0][i][1] <= w){
    ved[0][i] = true;
    q.add(new int[]{0, i});
    }
    }
    while(!q.isEmpty()){
    int[] cur = q.poll();
    int t = g[cur[0]][cur[1]][2];
    int pos = g[cur[0]][cur[1]][0];
    if(pos == n-1 && t <= dead){
    return true;
    }
    if(t <= dead){
    int from = -Arrays.binarySearch(ss[pos], 2*t-1)-1;
    int to = -Arrays.binarySearch(ss[pos], 2*(t+w)+1)-1;
    int i;
    for(i = from;i < to;i = next[pos][i]){
    if(!ved[pos][i]){
    ved[pos][i] = true;
    q.add(new int[]{pos, i});
    }
    }
    for(int j = from;j < to;){
    int on = next[pos][j];
    next[pos][j] = i;
    j = on;
    }
    }
    }
    return false;
    }
    public static int[][][] packWD(int n, int[] from, int[] to, int[] w, int[] x) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for(int f : from)
    p[f]++;
    for(int i = 0;i < n;i++)
    g[i] = new int[p[i]][3];
    for(int i = 0;i < from.length;i++){
    --p[from[i]];
    g[from[i]][p[from[i]]][0] = to[i];
    g[from[i]][p[from[i]]][1] = w[i];
    g[from[i]][p[from[i]]][2] = x[i];
    }
    return g;
    }
    public static void main(String[] args) throws Exception
    {
    long S = System.currentTimeMillis();
    is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
    out = new PrintWriter(System.out);
    solve();
    out.flush();
    long G = System.currentTimeMillis();
    tr(G-S+"ms");
    }
    private static boolean eof()
    {
    if(lenbuf == -1)return true;
    int lptr = ptrbuf;
    while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
    try {
    is.mark(1000);
    while(true){
    int b = is.read();
    if(b == -1){
    is.reset();
    return true;
    }else if(!isSpaceChar(b)){
    is.reset();
    return false;
    }
    }
    } catch (IOException e) {
    return true;
    }
    }
    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;
    private static int readByte()
    {
    if(lenbuf == -1)throw new InputMismatchException();
    if(ptrbuf >= lenbuf){
    ptrbuf = 0;
    try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
    if(lenbuf <= 0)return -1;
    }
    return inbuf[ptrbuf++];
    }
    private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    private static double nd() { return Double.parseDouble(ns()); }
    private static char nc() { return (char)skip(); }
    private static String ns()
    {
    int b = skip();
    StringBuilder sb = new StringBuilder();
    while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
    sb.appendCodePoint(b);
    b = readByte();
    }
    return sb.toString();
    }
    private static char[] ns(int n)
    {
    char[] buf = new char[n];
    int b = skip(), p = 0;
    while(p < n && !(isSpaceChar(b))){
    buf[p++] = (char)b;
    b = readByte();
    }
    return n == p ? buf : Arrays.copyOf(buf, p);
    }
    private static char[][] nm(int n, int m)
    {
    char[][] map = new char[n][];
    for(int i = 0;i < n;i++)map[i] = ns(m);
    return map;
    }
    private static int[] na(int n)
    {
    int[] a = new int[n];
    for(int i = 0;i < n;i++)a[i] = ni();
    return a;
    }
    private static int ni()
    {
    int num = 0, b;
    boolean minus = false;
    while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if(b == '-'){
    minus = true;
    b = readByte();
    }
    while(true){
    if(b >= '0' && b <= '9'){
    num = num * 10 + (b - '0');
    }else{
    return minus ? -num : num;
    }
    b = readByte();
    }
    }
    private static long nl()
    {
    long num = 0;
    int b;
    boolean minus = false;
    while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if(b == '-'){
    minus = true;
    b = readByte();
    }
    while(true){
    if(b >= '0' && b <= '9'){
    num = num * 10 + (b - '0');
    }else{
    return minus ? -num : num;
    }
    b = readByte();
    }
    }
    private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
    } 