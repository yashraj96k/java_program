import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat extends JFrame {
    private JTextField roomNumberField, examDateField, examTimeField;
    private JEditorPane seatStatusArea;
    private JButton setUpButton, reserveButton, showButton;

    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 4;
    private static final int NUM_ROOMS = 4;
    private ExamRoom[] examRooms = new ExamRoom[NUM_ROOMS];
    private int currentRoomIndex = 0;

    public Seat() {
        setTitle("EXAM SEAT RESERVATION SYSTEM");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Exam Room Number:"));
        roomNumberField = new JTextField();
        inputPanel.add(roomNumberField);

        inputPanel.add(new JLabel("Exam Date:"));
        examDateField = new JTextField();
        inputPanel.add(examDateField);

        inputPanel.add(new JLabel("Exam Time:"));
        examTimeField = new JTextField();
        inputPanel.add(examTimeField);

        setUpButton = new JButton("Set up exam room");
        reserveButton = new JButton("Reserve seat");
        showButton = new JButton("Show exam room");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(setUpButton);
        buttonPanel.add(reserveButton);
        buttonPanel.add(showButton);

        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(inputPanel, BorderLayout.NORTH);
        controlPanel.add(buttonPanel, BorderLayout.CENTER);

        seatStatusArea = new JEditorPane();
        seatStatusArea.setContentType("text/html");
        seatStatusArea.setEditable(false);

        add(controlPanel, BorderLayout.NORTH);
        add(new JScrollPane(seatStatusArea), BorderLayout.CENTER);

        setUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUpExamRoom();
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserveSeat();
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showExamRoom();
            }
        });
    }

    private void setUpExamRoom() {
        String roomNumber = roomNumberField.getText();
        String examDate = examDateField.getText();
        String examTime = examTimeField.getText();

        examRooms[currentRoomIndex] = new ExamRoom(roomNumber, examDate, examTime);
        currentRoomIndex++;
        updateSeatStatusArea("Exam room set up successfully.");
    }

    private void reserveSeat() {
        if (currentRoomIndex == 0) {
            updateSeatStatusArea("No exam room set up yet.");
            return;
        }
        String roomNumber = roomNumberField.getText();
        ExamRoom currentRoom = null;
        for (int i = 0; i < currentRoomIndex; i++) {
            if (examRooms[i].getRoomNumber().equals(roomNumber)) {
                currentRoom = examRooms[i];
                break;
            }
        }
        if (currentRoom == null) {
            updateSeatStatusArea("Exam room not found.");
            return;
        }
        String studentName = JOptionPane.showInputDialog(this, "Enter student's name:");
        String rollNumber = JOptionPane.showInputDialog(this, "Enter student's roll number:");
        if (studentName == null || studentName.isEmpty() || rollNumber == null || rollNumber.isEmpty()) {
            return;
        }
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                if (currentRoom.seats[i][j] != null && currentRoom.seats[i][j].contains("(RN: " + rollNumber + ")")) {
                    updateSeatStatusArea("This roll number is already associated with a reserved seat.");
                    return;
                }
                if (currentRoom.seats[i][j] == null) {
                    String seatNumber = "RS" + ((i * NUM_COLS) + j + 1);
                    currentRoom.seats[i][j] = studentName + "(" + seatNumber + ")";
                    updateSeatStatusArea("Seat reserved successfully for " + studentName + ". Seat Number: " + seatNumber);
                    return;
                }
            }
        }
        updateSeatStatusArea("This room is already full.");
    }

    private void showExamRoom() {
        if (currentRoomIndex == 0) {
            updateSeatStatusArea("<html><body><div style='text-align: center;'><b>No exam room set up yet.</b></div></body></html>");
            return;
        }
        String roomNumber = roomNumberField.getText();
        ExamRoom currentRoom = null;
        for (int i = 0; i < currentRoomIndex; i++) {
            if (examRooms[i].getRoomNumber().equals(roomNumber)) {
                currentRoom = examRooms[i];
                break;
            }
        }
        if (currentRoom == null) {
            updateSeatStatusArea("<html><body><div style='text-align: center;'><b>Exam room not found.</b></div></body></html>");
            return;
        }
        updateSeatStatusArea("<html><body><div style='text-align: center;'><b>" + currentRoom.toString() + "</b></div></body></html>");
    }

    private void updateSeatStatusArea(String text) {
        seatStatusArea.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Seat().setVisible(true);
            }
        });
    }

    static class ExamRoom {
        private String roomNumber;
        private String examDate;
        private String examTime;
        private String[][] seats;

        public ExamRoom(String roomNumber, String examDate, String examTime) {
            this.roomNumber = roomNumber;
            this.examDate = examDate;
            this.examTime = examTime;
            seats = new String[NUM_ROWS][NUM_COLS];
        }

        public String getRoomNumber() {
            return roomNumber;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Exam Room Number: ").append(roomNumber).append("<br>");
            sb.append("Exam Date: ").append(examDate).append("<br>");
            sb.append("Exam Time: ").append(examTime).append("<br>");
            sb.append("Seat Reservation Status:<br>");
            sb.append("<table>");
            for (int i = 0; i < NUM_ROWS; i++) {
                sb.append("<tr>");
                for (int j = 0; j < NUM_COLS; j++) {
                    sb.append("<td>");
                    if (seats[i][j] == null) {
                        sb.append("[Empty]");
                    } else {
                        sb.append(seats[i][j]);
                    }
                    sb.append("</td>");
                }
                sb.append("</tr>");
            }
            sb.append("</table>");
            return sb.toString();
        }
    }
}
