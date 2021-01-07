
package ajedrez;

import javax.swing.JLabel;

public class Tablero extends javax.swing.JFrame {
    
    JLabel cas[][] = new JLabel[8][8];
    Pieza casilla[][] = new Pieza[8][8];
    Peon peones[] = new Peon[16];
    Alfil alfiles[] = new Alfil[4];
    Torre torres[] = new Torre[4];
    Caballo caballos[] = new Caballo[4];
    Reina reinas[] = new Reina[2];
    Rey reyes[] = new Rey[2];
    boolean confirm[][] = new boolean[8][8];
    Peon peon = new Peon();
    Caballo caballo = new Caballo();
    Alfil alfil = new Alfil();
    Torre torre = new Torre();
    Reina reina = new Reina();
    Rey rey = new Rey();
      
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        asignarLabels();
        inicializarPiezas();
        inicializarCasillas();
    }
    
    public void asignarLabels(){
        cas[0][0] = A1;
        cas[0][1] = B1;
        cas[0][2] = C1;
        cas[0][3] = D1;
        cas[0][4] = E1;
        cas[0][5] = F1;
        cas[0][6] = G1;
        cas[0][7] = H1;
        cas[1][0] = A2;
        cas[1][1] = B2;
        cas[1][2] = C2;
        cas[1][3] = D2;
        cas[1][4] = E2;
        cas[1][5] = F2;
        cas[1][6] = G2;
        cas[1][7] = H2;
        cas[2][0] = A3;
        cas[2][1] = B3;
        cas[2][2] = C3;
        cas[2][3] = D3;
        cas[2][4] = E3;
        cas[2][5] = F3;
        cas[2][6] = G3;
        cas[2][7] = H3;
        cas[3][0] = A4;
        cas[3][1] = B4;
        cas[3][2] = C4;
        cas[3][3] = D4;
        cas[3][4] = E4;
        cas[3][5] = F4;
        cas[3][6] = G4;
        cas[3][7] = H4;
        cas[4][0] = A5;
        cas[4][1] = B5;
        cas[4][2] = C5;
        cas[4][3] = D5;
        cas[4][4] = E5;
        cas[4][5] = F5;
        cas[4][6] = G5;
        cas[4][7] = H5;
        cas[5][0] = A6;
        cas[5][1] = B6;
        cas[5][2] = C6;
        cas[5][3] = D6;
        cas[5][4] = E6;
        cas[5][5] = F6;
        cas[5][6] = G6;
        cas[5][7] = H6;
        cas[6][0] = A7;
        cas[6][1] = B7;
        cas[6][2] = C7;
        cas[6][3] = D7;
        cas[6][4] = E7;
        cas[6][5] = F7;
        cas[6][6] = G7;
        cas[6][7] = H7;
        cas[7][0] = A8;
        cas[7][1] = B8;
        cas[7][2] = C8;
        cas[7][3] = D8;
        cas[7][4] = E8;
        cas[7][5] = F8;
        cas[7][6] = G8;
        cas[7][7] = H8;
    }
    
    public void inicializarPiezas(){
        for(int i=0;i<8;i++){
            peones[i] = new Peon("blanco",1);
        }
        for(int i=8;i<16;i++){
            peones[i] = new Peon("negro",1);
        }
        alfiles[0] = new Alfil("blanco",5);
        alfiles[1] = new Alfil("blanco",5);
        alfiles[2] = new Alfil("negro",5);
        alfiles[3] = new Alfil("negro",5);
        
        torres[0] = new Torre("blanco",10);
        torres[1] = new Torre("blanco",10);
        torres[2] = new Torre("negro",10);
        torres[3] = new Torre("negro",10);
        
        caballos[0] = new Caballo("blanco",3);
        caballos[1] = new Caballo("blanco",3);
        caballos[2] = new Caballo("negro",3);
        caballos[3] = new Caballo("negro",3);
        
        reinas[0] = new Reina("blanco",20);
        reinas[1] = new Reina("negro",20);
        
        reyes[0] = new Rey("blanco",50);
        reyes[1] = new Rey("negro",50);
    }
    
    public void inicializarCasillas(){
        casilla[0][0] = torres[0];
        casilla[0][1] = caballos[0];
        casilla[0][2] = alfiles[0];
        casilla[0][3] = reinas[0];
        casilla[0][4] = reyes[0];
        casilla[0][5] = alfiles[1];
        casilla[0][6] = caballos[1];
        casilla[0][7] = torres[1];
        for(int i=0;i<8;i++){
            casilla[1][i] = peones[i];
        }
        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                casilla[i][j] = null;
            }
        }
        casilla[7][0] = torres[2];
        casilla[7][1] = caballos[2];
        casilla[7][2] = alfiles[2];
        casilla[7][3] = reinas[1];
        casilla[7][4] = reyes[1];
        casilla[7][5] = alfiles[3];
        casilla[7][6] = caballos[3];
        casilla[7][7] = torres[3];
        for(int i=0;i<8;i++){
            casilla[6][i] = peones[i+8];
        }
    }
    
    public void moverPeon(int a, int b){
        if(a==7){
            
        }
        if(a==0){
            
        }
        if(a>0&&a<7){
            if(casilla[b+1][a+1]==null&&casilla[b+1][a-1]==null){
                int aux[][] = peon.movimiento(a, b, false);
                for(int i=0;i<aux.length;i++){
                    if(casilla[aux[i][1]][aux[i][0]]==null){
                        confirm[aux[i][1]][aux[i][0]] = true;
                    }else{
                        break;
                    }
                }
            }else{
                if(casilla[b+1][a+1]!=null&&casilla[b+1][a-1]==null){
                    if(casilla[b+1][a+1].getColor().equals(casilla[b][a].getColor())){
                        int aux[][] = peon.movimiento(a, b, false);
                        for(int i=0;i<aux.length;i++){
                            if(casilla[aux[i][1]][aux[i][0]]==null){
                                confirm[aux[i][1]][aux[i][0]] = true;
                            }else{
                                break;
                            }
                        }
                    }else{
                        int aux[][] = peon.movimiento(a, b, true);
                        if(casilla[aux[0][1]][aux[0][0]]==null){
                            confirm[aux[0][1]][aux[0][0]] = true;
                            if(casilla[aux[1][1]][aux[1][0]]==null){
                                confirm[aux[1][1]][aux[1][0]] = true;
                            }
                        }else{
                            
                        }
                        
                    }
                }
                if(casilla[b+1][a+1]==null&&casilla[b+1][a-1]!=null){
                    
                }
                if(casilla[b+1][a+1]!=null&&casilla[b+1][a-1]!=null){
                    
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        OCHO = new javax.swing.JLabel();
        SIETE = new javax.swing.JLabel();
        SEIS = new javax.swing.JLabel();
        CINCO = new javax.swing.JLabel();
        CUATRO = new javax.swing.JLabel();
        TRES = new javax.swing.JLabel();
        DOS = new javax.swing.JLabel();
        UNO = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        H3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        H4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        H5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        H6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        G7 = new javax.swing.JLabel();
        H7 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        G8 = new javax.swing.JLabel();
        H8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contPeonB = new javax.swing.JLabel();
        contCaballoB = new javax.swing.JLabel();
        contAlfilB = new javax.swing.JLabel();
        contTorreB = new javax.swing.JLabel();
        peonB = new javax.swing.JLabel();
        caballoB = new javax.swing.JLabel();
        alfilB = new javax.swing.JLabel();
        torreB = new javax.swing.JLabel();
        reinaB = new javax.swing.JLabel();
        contTorreN = new javax.swing.JLabel();
        contAlfilN = new javax.swing.JLabel();
        contCaballoN = new javax.swing.JLabel();
        contPeonN = new javax.swing.JLabel();
        reinaN = new javax.swing.JLabel();
        torreN = new javax.swing.JLabel();
        alfilN = new javax.swing.JLabel();
        caballoN = new javax.swing.JLabel();
        peonN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A.setBackground(new java.awt.Color(130, 96, 22));
        A.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.setOpaque(true);
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 30));

        B.setBackground(new java.awt.Color(130, 96, 22));
        B.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setOpaque(true);
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 80, 30));

        C.setBackground(new java.awt.Color(130, 96, 22));
        C.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.setOpaque(true);
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 80, 30));

        D.setBackground(new java.awt.Color(130, 96, 22));
        D.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.setOpaque(true);
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 80, 30));

        E.setBackground(new java.awt.Color(130, 96, 22));
        E.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        E.setForeground(new java.awt.Color(255, 255, 255));
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.setOpaque(true);
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 80, 30));

        F.setBackground(new java.awt.Color(130, 96, 22));
        F.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("F");
        F.setOpaque(true);
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 30));

        G.setBackground(new java.awt.Color(130, 96, 22));
        G.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        G.setForeground(new java.awt.Color(255, 255, 255));
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        G.setOpaque(true);
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 80, 30));

        H.setBackground(new java.awt.Color(130, 96, 22));
        H.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("H");
        H.setOpaque(true);
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 80, 30));

        OCHO.setBackground(new java.awt.Color(130, 96, 22));
        OCHO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        OCHO.setForeground(new java.awt.Color(255, 255, 255));
        OCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OCHO.setText("8");
        OCHO.setOpaque(true);
        getContentPane().add(OCHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 30, 80));

        SIETE.setBackground(new java.awt.Color(130, 96, 22));
        SIETE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SIETE.setForeground(new java.awt.Color(255, 255, 255));
        SIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIETE.setText("7");
        SIETE.setOpaque(true);
        getContentPane().add(SIETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 30, 80));

        SEIS.setBackground(new java.awt.Color(130, 96, 22));
        SEIS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SEIS.setForeground(new java.awt.Color(255, 255, 255));
        SEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEIS.setText("6");
        SEIS.setOpaque(true);
        getContentPane().add(SEIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 30, 80));

        CINCO.setBackground(new java.awt.Color(130, 96, 22));
        CINCO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CINCO.setForeground(new java.awt.Color(255, 255, 255));
        CINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CINCO.setText("5");
        CINCO.setOpaque(true);
        getContentPane().add(CINCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 30, 80));

        CUATRO.setBackground(new java.awt.Color(130, 96, 22));
        CUATRO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CUATRO.setForeground(new java.awt.Color(255, 255, 255));
        CUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUATRO.setText("4");
        CUATRO.setOpaque(true);
        getContentPane().add(CUATRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 30, 80));

        TRES.setBackground(new java.awt.Color(130, 96, 22));
        TRES.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TRES.setForeground(new java.awt.Color(255, 255, 255));
        TRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRES.setText("3");
        TRES.setOpaque(true);
        getContentPane().add(TRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 30, 80));

        DOS.setBackground(new java.awt.Color(130, 96, 22));
        DOS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        DOS.setForeground(new java.awt.Color(255, 255, 255));
        DOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOS.setText("2");
        DOS.setOpaque(true);
        getContentPane().add(DOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 30, 80));

        UNO.setBackground(new java.awt.Color(130, 96, 22));
        UNO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        UNO.setForeground(new java.awt.Color(255, 255, 255));
        UNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UNO.setText("1");
        UNO.setOpaque(true);
        getContentPane().add(UNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 30, 80));

        a.setBackground(new java.awt.Color(130, 96, 22));
        a.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("A");
        a.setOpaque(true);
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 80, 30));

        b.setBackground(new java.awt.Color(130, 96, 22));
        b.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText("B");
        b.setOpaque(true);
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 80, 30));

        c.setBackground(new java.awt.Color(130, 96, 22));
        c.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("C");
        c.setOpaque(true);
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 80, 30));

        d.setBackground(new java.awt.Color(130, 96, 22));
        d.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("D");
        d.setOpaque(true);
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, 80, 30));

        e.setBackground(new java.awt.Color(130, 96, 22));
        e.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e.setText("E");
        e.setOpaque(true);
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, 80, 30));

        f.setBackground(new java.awt.Color(130, 96, 22));
        f.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f.setText("F");
        f.setOpaque(true);
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 80, 30));

        g.setBackground(new java.awt.Color(130, 96, 22));
        g.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        g.setForeground(new java.awt.Color(255, 255, 255));
        g.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g.setText("G");
        g.setOpaque(true);
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 80, 30));

        h.setBackground(new java.awt.Color(130, 96, 22));
        h.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h.setText("H");
        h.setOpaque(true);
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 80, 30));

        ocho.setBackground(new java.awt.Color(130, 96, 22));
        ocho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocho.setText("8");
        ocho.setOpaque(true);
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 30, 80));

        siete.setBackground(new java.awt.Color(130, 96, 22));
        siete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siete.setText("7");
        siete.setOpaque(true);
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 30, 80));

        seis.setBackground(new java.awt.Color(130, 96, 22));
        seis.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seis.setText("6");
        seis.setOpaque(true);
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 30, 80));

        cinco.setBackground(new java.awt.Color(130, 96, 22));
        cinco.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinco.setText("5");
        cinco.setOpaque(true);
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 30, 80));

        cuatro.setBackground(new java.awt.Color(130, 96, 22));
        cuatro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuatro.setText("4");
        cuatro.setOpaque(true);
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 30, 80));

        tres.setBackground(new java.awt.Color(130, 96, 22));
        tres.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres.setText("3");
        tres.setOpaque(true);
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 30, 80));

        dos.setBackground(new java.awt.Color(130, 96, 22));
        dos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dos.setText("2");
        dos.setOpaque(true);
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 30, 80));

        uno.setBackground(new java.awt.Color(130, 96, 22));
        uno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uno.setText("1");
        uno.setOpaque(true);
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 30, 80));

        jLabel1.setBackground(new java.awt.Color(130, 96, 22));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 30, 30));

        jLabel2.setBackground(new java.awt.Color(130, 96, 22));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        jLabel3.setBackground(new java.awt.Color(130, 96, 22));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 670, 30, 30));

        jLabel4.setBackground(new java.awt.Color(130, 96, 22));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 30, 30));

        A1.setBackground(new java.awt.Color(200, 164, 109));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreB.png"))); // NOI18N
        A1.setOpaque(true);
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 80, 80));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoB.png"))); // NOI18N
        B1.setOpaque(true);
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 80, 80));

        C1.setBackground(new java.awt.Color(200, 164, 109));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilB.png"))); // NOI18N
        C1.setOpaque(true);
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 80, 80));

        D1.setBackground(new java.awt.Color(255, 255, 255));
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReinaB.png"))); // NOI18N
        D1.setOpaque(true);
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 80, 80));

        E1.setBackground(new java.awt.Color(200, 164, 109));
        E1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReyB.png"))); // NOI18N
        E1.setOpaque(true);
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 80, 80));

        F1.setBackground(new java.awt.Color(255, 255, 255));
        F1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilB.png"))); // NOI18N
        F1.setOpaque(true);
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 80, 80));

        G1.setBackground(new java.awt.Color(200, 164, 109));
        G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoB.png"))); // NOI18N
        G1.setOpaque(true);
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 80, 80));

        H1.setBackground(new java.awt.Color(255, 255, 255));
        H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreB.png"))); // NOI18N
        H1.setOpaque(true);
        getContentPane().add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 80, 80));

        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        A2.setOpaque(true);
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 80, 80));

        B2.setBackground(new java.awt.Color(200, 164, 109));
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        B2.setOpaque(true);
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 80, 80));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        C2.setOpaque(true);
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 80, 80));

        D2.setBackground(new java.awt.Color(200, 164, 109));
        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        D2.setOpaque(true);
        getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 80, 80));

        E2.setBackground(new java.awt.Color(255, 255, 255));
        E2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        E2.setOpaque(true);
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 80, 80));

        F2.setBackground(new java.awt.Color(200, 164, 109));
        F2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        F2.setOpaque(true);
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 80, 80));

        G2.setBackground(new java.awt.Color(255, 255, 255));
        G2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        G2.setOpaque(true);
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 80, 80));

        H2.setBackground(new java.awt.Color(200, 164, 109));
        H2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonB.png"))); // NOI18N
        H2.setOpaque(true);
        getContentPane().add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 80, 80));

        A3.setBackground(new java.awt.Color(200, 164, 109));
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setOpaque(true);
        getContentPane().add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 80, 80));

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setOpaque(true);
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, 80));

        C3.setBackground(new java.awt.Color(200, 164, 109));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setOpaque(true);
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 80, 80));

        D3.setBackground(new java.awt.Color(255, 255, 255));
        D3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D3.setOpaque(true);
        getContentPane().add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 80, 80));

        E3.setBackground(new java.awt.Color(200, 164, 109));
        E3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E3.setOpaque(true);
        getContentPane().add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 80, 80));

        F3.setBackground(new java.awt.Color(255, 255, 255));
        F3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F3.setOpaque(true);
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 80, 80));

        G3.setBackground(new java.awt.Color(200, 164, 109));
        G3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G3.setOpaque(true);
        getContentPane().add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 80, 80));

        H3.setBackground(new java.awt.Color(255, 255, 255));
        H3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H3.setOpaque(true);
        getContentPane().add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 80, 80));

        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A4.setOpaque(true);
        getContentPane().add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 80, 80));

        B4.setBackground(new java.awt.Color(200, 164, 109));
        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setOpaque(true);
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, 80));

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C4.setOpaque(true);
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 80, 80));

        D4.setBackground(new java.awt.Color(200, 164, 109));
        D4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D4.setOpaque(true);
        getContentPane().add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 80, 80));

        E4.setBackground(new java.awt.Color(255, 255, 255));
        E4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E4.setOpaque(true);
        getContentPane().add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 80, 80));

        F4.setBackground(new java.awt.Color(200, 164, 109));
        F4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F4.setOpaque(true);
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 80, 80));

        G4.setBackground(new java.awt.Color(255, 255, 255));
        G4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G4.setOpaque(true);
        getContentPane().add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 80, 80));

        H4.setBackground(new java.awt.Color(200, 164, 109));
        H4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H4.setOpaque(true);
        getContentPane().add(H4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 80, 80));

        A5.setBackground(new java.awt.Color(200, 164, 109));
        A5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A5.setOpaque(true);
        getContentPane().add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 80));

        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setOpaque(true);
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 80, 80));

        C5.setBackground(new java.awt.Color(200, 164, 109));
        C5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C5.setOpaque(true);
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 80));

        D5.setBackground(new java.awt.Color(255, 255, 255));
        D5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D5.setOpaque(true);
        getContentPane().add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 80, 80));

        E5.setBackground(new java.awt.Color(200, 164, 109));
        E5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E5.setOpaque(true);
        getContentPane().add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 80, 80));

        F5.setBackground(new java.awt.Color(255, 255, 255));
        F5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F5.setOpaque(true);
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 80, 80));

        G5.setBackground(new java.awt.Color(200, 164, 109));
        G5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G5.setOpaque(true);
        getContentPane().add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 80, 80));

        H5.setBackground(new java.awt.Color(255, 255, 255));
        H5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H5.setOpaque(true);
        getContentPane().add(H5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 80, 80));

        A6.setBackground(new java.awt.Color(255, 255, 255));
        A6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A6.setOpaque(true);
        getContentPane().add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 80, 80));

        B6.setBackground(new java.awt.Color(200, 164, 109));
        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setOpaque(true);
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 80, 80));

        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C6.setOpaque(true);
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 80));

        D6.setBackground(new java.awt.Color(200, 164, 109));
        D6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D6.setOpaque(true);
        getContentPane().add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 80));

        E6.setBackground(new java.awt.Color(255, 255, 255));
        E6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E6.setOpaque(true);
        getContentPane().add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 80, 80));

        F6.setBackground(new java.awt.Color(200, 164, 109));
        F6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F6.setOpaque(true);
        getContentPane().add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 80, 80));

        G6.setBackground(new java.awt.Color(255, 255, 255));
        G6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G6.setOpaque(true);
        getContentPane().add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 80, 80));

        H6.setBackground(new java.awt.Color(200, 164, 109));
        H6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H6.setOpaque(true);
        getContentPane().add(H6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 80, 80));

        A7.setBackground(new java.awt.Color(200, 164, 109));
        A7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        A7.setOpaque(true);
        getContentPane().add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 80, 80));

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        B7.setOpaque(true);
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, 80));

        C7.setBackground(new java.awt.Color(200, 164, 109));
        C7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        C7.setOpaque(true);
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 80, 80));

        D7.setBackground(new java.awt.Color(255, 255, 255));
        D7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        D7.setOpaque(true);
        getContentPane().add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 80));

        E7.setBackground(new java.awt.Color(200, 164, 109));
        E7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        E7.setOpaque(true);
        getContentPane().add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 80, 80));

        F7.setBackground(new java.awt.Color(255, 255, 255));
        F7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        F7.setOpaque(true);
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 80, 80));

        G7.setBackground(new java.awt.Color(200, 164, 109));
        G7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        G7.setOpaque(true);
        getContentPane().add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 80, 80));

        H7.setBackground(new java.awt.Color(255, 255, 255));
        H7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PeonN.png"))); // NOI18N
        H7.setOpaque(true);
        getContentPane().add(H7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 80, 80));

        A8.setBackground(new java.awt.Color(255, 255, 255));
        A8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreN.png"))); // NOI18N
        A8.setOpaque(true);
        getContentPane().add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 80, 80));

        B8.setBackground(new java.awt.Color(200, 164, 109));
        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoN.png"))); // NOI18N
        B8.setOpaque(true);
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 80, 80));

        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilN.png"))); // NOI18N
        C8.setOpaque(true);
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 80, 80));

        D8.setBackground(new java.awt.Color(200, 164, 109));
        D8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReinaN.png"))); // NOI18N
        D8.setOpaque(true);
        getContentPane().add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 80, 80));

        E8.setBackground(new java.awt.Color(255, 255, 255));
        E8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReyN.png"))); // NOI18N
        E8.setOpaque(true);
        getContentPane().add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 80, 80));

        F8.setBackground(new java.awt.Color(200, 164, 109));
        F8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilN.png"))); // NOI18N
        F8.setOpaque(true);
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 80, 80));

        G8.setBackground(new java.awt.Color(255, 255, 255));
        G8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoN.png"))); // NOI18N
        G8.setOpaque(true);
        getContentPane().add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 80, 80));

        H8.setBackground(new java.awt.Color(200, 164, 109));
        H8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreN.png"))); // NOI18N
        H8.setOpaque(true);
        getContentPane().add(H8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, 80));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(132, 98, 45));
        jButton1.setText("Tablas");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(107, 88, 3)));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 50));

        contPeonB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contPeonB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contPeonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 20, 20));

        contCaballoB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contCaballoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contCaballoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 20, 20));

        contAlfilB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contAlfilB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contAlfilB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 20, 20));

        contTorreB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contTorreB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contTorreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 20, 20));

        peonB.setBackground(new java.awt.Color(204, 204, 204));
        peonB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        peonB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(peonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 80));

        caballoB.setBackground(new java.awt.Color(204, 204, 204));
        caballoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(caballoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 80));

        alfilB.setBackground(new java.awt.Color(204, 204, 204));
        alfilB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(alfilB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 80));

        torreB.setBackground(new java.awt.Color(204, 204, 204));
        torreB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(torreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 80));

        reinaB.setBackground(new java.awt.Color(204, 204, 204));
        reinaB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(reinaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        contTorreN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contTorreN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contTorreN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 20, 20));

        contAlfilN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contAlfilN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contAlfilN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 20, 20));

        contCaballoN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contCaballoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contCaballoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 20, 20));

        contPeonN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contPeonN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(contPeonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 20, 20));

        reinaN.setBackground(new java.awt.Color(204, 204, 204));
        reinaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(reinaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 80));

        torreN.setBackground(new java.awt.Color(204, 204, 204));
        torreN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(torreN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 80, 80));

        alfilN.setBackground(new java.awt.Color(204, 204, 204));
        alfilN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(alfilN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 80, 80));

        caballoN.setBackground(new java.awt.Color(204, 204, 204));
        caballoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(caballoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 80, 80));

        peonN.setBackground(new java.awt.Color(204, 204, 204));
        peonN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        peonN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(peonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 80, 80));

        jLabel6.setBackground(new java.awt.Color(215, 192, 146));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel B;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel C;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel CINCO;
    private javax.swing.JLabel CUATRO;
    private javax.swing.JLabel D;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel DOS;
    private javax.swing.JLabel E;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel G;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel G7;
    private javax.swing.JLabel G8;
    private javax.swing.JLabel H;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel H3;
    private javax.swing.JLabel H4;
    private javax.swing.JLabel H5;
    private javax.swing.JLabel H6;
    private javax.swing.JLabel H7;
    private javax.swing.JLabel H8;
    private javax.swing.JLabel OCHO;
    private javax.swing.JLabel SEIS;
    private javax.swing.JLabel SIETE;
    private javax.swing.JLabel TRES;
    private javax.swing.JLabel UNO;
    private javax.swing.JLabel a;
    private javax.swing.JLabel alfilB;
    private javax.swing.JLabel alfilN;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel caballoB;
    private javax.swing.JLabel caballoN;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel contAlfilB;
    private javax.swing.JLabel contAlfilN;
    private javax.swing.JLabel contCaballoB;
    private javax.swing.JLabel contCaballoN;
    private javax.swing.JLabel contPeonB;
    private javax.swing.JLabel contPeonN;
    private javax.swing.JLabel contTorreB;
    private javax.swing.JLabel contTorreN;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel d;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel peonB;
    private javax.swing.JLabel peonN;
    private javax.swing.JLabel reinaB;
    private javax.swing.JLabel reinaN;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel torreB;
    private javax.swing.JLabel torreN;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
