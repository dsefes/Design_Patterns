package source;

public class Sign implements IPrintable {

    char c;

    public Sign(char c) {
        this.c = c;
    }

    @Override
    public void print(IPrinter printer) {
        printer.printString(c + "");
    }

}
