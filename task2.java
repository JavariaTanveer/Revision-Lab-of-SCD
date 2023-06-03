import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

import javax.security.auth.Subject;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class t3 extends JFrame {

	private JPanel contentPane;
	private JCheckBox checkField;
	private final ButtonGroup GenderB = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t3 frame = new t3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public t3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea nameField = new JTextArea();
		nameField.setBounds(210, 40, 180, 22);
		contentPane.add(nameField);
		
		JEditorPane subField = new JEditorPane();
		subField.setBounds(210, 88, 180, 22);
		contentPane.add(subField);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(113, 44, 85, 17);
		contentPane.add(Name);
		
		JLabel Subject = new JLabel("Subject");
		Subject.setBounds(113, 96, 53, 17);
		contentPane.add(Subject);
		
		JRadioButton radioM = new JRadioButton("Male");
		radioM.setBackground(SystemColor.activeCaption);
		GenderB.add(radioM);
		radioM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioM.setBounds(161, 141, 109, 23);
		contentPane.add(radioM);
		
		JRadioButton radioF = new JRadioButton("Female");
		radioF.setBackground(SystemColor.activeCaption);
		GenderB.add(radioF);
		radioF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioF.setBounds(294, 141, 109, 23);
		contentPane.add(radioF);
		
		JButton ResButton = new JButton("Result");
		ResButton.setBackground(new Color(0, 0, 160));
		ResButton.setForeground(new Color(255, 255, 255));
		ResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameField.getText().toString().equals("javaria")&& subField.getText().toString().equals("scd") && radioF.isSelected() && checkField.isSelected()) {
					JOptionPane.showMessageDialog(null, "Marks is 100");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "not registered");
				}
			}
		});
		ResButton.setBounds(210, 207, 89, 23);
		contentPane.add(ResButton);
		
		checkField = new JCheckBox("I agree to terms and conditon");
		checkField.setBackground(SystemColor.activeCaption);
		checkField.setBounds(161, 177, 190, 23);
		contentPane.add(checkField);
	}
}


