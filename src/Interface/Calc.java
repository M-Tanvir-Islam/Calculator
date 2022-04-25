package Interface;

public class Calc extends javax.swing.JFrame {

   
	private static final long serialVersionUID = 1L;
	String value;
    double fnum;
    double snum;
    String operator;
    double ans;
  
    public Calc() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdisplay = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdisplay.setEditable(false);
        txtdisplay.setFont(new java.awt.Font("Tahoma", 1, 20));
        txtdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtdisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txtdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 70));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 50));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, 50));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 50));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 50));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 50));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 50));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 50));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 70, 50));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 70, 50));

        btn10.setFont(new java.awt.Font("Tahoma", 1, 18));
        btn10.setText("+/-");
        btn10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 50));

        btn11.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn11.setText("0");
        btn11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 70, 50));

        btn12.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn12.setText(".");
        btn12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 70, 50));

        btn14.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn14.setText("c");
        btn14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 50));

        btn15.setFont(new java.awt.Font("Tahoma", 1, 18));
        btn15.setText("=");
        btn15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel1.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 150, 50));

        btn16.setFont(new java.awt.Font("Tahoma", 1, 18));
        btn16.setText("+");
        btn16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel1.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, 50));

        btn17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn17.setText("-");
        btn17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel1.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 50));

        btn18.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btn18.setText("*");
        btn18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        jPanel1.add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 70, 50));

        btn19.setFont(new java.awt.Font("Tahoma", 1, 18));
        btn19.setText("/");
        btn19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        jPanel1.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 70, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 430));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
     
       value= txtdisplay.getText()+"1";
       txtdisplay.setText(value);
        
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
       value= txtdisplay.getText()+"2";
       txtdisplay.setText(value);
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
       value= txtdisplay.getText()+"3";
       txtdisplay.setText(value);
    }

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+" + ";
       txtdisplay.setText(value);
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
       value= txtdisplay.getText()+"4";
       txtdisplay.setText(value);
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
       value= txtdisplay.getText()+"5";
       txtdisplay.setText(value);
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
      value= txtdisplay.getText()+"6";
       txtdisplay.setText(value);
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
      value= txtdisplay.getText()+"7";
       txtdisplay.setText(value);
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
      value= txtdisplay.getText()+"8";
       txtdisplay.setText(value);
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
      value= txtdisplay.getText()+"9";
       txtdisplay.setText(value);
    }

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {
      if(txtdisplay.getText().length()>0)
      {
            
               double text=Double.parseDouble(txtdisplay.getText());
               double y= -1 * text;
               txtdisplay.setText(String.valueOf(y));     
      }
    }

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+"0";
       txtdisplay.setText(value);
    }

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+".";
       txtdisplay.setText(value);
    }

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+" / ";
       txtdisplay.setText(value);
    }

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+" * ";
       txtdisplay.setText(value);
    }

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {
        value= txtdisplay.getText()+" - ";
       txtdisplay.setText(value);
    }

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {
      txtdisplay.setText("");
    }

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {
      
        answer();
        
    }

    private void answer()
    {
        int x=txtdisplay.getText().length();
        fnum= Double.parseDouble(value.substring(0, value.indexOf(" ")));
        snum= Double.parseDouble(value.substring(value.indexOf(" ")+2, x));
        operator= value.substring(value.indexOf(" ")+1,value.indexOf(" ")+2);
       
        if(operator.equals("+"))
        {
            ans = fnum+snum;
        }
        else if(operator.equals("-"))
        {
            ans = fnum-snum;
        }
         else if(operator.equals("*"))
        {
            ans = fnum*snum;
        }
         else if(operator.equals("/"))
        {
            ans = fnum/snum;
        }
         else
        {
            txtdisplay.setText("");
        }
        
        txtdisplay.setText(String.valueOf(ans));
    
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdisplay;
}
