package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class clientGUI {

	private static JFrame frame;
	private static boolean running = true;
	
	private static JTextArea recievedMessagesTextWindow;
	private static JTextArea inputTextWindow;
	private static JButton sendButton;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientGUI window = new clientGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clientGUI() {
		initialize();
	}
	
	public static void incomingMessage(String m) {
		recievedMessagesTextWindow.append(m + "\n");
	}
	
	public static void turnOff() {
		System.exit(0);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				main.close();
			}
		});

		frame.setBounds(100, 100, 541, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane recievedMessagesScrollPane = new JScrollPane();
		recievedMessagesScrollPane.setBounds(10, 11, 505, 273);
		frame.getContentPane().add(recievedMessagesScrollPane);
		
		JTextArea recievedMessagesTextWindow = new JTextArea();
		recievedMessagesTextWindow.setEditable(false);
		recievedMessagesScrollPane.setViewportView(recievedMessagesTextWindow);
		
		JScrollPane writeMessageScrollPane = new JScrollPane();
		writeMessageScrollPane.setBounds(10, 295, 411, 66);
		frame.getContentPane().add(writeMessageScrollPane);
		
		JTextArea writeMessageTextWindow = new JTextArea();
		writeMessageTextWindow.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					main.sendMessage(inputTextWindow.getText().trim());
					inputTextWindow.setText("");
				}
			}
		});
		writeMessageScrollPane.setViewportView(writeMessageTextWindow);
		
		JButton sendButton = new JButton("Send");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.sendMessage(inputTextWindow.getText());
				inputTextWindow.setText("");
			}
		});
		sendButton.setBounds(426, 295, 89, 66);
		frame.getContentPane().add(sendButton);
		
		this.recievedMessagesTextWindow = recievedMessagesTextWindow;
		this.inputTextWindow = writeMessageTextWindow;
		this.sendButton = sendButton;
		
		this.recievedMessagesTextWindow.setText("");
	}
}
