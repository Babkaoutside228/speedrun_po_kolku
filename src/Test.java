import java.io.*;import java.util.Scanner;import java.util.regex.Pattern;
public class Test {
    public static void main(String[] args){
        try {Scanner in = new Scanner(new File("input.txt")).useDelimiter(Pattern.compile("[;, \n]+"));
            double sum = 0;int size = 0;
            while(in.hasNext()){ String string = in.next();
                try { sum += Double.parseDouble(string);
                    size = Integer.max(size,string.length() - string.indexOf('.') - 1);}
                catch(NumberFormatException e){}}
            PrintWriter wr=new PrintWriter("output.txt");
            wr.println(String.format("%." + size + "f",sum));wr.close();}
        catch (IOException e){System.out.println("Ошибка чтения или записи файла");}}}