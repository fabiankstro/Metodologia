/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Idiomas.Idioma;

/**
 *
 * @author castrorj
 */
public class Create extends javax.swing.JFrame {

    public void Language (){
        Idioma idiom = new Idioma();
        if (LogIn.lang != "" && LogIn.Country != ""){
            lbl_Title.setText(idiom.language(LogIn.lang, LogIn.Country, "Create"));
            lbl_Name_BU.setText(idiom.language(LogIn.lang, LogIn.Country, "Name"));
        }
    }
    /**
     * Creates new form Create
     */
    public Create() {
        initComponents();
        Language();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_Name_BU = new javax.swing.JLabel();
        txt_Name_BU = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_BU_Area = new javax.swing.JLabel();
        cmb_BU_Area = new javax.swing.JComboBox<>();
        lbl_Name_Area = new javax.swing.JLabel();
        txt_Area = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbl_BU_Dept = new javax.swing.JLabel();
        lbl_Area_Dept = new javax.swing.JLabel();
        lbl_DeptNo = new javax.swing.JLabel();
        lbl_DeptName = new javax.swing.JLabel();
        txt_DeptNo = new javax.swing.JTextField();
        txt_DeptName = new javax.swing.JTextField();
        cmb_Area_Dept = new javax.swing.JComboBox<>();
        cmb_BU_Dept = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lbl_BU_Prod = new javax.swing.JLabel();
        cmb_BU_Prod = new javax.swing.JComboBox<>();
        cmb_Area_Prod = new javax.swing.JComboBox<>();
        lbl_Area_Prod = new javax.swing.JLabel();
        lbl_Dept_Prod = new javax.swing.JLabel();
        cmb_Dept_Prod = new javax.swing.JComboBox<>();
        lbl_ProdName = new javax.swing.JLabel();
        txt_ProdName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbl_empNo = new javax.swing.JLabel();
        lbl__empName = new javax.swing.JLabel();
        lbl__empLastName = new javax.swing.JLabel();
        lbl_Password_emp = new javax.swing.JLabel();
        lbl_Department_emp = new javax.swing.JLabel();
        lbl_Rol_emp = new javax.swing.JLabel();
        cmb_Dept_emp = new javax.swing.JComboBox<>();
        cmb_Rol_emp = new javax.swing.JComboBox<>();
        txt_empName = new javax.swing.JTextField();
        txt__empLastName = new javax.swing.JTextField();
        txt_empPass = new javax.swing.JPasswordField();
        lbl_BU_emp = new javax.swing.JLabel();
        cmb_BU_emp = new javax.swing.JComboBox<>();
        lbl_Area_emp = new javax.swing.JLabel();
        cmb_Area_emp = new javax.swing.JComboBox<>();
        txt_empNo = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        lbl_RwkType = new javax.swing.JLabel();
        txt_RwkType = new javax.swing.JTextField();
        bnt_Cancel = new javax.swing.JButton();
        txt_EmpNo = new javax.swing.JTextField();
        lbl_EmpNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Title.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create-new-pencil-button.png"))); // NOI18N
        lbl_Title.setText("Create");

        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        lbl_Name_BU.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Name_BU.setText("Name");

        txt_Name_BU.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(lbl_Name_BU)
                .addGap(18, 18, 18)
                .addComponent(txt_Name_BU, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Name_BU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name_BU))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Business Unit", jPanel1);

        lbl_BU_Area.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_BU_Area.setText("Business Unit");

        cmb_BU_Area.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_BU_Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_Name_Area.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Name_Area.setText("Name");

