package Searching;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); *

public class IsBadVersion {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int mid = s + (e - s) / 2;
        while(s < e){
            mid = s + (e - s) / 2;
            if(isBadVersion(mid) == false){
                s = mid + 1;
            } else if(isBadVersion(mid) == true){
                e = mid - 1;
            }
        }

        return mid;
    }
}
    */