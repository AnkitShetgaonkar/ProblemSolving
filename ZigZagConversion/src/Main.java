import java.util.ArrayList;
import java.util.List;

public class Main {

    public String convert(String s, int numRows) {
        if(s.isEmpty()||numRows <=1){
            return s;
        }
        StringBuilder resBuilder = new StringBuilder();
        boolean back = false;
        int currentRow = 0;
        StringBuilder[] adjacencyList  = new StringBuilder[numRows];
        for (int i = 0; i < s.length(); i++) {
            if(currentRow == 0){
                back = false;
            }
            if(currentRow == numRows-1){
                back = true;
            }
            if(adjacencyList[currentRow] == null){
                adjacencyList[currentRow] = new StringBuilder();
            }
            adjacencyList[currentRow].append(s.charAt(i));
            if(back){
                currentRow--;
            }else{
                currentRow++;
            }
        }
        for (StringBuilder builder:
             adjacencyList) {
            if(builder !=null)
                resBuilder.append(builder);
        }

        return resBuilder.toString();
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.convert("AB", 1));
    }
}
