package source;

public class PrinterSpecial extends PrinterDefault {

    @Override
    public void printIPrintable(IPrintable printable) {
        if (printable instanceof Word){
            printString("(");
            super.printIPrintable(printable);
            printString(")");
        } else {
            super.printIPrintable(printable);
        }
    }

}
