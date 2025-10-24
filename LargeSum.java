import java.math.BigInteger;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LargeSum{
    public static void main(String[] args)throws Exception { 
        List<String>numbers=Files.readAllLines(Paths.get("/home/nj/ProjectEuler/numbers.txt"));

         System.out.println("Number of lines loaded: " + numbers.size());
        if (!numbers.isEmpty()) {
            System.out.println("First number: " + numbers.get(0));
            System.out.println("First number length: " + numbers.get(0).length());
        } 

        BigInteger sum=BigInteger.ZERO;
        
        for (String num:numbers){
            if(num.trim().isEmpty()) continue;
            sum=sum.add(new BigInteger(num.trim()));
        }
        String sumString = sum.toString();
        System.out.println("Sum length: " + sumString.length());
        System.out.println("Full sum: " + sumString);

        String result = sumString.substring(0, 10);
        System.out.println("First ten digits: " + result);
        
    }
}