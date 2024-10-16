public class ArrayListExample {
    public static void main(String[] args) {
        String s= "I love java programming";
        ArrayList<Character> vowels= new ArrayList<>();
        String v= "aeiouAEIOU";
        for(char i: s.toCharArray()){
            if(v.contains(""+i)){
                vowels.add(i);
            }
        }
        for(int i=0;i<vowels.size();i++){
            System.out.println(vowels.get(i));
        }
    }
}
