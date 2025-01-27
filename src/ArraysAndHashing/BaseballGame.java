package ArraysAndHashing;
import java.util.ArrayList;

class BaseballGame {

    private ArrayList<Integer> a = new ArrayList<>();
    public int calPoints(String[] operations) {
        int sum = 0;
        int num = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                num = a.get(a.size() - 1) + a.get(a.size() - 2);
                a.add(num);
                sum += num;
            } else if(operations[i].equals("D")){
                num = a.get(a.size() - 1) * 2;
                a.add(num);
                sum+= num;
            } else if(operations[i].equals("C")){
                sum-= a.get(a.size() - 1);
                a.remove(a.size() - 1);
            } else {
                num = Integer.parseInt(operations[i]);
                a.add(num);
                sum += num;
            }
        }

        return sum;
    }
}