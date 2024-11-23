import java.util.ArrayList;

public class BrowserHistoryArray {
    ArrayList<String> browserHistory = new ArrayList<>();
    int curr, size;

    public BrowserHistoryArray(String homepage){
        browserHistory.add(homepage);
        curr = 0;
    }

    public void visit(String url){
        size = browserHistory.size() - 1;

        while(curr < size){
            browserHistory.remove(size);
            size--;
        }
        browserHistory.add(url);
        curr++;
    }

    public String back(int steps){
        if(steps < curr){
            curr = curr - steps;
        } else {
            curr = 0;
        }
        return browserHistory.get(curr);
    }

    public String forward(int steps){
        if((steps + curr) < browserHistory.size()){
            curr = steps + curr;
        } else {
            curr = browserHistory.size() - 1;
        }
        return browserHistory.get(curr);
    }
}
