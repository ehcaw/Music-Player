/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicplayer;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicButtonUI;
/**
 *
 * @author Anhadh Sran
 */
public class MusicPlayerFrame extends javax.swing.JFrame {

    /**
     * Creates new form MusicPlayerFrame
     */
        
    public MusicPlayerFrame() {
        // super()
        initComponents();
        home();
        JButton[] buttons = {homeButton, libraryButton, searchButton, rewindButton, playButton, forwardButton, sortButton}; // An array to set the appearence for the buttons
        for (JButton button: buttons) { 
            button.setBackground(new Color(20,25,30)); // Sets the background color for the buttons
            button.setUI(new BasicButtonUI());
            button.addMouseListener(new MouseInputListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (button.equals(homeButton)) {
                        home();
                    }
                    else if (button.equals(libraryButton)) {
                        library();
                    }
                    else if (button.equals(searchButton)) {
                        search();
                    }
                    else {
                        centerPanelBottom.setBackground(Color.WHITE);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(new Color(54, 81, 207)); // Changes the color of button to blue when mouse hovers on it
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(new Color(20, 25, 30)); // Resets the button color to original when mouse is not hovering on it
                }

                @Override
                public void mouseDragged(MouseEvent e) {
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                }
            });
        }
    }
    
    /**
     * Displays the home page when the home button is clicked 
    */
    private void home() {
        jLabel1.setText("Home"); // Sets the title to "Home"
        // The following three lines of code clear the panel
        centerPanelMiddle.removeAll(); 
        centerPanelMiddle.revalidate();
        centerPanelMiddle.repaint();
        
        int n = 100;
        centerPanelMiddle.setLayout(new GridLayout(10, 1, 1, 2));
        SongTile tile;
        for (int i = 0; i < 3; i++) {
            tile = new SongTile();
            if (i == 0) 
                tile.setBackground(Color.WHITE);
            else if (i == 1) 
                tile.setBackground(Color.PINK);
            else
                tile.setBackground(Color.YELLOW);
            centerPanelMiddle.add(tile);
        }
    }
    
    /**
     * Displays the library page when the library button is clicked
     */
    private void library() {
        jLabel1.setText("Your Library"); // Sets the title to "Your Library"
        // The following three lines of code clear the panel
        centerPanelMiddle.removeAll(); 
        centerPanelMiddle.revalidate();
        centerPanelMiddle.repaint();
        
        centerPanelMiddle.setLayout(new GridLayout(10, 1, 1, 2)); // Sets the layout for library page
        // Some tests
        JPanel test = new JPanel();
        test.setBackground(Color.red);
        centerPanelMiddle.add(test);
        JPanel test2 = new JPanel();
        test2.setBackground(Color.red);
        centerPanelMiddle.add(test2);
    }
    
    private void openPlaylist() {
        
    }
    
    /**
     * Displays the search page when the search button is clicked
     */
    private void search() {
        jLabel1.setText("Search"); // Sets the title to "Search"
        // The following three lines of code clear the panel
        centerPanelMiddle.removeAll();
        centerPanelMiddle.revalidate();
        centerPanelMiddle.repaint();
        
        centerPanelMiddle.setLayout(new FlowLayout());

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        libraryButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        centerPanelTop = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();
        scrollPaneWin11 = new win11ScrollPane.ScrollPaneWin11();
        centerPanelMiddle = new javax.swing.JPanel();
        centerPanelBottom = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        rewindButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        jsliderCustom1 = new slider.JsliderCustom();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WHAM!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rootPanel.setBackground(new java.awt.Color(50, 50, 50));
        rootPanel.setPreferredSize(new java.awt.Dimension(720, 720));
        rootPanel.setRequestFocusEnabled(false);
        rootPanel.setLayout(new java.awt.BorderLayout(2, 0));

        sidePanel.setBackground(new java.awt.Color(20, 25, 30));
        sidePanel.setPreferredSize(new java.awt.Dimension(80, 0));
        sidePanel.setLayout(new java.awt.GridLayout(3, 1));

        jPanel3.setBackground(new java.awt.Color(20, 25, 30));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(60, 240));
        sidePanel.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(20, 25, 30));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 100));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        homeButton.setBackground(new java.awt.Color(240, 240, 240));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home (1).png"))); // NOI18N
        homeButton.setAlignmentX(0.5F);
        homeButton.setBorder(null);
        homeButton.setPreferredSize(new java.awt.Dimension(40, 40));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);

        libraryButton.setBackground(new java.awt.Color(240, 240, 240));
        libraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books.png"))); // NOI18N
        libraryButton.setAlignmentX(0.5F);
        libraryButton.setPreferredSize(new java.awt.Dimension(40, 40));
        libraryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libraryButtonMouseClicked(evt);
            }
        });
        libraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(libraryButton);

        sidePanel.add(jPanel1);

        jPanel7.setBackground(new java.awt.Color(20, 25, 30));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(60, 240));
        sidePanel.add(jPanel7);

        rootPanel.add(sidePanel, java.awt.BorderLayout.WEST);

        centerPanel.setBackground(new java.awt.Color(60, 60, 60));
        centerPanel.setPreferredSize(new java.awt.Dimension(640, 720));
        centerPanel.setLayout(new java.awt.BorderLayout(0, 2));

        centerPanelTop.setBackground(new java.awt.Color(20, 25, 30));
        centerPanelTop.setToolTipText("");
        centerPanelTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        centerPanelTop.setPreferredSize(new java.awt.Dimension(0, 50));
        centerPanelTop.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(20, 25, 30));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Home");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        centerPanelTop.add(jPanel2);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 10));

        jTextField1.setBackground(new java.awt.Color(60, 60, 60));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 24));
        jPanel9.add(jTextField1);

        searchButton.setBackground(new java.awt.Color(240, 240, 240));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loupe.png"))); // NOI18N
        searchButton.setAlignmentX(0.5F);
        searchButton.setPreferredSize(new java.awt.Dimension(24, 24));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel9.add(searchButton);

        sortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/more.png"))); // NOI18N
        sortButton.setBorder(null);
        sortButton.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel9.add(sortButton);

        centerPanelTop.add(jPanel9);

        centerPanel.add(centerPanelTop, java.awt.BorderLayout.PAGE_START);

        scrollPaneWin11.setBackground(new java.awt.Color(20, 25, 30));
        scrollPaneWin11.setBorder(null);
        scrollPaneWin11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        centerPanelMiddle.setBackground(new java.awt.Color(35, 40, 30));
        centerPanelMiddle.setAutoscrolls(true);
        centerPanelMiddle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centerPanelMiddleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout centerPanelMiddleLayout = new javax.swing.GroupLayout(centerPanelMiddle);
        centerPanelMiddle.setLayout(centerPanelMiddleLayout);
        centerPanelMiddleLayout.setHorizontalGroup(
            centerPanelMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        centerPanelMiddleLayout.setVerticalGroup(
            centerPanelMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );

        scrollPaneWin11.setViewportView(centerPanelMiddle);
        centerPanelMiddle.getAccessibleContext().setAccessibleName("");

        centerPanel.add(scrollPaneWin11, java.awt.BorderLayout.CENTER);

        centerPanelBottom.setBackground(new java.awt.Color(20, 25, 30));
        centerPanelBottom.setPreferredSize(new java.awt.Dimension(733, 75));
        centerPanelBottom.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setBackground(new java.awt.Color(20, 25, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        centerPanelBottom.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(20, 25, 30));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(20, 25, 30));

        rewindButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rewind.png"))); // NOI18N
        rewindButton.setBorder(null);
        rewindButton.setMaximumSize(new java.awt.Dimension(60, 60));
        rewindButton.setMinimumSize(new java.awt.Dimension(20, 20));
        rewindButton.setPreferredSize(new java.awt.Dimension(40, 40));
        rewindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindButtonActionPerformed(evt);
            }
        });
        jPanel8.add(rewindButton);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setMaximumSize(new java.awt.Dimension(60, 60));
        playButton.setMinimumSize(new java.awt.Dimension(20, 20));
        playButton.setPreferredSize(new java.awt.Dimension(40, 40));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel8.add(playButton);

        forwardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fast-forward.png"))); // NOI18N
        forwardButton.setBorder(null);
        forwardButton.setMaximumSize(new java.awt.Dimension(60, 60));
        forwardButton.setMinimumSize(new java.awt.Dimension(20, 20));
        forwardButton.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel8.add(forwardButton);

        jPanel5.add(jPanel8, java.awt.BorderLayout.NORTH);

        jsliderCustom1.setBackground(new java.awt.Color(102, 255, 153));
        jsliderCustom1.setForeground(new java.awt.Color(0, 153, 255));
        jsliderCustom1.setValue(0);
        jPanel5.add(jsliderCustom1, java.awt.BorderLayout.CENTER);

        centerPanelBottom.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(20, 25, 30));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        centerPanelBottom.add(jPanel6);

        centerPanel.add(centerPanelBottom, java.awt.BorderLayout.PAGE_END);

        rootPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void libraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libraryButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void rewindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewindButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void centerPanelMiddleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerPanelMiddleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_centerPanelMiddleMouseClicked

    private void libraryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_libraryButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MusicPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicPlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel centerPanelBottom;
    private javax.swing.JPanel centerPanelMiddle;
    private javax.swing.JPanel centerPanelTop;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private slider.JsliderCustom jsliderCustom1;
    private javax.swing.JButton libraryButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton rewindButton;
    private javax.swing.JPanel rootPanel;
    private win11ScrollPane.ScrollPaneWin11 scrollPaneWin11;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton sortButton;
    // End of variables declaration//GEN-END:variables

}
