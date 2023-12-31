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

public class StaffCheckIns extends javax.swing.JFrame {

    private String databaseUrl = "jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String username = "root";
    private String password = "";
    private HotelDatabaseManager hotelDBM = new HotelDatabaseManager(databaseUrl, username, password);
    
    private Staff staff = null;
    private User user = null;
    
    public StaffCheckIns(Staff staff, User user){
        this.staff=staff;
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
        logOutButton = new javax.swing.JButton();
        staffNameLabel = new javax.swing.JLabel();
        bookingsButton4 = new javax.swing.JButton();
        checkInsButtons2 = new javax.swing.JButton();
        billsButton = new javax.swing.JButton();
        headerPanel6 = new javax.swing.JPanel();
        bookingsHeader = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkInsTable = new javax.swing.JTable();
        notifLabel = new javax.swing.JLabel();
        checkInGuestButton = new javax.swing.JButton();

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
        feedbackButon.setText("Feedbacks");
        feedbackButon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        feedbackButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackButonActionPerformed(evt);
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

        staffNameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        staffNameLabel.setForeground(new java.awt.Color(88, 73, 16));
        staffNameLabel.setText("staffName");
        staffNameLabel.setToolTipText("");

        bookingsButton4.setBackground(new java.awt.Color(88, 73, 16));
        bookingsButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bookingsButton4.setForeground(new java.awt.Color(255, 255, 255));
        bookingsButton4.setText("Bookings");
        bookingsButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookingsButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingsButton4ActionPerformed(evt);
            }
        });

        checkInsButtons2.setBackground(new java.awt.Color(88, 73, 16));
        checkInsButtons2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkInsButtons2.setForeground(new java.awt.Color(255, 255, 255));
        checkInsButtons2.setText("Check Ins");
        checkInsButtons2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkInsButtons2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInsButtons2ActionPerformed(evt);
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

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(billsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hotelLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(servicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feedbackButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookingsButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkInsButtons2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hotelLabelImg)
                .addGap(18, 18, 18)
                .addComponent(staffNameLabel)
                .addGap(18, 18, 18)
                .addComponent(roomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingsButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkInsButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(billsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedbackButon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        staffNameLabel.setText("Hello, " + staff.getFirstName());

        headerPanel6.setBackground(new java.awt.Color(216, 196, 156));
        headerPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bookingsHeader.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        bookingsHeader.setForeground(new java.awt.Color(88, 73, 16));
        bookingsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingsHeader.setText("CHECK INS");

        javax.swing.GroupLayout headerPanel6Layout = new javax.swing.GroupLayout(headerPanel6);
        headerPanel6.setLayout(headerPanel6Layout);
        headerPanel6Layout.setHorizontalGroup(
            headerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel6Layout.setVerticalGroup(
            headerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkInsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Checkin ID", "Room", "Guest", "Check In Date", "Check Out Date", "Arrival", "Checked Out?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        checkInsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        checkInsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(checkInsTable);
        try (Connection connection = hotelDBM.getDatabaseConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM booking INNER JOIN guest ON booking.guest_id = guest.guest_id INNER JOIN check_in ON  booking.booking_id = check_in.booking_id where checked_in=1")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String checkin_id = String.valueOf(resultSet.getInt("checkin_id"));
                String room_number = String.valueOf(resultSet.getInt("room_number"));
                String guest_name = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
                Date checkin_date = resultSet.getDate("check_in_date");
                Date checkout_date = resultSet.getDate("check_out_date");
                String arrival = resultSet.getString("arrival");
                String checked_out = resultSet.getString("checked_out");

                checked_out = "1".equals(checked_out) ? "Yes" : "0".equals(checked_out) ? "No" : checked_out;

                SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
                String formattedCheckinDate = dateFormat.format(checkin_date);
                String formattedCheckoutDate = dateFormat.format(checkout_date);

                String checkinsTableData[] = {checkin_id, room_number, guest_name, formattedCheckinDate, formattedCheckoutDate, arrival, checked_out};
                DefaultTableModel checkinsTableModel = (DefaultTableModel) checkInsTable.getModel();

                checkinsTableModel.addRow(checkinsTableData);
            }

            preparedStatement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        notifLabel.setForeground(new java.awt.Color(255, 102, 102));
        notifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        checkInGuestButton.setText("Check Out Guest");
        checkInGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInGuestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notifLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                        .addComponent(checkInGuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkInGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
        StaffRooms staffRoom = new StaffRooms(staff, user);
        staffRoom.setVisible(true);
        dispose();
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void servicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesButtonActionPerformed
        StaffServices staffServices = new StaffServices(staff, user);
        staffServices.setVisible(true);
        dispose();
    }//GEN-LAST:event_servicesButtonActionPerformed

    private void feedbackButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackButonActionPerformed
        StaffFeedback staffFeedback = new StaffFeedback(staff, user);
        staffFeedback.setVisible(true);
        dispose();
    }//GEN-LAST:event_feedbackButonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void bookingsButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingsButton4ActionPerformed
        StaffBookings staffBookings = new StaffBookings(staff, user);
        staffBookings.setVisible(true);
        dispose();
    }//GEN-LAST:event_bookingsButton4ActionPerformed

    private void checkInsButtons2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInsButtons2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInsButtons2ActionPerformed

    private void checkInGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInGuestButtonActionPerformed
        int selectedRowIndex = checkInsTable.getSelectedRow();
        
        if (selectedRowIndex != -1) {
            String checkin_id = checkInsTable.getValueAt(selectedRowIndex, 0).toString();
            String room_number = checkInsTable.getValueAt(selectedRowIndex, 1).toString();
            
            if("Yes".equals(checkInsTable.getValueAt(selectedRowIndex, 6).toString())){
                notifLabel.setText("Guest already checked out!");
            }
            else{
                if(hotelDBM.updateBookingCheckOut(Integer.parseInt(checkin_id))){
                    if(hotelDBM.updateRoomStatus(Integer.parseInt(room_number), "Available")){                        
                        StaffCheckIns staffCheckIns = new StaffCheckIns(staff, user);
                        staffCheckIns.setVisible(true);
                        dispose();

                        JOptionPane.showMessageDialog(this, "Guest has successfully checked out!", "Check out", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        notifLabel.setText("Error!");
                    }
                }
                else{
                    notifLabel.setText("Error!");
                }
            }
        } 
        else {
            notifLabel.setText("Please select a checked in guest.");
        }
    }//GEN-LAST:event_checkInGuestButtonActionPerformed

    private void billsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsButtonActionPerformed
        StaffBills staffBills = new StaffBills(staff, user);
        staffBills.setVisible(true);
        dispose();
    }//GEN-LAST:event_billsButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billsButton;
    private javax.swing.JButton bookingsButton4;
    private javax.swing.JLabel bookingsHeader;
    private javax.swing.JButton checkInGuestButton;
    private javax.swing.JButton checkInsButtons2;
    private javax.swing.JTable checkInsTable;
    private javax.swing.JButton feedbackButon;
    private javax.swing.JPanel headerPanel6;
    private javax.swing.JLabel hotelLabelImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel notifLabel;
    private javax.swing.JButton roomsButton;
    private javax.swing.JButton servicesButton;
    private javax.swing.JLabel staffNameLabel;
    // End of variables declaration//GEN-END:variables
}
