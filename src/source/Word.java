package source;

public class Word implements IPrintable {

    private String s;

    public Word(String s) {
        this.s = s;
    }

    @Override
    public void print(IPrinter printer) {
        printer.printString(s);
    }

}
