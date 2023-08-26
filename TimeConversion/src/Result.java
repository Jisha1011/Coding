import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Date;


class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
    // Write your code here
   String ret = "";
   
   DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
   DateFormat format = new SimpleDateFormat("HH:mm:ss");
   Date  time = dateFormat.parse(s);
  ret = format.format(time);
   
      return ret;
       
    }




    public static void main(String[] args) throws IOException, ParseException {
     

        String s = "07:05:45PM";

        String result = Result.timeConversion(s);

        System.out.println("Final result "+result);
    }
}
