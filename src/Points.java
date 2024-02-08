import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Points {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ranking = new ArrayList<>();

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)){
                aliceScore++;
            } else if(a.get(i) < b.get(i)){
                bobScore++;
            }
            
        }
        ranking.add(aliceScore);
        ranking.add(bobScore);

        return ranking;
    }
}
