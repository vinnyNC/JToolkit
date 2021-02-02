package JToolKit;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Mon Feb 01 14:58:36 EST 2021
 */



/**
 * @author Vincent Lyons
 */
public class JToolKit extends JFrame {
    public JToolKit() {
        initComponents();
    }

    private void menuFileCloseActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void menuFileCloseMenuKeyPressed(MenuKeyEvent e) {
        // TODO add your code here
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    public JLabel getLblVersion() {
        return lblVersion;
    }

    public JList getLstApps() {
        return lstApps;
    }

    public JCheckBox getChkSilentInstall() {
        return chkSilentInstall;
    }

    private void menuHelpUpdateActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vincent Lyons
        menuBar1 = new JMenuBar();
        menuFile = new JMenu();
        menuFileClose = new JMenuItem();
        menuHelp = new JMenu();
        menuHelpUpdate = new JMenuItem();
        menuHelpAbout = new JMenuItem();
        scrollPane1 = new JScrollPane();
        lstApps = new JList();
        btnInstall = new JButton();
        chkSilentInstall = new JCheckBox();
        lblVersion = new JLabel();

        //======== this ========
        setResizable(false);
        setTitle("JToolKit");
        setVisible(true);
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menuFile ========
            {
                menuFile.setText("File");

                //---- menuFileClose ----
                menuFileClose.setText("Exit");
                menuFileClose.addMenuKeyListener(new MenuKeyListener() {
                    @Override
                    public void menuKeyPressed(MenuKeyEvent e) {
                        menuFileCloseMenuKeyPressed(e);
                    }
                    @Override
                    public void menuKeyReleased(MenuKeyEvent e) {}
                    @Override
                    public void menuKeyTyped(MenuKeyEvent e) {}
                });
                menuFileClose.addActionListener(e -> menuFileCloseActionPerformed(e));
                menuFile.add(menuFileClose);
            }
            menuBar1.add(menuFile);

            //======== menuHelp ========
            {
                menuHelp.setText("Help");

                //---- menuHelpUpdate ----
                menuHelpUpdate.setText("Update");
                menuHelpUpdate.addActionListener(e -> menuHelpUpdateActionPerformed(e));
                menuHelp.add(menuHelpUpdate);

                //---- menuHelpAbout ----
                menuHelpAbout.setText("About");
                menuHelp.add(menuHelpAbout);
            }
            menuBar1.add(menuHelp);
        }
        setJMenuBar(menuBar1);

        //======== scrollPane1 ========
        {

            //---- lstApps ----
            lstApps.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            scrollPane1.setViewportView(lstApps);
        }

        //---- btnInstall ----
        btnInstall.setText("Install");

        //---- chkSilentInstall ----
        chkSilentInstall.setText("Silent Install");

        //---- lblVersion ----
        lblVersion.setText("No Version Info");
        lblVersion.setVerticalTextPosition(SwingConstants.BOTTOM);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(chkSilentInstall, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(btnInstall, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVersion, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnInstall)
                            .addGap(18, 18, 18)
                            .addComponent(chkSilentInstall)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                            .addComponent(lblVersion, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vincent Lyons
    private JMenuBar menuBar1;
    private JMenu menuFile;
    private JMenuItem menuFileClose;
    private JMenu menuHelp;
    private JMenuItem menuHelpUpdate;
    private JMenuItem menuHelpAbout;
    private JScrollPane scrollPane1;
    private JList lstApps;
    private JButton btnInstall;
    private JCheckBox chkSilentInstall;
    private JLabel lblVersion;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
