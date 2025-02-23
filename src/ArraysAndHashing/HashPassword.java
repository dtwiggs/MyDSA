package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class HashPassword {
    public static List<Integer> authEvents(List<List<String>> events) {
        List<Integer> res = new ArrayList<>();
        int[] bounds = new int[3];
        int last = -1, curr = -1;
        
        for(int i = 0; i < events.size(); i++){
            System.out.println(events.get(i).get(0) + " " + events.get(i).get(1));
            
            if(events.get(i).get(0).equals("setPassword")){
                last = i;
            } else{
                if(curr != last){
                    bounds = hash(events.get(last).get(1));
                    curr = last;
                }
                int input = Integer.parseInt(events.get(i).get(1));
                if(input == bounds[0] || input >= bounds[1] && input <= bounds[2]){
                    res.add(1);
                } else{
                    res.add(0);
                }
            }
        }
        System.out.println(bounds[0] + " " + bounds[1] + " " + bounds[2]);

        return res;
    }
    
    private static int[] hash(String pw){
        int[] bounds = new int[3];
        int n = pw.length(), M = (int)(Math.pow(10,9) + 7);
        long tmp = 0;
        
        for(int i = 0; i < pw.length(); i++){
            tmp += pw.charAt(i) * (int)Math.pow(131, n - 1);
            n--;
        }
        
        bounds[0] = (int)(tmp % M);
        bounds[1] = (int)((tmp * 131) % M);
        bounds[2] = (int)((tmp * 131 + 127) % M);
                
        return bounds;
    }
}
