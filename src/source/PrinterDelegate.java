package source;

public class PrinterDelegate implements IPrinterDelegate {

    IPrinter p;
    public PrinterDelegate(IPrinter p) {
        this.p = p;
    }

    @Override
    public void printText(Text text) {
        text.print(p);
    }
    
    @Override
    public void printIPrintable(IPrintable printable) {
        printable.print(this);
    }

    @Override
    public void printString(String s) {
        System.out.println(s);
    }


}
