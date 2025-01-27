package ArraysAndHashing;
import java.util.HashMap;
import java.util.ArrayList;

public class NumToWord {
    ArrayList<String> stringList = new ArrayList<>();

    public String numberToWords(int num) {

        if(num == 0){
            return "Zero";
        }

        String numAsString = String.valueOf((Math.abs(num)));
        int size = numAsString.length();
        int trips = (size - 1) / 3;
        int rem = size % 3;

        int i = 0;

        if(rem == 2){
            tokenize("0" + numAsString.substring(0, 2), trips);
            trips--;
            i += 2;
        } else if(rem == 1){
            tokenize("00" + numAsString.substring(0, 1), trips);
            trips--;
            i++;
        }

        while(i < size){
            tokenize(numAsString.substring(i, i + 3), trips);
            trips--;
            i += 3;
        } 
        
        return concatenate();
    }

    private void tokenize(String sub, int degree){
        Maps maps = new Maps();
        int x = Character.getNumericValue(sub.charAt(0));
        int y = Character.getNumericValue(sub.charAt(1));
        int z = Character.getNumericValue(sub.charAt(2));

        if(x == 0){
        } else{
            stringList.add(maps.initMap.get(x));
            stringList.add(maps.degreeMap.get(0));
        }

        if (y == 0){
        } else if(y < 2){
            int yz = Integer.parseInt((sub.substring(1, 3)));
            stringList.add(maps.initMap.get(yz));
            z = 0;
        } else{
            stringList.add(maps.tensMap.get(y));
        }

        if(z == 0){
        } else{
            stringList.add(maps.initMap.get(z));
        }

        if(x != 0 || y != 0 || z != 0){
            if(degree != 0){
                stringList.add(maps.degreeMap.get(degree));
            }
        }
    }

    private String concatenate(){
        StringBuilder fullString = new StringBuilder();
        for (String str : stringList){
            fullString.append(str).append(" ");
        }
        String result = fullString.toString().trim(); 
        return result;
    }

    class Maps{
        HashMap<Integer, String> initMap = new HashMap<>();
        HashMap<Integer, String> tensMap = new HashMap<>();
        HashMap<Integer, String> degreeMap = new HashMap<>();

        Maps(){
            degreeMap.put(0, "Hundred");
            degreeMap.put(1, "Thousand");
            degreeMap.put(2, "Million");
            degreeMap.put(3, "Billion");

            tensMap.put(2, "Twenty");
            tensMap.put(3, "Thirty");
            tensMap.put(4, "Forty");
            tensMap.put(5, "Fifty");
            tensMap.put(6, "Sixty");
            tensMap.put(7, "Seventy");
            tensMap.put(8, "Eighty");
            tensMap.put(9, "Ninety");

            initMap.put(1, "One");
            initMap.put(2, "Two");
            initMap.put(3, "Three");
            initMap.put(4, "Four");
            initMap.put(5, "Five");
            initMap.put(6, "Six");
            initMap.put(7, "Seven");
            initMap.put(8, "Eight");
            initMap.put(9, "Nine");
            initMap.put(10, "Ten");
            initMap.put(11, "Eleven");
            initMap.put(12, "Twelve");
            initMap.put(13, "Thirteen");
            initMap.put(14, "Fourteen");
            initMap.put(15, "Fifteen");
            initMap.put(16, "Sixteen");
            initMap.put(17, "Seventeen");
            initMap.put(18, "Eighteen");
            initMap.put(19, "Nineteen");
        }
    }
}
