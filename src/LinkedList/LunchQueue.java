package LinkedList;
public class LunchQueue {

    int size;
    int pb = 0;
    int j = 0;

    public int countStudents(int[] students, int[] sandwiches) {

        size = students.length;

        for (int i = 0; i < students.length; i++){
            if (students[i] == 0){
                pb++;
            } else {
                j++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++){
            switch (sandwiches[i]) {
                case 0:
                    if (pb > 0){
                        pb--;
                        size--;
                    } else {
                        return size;
                    }
                    break;
            
                case 1:
                if (j > 0){
                    j--;
                    size--;
                } else {
                    return size;
                }
                    break;
            }
        }



        return size;
    }
}