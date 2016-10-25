
package MINOR_PROJ;
import java.util.Scanner;

public class scanning extends javax.swing.JFrame {

    
    public scanning() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("           Checking for violations");

        jButton1.setText("Click here to see results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        violations s= new violations();
        s.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        int u=1;//u:num of user
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m= u+n;//n: number of friends
         boolean c,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
         int uf[]=new int[10];
         //c:commitment uf:friends of user

  
     void canseepost(int uf[n],int u)
         {
             if((f1&&f2)&&(!f3&&f4&&f5&&f6&&f7&&f8&&f9&&f10)==true)
             {
                 c=true;
             }
             for(n=n+1;n<=10;n++)
             {
                 f[n]=0;
                 
             }
         }
         int onlyme=1;
         int friend=2;
         int fof=3;
         int publicc=4;
         int d=0;
         switch(d)
         {
             case 1:
                 break;
             case 2:
                 break;
             case 3:
                 break;
             case 4:
                 break;
         }
         
         
         
         
         
         
         
         
         
        
        
      
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scanning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
