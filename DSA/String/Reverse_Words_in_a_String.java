package DSA.String;

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int Start_index = s.length()-1;
        while(Start_index>=0){

            while(Start_index>=0 && s.charAt(Start_index)==' '){
                Start_index--;
            }   
            if(Start_index<0)
                break;

            int finish_index = Start_index;
            while(s.charAt(Start_index)!=' '){
                Start_index--;
                if(Start_index<0)
                    break;
            }
            if(res.length()==0){
                res.append(s.substring(Start_index+1, finish_index+1));
            }else{
             res.append(" ");
             res.append(s.substring(Start_index+1, finish_index+1));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Reverse_Words_in_a_String r = new Reverse_Words_in_a_String();
        System.out.println(r.reverseWords(" the sky is blue"));
    }
}
