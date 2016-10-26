
package MINOR_PROJ;
import java.util.Scanner;


public class scanning extends javax.swing.JFrame {
      static boolean uid,c,v,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,ff1,ff2,ff3,ff4,ff5,ff6,ff7,ff8,ff9,ff10;

    
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
         
          
    public static void canspost(int uf[],int u)
{
            u=1;//u:num of user
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m= u+n;//n: number of friends
         //c:commitment uf:friends of user

             if((f1&&f2==true)&&(f3&&f4&&f5&&f6&&f7&&f8&&f9&&f10)==false)
             {
                 c=true;
             }
             for(n=n+1;n<=10;n++)
             {
                 uf[n]=0;
                 
             }
         
         int onlyme=1;
         int friend=2;
         int fof=3;
         int publicc=4;
         int d = 0;
         switch(d)
         {
             case 1: if((uid==true)&&(f1&&f2&&f3&&f4&&f5&&f6&&f7&&f8&&f9&&f10==false))
             {
                 c=true;
                 v=false;
                 System.out.println("No privacy violations detected");
             }
             else
             {
                 v=true;
                 System.out.println("Number of privacy violations detected are: ");
                 
             }
                 break;
             case 2: if(uid&&f1&&f2&&f3&&f4&&f5&&f6&&f7&&f8&&f9&&f10==true)
             {
                 c=true;
                 v=false;
                 System.out.println("No privacy violations detected");
              }
              else
             {
                 v=true;
                 System.out.println("Number of privacy violations detected are: ");
                 
             }
                 break;
             case 3: if(uid&&ff1&&ff2&ff3&&ff4&&ff5&&ff6&&ff7&&ff8&&ff9&&ff10==true)
             {
                 c=true;
                 v=false;
                 System.out.println("No privacy violations detected");
             }
              else
             {
                 v=true;
                 System.out.println("Number of privacy violations detected are: ");
                 
             }
                 break;
             case 4: if(uid&&ff1&&ff2&ff3&&ff4&&ff5&&ff6&&ff7&&ff8&&ff9&&ff10==true)
             {
                 c=true;
                 v=false;
                 System.out.println("No privacy violations detected");
             }
              else
             {
                 v=true;
                 System.out.println("Number of privacy violations detected are: ");
                 
             }
                 break;
         }

}
    public static void main(String args[]) {
        
      int uf[]=new int[10];
         
  
        canspost(uf,1) ;
        
         
        
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
