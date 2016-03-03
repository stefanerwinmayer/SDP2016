import java.util.ArrayList;
import java.util.List;

public class TestCovariant {
    Aa avar = new Bb();   // covariant
    List<Aa> alist = new ArrayList<>(); // invariant
}

class Aa {
}

class Bb extends Aa {
}