/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author elivs
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addpassenger = new javax.swing.JMenuItem();
        searchpassenger = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addflight = new javax.swing.JMenuItem();
        searchflight = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bookticket = new javax.swing.JMenuItem();
        searchticket = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(5568, 3712));
        jLabel2.setMinimumSize(new java.awt.Dimension(5568, 3712));
        jLabel2.setPreferredSize(new java.awt.Dimension(5568, 3712));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("FIND AND BOOK ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("YOUR GREAT EXPERIENCE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("FLIGHT BOOKING SYSTEM");

        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 837, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(133, 75));

        jMenu1.setBackground(new java.awt.Color(0, 102, 204));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\person_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        jMenu1.setText("Passenger ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(200, 40000));

        addpassenger.setBackground(new java.awt.Color(0, 102, 204));
        addpassenger.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addpassenger.setForeground(new java.awt.Color(51, 51, 51));
        addpassenger.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\person_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        addpassenger.setText("Add Passenger");
        addpassenger.setPreferredSize(new java.awt.Dimension(177, 50));
        addpassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpassengerActionPerformed(evt);
            }
        });
        jMenu1.add(addpassenger);

        searchpassenger.setBackground(new java.awt.Color(0, 102, 204));
        searchpassenger.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        searchpassenger.setForeground(new java.awt.Color(51, 51, 51));
        searchpassenger.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\search_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        searchpassenger.setText("Search Passenger");
        searchpassenger.setPreferredSize(new java.awt.Dimension(199, 50));
        searchpassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpassengerActionPerformed(evt);
            }
        });
        jMenu1.add(searchpassenger);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\flight_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        jMenu2.setText("Flight");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jMenu2.setMaximumSize(new java.awt.Dimension(200, 40000));

        addflight.setBackground(new java.awt.Color(0, 102, 204));
        addflight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addflight.setForeground(new java.awt.Color(51, 51, 51));
        addflight.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\flight_takeoff_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        addflight.setText("Add flight");
        addflight.setPreferredSize(new java.awt.Dimension(177, 50));
        addflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightActionPerformed(evt);
            }
        });
        jMenu2.add(addflight);

        searchflight.setBackground(new java.awt.Color(0, 102, 204));
        searchflight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        searchflight.setForeground(new java.awt.Color(51, 51, 51));
        searchflight.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\FlightBookingSystemGUI\\src\\icons\\search_FILL0_wght400_GRAD0_opsz24.png")); // NOI18N
        searchflight.setText("Search Flight");
        searchflight.setPreferredSize(new java.awt.Dimension(161, 50));
        searchflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightActionPerformed(evt);
            }
        });
        jMenu2.add(searchflight);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 102, 204));
        jMenu3.setForeground(new java.awt.Color(51, 51, 51));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/airplane_ticket_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jMenu3.setText("Booking");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(200, 40000));

        bookticket.setBackground(new java.awt.Color(0, 102, 204));
        bookticket.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bookticket.setForeground(new java.awt.Color(51, 51, 51));
        bookticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/airplane_ticket_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        bookticket.setText("BookTicket");
        bookticket.setPreferredSize(new java.awt.Dimension(177, 50));
        bookticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookticketActionPerformed(evt);
            }
        });
        jMenu3.add(bookticket);

        searchticket.setBackground(new java.awt.Color(0, 102, 204));
        searchticket.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        searchticket.setForeground(new java.awt.Color(51, 51, 51));
        searchticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        searchticket.setText("Search Ticket");
        searchticket.setPreferredSize(new java.awt.Dimension(165, 50));
        searchticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchticketActionPerformed(evt);
            }
        });
        jMenu3.add(searchticket);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpassengerActionPerformed
        // TODO add your handling code here:
        AddPassanger pass = new AddPassanger();
        jDesktopPane1.add(pass);
        pass.setVisible(true);

    }//GEN-LAST:event_addpassengerActionPerformed

    private void searchpassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpassengerActionPerformed
        // TODO add your handling code here:
        SearchPssngr pss = new SearchPssngr();
        jDesktopPane1.add(pss);
        pss.setVisible(true);
    }//GEN-LAST:event_searchpassengerActionPerformed

    private void addflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightActionPerformed
        // TODO add your handling code here:
        AddFlight pss = new AddFlight();
        jDesktopPane1.add(pss);
        pss.setVisible(true);
    }//GEN-LAST:event_addflightActionPerformed

    private void searchflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightActionPerformed
        // TODO add your handling code here:
        SearchFlight pss = new SearchFlight();
        jDesktopPane1.add(pss);
        pss.setVisible(true);
    }//GEN-LAST:event_searchflightActionPerformed

    private void bookticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookticketActionPerformed
        // TODO add your handling code here:
        BookTicket pss = new BookTicket();
        jDesktopPane1.add(pss);
        pss.setVisible(true);
    }//GEN-LAST:event_bookticketActionPerformed

    private void searchticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchticketActionPerformed
        // TODO add your handling code here:
        SearchTicket pss = new SearchTicket();
        jDesktopPane1.add(pss);
        pss.setVisible(true);
    }//GEN-LAST:event_searchticketActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addflight;
    private javax.swing.JMenuItem addpassenger;
    private javax.swing.JMenuItem bookticket;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem searchflight;
    private javax.swing.JMenuItem searchpassenger;
    private javax.swing.JMenuItem searchticket;
    // End of variables declaration//GEN-END:variables
}