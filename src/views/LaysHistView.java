/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.Controller;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;


public class LaysHistView extends javax.swing.JDialog {
    private DefaultListModel mlayers;
    private DefaultListModel mhistory;
    private MainView mainview;
    private Controller control;

    private javax.swing.JButton buttonLaysDown;
    private javax.swing.JButton buttonLaysMergeDown;
    private javax.swing.JButton buttonLaysMergeUp;
    private javax.swing.JButton buttonLaysRemove;
    private javax.swing.JButton buttonLaysRename;
    private javax.swing.JButton buttonLaysUp;
    private javax.swing.JList listHistory;
    private javax.swing.JList listLayers;
    private javax.swing.JLabel labelLaysAlpha;
    private javax.swing.JPanel panelHistory;
    private javax.swing.JPanel panelLayers;
    private javax.swing.JPanel panelLaysHist;
    private javax.swing.JSlider sliderLaysAlpha;
    private javax.swing.JScrollPane scrollPaneHistory;
    private javax.swing.JScrollPane scrollPaneLayers;
    private javax.swing.JToggleButton toggleButtonLaysView;
    private javax.swing.JTabbedPane tabbedPaneLaysHist;



    /**
     * Creates new form LaysHistView
     */
    public LaysHistView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setTitle("Layers - History - Project CG & GPI");
        mainview = (MainView)parent;
        control = mainview.getController();
        listLayers.addListSelectionListener(control);
        listHistory.addListSelectionListener(control);
        buttonLaysRemove.addActionListener(control);
        buttonLaysUp.addActionListener(control);
        buttonLaysDown.addActionListener(control);
        mlayers = new DefaultListModel();
        listLayers.setCellRenderer(new CellRender());
        listLayers.setModel(mlayers);
        mhistory = new DefaultListModel();
        listHistory.setCellRenderer(new CellRender());
        listHistory.setModel(mhistory);
        buttonLaysUp.setIcon(new ImageIcon("src/images/up.png"));
        buttonLaysDown.setIcon(new ImageIcon("src/images/down.png"));
        buttonLaysRemove.setIcon(new ImageIcon("src/images/remove.png"));
        buttonLaysMergeUp.addActionListener(control);
        buttonLaysMergeUp.setIcon(new ImageIcon("src/images/mergeup.png"));
        buttonLaysMergeDown.addActionListener(control);
        buttonLaysMergeDown.setIcon(new ImageIcon("src/images/mergedown.png"));
        toggleButtonLaysView.addActionListener(control);
        toggleButtonLaysView.setIcon(new ImageIcon("src/images/eye.png"));
        toggleButtonLaysView.setSelectedIcon(new ImageIcon("src/images/eyebis.png"));
        sliderLaysAlpha.addChangeListener(control);
        buttonLaysRename.addActionListener(control);
    }

    public JSlider getSliderLaysAlpha() {
        return sliderLaysAlpha;
    }

    public JLabel getLabelLaysAlpha() {
        return labelLaysAlpha;
    }

    public JButton getButtonLaysRename() {
        return buttonLaysRename;
    }

    public DefaultListModel getModelLayers() {
        return mlayers;
    }

    public DefaultListModel getModelHistory() {
        return mhistory;
    }

    public JList getListLayers() {
        return listLayers;
    }

    public JList getListHistory() {
        return listHistory;
    }

    public JButton getButtonLaysMergeUp() {
        return buttonLaysMergeUp;
    }

    public JButton getButtonLaysMergeDown() {
        return buttonLaysMergeDown;
    }

    public JButton getButtonLaysRemove() {
        return buttonLaysRemove;
    }

    public JToggleButton getButtonLaysView() {
        return toggleButtonLaysView;
    }

    public JButton getButtonLaysUp() {
        return buttonLaysUp;
    }

    public JButton getButtonLaysDown() {
        return buttonLaysDown;
    }

    public JTabbedPane getTabbedPaneLaysHist() {
        return tabbedPaneLaysHist;
    }



    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelLaysHist = new javax.swing.JPanel();
        tabbedPaneLaysHist = new javax.swing.JTabbedPane();
        panelLayers = new javax.swing.JPanel();
        scrollPaneLayers = new javax.swing.JScrollPane();
        listLayers = new javax.swing.JList();
        buttonLaysRemove = new javax.swing.JButton();
        buttonLaysUp = new javax.swing.JButton();
        buttonLaysDown = new javax.swing.JButton();
        buttonLaysMergeUp = new javax.swing.JButton();
        buttonLaysMergeDown = new javax.swing.JButton();
        toggleButtonLaysView = new javax.swing.JToggleButton();
        sliderLaysAlpha = new javax.swing.JSlider();
        labelLaysAlpha = new javax.swing.JLabel();
        buttonLaysRename = new javax.swing.JButton();
        panelHistory = new javax.swing.JPanel();
        scrollPaneHistory = new javax.swing.JScrollPane();
        listHistory = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabbedPaneLaysHist.setFont(new java.awt.Font("Times New Roman", 0, 12));

        listLayers.setFont(new java.awt.Font("Times New Roman", 0, 14));
        listLayers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneLayers.setViewportView(listLayers);

        buttonLaysRemove.setFont(new java.awt.Font("Times New Roman", 0, 12));
        buttonLaysRemove.setMaximumSize(new java.awt.Dimension(29, 22));
        buttonLaysRemove.setMinimumSize(new java.awt.Dimension(29, 22));
        buttonLaysRemove.setPreferredSize(new java.awt.Dimension(29, 22));

        buttonLaysUp.setMaximumSize(new java.awt.Dimension(29, 22));
        buttonLaysUp.setMinimumSize(new java.awt.Dimension(29, 22));
        buttonLaysUp.setPreferredSize(new java.awt.Dimension(29, 22));

        buttonLaysDown.setMaximumSize(new java.awt.Dimension(29, 22));
        buttonLaysDown.setMinimumSize(new java.awt.Dimension(29, 22));
        buttonLaysDown.setPreferredSize(new java.awt.Dimension(29, 22));

        buttonLaysMergeUp.setMaximumSize(new java.awt.Dimension(29, 22));
        buttonLaysMergeUp.setMinimumSize(new java.awt.Dimension(29, 22));
        buttonLaysMergeUp.setPreferredSize(new java.awt.Dimension(29, 22));

        buttonLaysMergeDown.setMaximumSize(new java.awt.Dimension(29, 22));
        buttonLaysMergeDown.setMinimumSize(new java.awt.Dimension(29, 22));
        buttonLaysMergeDown.setPreferredSize(new java.awt.Dimension(29, 22));

        toggleButtonLaysView.setMaximumSize(new java.awt.Dimension(29, 22));
        toggleButtonLaysView.setMinimumSize(new java.awt.Dimension(29, 22));
        toggleButtonLaysView.setPreferredSize(new java.awt.Dimension(29, 22));

        sliderLaysAlpha.setMinimum(1);
        sliderLaysAlpha.setMaximumSize(new java.awt.Dimension(122, 26));
        sliderLaysAlpha.setMinimumSize(new java.awt.Dimension(122, 25));
        sliderLaysAlpha.setPreferredSize(new java.awt.Dimension(122, 26));

        labelLaysAlpha.setFont(new java.awt.Font("Times New Roman", 0, 12));
        labelLaysAlpha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLaysAlpha.setText("100");
        labelLaysAlpha.setMaximumSize(new java.awt.Dimension(26, 26));
        labelLaysAlpha.setMinimumSize(new java.awt.Dimension(26, 26));
        labelLaysAlpha.setPreferredSize(new java.awt.Dimension(26, 26));

        buttonLaysRename.setFont(new java.awt.Font("Times New Roman", 1, 12));
        buttonLaysRename.setForeground(new java.awt.Color(100, 100, 100));
        buttonLaysRename.setText("...");
        buttonLaysRename.setMaximumSize(new java.awt.Dimension(30, 26));
        buttonLaysRename.setMinimumSize(new java.awt.Dimension(30, 26));
        buttonLaysRename.setPreferredSize(new java.awt.Dimension(30, 26));

        javax.swing.GroupLayout PlayersLayout = new javax.swing.GroupLayout(panelLayers);
        panelLayers.setLayout(PlayersLayout);
        PlayersLayout.setHorizontalGroup(
                PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneLayers, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(PlayersLayout.createSequentialGroup()
                                .addGroup(PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PlayersLayout.createSequentialGroup()
                                                .addComponent(buttonLaysRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(toggleButtonLaysView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLaysUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLaysDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLaysMergeUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLaysMergeDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PlayersLayout.createSequentialGroup()
                                                .addComponent(sliderLaysAlpha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelLaysAlpha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLaysRename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        PlayersLayout.setVerticalGroup(
                PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PlayersLayout.createSequentialGroup()
                                .addComponent(scrollPaneLayers, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonLaysUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLaysDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLaysRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLaysMergeUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLaysMergeDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(toggleButtonLaysView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sliderLaysAlpha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labelLaysAlpha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonLaysRename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabbedPaneLaysHist.addTab("Layers", panelLayers);

        listHistory.setFont(new java.awt.Font("Times New Roman", 0, 14));
        listHistory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneHistory.setViewportView(listHistory);

        javax.swing.GroupLayout PhistoryLayout = new javax.swing.GroupLayout(panelHistory);
        panelHistory.setLayout(PhistoryLayout);
        PhistoryLayout.setHorizontalGroup(
                PhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        PhistoryLayout.setVerticalGroup(
                PhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        tabbedPaneLaysHist.addTab("History", panelHistory);

        javax.swing.GroupLayout PlayshistLayout = new javax.swing.GroupLayout(panelLaysHist);
        panelLaysHist.setLayout(PlayshistLayout);
        PlayshistLayout.setHorizontalGroup(
                PlayshistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPaneLaysHist)
        );
        PlayshistLayout.setVerticalGroup(
                PlayshistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPaneLaysHist)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLaysHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLaysHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(LaysHistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaysHistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaysHistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaysHistView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LaysHistView dialog = new LaysHistView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


}