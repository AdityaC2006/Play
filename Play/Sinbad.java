import core.data.*;

public class Sinbad {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("http://api.kivaws.org/v1/loans/newest.json");
        ds.load();
        ds.printUsageString();

    }
}
