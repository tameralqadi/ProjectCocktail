/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package springcocktail;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author M.T
 */
public class cocktailForm extends javax.swing.JFrame {
Color color;
Fruit fruit;
Milk milk;
IceCream ice;
Sugar sugar;
Ingredient ing;

ArrayList<Fruit> farr = new ArrayList<>();
ArrayList<Milk> marr = new ArrayList<>();
ArrayList<Sugar> sarr = new ArrayList<>();
ArrayList<IceCream> icearr = new ArrayList<>();
ArrayList<Ingredient> ingarr=new ArrayList<>();
Blender ble=new Blender(ingarr);
Cup cup=new Cup();
 
    public cocktailForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fruitTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ingList = new javax.swing.JList<>();
        blendButton = new javax.swing.JButton();
        picButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nameFruitTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caloriesFruitTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        volumeFruitTextField = new javax.swing.JTextField();
        fruitButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        fruitList1 = new javax.swing.JList<>();
        selectColorButton = new javax.swing.JButton();
        fcPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        insLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nameMilkTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caloriesMilkTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        volumeMilkTextField = new javax.swing.JTextField();
        milkButton = new javax.swing.JButton();
        selectColorMButton1 = new javax.swing.JButton();
        mcPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        insmLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        milkList2 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nameIceTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        caloriesIceTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        volumeIceTextField = new javax.swing.JTextField();
        iceButton = new javax.swing.JButton();
        selectColorIceButton2 = new javax.swing.JButton();
        icPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        insiceLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        iceList = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nameSugarTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        caloriesSugarTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        weightSugarTextField = new javax.swing.JTextField();
        sugarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cocktail ");

        ingList.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrediants"));
        ingList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ingListValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(ingList);

