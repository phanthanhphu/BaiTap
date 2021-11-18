package Demo_manage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Display extends JFrame {

	private JPanel contentPane;
	private JTextField txtcode;
	private JTextField txtname;
	private JTextField txtquantity;
	private JTextField txtprice;
	JLabel lblsummoney = new JLabel("");
	JComboBox comboBox = new JComboBox();
	private JTable table;
	 
	Vector Vtitle = new Vector();
	Vector Vcontent = new Vector();
	Vector Vdong;
	float summoney = 0;
	
	DefaultTableModel dtm = new DefaultTableModel();
	
	 void Title() {
		 Vtitle.add("Code");
		 Vtitle.add("Name");
		 Vtitle.add("Product type");
		 Vtitle.add("Quantity");
		 Vtitle.add("Promotion");
		 Vtitle.add("Price");
		 Vtitle.add("Money");
	 }
	 
	 void Input(Product Pd) {
		 Vdong = new Vector();
		 Vdong.add(Pd.getCode());
		 Vdong.add(Pd.getName());
	
		 if(comboBox.getSelectedIndex() == 0) {
			 Vdong.add("Iphone");
			 Vdong.add("20%");
			 
			 
		 }
		 if(comboBox.getSelectedIndex() == 1) {
			 Vdong.add("Electric");
			 Vdong.add("10%");
		 }
		 Vdong.add(Pd.getQuantity());
		 Vdong.add(Pd.getPrice());
		 Vdong.add(Pd.money());
		 Vcontent.add(Vdong);
		 summoney += Pd.money();
		 
	 }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
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
	public Display() {
		Title();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,586, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 99, 100, 13);
		contentPane.add(lblNewLabel);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Iphone", "Electric"}));
		comboBox.setBounds(10, 122, 120, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(185, 99, 84, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(185, 122, 84, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantity");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(185, 145, 84, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(185, 170, 84, 13);
		contentPane.add(lblNewLabel_1_3);
		
		txtcode = new JTextField();
		txtcode.setBounds(287, 92, 161, 20);
		contentPane.add(txtcode);
		txtcode.setColumns(10);
		
		txtname = new JTextField();
		txtname.setBounds(286, 121, 162, 19);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtquantity = new JTextField();
		txtquantity.setColumns(10);
		txtquantity.setBounds(286, 144, 162, 19);
		contentPane.add(txtquantity);
		
		txtprice = new JTextField();
		txtprice.setColumns(10);
		txtprice.setBounds(286, 169, 162, 19);
		contentPane.add(txtprice);
		
		JButton btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product pd = null;
				
				String code = txtcode.getText();
				String name = txtname.getText();
				float quantity = Float.parseFloat(txtquantity.getText());
				float price = Float.parseFloat(txtprice.getText());
				if(comboBox.getSelectedIndex() == 0) {
					pd = new Iphone(code, name, quantity, price);
					
				}
				if(comboBox.getSelectedIndex() == 1) {
					pd = new Electric(code, name, quantity, price);
				}
			
				lblsummoney.setText(""+summoney);
				Input(pd);
				dtm.setDataVector(Vcontent, Vtitle);
				table.setModel(dtm);
				
				
				
				
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnadd.setBounds(75, 230, 85, 21);
		contentPane.add(btnadd);
		
		JButton btnEdit = new JButton("Exit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(399, 230, 85, 21);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtprice.setText("");
				txtcode.setText("");
				txtname.setText("");
				txtquantity.setText("");
				Vdong.clear();
				
				dtm.setDataVector(Vdong, Vtitle);
                 table.setModel(dtm);
                 
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(237, 230, 85, 21);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 298, 552, 128);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Code ", "Name", "Product Type", "Quantity", "Promotion", "Price", "Money"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_4 = new JLabel("Sum money");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(165, 436, 120, 23);
		contentPane.add(lblNewLabel_1_4);
		
		
		lblsummoney.setForeground(Color.RED);
		lblsummoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsummoney.setBounds(295, 436, 167, 18);
		contentPane.add(lblsummoney);
		
		JLabel lblNewLabel_2 = new JLabel("Product Managemant Software");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 30));
		lblNewLabel_2.setBounds(67, 23, 479, 38);
		contentPane.add(lblNewLabel_2);
	}
}
