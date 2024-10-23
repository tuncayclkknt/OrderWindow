import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Objects;

public class Main {
    private static double totalPrice = 0;
    public static void main(String[] args) {

        JFrame frm = new JFrame();
        frm.setTitle("Assignment!");
        frm.setBounds(200,15,900,800);
        frm.setLayout(null);
        frm.setResizable(false);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("Customer Information");
        panel.setBorder(border);
        panel.setBounds(30, 10, 800, 100);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(50,40,150,30);

        JLabel phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(400,40,150,30);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(150,40,200,30);

        JTextField phoneTextField = new JTextField();
        phoneTextField.setBounds(500,40,200,30);

        panel.setLayout(null);
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(phoneLabel);
        panel.add(phoneTextField);

//------------------------------------------------------------------------------------------

        JPanel panel2 = new JPanel();
        TitledBorder border2 = new TitledBorder("Meals");
        panel2.setBorder(border2);
        panel2.setBounds(30, 110, 300, 200);

        JLabel label = new JLabel("Choose a meal:");
        label.setBounds(10,20,150,30);

        String[] meals = {"Pasta - $12", "Pizza - $9", "Yağlama - $5"};
        JComboBox<String> comboBox = new JComboBox<>(meals);
        comboBox.setBounds(10,70,150,30);

        JLabel quantityLabel = new JLabel("Quantity: ");
        quantityLabel.setBounds(10,120,150,30);

        SpinnerNumberModel model = new SpinnerNumberModel(1,0,10,1);
        JSpinner spinner = new JSpinner(model);
        spinner.setBounds(80,120,50,30);

        JCheckBox extraCheese = new JCheckBox("Extra Cheese (+$2.00)");
        extraCheese.setBounds(10,160,150,30);

        panel2.setLayout(null);
        panel2.add(label);
        panel2.add(comboBox);
        panel2.add(quantityLabel);
        panel2.add(spinner);
        panel2.add(extraCheese);
//------------------------------------------------------------------------------------------

        JPanel panel3 = new JPanel();
        TitledBorder border3 = new TitledBorder("Drinks");
        panel3.setBorder(border3);
        panel3.setBounds(30, 310, 300, 200);

        JLabel label2 = new JLabel("Choose a drink:");
        label2.setBounds(10,20,150,30);

        JCheckBox cola = new JCheckBox("Cola - $2.00");
        cola.setBounds(10,60,150,30);

        JCheckBox water = new JCheckBox("Water - $1.00");
        water.setBounds(10,100,150,30);

        JCheckBox addIce = new JCheckBox("Add Ice (+$0.50)");
        addIce.setBounds(10,140,150,30);

        panel3.setLayout(null);
        panel3.add(label2);
        panel3.add(cola);
        panel3.add(water);
        panel3.add(addIce);
//------------------------------------------------------------------------------------------

        JPanel panel4 = new JPanel();
        TitledBorder border4 = new TitledBorder("Desserts");
        panel4.setBorder(border4);
        panel4.setBounds(30, 510, 300, 200);

        JLabel label3 = new JLabel("Choose a drink:");
        label3.setBounds(10,20,150,30);

        JRadioButton cakeRadio = new JRadioButton("Cake - $4.00");
        cakeRadio.setBounds(10,70,150,30);

        JRadioButton iceCreamRadio = new JRadioButton("Ice Cream - $3.00");
        iceCreamRadio.setBounds(10,110,150,30);

        ButtonGroup group = new ButtonGroup();
        group.add(cakeRadio);
        group.add(iceCreamRadio);

        JCheckBox extraToppings = new JCheckBox("Extra Toppings(+$1.00)");
        extraToppings.setBounds(10,150,170,30);

        panel4.setLayout(null);
        panel4.add(label3);
        panel4.add(cakeRadio);
        panel4.add(iceCreamRadio);
        panel4.add(extraToppings);
//------------------------------------------------------------------------------------------

        JPanel panel5 = new JPanel();
        TitledBorder border5 = new TitledBorder("Order Summary");
        panel5.setBorder(border5);
        panel5.setBounds(375, 110, 455, 600);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,20,415,560);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        panel5.setLayout(null);
        panel5.add(textArea);
//------------------------------------------------------------------------------------------

        JLabel totalLabel = new JLabel("Total: ");
        totalLabel.setBounds(50,720,130,20);

        JButton calculateBtn = new JButton("Calculate Price");
        calculateBtn.setBounds(475,720,130,30);

        JButton resetBtn = new JButton("Reset Order");
        resetBtn.setBounds(630,720,130,30);



        calculateBtn.addActionListener(e ->{
            textArea.setText("");
            totalPrice = 0;

            double currentPrice;

            if (comboBox.getSelectedIndex() == 0){
                currentPrice = 12;
                totalPrice += 12 * (Integer) spinner.getValue();
            }
            else if (comboBox.getSelectedIndex() == 1){
                currentPrice = 9;
                totalPrice += 9 * (Integer) spinner.getValue();
            }
            else{
                currentPrice = 5;
                totalPrice += 5 * (Integer) spinner.getValue();
            }

            textArea.append(String.format("Customer: %s%nPhone: %s%n%n"
                    ,nameTextField.getText(),phoneTextField.getText()));

            String mealChoose = (String) comboBox.getSelectedItem();

            switch (Objects.requireNonNull(mealChoose)) {
                case "Pasta - $12" -> textArea.append("Pasta ");
                case "Pizza - $9" -> textArea.append("Pizza ");
                case "Yağlama - $5" -> textArea.append("Yağlama ");
            }

            textArea.append(String.format("x%d - $%.2f",(Integer)spinner.getValue(),
                    (Integer)spinner.getValue() * currentPrice));

            if (extraCheese.isSelected()){
                textArea.append(String.format("%n + Extra Cheese x%d - $%.2f%n",
                        (Integer)spinner.getValue(), 2.0 * (Integer) spinner.getValue()));
                totalPrice += 2.0 * (Integer) spinner.getValue();
            }

            if (cola.isSelected()){
                textArea.append(String.format("%n%s",cola.getText()));
                totalPrice += 2;
            }
            if (water.isSelected()){
                textArea.append(String.format("%n%s",water.getText()));
                totalPrice += 1;
            }
            if (addIce.isSelected()){
                textArea.append("\n + Ice - $0.50\n");
                totalPrice += 0.5;
            }

            if (cakeRadio.isSelected()){
                textArea.append(String.format("%n%s",cakeRadio.getText()));
                totalPrice += 4;
            } else if (iceCreamRadio.isSelected()) {
                textArea.append(String.format("%n%s",iceCreamRadio.getText()));
                totalPrice += 3;
            }

            if (extraToppings.isSelected()){
                textArea.append(String.format("%n + Extra Toppings - $1.00"));
                totalPrice += 1;
            }

            totalLabel.setText("Total: $" + totalPrice);
        });

        resetBtn.addActionListener(e ->{
            totalPrice = 0;
            textArea.setText("");
            totalLabel.setText("Total: ");
            spinner.setValue(1);

            extraCheese.setSelected(false);
            cola.setSelected(false);
            water.setSelected(false);
            addIce.setSelected(false);
            extraToppings.setSelected(false);

            comboBox.setSelectedIndex(0);
        });

        frm.add(totalLabel);
        frm.getContentPane().add(calculateBtn);
        frm.add(resetBtn);

        frm.add(panel5);
        frm.add(panel4);
        frm.add(panel3);
        frm.add(panel2);
        frm.add(panel);
        frm.setVisible(true);
    }
}