public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Using StringBuffer methods
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World
        
        sb.insert(5, ",");
        System.out.println(sb);  // Output: Hello, World
        
        sb.reverse();
        System.out.println(sb);  // Output: dlroW ,olleH
    }
}
