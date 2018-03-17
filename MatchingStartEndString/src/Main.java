import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public void matchingSubString(String[] arr){
        HashMap<String,ArrayList<String>> hashFront = new HashMap<>();
        HashMap<String,ArrayList<String>> hashBack = new HashMap<>();
        for (String str :
                arr){
            String hash = makeFrontHash(str);
            if(!hash.equals("0"))
                appendHash(hashFront,str,hash);

            hash = makeBackHash(str);
            if(!hash.equals("0"))
                appendHash(hashBack,str,hash);
        }

        Set<String> set = hashFront.keySet();
        for (String key :
                set) {
            if(hashBack.containsKey(key)){
                System.out.println(hashFront.get(key)+","+hashBack.get(key));
            }
        }

    }

    private void appendHash(HashMap<String,ArrayList<String>> hash,String str,String hashStr){
        if(hash.containsKey(hashStr)){
            hash.get(hashStr).add(str);
        }else{
            ArrayList<String> values = new ArrayList<>();
            values.add(str);
            hash.put(hashStr,values);
        }
    }

    private String makeFrontHash(String str){
        if(str.length()<3){
            //the str is too small
            return "0";
        }
        return str.substring(0,3);
    }

    private String makeBackHash(String str){
        if(str.length()<3){
            //the str is too small
            return  "0";
        }
        return str.substring(str.length() - 3, str.length());
    }

    public static void main(String[] args) {
        Main main = new Main();
        String[] arr  = {"doctor","torque","1","2","3","quetor","quedoc"};
        main.matchingSubString(arr);
    }
}