        txt_Area.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Name_Area)
                    .addComponent(lbl_BU_Area))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_BU_Area, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_BU_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_BU_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Name_Area)
                    .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Area", jPanel2);

        lbl_BU_Dept.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_BU_Dept.setText("Business Unit");

        lbl_Area_Dept.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Area_Dept.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_Area_Dept.setText("Area");

        lbl_DeptNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_DeptNo.setText("Department No");

        lbl_DeptName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_DeptName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_DeptName.setText("Name");

        txt_DeptNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_DeptNo.setPreferredSize(new java.awt.Dimension(72, 30));

        txt_DeptName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_DeptName.setPreferredSize(new java.awt.Dimension(72, 30));

        cmb_Area_Dept.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Area_Dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_BU_Dept.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_BU_Dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_DeptNo)
                            .addComponent(lbl_Area_Dept)
                            .addComponent(lbl_DeptName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_DeptNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_DeptName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_Area_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_BU_Dept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_BU_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_BU_Dept)
                    .addComponent(cmb_BU_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Area_Dept)
                    .addComponent(cmb_Area_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DeptNo)
                    .addComponent(txt_DeptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DeptName)
                    .addComponent(txt_DeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Department", jPanel3);

        lbl_BU_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_BU_Prod.setText("Business Unit");

        cmb_BU_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_BU_Prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_Area_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Area_Prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_Area_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Area_Prod.setText("Area");

        lbl_Dept_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Dept_Prod.setText("Department");

        cmb_Dept_Prod.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Dept_Prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_ProdName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_ProdName.setText("Name");

        txt_ProdName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(lbl_BU_Prod))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(lbl_Area_Prod))
                            .addComponent(lbl_Dept_Prod, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmb_Dept_Prod, 0, 138, Short.MAX_VALUE)
                            .addComponent(cmb_BU_Prod, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_Area_Prod, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_ProdName)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_BU_Prod)
                    .addComponent(cmb_BU_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Area_Prod)
                    .addComponent(cmb_Area_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Dept_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dept_Prod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ProdName))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prod Number", jPanel4);

        lbl_empNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_empNo.setText("Employee Number");

        lbl__empName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl__empName.setText("Name");

        lbl__empLastName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl__empLastName.setText("Last Name");

        lbl_Password_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Password_emp.setText("Password");

        lbl_Department_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Department_emp.setText("Department");

        lbl_Rol_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Rol_emp.setText("Rol");

        cmb_Dept_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Dept_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_Rol_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Rol_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_empName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        txt__empLastName.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        txt_empPass.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_empPass.setToolTipText("");

        lbl_BU_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_BU_emp.setText("Business Unit");

        cmb_BU_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_BU_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_Area_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_Area_emp.setText("Area");

        cmb_Area_emp.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        cmb_Area_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            txt_empNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_empNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_empNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_empNo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_BU_emp))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl__empLastName)
                            .addComponent(lbl__empName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(lbl_Area_emp))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Rol_emp)
                                    .addComponent(lbl_Department_emp)))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt__empLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lbl_Password_emp)
                            .addGap(11, 11, 11)
                            .addComponent(txt_empPass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_Rol_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Dept_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Area_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_BU_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_empNo)
                    .addComponent(lbl_BU_emp)
                    .addComponent(cmb_BU_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl__empName)
                    .addComponent(lbl_Area_emp)
                    .addComponent(cmb_Area_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt__empLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl__empLastName)
                    .addComponent(lbl_Department_emp)
                    .addComponent(cmb_Dept_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Password_emp)
                    .addComponent(lbl_Rol_emp)
                    .addComponent(cmb_Rol_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Employee", jPanel5);

        lbl_RwkType.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_RwkType.setText("Task Name");

        txt_RwkType.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lbl_RwkType)
                .addGap(18, 18, 18)
                .addComponent(txt_RwkType, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_RwkType)
                    .addComponent(txt_RwkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ReworkType", jPanel6);

        bnt_Cancel.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        bnt_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N
        bnt_Cancel.setText("Cancel");
        bnt_Cancel.setMaximumSize(new java.awt.Dimension(133, 41));
        bnt_Cancel.setMinimumSize(new java.awt.Dimension(133, 41));
        bnt_Cancel.setPreferredSize(new java.awt.Dimension(133, 41));

        txt_EmpNo.setEditable(false);
        txt_EmpNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_EmpNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_EmpNo.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lbl_EmpNo.setText("Employee No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(btn_Save)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(lbl_EmpNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_EmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EmpNo)
                    .addComponent(txt_EmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Save, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnt_Cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> cmb_Area_Dept;
    private javax.swing.JComboBox<String> cmb_Area_Prod;
    private javax.swing.JComboBox<String> cmb_Area_emp;
    private javax.swing.JComboBox<String> cmb_BU_Area;
    private javax.swing.JComboBox<String> cmb_BU_Dept;
    private javax.swing.JComboBox<String> cmb_BU_Prod;
    private javax.swing.JComboBox<String> cmb_BU_emp;
    private javax.swing.JComboBox<String> cmb_Dept_Prod;
    private javax.swing.JComboBox<String> cmb_Dept_emp;
    private javax.swing.JComboBox<String> cmb_Rol_emp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Area_Dept;
    private javax.swing.JLabel lbl_Area_Prod;
    private javax.swing.JLabel lbl_Area_emp;
    private javax.swing.JLabel lbl_BU_Area;
    private javax.swing.JLabel lbl_BU_Dept;
    private javax.swing.JLabel lbl_BU_Prod;
    private javax.swing.JLabel lbl_BU_emp;
    private javax.swing.JLabel lbl_Department_emp;
    private javax.swing.JLabel lbl_DeptName;
    private javax.swing.JLabel lbl_DeptNo;
    private javax.swing.JLabel lbl_Dept_Prod;
    private javax.swing.JLabel lbl_EmpNo;
    private javax.swing.JLabel lbl_Name_Area;
    private javax.swing.JLabel lbl_Name_BU;
    private javax.swing.JLabel lbl_Password_emp;
    private javax.swing.JLabel lbl_ProdName;
    private javax.swing.JLabel lbl_Rol_emp;
    private javax.swing.JLabel lbl_RwkType;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl__empLastName;
    private javax.swing.JLabel lbl__empName;
    private javax.swing.JLabel lbl_empNo;
    private javax.swing.JTextField txt_Area;
    private javax.swing.JTextField txt_DeptName;
    private javax.swing.JTextField txt_DeptNo;
    private javax.swing.JTextField txt_EmpNo;
    private javax.swing.JTextField txt_Name_BU;
    private javax.swing.JTextField txt_ProdName;
    private javax.swing.JTextField txt_RwkType;
    private javax.swing.JTextField txt__empLastName;
    private javax.swing.JTextField txt_empName;
    private javax.swing.JFormattedTextField txt_empNo;
    private javax.swing.JPasswordField txt_empPass;
    // End of variables declaration//GEN-END:variables
}