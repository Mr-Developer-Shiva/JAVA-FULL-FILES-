public class ReverseString {
    public static void main(String[] args){
        String str = "reacaer";
        // for(int i = str.length()-1 ; i >= 0; i--){
        //     System.out.print(str.charAt(i));
        // }
        String str1 = "";
        for(int i = str.length() - 1 ; i >= 0;i--){
            str1 += str.charAt(i);
        }
        System.out.print(str1);

        if(str1.equals(str)){
            System.out.println("\nis Palindrome");
        }else {
            System.out.println("Not is Palindrome");
        }


        } 
}