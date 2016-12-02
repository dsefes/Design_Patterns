using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;




public interface IPrintable
{
    void print(IPrinter iPrinter);
    //String getContent();
}
public interface IPrinter
{
    void printWord(string text);
    void printSign(string text);
}




class Sign : IPrintable
{
    public Sign()
    {
        text = '\0';
    }
    public Sign(char s)
    {
        this.text = s;
    }

    public Sign(String s)
    {
        this.text = s[0];
    }
    
    char text;
    public void print(IPrinter iPrinter){
        iPrinter.printSign(text + "");
    }
    public String getContent()
    {
        return "" + text;
    }
}




class Word : IPrintable
{
    public Word()
    {
        text = "";
    }
    public Word(String s)
    {
        this.text = s;
    }

    String text;
    public void print(IPrinter iPrinter){

        iPrinter.printWord(text);
    }
    public void printNew(IPrinter iPrinter)
    {

        iPrinter.printWord(text);
    }
    public String getContent(){
        return text;   
    }
}



class Text
{
    private IPrintable[] text;


    public Text(params IPrintable[] array)
    {
        if (array != null)
        {
            text = array;
        }
        else
        {
            text = null;
        }
    }

    public void Print(IPrinter printer)
    {
        for (int i = 0; i < text.Length; i++ )
            text[i].print(printer);
    }

}



class PrinterDefault : IPrinter
{
    virtual public void printWord(string text)
    {
        //text.print(this);
        Console.WriteLine(text);
    }

    virtual public void printSign(string text)
    {
        Console.WriteLine(text);
//        text.print(this);
    }
}


class PrinterSpecial : PrinterDefault
{
    override
    public void printWord(string text)
    {
        Console.Write("(" + text + ")");
    }

    override
    public void printSign(string text)
    {
        Console.WriteLine(text);
    }
}


interface IPrinterDelegate : IPrinter
{
    void print(Text iprintable);
}

class PrinterDelegate1 : IPrinterDelegate
{
    private IPrinter defPrinter;
    public PrinterDelegate1(IPrinter defPrinter)
    {
        this.defPrinter = defPrinter;
    }

    public void print(Text iprintable)
    {
        iprintable.Print(defPrinter);
    }

    public void printWord(string text)
    {
        Console.Write(text);
    }

    public void printSign(string text)
    {
        Console.Write(text);
    }

}
class somePrinter : IPrinter
{
    
    public void printWord(string text)
    {
        for (int i = 0; i < text.Length; i++)
        {
            Console.Write(text[i] + "   ");
        }
    }

    public void printSign(string text)
    {
        Console.Write("||||");
    }

}



namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Text txt = new Text(new Word("Тестируем"), new Sign(" "),
                        new Word("мою"), new Sign(" "),
                        new Word("архитектуру"), new Sign("!"));
            txt.Print(new PrinterDefault());

            Console.WriteLine();

            PrinterDelegate1 printer = new PrinterDelegate1(new PrinterSpecial());

            printer.print(txt);


            PrinterDelegate1 printer1 = new PrinterDelegate1(new somePrinter());

            printer1.print(txt);
            
            //txt.Print(new PrinterSpecial());

            //txt.Print(new PrinterDelegate1());

            Console.ReadLine();

        }
    }
}


