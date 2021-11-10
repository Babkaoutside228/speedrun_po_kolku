import java.io.*;import java.util.*;import java.util.regex.Pattern;
public class Speed {
    public static void main(String[] args) {
        try{Scanner in = new Scanner("input.txt").useDelimiter(Pattern.compile("[;, \n]+"));
        PrintWriter out = new PrintWriter("output.txt");
        int size = 0; int sum=0;
        while(in.hasNext()){String string = in.next();
            try {sum += Double.parseDouble(string);
                size = Integer.max(size,string.length() - string.indexOf('.') - 1);
                out.println(String.format("%." + size + "f",sum));out.close();}
            catch(NumberFormatException e){}}}
        catch(FileNotFoundException e) {e.printStackTrace();}}}