package string;

public class substring {
    public static void main(String[] args){
        String str = "hello my name is java";
        // string substring = str.substring(0, 5);

        // System.out.println(string);
        int si = 0; // starting index
        int ti = 5; // ending index

        System.out.println(Substring(str, si, ti));
    }

    public static String Substring(String str, int si, int ti){
        String substring = "";
        for(int i= si; i<ti; i++){
            substring = substring + str.charAt(i);
        }
        return substring;
    }
    
}
