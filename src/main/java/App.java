
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(final String[] args)
            throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Child1 c = new Child1();
        List<Child1> ll = new ArrayList<Child1>();
        ll.add(c);
        System.out.println("H1 " + mapper.writeValueAsString(c));
        System.out.println("H2 " + mapper.writeValueAsString(ll));

        if (true) {
            return;
        }
    }
}
