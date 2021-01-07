
package calendario;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Grafico extends javax.swing.JFrame {

    JLabel di[] = new JLabel[37];
    Operaciones op = new Operaciones();
    int mo = op.mesActual();
    int ye = op.anoActual();
    
    public Grafico() {
        initComponents();
        this.setLocationRelativeTo(null);
        di[0] = d1;
        di[1] = d2;
        di[2] = d3;
        di[3] = d4;
        di[4] = d5;
        di[5] = d6;
        di[6] = d7;
        di[7] = d8;
        di[8] = d9;
        di[9] = d10;
        di[10] = d11;
        di[11] = d12;
        di[12] = d13;
        di[13] = d14;
        di[14] = d15;
        di[15] = d16;
        di[16] = d17;
        di[17] = d18;
        di[18] = d19;
        di[19] = d20;
        di[20] = d21;
        di[21] = d22;
        di[22] = d23;
        di[23] = d24;
        di[24] = d25;
        di[25] = d26;
        di[26] = d27;
        di[27] = d28;
        di[28] = d29;
        di[29] = d30;
        di[30] = d31;
        di[31] = d32;
        di[32] = d33;
        di[33] = d34;
        di[34] = d35;
        di[35] = d36;
        di[36] = d37;
        calcularDias(op.mesActual(),op.anoActual(),op.diaActual());
    }

    public void calcularDias(int mes, int ano,int dia){
        int semana=3;
        int i,j,k;
        
        for(i=1582;i<=ano;i++){
            if(i==ano){
                for(j=1;j<=mes;j++){
                    if(j<mes){
                        if(j==2){
                           if(i%4==0){
                                for(k=1;k<=29;k++){
                                    if(semana==7){
                                        semana=1;
                                    }else{
                                        semana+=1;
                                    }
                                }
                            }else{
                                for(k=1;k<=28;k++){
                                    if(semana==7){
                                        semana=1;
                                    }else{
                                        semana+=1;
                                    }
                                }
                            }
                        }else{
                            if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
                                for(k=1;k<=31;k++){
                                    if(semana==7){
                                        semana=1;
                                    }else{
                                        semana+=1;
                                    }
                                }
                            }else{
                                for(k=1;k<=30;k++){
                                    if(semana==7){
                                        semana=1;
                                    }else{
                                        semana+=1;
                                    }
                                }
                            }
                        }
                    }else{
                        if(j==2){
                           if(i%4==0){
                                for(k=1;k<=29;k++){
                                    di[(semana-2)+k].setText(String.valueOf(k));
                                    if(k==dia){
                                        di[(semana-2)+k].setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                                    }
                                }
                            }else{
                                for(k=1;k<=28;k++){
                                    di[(semana-2)+k].setText(String.valueOf(k));
                                    if(k==dia){
                                        di[(semana-2)+k].setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                                    }
                                }
                            }
                        }else{
                            if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
                                for(k=1;k<=31;k++){
                                    di[(semana-2)+k].setText(String.valueOf(k));
                                    if(k==dia){
                                        di[(semana-2)+k].setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                                    }
                                }
                            }else{
                                for(k=1;k<=30;k++){
                                    di[(semana-2)+k].setText(String.valueOf(k));
                                    if(k==dia){
                                        di[(semana-2)+k].setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                                    }
                                }
                            }
                        }
                    }
                }
            }else{
                for(j=1;j<=12;j++){
                    if(j==2){
                       if(i%4==0){
                            for(k=1;k<=29;k++){
                                if(semana==7){
                                   semana=1;
                                }else{
                                   semana+=1;
                                }
                            }
                        }else{
                            for(k=1;k<=28;k++){
                                if(semana==7){
                                   semana=1;
                                }else{
                                   semana+=1;
                                }
                            }
                        }
                    }else{
                        if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
                            for(k=1;k<=31;k++){
                                if(semana==7){
                                   semana=1;
                                }else{
                                   semana+=1;
                                }
                            }
                        }else{
                            for(k=1;k<=30;k++){
                                if(semana==7){
                                   semana=1;
                                }else{
                                   semana+=1;
                                }
                            }
                        }
                    }
                }
            }
        }
        switch(mes){
            case 1:
                meses.setText("Enero");
                break;
            
            case 2:
                meses.setText("Febrero");
                break;
                
            case 3:
                meses.setText("Marzo");
                break;
                
            case 4:
                meses.setText("Abril");
                break;
                
            case 5:
                meses.setText("Mayo");
                break;
                
            case 6:
                meses.setText("Junio");
                break;
                
            case 7:
                meses.setText("Julio");
                break;
                
            case 8:
                meses.setText("Agosto");
                break;
                
            case 9:
                meses.setText("Septiembre");
                break;
                
            case 10:
                meses.setText("Octubre");
                break;
                
            case 11:
                meses.setText("Noviembre");
                break;
                
            case 12:
                meses.setText("Diciembre");
                break;
        }
        anio.setText(String.valueOf(ano));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        meses = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d29 = new javax.swing.JLabel();
        d22 = new javax.swing.JLabel();
        d15 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        d16 = new javax.swing.JLabel();
        d23 = new javax.swing.JLabel();
        d30 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d17 = new javax.swing.JLabel();
        d18 = new javax.swing.JLabel();
        d24 = new javax.swing.JLabel();
        d25 = new javax.swing.JLabel();
        d31 = new javax.swing.JLabel();
        d32 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d27 = new javax.swing.JLabel();
        d26 = new javax.swing.JLabel();
        d19 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d34 = new javax.swing.JLabel();
        d33 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        d20 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        d21 = new javax.swing.JLabel();
        d28 = new javax.swing.JLabel();
        d35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TareasT = new javax.swing.JTable();
        d36 = new javax.swing.JLabel();
        d37 = new javax.swing.JLabel();
        anio = new javax.swing.JLabel();
        izquierda = new javax.swing.JLabel();
        derecha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dom");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 74, 60, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lun");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 74, 60, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jue");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 74, 60, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mie");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 74, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 74, 60, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vie");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 74, 60, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sab");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 74, 60, -1));

        meses.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        meses.setText("Enero");
        getContentPane().add(meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 270, -1));

        d1.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 121, 60, 60));

        d29.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d29, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 385, 60, 60));

        d22.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d22, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 319, 60, 60));

        d15.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d15, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 253, 60, 60));

        d8.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 187, 60, 60));

        d2.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 121, 60, 60));

        d9.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 187, 60, 60));

        d16.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d16, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 253, 60, 60));

        d23.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d23, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 319, 60, 60));

        d30.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d30, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 385, 60, 60));

        d3.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 121, 60, 60));

        d10.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 187, 60, 60));

        d4.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 121, 60, 60));

        d11.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 187, 60, 60));

        d17.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d17, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 253, 60, 60));

        d18.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d18, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 253, 60, 60));

        d24.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d24, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 319, 60, 60));

        d25.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d25, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 319, 60, 60));

        d31.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 385, 60, 60));

        d32.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d32, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 385, 60, 60));

        d6.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 121, 60, 60));

        d27.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d27, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 319, 60, 60));

        d26.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d26, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 319, 60, 60));

        d19.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d19, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 253, 60, 60));

        d12.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 187, 60, 60));

        d5.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 121, 60, 60));

        d34.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d34, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 385, 60, 60));

        d33.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d33, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 385, 60, 60));

        d13.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d13, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 187, 60, 60));

        d20.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d20, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 253, 60, 60));

        d7.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 121, 60, 60));

        d14.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d14, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 187, 60, 60));

        d21.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d21, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 253, 60, 60));

        d28.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d28, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 319, 60, 60));

        d35.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d35, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 385, 60, 60));

        jButton1.setText("Agregar Tarea");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 486, -1, -1));

        jButton2.setText("Eliminar Tarea");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 486, -1, -1));

        jButton3.setText("Modificar Tarea");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 486, -1, -1));

        TareasT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Hora", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TareasT);
        if (TareasT.getColumnModel().getColumnCount() > 0) {
            TareasT.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 35, 351, 433));

        d36.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d36, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 451, 60, 60));

        d37.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        d37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(d37, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 451, 60, 60));

        anio.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        anio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        anio.setText("2020");
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 6, 168, -1));

        izquierda.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        izquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        izquierda.setText("<");
        izquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izquierdaMouseClicked(evt);
            }
        });
        getContentPane().add(izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 278, -1, 35));

        derecha.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        derecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        derecha.setText(">");
        derecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                derechaMouseClicked(evt);
            }
        });
        getContentPane().add(derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 278, -1, 35));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Usuario");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 1, true));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 210, 35));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 104, 210, 35));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contraseña");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 210, 35));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 234, 210, 35));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salir");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 320, 180, 35));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cambiar de Usuario");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 380, 180, 35));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Ayuda");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 440, 180, 35));

        jLabel9.setBackground(new java.awt.Color(0, 102, 204));
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 12, 264, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void derechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMouseClicked
        if(mo==12){
            mo=1;
            ye+=1;
        }else{
            mo+=1;
        }
        for(int i=0;i<di.length;i++){
            di[i].setText("");
            di[i].setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.black));
        }
        if(mo==op.mesActual()&&ye==op.anoActual()){
            calcularDias(mo,ye,op.diaActual());
        }else{
            calcularDias(mo,ye,0);
        }
    }//GEN-LAST:event_derechaMouseClicked

    private void izquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izquierdaMouseClicked
        if(mo==1){
            mo=12;
            ye-=1;
        }else{
            mo-=1;
        }     
        for(int i=0;i<di.length;i++){
            di[i].setText("");
            di[i].setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.black));
        }
        if(mo==op.mesActual()&&ye==op.anoActual()){
            calcularDias(mo,ye,op.diaActual());
        }else{
            calcularDias(mo,ye,0);
        }
    }//GEN-LAST:event_izquierdaMouseClicked

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Grafico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TareasT;
    private javax.swing.JLabel anio;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d10;
    private javax.swing.JLabel d11;
    private javax.swing.JLabel d12;
    private javax.swing.JLabel d13;
    private javax.swing.JLabel d14;
    private javax.swing.JLabel d15;
    private javax.swing.JLabel d16;
    private javax.swing.JLabel d17;
    private javax.swing.JLabel d18;
    private javax.swing.JLabel d19;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d20;
    private javax.swing.JLabel d21;
    private javax.swing.JLabel d22;
    private javax.swing.JLabel d23;
    private javax.swing.JLabel d24;
    private javax.swing.JLabel d25;
    private javax.swing.JLabel d26;
    private javax.swing.JLabel d27;
    private javax.swing.JLabel d28;
    private javax.swing.JLabel d29;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d30;
    private javax.swing.JLabel d31;
    private javax.swing.JLabel d32;
    private javax.swing.JLabel d33;
    private javax.swing.JLabel d34;
    private javax.swing.JLabel d35;
    private javax.swing.JLabel d36;
    private javax.swing.JLabel d37;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JLabel derecha;
    private javax.swing.JLabel izquierda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel meses;
    // End of variables declaration//GEN-END:variables
}
