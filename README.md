<h1 align="center">Order Window</h1>
</hr >
<h2>1. View Of The Project</h2>

<div align="center">
  <img src="https://github.com/user-attachments/assets/30ae04a9-db58-4eec-b877-44ec3c1552ca" alt="Project View" width="600">
</div> <br/><br/>

<h2>2. Panels, Titles And Borders</h2>
<p>
    We have 5 panels, these are titled with 'Customer Information', 'Meals', 'Drinks', 'Desserts' and 'Order Summary'.<br/>
  You can use different borber style but I used titeBorder like that:<br/><br/>
</p>

```ps
JPanel panel = new JPanel();
TitledBorder border = new TitledBorder("Customer Information");
panel.setBorder(border);
panel.setBounds(30, 10, 800, 100);
```
<br/>
<h2>3. Text Fields and Labels</h2>
<img src="https://github.com/user-attachments/assets/3df641ed-a2e0-423a-8b75-dd1f6283b3e4"> <br/><br/>
<p1>These are the easist ones. Here is an example usage.</p1> <br/> <br/>

```ps
JLabel nameLabel = new JLabel("Name: ");
nameLabel.setBounds(50,40,150,30);

JLabel phoneLabel = new JLabel("Phone: ");
phoneLabel.setBounds(400,40,150,30);

JTextField nameTextField = new JTextField();
nameTextField.setBounds(150,40,200,30);

JTextField phoneTextField = new JTextField();
phoneTextField.setBounds(500,40,200,30);
```
<br/>
<h2>4. ComboBox</h2>

```p
String[] meals = {"Pasta - $12", "Pizza - $9", "Yağlama - $5"};
JComboBox<String> comboBox = new JComboBox<>(meals);
comboBox.setBounds(10,70,150,30);
```
<p>
  Here is the combo boxes. Key point is they are taking an array.<br/>
  And it seems like that:<br/><br/>
</p>
<img src="https://github.com/user-attachments/assets/9948e34b-5a4e-4ecf-92c5-3d3ce5253875"><br/>
<br/>
<h2>5. Spinner</h2>

```p
SpinnerNumberModel model = new SpinnerNumberModel(1,0,10,1);
JSpinner spinner = new JSpinner(model);
spinner.setBounds(80,120,50,30);
```
<p>
  Here is the spinner, in first line there are inputs for spinner model. <br/>
  The first one is the initial value. Its mean is that when the program is started, the spinner will show that value as default.<br/>
  The second one is minimum and the third one is the maximum value for the spinner.<br/>
  The last one is the steps count, if it equals 1, then the spinner increase one by one.<br/>
  And the spinner seems like that: <br/> <br/>
</p>
<img src="https://github.com/user-attachments/assets/6f8e4a58-0249-403b-b267-8f565c9bde7d"><br/>
<br/>
<h2>6. Check Boxes</h2>

```p
JCheckBox cola = new JCheckBox("Cola - $2.00");
cola.setBounds(10,60,150,30);

JCheckBox water = new JCheckBox("Water - $1.00");
water.setBounds(10,100,150,30);

JCheckBox addIce = new JCheckBox("Add Ice (+$0.50)");
addIce.setBounds(10,140,150,30);
```
<p>
  These are selectable boxes and you can select more than one or non.<br/>
  It seems like that: 
</p> <br/>
<img src="https://github.com/user-attachments/assets/dd25a7fd-8964-47b0-b7a5-6943ecbb7575"> <br/>
<br/>
<h2>7. Radio Buttons</h2>

```p
JRadioButton cakeRadio = new JRadioButton("Cake - $4.00");
cakeRadio.setBounds(10,60,150,30);

JRadioButton iceCreamRadio = new JRadioButton("Ice Cream - $3.00");
iceCreamRadio.setBounds(10,100,150,30);

ButtonGroup group = new ButtonGroup();
group.add(cakeRadio);
group.add(iceCreamRadio);
```
<p>
  Here is the radio buttons. In usage of that there is difference; ButtonGroup.<br/>
  We can see all of radio buttons are added in the gruop. Because when select one of them, the other ones must be unselected.<br/>
  The group makes that easy.<br/> <br/>
</p>
<img src="https://github.com/user-attachments/assets/224b456c-8e72-4b37-9e0d-09e926e3730d"><br/>
<br/>
<h2>8. Buttons</h2>

```p
JButton calculateBtn = new JButton("Calculate Price");
calculateBtn.setBounds(475,720,130,30);

JButton resetBtn = new JButton("Reset Order");
resetBtn.setBounds(630,720,130,30);
```
<p>
  The calculate button take the price of whole selected meals, desserts, drinks and others and print in a label on left-bottom side.<br/>
  The reset button clear the whole selections and set price 0.<br/>
</p> <br/>
<img src="https://github.com/user-attachments/assets/589f127a-27e9-4c08-8d7e-b8e9c5fe9dd0">

