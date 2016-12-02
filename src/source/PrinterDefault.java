package source;

public class PrinterDefault implements IPrinter {

    @Override
    public void printIPrintable(IPrintable printable) {
        printable.print(this);
    }

    @Override
    public void printString(String s) {
        System.out.print(s);
    }

}
