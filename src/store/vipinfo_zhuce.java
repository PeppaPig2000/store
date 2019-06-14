package store;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.DbUtil;
import util.NowTime;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class vipinfo_zhuce extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try{
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e) {
            e.printStackTrace();
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vipinfo_zhuce frame = new vipinfo_zhuce();
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
	public vipinfo_zhuce() {
		setBackground(new Color(240, 240, 240));
		setTitle("ע��vip�û�");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�˺ţ�");
		lblNewLabel.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(21, 61, 54, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���룺");
		lblNewLabel_1.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 115, 54, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("������");
		lblNewLabel_2.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(21, 169, 54, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�Ա�");
		lblNewLabel_3.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(21, 227, 54, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("סַ��");
		lblNewLabel_4.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(21, 289, 54, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("�绰��");
		lblNewLabel_5.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(21, 345, 54, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("�ۿۣ�");
		lblNewLabel_6.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(21, 407, 54, 22);
		contentPane.add(lblNewLabel_6);
		
		
		
		textField = new JTextField();
		textField.setBounds(73, 64, 277, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 118, 277, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(73, 172, 277, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(73, 230, 277, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(73, 292, 277, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(73, 348, 277, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(73, 410, 277, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("ȷ��ע��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ȡ����
				String id = textField.getText();
				String password = textField_1.getText();
				String name = textField_2.getText();
				String gender = textField_3.getText();
				String address = textField_4.getText();
				String phone = textField_5.getText();
				String discount = textField_6.getText();
				String time = new NowTime().getSystemTime();
				
				//�������ݿ�
				Connection con=null;
				Statement statement =null;
				 ResultSet res=null;
				 PreparedStatement preparedStatement = null;
				 new DbUtil();
				 String sql = "insert into vip_info values(?,?,?,?,?,?,?,?)";
				 try {		
					 DbUtil dbutil = new DbUtil();
					 	con = dbutil.getCon();
					 	statement = con.createStatement();
					 	preparedStatement = con.prepareStatement(sql);
					 	preparedStatement.setString(1,id);
					 	preparedStatement.setString(2,password);
					 	preparedStatement.setString(3,name);
					 	preparedStatement.setString(4,gender);
					 	preparedStatement.setString(5,address);
					 	preparedStatement.setString(6,phone);
					 	preparedStatement.setString(7,discount);
					 	preparedStatement.setString(8,time);
					 	preparedStatement.executeUpdate();
					 	JOptionPane.showMessageDialog(null,"�ɹ�¼�룡");
				 }catch (SQLException e1) { 
					 JOptionPane.showMessageDialog(null,"¼��ʧ�ܣ���ȷ�������Ƿ���ȷ������¼�룡");
					 
					 System.out.println(e1);

								} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("΢���ź� Light", Font.PLAIN, 16));
		btnNewButton.setBounds(120, 472, 139, 41);
		contentPane.add(btnNewButton);
	}

}
