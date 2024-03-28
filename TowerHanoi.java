public class TowerHanoi {
    public static void main(String[] args) {
        int n = 3;
        String source = "A", auxiliary = "B", destination = "C";
        solve(n, source, auxiliary, destination);
    }

    public static void solve(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solve(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solve(n - 1, auxiliary, source, destination);
    }
}
