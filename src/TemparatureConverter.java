import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TemparatureConverter{
    public static void main(String[] args) throws Exception{
        System.out.println("Enter Temperature in Fahrenheit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        Double f = Double.parseDouble(data);
        System.out.println("Fahrenheit Temperature "+":"+f);
        Double c = (f-32)*5/9;
        System.out.println("Celsius Temperature:"+c);



    }
}
