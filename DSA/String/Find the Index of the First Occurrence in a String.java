package DSA.String;

class first_index_str {
    public int strStr(String haystack, String needle) {
       int h = haystack.length();
        for(int i=0;i<=h-needle.length();i++){
            int left = i;
            int right = i;
            int num =0;
             if(! (haystack.charAt(left) == needle.charAt(0))){
                    continue;
                }
            while(right<h){
                 if(num==needle.length()){
                    break;
                }
                 if(! (haystack.charAt(right) == needle.charAt(num))){
                    break;
                }
                right ++;
                num ++;
                if(num == needle.length()){
                    return left;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        first_index_str f = new first_index_str();
        int num = f.strStr("sadbutsad", "sad");
        System.out.println(num);
    }
}