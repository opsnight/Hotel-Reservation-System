
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kyleq
 */
public class UserBookRoom extends javax.swing.JFrame {

    private String databaseUrl = "jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String username = "root";
    private String password = "";
    private HotelDatabaseManager hotelDBM = new HotelDatabaseManager(databaseUrl, username, password);
    
    private Guest guest = null;
    private User user = null;
    private Room room = null;
    private Date checkInDate;
    private Date checkOutDate;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
    private long duration;
    
    private double totalCost;
    
    public UserBookRoom(Guest guest, User user, Room room, Date checkInDate, Date checkOutDate, double totalCost){
        this.guest=guest;
        this.user=user;
        this.room=room;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
        this.totalCost=totalCost;
        this.duration=(checkOutDate.getTime() - checkInDate.getTime()) / (24 * 60 * 60 * 1000);
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
        headerPanel = new javax.swing.JPanel();
        userRoomsHeaderPanel = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();
        roomPicLabel = new javax.swing.JLabel();
        roomNumberTopLabel = new javax.swing.JLabel();
        roomTypeTopLabel = new javax.swing.JLabel();
        roomCapTopLabel = new javax.swing.JLabel();
        rateTopLabel = new javax.swing.JLabel();
        statusTopLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();
        roomTypeLabel = new javax.swing.JLabel();
        roomCapacityLabel = new javax.swing.JLabel();
        rateLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        bookRoomButton = new javax.swing.JButton();
        checkInLabel = new javax.swing.JLabel();
        checkOutLabel = new javax.swing.JLabel();
        checkOutDateLabel = new javax.swing.JLabel();
        checkInDateLabel1 = new javax.swing.JLabel();
        durationHLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        totalCostHLabel = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        notifLabel = new javax.swing.JLabel();
        descTopLabel = new javax.swing.JLabel();
        statusLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(guestName)
                .addGap(33, 33, 33)
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

        headerPanel.setBackground(new java.awt.Color(216, 196, 156));
        headerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        userRoomsHeaderPanel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        userRoomsHeaderPanel.setForeground(new java.awt.Color(88, 73, 16));
        userRoomsHeaderPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userRoomsHeaderPanel.setText("ROOM " + room.getRoomNumber());

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userRoomsHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userRoomsHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        lowerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        roomPicLabel.setIcon(
            room.getRoomType().equals("Studio") ?
            new javax.swing.ImageIcon(getClass().getResource("/assets/studio.png")) :
            room.getRoomType().equals("Suite") ?
            new javax.swing.ImageIcon(getClass().getResource("/assets/suite.png")) :
            room.getRoomType().equals("Deluxe") ?
            new javax.swing.ImageIcon(getClass().getResource("/assets/deluxe.png")) :
            null
        );
        roomPicLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomPicLabel.setMaximumSize(new java.awt.Dimension(555, 251));
        roomPicLabel.setMinimumSize(new java.awt.Dimension(555, 251));
        roomPicLabel.setPreferredSize(new java.awt.Dimension(555, 251));
        roomPicLabel.setRequestFocusEnabled(false);

        roomNumberTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomNumberTopLabel.setText("Room Number:");

        roomTypeTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomTypeTopLabel.setText("Room Type:");

        roomCapTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomCapTopLabel.setText("Room Capacity:");

        rateTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rateTopLabel.setText("Rate:");

        statusTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        statusTopLabel.setText("Status:");

        roomNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomNumberLabel.setText(String.valueOf(room.getRoomNumber()));

        roomTypeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomTypeLabel.setText(room.getRoomType());

        roomCapacityLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomCapacityLabel.setText(String.valueOf(room.getRoomCapacity()));

        rateLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rateLabel.setText("₱ " + String.valueOf(room.getRate()) + "0");

        statusLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        statusLabel.setText(room.getStatus());

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        bookRoomButton.setText("Confirm Book");
        bookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomButtonActionPerformed(evt);
            }
        });

        checkInLabel.setText("Check in:");

        checkOutLabel.setText("Check out:");

        durationHLabel.setText("Duration");

        totalCostHLabel.setText("Total Cost:");

        notifLabel.setForeground(new java.awt.Color(255, 102, 102));
        notifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        descTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        descTopLabel.setText("Description:");

        statusLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        statusLabel1.setText(    room.getRoomType().equals("Studio") ?
            "Modern, compact, comfy" :
            room.getRoomType().equals("Suite") ?
            "Style, comfort, and modern amenities" :
            room.getRoomType().equals("Deluxe") ?
            "Lavish, spacious, and luxurious" :
            null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hotel-icon-corner.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addComponent(roomPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(roomTypeLabel))
                            .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomCapTopLabel)
                                    .addComponent(rateTopLabel)
                                    .addComponent(statusTopLabel)
                                    .addComponent(roomTypeTopLabel)
                                    .addComponent(roomNumberTopLabel)
                                    .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                            .addComponent(descTopLabel)
                                            .addGap(11, 11, 11))
                                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(roomNumberLabel)
                                            .addComponent(roomCapacityLabel)
                                            .addComponent(rateLabel)
                                            .addComponent(statusLabel)))
                                    .addGroup(lowerPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(statusLabel1)))))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(goBackButton)
                            .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lowerPanelLayout.createSequentialGroup()
                                        .addComponent(checkInLabel)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                                        .addComponent(checkInDateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkOutLabel)
                                    .addComponent(checkOutDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lowerPanelLayout.createSequentialGroup()
                                        .addComponent(durationHLabel)
                                        .addGap(55, 55, 55)
                                        .addComponent(totalCostHLabel))
                                    .addGroup(lowerPanelLayout.createSequentialGroup()
                                        .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(notifLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addComponent(roomPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkInLabel)
                            .addComponent(checkOutLabel)
                            .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(durationHLabel)
                                .addComponent(totalCostHLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkOutDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkInDateLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(durationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(goBackButton)
                        .addContainerGap())
                    .addGroup(lowerPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(roomNumberTopLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomNumberLabel)
                        .addGap(13, 13, 13)
                        .addComponent(roomTypeTopLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(roomCapTopLabel)
                        .addGap(8, 8, 8)
                        .addComponent(roomCapacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rateTopLabel)
                        .addGap(8, 8, 8)
                        .addComponent(rateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusTopLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descTopLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        if ("Unavailable".equals(room.getStatus())) {
            bookRoomButton.setEnabled(false);
        }
        String checkOutDateString = dateFormat.format(checkOutDate);
        checkOutDateLabel.setText(checkOutDateString);
        String checkInDateString = dateFormat.format(checkInDate);
        checkInDateLabel1.setText(checkInDateString);
        durationLabel.setText(String.valueOf(duration) + " Day(s)");
        totalCostLabel.setText("₱" + this.totalCost+ "0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        UserRooms userRoom = new UserRooms(guest, user);

        userRoom.setVisible(true);

        dispose();
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void servicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesButtonActionPerformed
        UserServices userServices = new UserServices(guest, user);

        userServices.setVisible(true);

        dispose();
    }//GEN-LAST:event_servicesButtonActionPerformed

    private void feedbackButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackButonActionPerformed
        UserFeedback userFeedback = new UserFeedback(guest, user);

        userFeedback.setVisible(true);

        dispose();
    }//GEN-LAST:event_feedbackButonActionPerformed

    private void billsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsButtonActionPerformed
        UserBills userBills = new UserBills(guest, user);

        userBills.setVisible(true);

        dispose();
    }//GEN-LAST:event_billsButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        UserViewRoom userViewRoom = new UserViewRoom(guest, user, room);

        userViewRoom.setVisible(true);

        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void bookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomButtonActionPerformed
        if(hotelDBM.registerBooking(room.getRoomNumber(), guest.getGuestID(), checkInDate, checkOutDate, totalCost)){
            UserRooms userRooms = new UserRooms(guest, user);
            userRooms.setVisible(true);
            dispose();
            
            JOptionPane.showMessageDialog(this, "Booking has been made!", "Book Room", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            notifLabel.setText("Booking has failed!");
        }
    }//GEN-LAST:event_bookRoomButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billsButton;
    private javax.swing.JButton bookRoomButton;
    private javax.swing.JLabel checkInDateLabel1;
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JLabel checkOutDateLabel;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel descTopLabel;
    private javax.swing.JLabel durationHLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JButton feedbackButon;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel guestName;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel hotelLabelImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel notifLabel;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JLabel rateTopLabel;
    private javax.swing.JLabel roomCapTopLabel;
    private javax.swing.JLabel roomCapacityLabel;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JLabel roomNumberTopLabel;
    private javax.swing.JLabel roomPicLabel;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel roomTypeTopLabel;
    private javax.swing.JButton roomsButton;
    private javax.swing.JButton servicesButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusLabel1;
    private javax.swing.JLabel statusTopLabel;
    private javax.swing.JLabel totalCostHLabel;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JLabel userRoomsHeaderPanel;
    // End of variables declaration//GEN-END:variables
}