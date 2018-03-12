import java.util.Stack;

public class Main {

    private void isBalancedBracket(String input){
        char[] bracketArr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character c :
                bracketArr) {
            if (c == '['||c == '{'||c == '('){
                stack.push(c);
            }else{
                //if throughout each character not matched then return unmatched
                if(stack.empty()||!isMatching(stack.pop(),c)){
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("UNBALANCED");
            return;
        }
        System.out.println("BALANCED");
    }

    private boolean isMatching(char open,char close){
        switch (open){
            case '[':
                return close == ']';
            case '{':
                return close == '}';
            case '(':
                return close == ')';
            default:
                System.out.println("weirdo bracket encountered, teach me about it");
                return false;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        String input = "[{({})}]))";
        main.isBalancedBracket(input);
    }
}
