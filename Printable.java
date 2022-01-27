import java.util.List;

public interface Printable {
    public void print();

    public static void print(List printable){
        print(printable);
    }
}
