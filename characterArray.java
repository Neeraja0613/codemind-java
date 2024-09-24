public class StringExample3 {
    public static void main(String[] args)
    {
        //converting a string to a char array
        String college="Aditye";
        // toCharArray() -> give a character array of a string
        char[] charArray=college.toCharArray();
        // {'A', 'd', 'i', 't', 'y', 'e'}
        charArray[5]='a';   //Changing last character to a
        //{'A', 'd', 'i', 't', 'y', 'a'}
        String x=new String(charArray);
        System.out.println(x);
    }
}
