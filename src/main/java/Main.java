import static com.googlecode.totallylazy.Sequences.sequence;

public class Main {
    public static void main(String[] argv) {
        System.out.println(sequence(1, 2, 3, 4).filter(a -> a == 2).take(1).first());
    }
}
