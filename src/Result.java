import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
/*Given an array of integers, find the sum of its elements. Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
simpleArraySum has the following parameter(s): ar: an array of integers*/
public class Result {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (int index : ar) {
            sum += index;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(("output.txt")));

        int arCont = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer:: parseInt)
                .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}