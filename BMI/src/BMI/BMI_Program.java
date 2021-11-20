package BMI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class BMI_Program extends JFrame {

	private JPanel contentPane;
	private JTextField txtweight;
	private JTextField txtheight;
	private JTextField txtindex;
	private JTextField txtbmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_Program frame = new BMI_Program();
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
	public BMI_Program() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BMI PROGRAM");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(106, 10, 227, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(42, 69, 51, 17);
		contentPane.add(lblNewLabel_1);
		
		txtweight = new JTextField();
		txtweight.setBounds(101, 70, 151, 19);
		contentPane.add(txtweight);
		txtweight.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Height");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(42, 107, 51, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnresult = new JButton("Result");
		btnresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double  weight = Double.parseDouble(txtweight.getText());
				Double height = Double.parseDouble(txtheight.getText());
				Double result = (weight/ (height*height));
				if(result < 18.5) {

					txtbmi.setText("Người gầy");
					txtindex.setText(Double.toString(result));
				}else if(result >= 18.5 && result <= 24.9) {
					
					txtbmi.setText("Bình thường");
					txtindex.setText(Double.toString(result));
					
				}else if(result == 25 ) {

					txtbmi.setText("Tiền béo phì");
					txtindex.setText(Double.toString(result));
					
				}else if(result >=30 && result <=34.9 ) {

					txtbmi.setText("Béo phì độ I");
					txtindex.setText(Double.toString(result));
				}
				
				
				
			}
		});
		btnresult.setBounds(42, 149, 85, 21);
		contentPane.add(btnresult);
		
		JLabel lblNewLabel_1_2 = new JLabel("BMI index:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(42, 180, 76, 17);
		contentPane.add(lblNewLabel_1_2);
		
		txtheight = new JTextField();
		txtheight.setColumns(10);
		txtheight.setBounds(101, 108, 151, 19);
		contentPane.add(txtheight);
		
		txtindex = new JTextField();
		txtindex.setColumns(10);
		txtindex.setBounds(106, 181, 146, 19);
		contentPane.add(txtindex);
		
		txtbmi = new JTextField();
		txtbmi.setColumns(10);
		txtbmi.setBounds(46, 221, 206, 19);
		contentPane.add(txtbmi);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Phub1\\Desktop\\cach-chon-rau-cu-qua-sach-tuoi-ngon-khong-ngam-doc.jpg"));
		lblNewLabel_2.setBounds(0, 0, 375, 293);
		contentPane.add(lblNewLabel_2);
	}
}
