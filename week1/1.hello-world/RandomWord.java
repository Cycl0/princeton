import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String randomString = null;
        for (int i = 0; !StdIn.isEmpty(); ++i) {
            String newStr = StdIn.readString();
            boolean prob = StdRandom.bernoulli(1.0/(i+1));
            if (prob) {
                randomString = newStr;
            }
        }
        StdOut.println(randomString);
    }
}
