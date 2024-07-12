import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PrzeszukiwanieUlic extends JFrame {

    private JTextField textField;
    private JTextArea textArea;

    public PrzeszukiwanieUlic() {
        setTitle("Przeszukiwanie Ulic");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        textField = new JTextField(20);
        JButton button = new JButton("Szukaj");
        textArea = new JTextArea();
        textArea.setEditable(false);

        button.addActionListener(e -> szukajUlicy());
        textField.addActionListener(e -> szukajUlicy());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Podaj nazwę ulicy:"));
        inputPanel.add(textField);
        inputPanel.add(button);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(panel);
    }

    private void szukajUlicy() {
        String nazwaUlicy = textField.getText();
        String plikCSV = "src/ulice.csv";
        boolean znalezionoUlicy = false;
        textArea.setText("");

        try (BufferedReader reader = new BufferedReader(new FileReader(plikCSV))) {
            String wiersz;
            while ((wiersz = reader.readLine()) != null) {
                String[] pola = wiersz.split(",");
                if (pola[0].equalsIgnoreCase(nazwaUlicy) || pola[1].equalsIgnoreCase(nazwaUlicy)) {
                    textArea.append("Polska nazwa ulicy: " + pola[0] + "\n");
                    textArea.append("Deutscher Straßenname: " + pola[1] + "\n");
                    znalezionoUlicy = true;
                    break;
                }
            }
        } catch (IOException e) {
            textArea.setText("Błąd podczas odczytu pliku: " + e.getMessage());
        }

        if (!znalezionoUlicy) {
            textArea.setText("Ulica " + nazwaUlicy + " nie została znaleziona w pliku.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PrzeszukiwanieUlic frame = new PrzeszukiwanieUlic();
            frame.setVisible(true);
        });
    }
}
