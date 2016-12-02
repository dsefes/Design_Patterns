package source;

public class Text implements IPrintable {
    IPrintable[] printables;

    public Text(IPrintable... printables) {
        this.printables = printables;
    }

    @Override
    public void print(IPrinter printer) {
        for (IPrintable ip : printables) {
            printer.printIPrintable(ip);
        }
    }
}
