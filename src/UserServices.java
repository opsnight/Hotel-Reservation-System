
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kyleq
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class UserServices extends javax.swing.JFrame {

    private String databaseUrl = "jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String username = "root";
    private String password = "";
    private HotelDatabaseManager hotelDBM = new HotelDatabaseManager(databaseUrl, username, password);
    
    private Guest guest = null;
    private User user = null;
    
    public UserServices(Guest guest, User user){
        this.guest=guest;
        this.user=user;
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

        navPanel = new javax.swing.JPanel();
        hotelLabelImg = new javax.swing.JLabel();
        roomsButton = new javax.swing.JButton();
        servicesButton = new javax.swing.JButton();
        feedbackButon = new javax.swing.JButton();
        billsButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        guestName = new javax.swing.JLabel();
        headerPanel6 = new javax.swing.JPanel();
        servicesHeader = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        requestRoomServiceBtn = new javax.swing.JButton();
        notifLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Home");
        setResizable(false);

        navPanel.setBackground(new java.awt.Color(196, 167, 111));
        navPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hotelLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hotel-label.png"))); // NOI18N

        roomsButton.setBackground(new java.awt.Color(88, 73, 16));
        roomsButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        roomsButton.setForeground(new java.awt.Color(255, 255, 255));
        roomsButton.setText("Rooms");
        roomsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomsButton.setBorderPainted(false);
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });

        servicesButton.setBackground(new java.awt.Color(88, 73, 16));
        servicesButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        servicesButton.setForeground(new java.awt.Color(255, 255, 255));
        servicesButton.setText("Services");
        servicesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        servicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesButtonActionPerformed(evt);
            }
        });

        feedbackButon.setBackground(new java.awt.Color(88, 73, 16));
        feedbackButon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        feedbackButon.setForeground(new java.awt.Color(255, 255, 255));
        feedbackButon.setText("Feedback");
        feedbackButon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        feedbackButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackButonActionPerformed(evt);
            }
        });

        billsButton.setBackground(new java.awt.Color(88, 73, 16));
        billsButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        billsButton.setForeground(new java.awt.Color(255, 255, 255));
        billsButton.setText("Bills");
        billsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        billsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(88, 73, 16));
        logOutButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Logout");
        logOutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        guestName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        guestName.setForeground(new java.awt.Color(88, 73, 16));
        guestName.setText("guestName");
        guestName.setToolTipText("");

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestName)
                    .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(roomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hotelLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(servicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(feedbackButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(billsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hotelLabelImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guestName)
                .addGap(26, 26, 26)
                .addComponent(roomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(servicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(feedbackButon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        guestName.setText("Hello, " + guest.getFirstName());

        headerPanel6.setBackground(new java.awt.Color(216, 196, 156));
        headerPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        servicesHeader.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        servicesHeader.setForeground(new java.awt.Color(88, 73, 16));
        servicesHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servicesHeader.setText("SERVICES");

        javax.swing.GroupLayout headerPanel6Layout = new javax.swing.GroupLayout(headerPanel6);
        headerPanel6.setLayout(headerPanel6Layout);
        headerPanel6Layout.setHorizontalGroup(
            headerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicesHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel6Layout.setVerticalGroup(
            headerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicesHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Check-in ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        roomsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(roomsTable);
        if (roomsTable.getColumnModel().getColumnCount() > 0) {
            roomsTable.getColumnModel().getColumn(0).setResizable(false);
        }
        try (Connection connection = hotelDBM.getDatabaseConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `booking` INNER JOIN check_in ON booking.booking_id = check_in.booking_id WHERE checked_in = 1 AND checked_out = 0 AND guest_id = " + guest.getGuestID())) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String room_number = String.valueOf(resultSet.getInt("room_number"));
                String checkin_id = String.valueOf(resultSet.getInt("checkin_id"));

                String roomsTableData[] = {room_number, checkin_id};
                DefaultTableModel roomsTableModel = (DefaultTableModel) roomsTable.getModel();

                roomsTableModel.addRow(roomsTableData);
            }

            preparedStatement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        requestRoomServiceBtn.setText("Request Room Service");
        requestRoomServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestRoomServiceBtnActionPerformed(evt);
            }
        });

        notifLabel.setForeground(new java.awt.Color(255, 102, 102));
        notifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Your Checked-in Rooms:");

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requestRoomServiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notifLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestRoomServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        UserRooms userRooms = new UserRooms(guest, user);
        userRooms.setVisible(true);
        dispose();
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void billsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsButtonActionPerformed
        UserBills userBills = new UserBills(guest, user);
        
        userBills.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_billsButtonActionPerformed

    private void servicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicesButtonActionPerformed

    private void feedbackButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackButonActionPerformed
        UserFeedback userFeedback = new UserFeedback(guest, user);
        
        userFeedback.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_feedbackButonActionPerformed

    private void requestRoomServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestRoomServiceBtnActionPerformed
        int selectedRowIndex = roomsTable.getSelectedRow();

        if (selectedRowIndex != -1) {
            int room_number = Integer.parseInt((String) roomsTable.getValueAt(selectedRowIndex, 0));
            int checkin_id = Integer.parseInt((String) roomsTable.getValueAt(selectedRowIndex, 1));
            
            UserRequestService requestService = new UserRequestService(this, true, guest, user, room_number, checkin_id);
            requestService.setTitle("Request Service");
            requestService.setVisible(true);
        }
        else {
            notifLabel.setText("Please select a room to request a room service!");
        }
    }//GEN-LAST:event_requestRoomServiceBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billsButton;
    private javax.swing.JButton feedbackButon;
    private javax.swing.JLabel guestName;
    private javax.swing.JPanel headerPanel6;
    private javax.swing.JLabel hotelLabelImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel notifLabel;
    private javax.swing.JButton requestRoomServiceBtn;
    private javax.swing.JButton roomsButton;
    private javax.swing.JTable roomsTable;
    private javax.swing.JButton servicesButton;
    private javax.swing.JLabel servicesHeader;
    // End of variables declaration//GEN-END:variables
}