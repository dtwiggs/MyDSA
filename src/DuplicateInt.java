import java.util.HashSet;

public class DuplicateInt {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
