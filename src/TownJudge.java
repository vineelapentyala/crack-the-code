import java.util.*;

public class TownJudge {
    public static int identifyJudge(int n, int[][] trustRelations){
        if (n == 1) return n;
        Set<Integer> possibleJudges = new HashSet<>();
        Map<Integer, Set<Integer>> relations = new HashMap<>();
        for (int i = 1; i <= n; i++){
            possibleJudges.add(i);
        }
        for (int i = 0; i < trustRelations.length; i++){
            possibleJudges.remove(trustRelations[i][0]);
            if (relations.containsKey(trustRelations[i][1])){
                Set temp = relations.get(trustRelations[i][1]);
                temp.add(trustRelations[i][0]);
                relations.put(trustRelations[i][1], temp);
            }
            else{
                Set<Integer> temp = new HashSet<Integer>();
                temp.add(trustRelations[i][0]);
                relations.put(trustRelations[i][1], temp);
            }
        }
        if (possibleJudges.size() == 0) return -1;
        List<Integer> possibleSolutions = new ArrayList<>();
        for (int possibleJudge: possibleJudges){
            if (relations.containsKey(possibleJudge)){
                if(relations.get(possibleJudge).size() == n){
                    possibleSolutions.add(possibleJudge);
                }
            }
            else{
                return -1;
            }
        }
        return possibleSolutions.size() != 1 ? -1 : possibleSolutions.get(0);
    }
}
