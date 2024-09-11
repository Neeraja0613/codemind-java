import javax.swing.JOptionPane;
public class SampleExample {
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Enter your name");
        //System.out.println("Hello, " + name);
        String outpuString="Hello, " + name;
        JOptionPane.showMessageDialog(null, outpuString);
    }
}
