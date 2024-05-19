import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int day = Integer.parseInt(JOptionPane.showInputDialog("Enter day of creation (1-7):"));

        switch (day) {
            case 1:
                JOptionPane.showMessageDialog(null, "Day 1: God created light.\nGenesis 1:3");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Day 2: God created the sky.\nGenesis 1:6-8");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Day 3: God created dry land and vegetation.\nGenesis 1:9-13");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Day 4: God created the sun, moon, and stars.\nGenesis 1:14-19");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Day 5: God created sea creatures and birds.\nGenesis 1:20-23");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Day 6: God created animals and mankind.\nGenesis 1:24-31");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Day 7: God rested.\nGenesis 2:1-3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid day entered. Please enter a number between 1 and 7.");
                break;
        }

        String response = JOptionPane.showInputDialog("Do you want to see the verse again? (yes/no):");
        if (response.equalsIgnoreCase("yes")) {
            switch (day) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Genesis 1:3");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Genesis 1:6-8");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Genesis 1:9-13");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Genesis 1:14-19");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Genesis 1:20-23");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Genesis 1:24-31");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Genesis 2:1-3");
                    break;
            }
        }
    }
}