        blendButton.setText("Blend");
        blendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendButtonActionPerformed(evt);
            }
        });

        picButton.setText("Pour Into Cup");
        picButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(blendButton)
                        .addGap(27, 27, 27)
                        .addComponent(picButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        fruitTabbedPane.addTab("cocktail", jPanel2);

        jLabel1.setText("Name:");

        jLabel2.setText("Calories:");

        jLabel4.setText("Volume:");

        fruitButton.setText("Add Fruit");
        fruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitButtonActionPerformed(evt);
            }
        });

        fruitList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fruit"));
        fruitList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fruitList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fruitList1ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(fruitList1);

        selectColorButton.setText("select color");
        selectColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fcPanelLayout = new javax.swing.GroupLayout(fcPanel);
        fcPanel.setLayout(fcPanelLayout);
        fcPanelLayout.setHorizontalGroup(
            fcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fcPanelLayout.setVerticalGroup(
            fcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("color in string:");

        insLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(fruitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectColorButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caloriesFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(volumeFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caloriesFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volumeFruitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(selectColorButton)
                        .addGap(7, 7, 7)
                        .addComponent(fcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insLabel))
                .addGap(15, 15, 15)
                .addComponent(fruitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fruitTabbedPane.addTab("Fruit", jPanel1);

        jLabel5.setText("Name:");

        jLabel6.setText("Calories:");

        jLabel8.setText("Volume:");

        milkButton.setText("Add Milk");
        milkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milkButtonActionPerformed(evt);
            }
        });

        selectColorMButton1.setText("select color");
        selectColorMButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorMButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mcPanelLayout = new javax.swing.GroupLayout(mcPanel);
        mcPanel.setLayout(mcPanelLayout);
        mcPanelLayout.setHorizontalGroup(
            mcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        mcPanelLayout.setVerticalGroup(
            mcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("color in string:");

        insmLabel.setText("0");

        milkList2.setBorder(javax.swing.BorderFactory.createTitledBorder("Milk"));
        milkList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        milkList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                milkList2ValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(milkList2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectColorMButton1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caloriesMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volumeMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(milkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caloriesMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volumeMilkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addComponent(selectColorMButton1))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(insmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(milkButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fruitTabbedPane.addTab("Milk", jPanel3);

        jLabel9.setText("Name:");

        jLabel10.setText("Calories:");

        jLabel12.setText("Volume:");

        iceButton.setText("Add IceCream");
        iceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceButtonActionPerformed(evt);
            }
        });

        selectColorIceButton2.setText("select color");
        selectColorIceButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorIceButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout icPanelLayout = new javax.swing.GroupLayout(icPanel);
        icPanel.setLayout(icPanelLayout);
        icPanelLayout.setHorizontalGroup(
            icPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        icPanelLayout.setVerticalGroup(
            icPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel19.setText("color in string:");

        insiceLabel.setText("0");

        iceList.setBorder(javax.swing.BorderFactory.createTitledBorder("Ice Cream"));
        iceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        iceList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                iceListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(iceList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(volumeIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caloriesIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(selectColorIceButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caloriesIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(volumeIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nameIceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectColorIceButton2)
                        .addGap(12, 12, 12)
                        .addComponent(icPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(insiceLabel))
                .addGap(3, 3, 3)
                .addComponent(iceButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        fruitTabbedPane.addTab("IceCream", jPanel5);

        jLabel13.setText("Name:");

        jLabel14.setText("Calories:");

        jLabel16.setText("Weight:");

        sugarButton.setText("Add Sugar");
        sugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sugarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(caloriesSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(weightSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caloriesSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightSugarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(101, 101, 101)
                .addComponent(sugarButton)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fruitTabbedPane.addTab("Sugar", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fruitTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fruitTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitButtonActionPerformed
        String name = nameFruitTextField.getText();
        double calorise = Double.parseDouble(caloriesFruitTextField.getText());
        double volume = Double.parseDouble(volumeFruitTextField.getText());
        Fruit f=new Fruit(name, calorise, volume, color);
        farr.add(f);
        ingarr.add(f);

         for (int i = 0; i < ingarr.size(); i++) {
            try {
                ble.addIngredients(ingarr.get(i));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(cocktailForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        displayFruit();
        displaying();
        nameFruitTextField.setText("");
        caloriesFruitTextField.setText("");
        volumeFruitTextField.setText(""); 
        fcPanel.setBackground(null);
        insLabel.setText(" ");
    }//GEN-LAST:event_fruitButtonActionPerformed
        void displayFruit() {
        String [] names = new String[farr.size()];
        for (int i = 0; i < farr.size(); i++) {
            names[i] = farr.get(i).getName();  
        }
          fruitList1.setListData(names);
         // ingList.setListData(names);
    }
  
    private void milkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milkButtonActionPerformed
        // TODO add your handling code here:
        String name = nameMilkTextField.getText();
        double calorise = Double.parseDouble(caloriesMilkTextField.getText());
        double volume = Double.parseDouble(volumeMilkTextField.getText());
        Milk m=new Milk(name, calorise, volume, color);
        marr.add(m);
        ingarr.add(m);
        for (int i = 0; i < ingarr.size(); i++) {
            try {
                ble.addIngredients(ingarr.get(i));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(cocktailForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        displayMilk();
        displaying();
        nameMilkTextField.setText("");
        caloriesMilkTextField.setText("");
        volumeMilkTextField.setText(""); 
        mcPanel.setBackground(null);
        insmLabel.setText(" ");
        
    }//GEN-LAST:event_milkButtonActionPerformed
        void displayMilk() {
        String [] names = new String[marr.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = marr.get(i).getName();  
        }
          milkList2.setListData(names);
         // ingList.setListData(names);
    }
    private void iceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceButtonActionPerformed
        // TODO add your handling code here:
        String name = nameIceTextField.getText();
        double calorise = Double.parseDouble(caloriesIceTextField.getText());
        double volume = Double.parseDouble(volumeIceTextField.getText());
        IceCream ice =new IceCream(name, calorise, volume, color);
        icearr.add(ice);
        ingarr.add(ice);
       for (int i = 0; i < ingarr.size(); i++) {
            try {
                ble.addIngredients(ingarr.get(i));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(cocktailForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        displayIceCream();
        displaying();
        nameIceTextField.setText("");
        caloriesIceTextField.setText("");
        volumeIceTextField.setText("");
         icPanel.setBackground(null);
         insiceLabel.setText(" ");
    }//GEN-LAST:event_iceButtonActionPerformed
        void displayIceCream() {
        String [] names = new String[icearr.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = icearr.get(i).getName();  
        }
          iceList.setListData(names);
       //   ingList.setListData(names);
    }
    private void sugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarButtonActionPerformed
        String name = nameSugarTextField.getText();
        double calorise = Double.parseDouble(caloriesSugarTextField.getText());
        double weight = Double.parseDouble(weightSugarTextField.getText());
        int volume=0;
        Sugar sug=new Sugar(weight, name, calorise, volume, color);
        ingarr.add(sug);
         for (int i = 0; i < ingarr.size(); i++) {
            try {
                ble.addIngredients(ingarr.get(i));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(cocktailForm.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       
        displaying();
        nameSugarTextField.setText("");
        caloriesSugarTextField.setText("");
        weightSugarTextField.setText("");
    }//GEN-LAST:event_sugarButtonActionPerformed
    private void selectColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorButtonActionPerformed
        color=Color.BLACK;
        color=JColorChooser.showDialog(this, "select color", color);
        if (color==null) {
            color=color.WHITE;
            fcPanel.setBackground(color);
            insLabel.setText(color.toString());
       }
        fcPanel.setBackground(color);
        insLabel.setText(color.toString());
    }//GEN-LAST:event_selectColorButtonActionPerformed

    private void selectColorMButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorMButton1ActionPerformed
          color=Color.BLACK;
          color=JColorChooser.showDialog(this,"Select color",color);
          if (color==null) {
              color=color.WHITE;
              mcPanel.setBackground(color);
              insmLabel.setText(color.toString());
        }
          mcPanel.setBackground(color);
          insmLabel.setText(color.toString());
    }//GEN-LAST:event_selectColorMButton1ActionPerformed
    private void selectColorIceButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorIceButton2ActionPerformed
       color=Color.BLACK;
          color=JColorChooser.showDialog(this,"Select color",color);
          if (color==null) {
              color=color.WHITE;
              icPanel.setBackground(color);
              insiceLabel.setText(color.toString());
        }
          icPanel.setBackground(color);
          insiceLabel.setText(color.toString());
    }//GEN-LAST:event_selectColorIceButton2ActionPerformed

    private void ingListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ingListValueChanged
//        int index = ingList.getSelectedIndex();
//        if(index != -1) {
//            Ingredient ingr = ingarr.get(index);
//            if (ingr instanceof Fruit) {
//                
//               JOptionPane.showMessageDialog(this, ingr.toString());  
//                
//            }
//           
//        }
    }//GEN-LAST:event_ingListValueChanged

    private void fruitList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fruitList1ValueChanged
        int index = fruitList1.getSelectedIndex();
        if(index != -1) {
           Fruit fru = farr.get(index);
               JOptionPane.showMessageDialog(this, fru.getInfo());  
        }
    }//GEN-LAST:event_fruitList1ValueChanged

    private void milkList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_milkList2ValueChanged
        int index = milkList2.getSelectedIndex();
        if(index != -1) {
          Milk mil= marr.get(index);
               JOptionPane.showMessageDialog(this, mil.getInfo());  
        }
    }//GEN-LAST:event_milkList2ValueChanged

    private void iceListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_iceListValueChanged
        int index = iceList.getSelectedIndex();
        if(index != -1) {
          IceCream ice= icearr.get(index);
               JOptionPane.showMessageDialog(this, ice.getInfo());  
        }
    }//GEN-LAST:event_iceListValueChanged

    private void blendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendButtonActionPerformed
      ble.blend();
      // JOptionPane.showMessageDialog(this,ble.getTotalCalories());
      JOptionPane.showMessageDialog(this, "Total Calories:"+ble.getTotalCalories()+"\nFinal color:"+ble.getFinalColor());
     
       
    }//GEN-LAST:event_blendButtonActionPerformed

    private void picButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picButtonActionPerformed

        try {
       ble.pourIntoCup(cup);
    } catch (BlenderEmptyException ex) {
        Logger.getLogger(cocktailForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    JOptionPane.showMessageDialog(this, "Total Calorise:"+cup.getTotalCalories()+"\nCapacity:"+cup.getCapacity());
    }//GEN-LAST:event_picButtonActionPerformed
    void displaying(){
        String [] names = new String[ingarr.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = ingarr.get(i).getName();  
        }
          ingList.setListData(names);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cocktailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cocktailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cocktailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cocktailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cocktailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blendButton;
    private javax.swing.JTextField caloriesFruitTextField;
    private javax.swing.JTextField caloriesIceTextField;
    private javax.swing.JTextField caloriesMilkTextField;
    private javax.swing.JTextField caloriesSugarTextField;
    private javax.swing.JPanel fcPanel;
    private javax.swing.JButton fruitButton;
    private javax.swing.JList<String> fruitList1;
    private javax.swing.JTabbedPane fruitTabbedPane;
    private javax.swing.JPanel icPanel;
    private javax.swing.JButton iceButton;
    private javax.swing.JList<String> iceList;
    private javax.swing.JList<String> ingList;
    private javax.swing.JLabel insLabel;
    private javax.swing.JLabel insiceLabel;
    private javax.swing.JLabel insmLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel mcPanel;
    private javax.swing.JButton milkButton;
    private javax.swing.JList<String> milkList2;
    private javax.swing.JTextField nameFruitTextField;
    private javax.swing.JTextField nameIceTextField;
    private javax.swing.JTextField nameMilkTextField;
    private javax.swing.JTextField nameSugarTextField;
    private javax.swing.JButton picButton;
    private javax.swing.JButton selectColorButton;
    private javax.swing.JButton selectColorIceButton2;
    private javax.swing.JButton selectColorMButton1;
    private javax.swing.JButton sugarButton;
    private javax.swing.JTextField volumeFruitTextField;
    private javax.swing.JTextField volumeIceTextField;
    private javax.swing.JTextField volumeMilkTextField;
    private javax.swing.JTextField weightSugarTextField;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
