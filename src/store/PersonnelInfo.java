package store;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import util.DbUtil;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonnelInfo extends JFrame {

	private JPanel contentPane;
	DefaultTableModel defaultTableModel;           
	JTable jTable;
	private JPanel panel;
	private Vector<Object> columnNames;
	private Vector<Object> rowData;
	private JTable jtable;
	private TableModel tableModel;
	private Component jscrollpane;
	private Component header;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_6;


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
					PersonnelInfo frame = new PersonnelInfo();
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
	public PersonnelInfo() {
		setTitle("�̳����¹���");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 10, 699, 428);
		Look();
		//���������С
		jtable.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		//���ñ�ͷ�����С
		JTableHeader header = jtable.getTableHeader();
		contentPane.setLayout(null);
		//�����и�
//		jtable.setRowHeight(30);
		
		//jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//ȡ���Զ�����
		//���ù������
		jscrollpane = new JScrollPane(jtable);
		jscrollpane.setBounds(124, 10, 907, 526);
		contentPane.add(jscrollpane);
		((JComponent) jscrollpane).setOpaque(false);
		jtable.setOpaque(false);
		
		btnNewButton_3 = new JButton("��ѯ�޸�");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				PersonelInfo_chaxun frame = new PersonelInfo_chaxun();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(10, 55, 93, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("ע��Ա��");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				personelInfo_zhuce frame = new personelInfo_zhuce();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(10, 156, 93, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("ע��Ա��");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				PersonnelInfo_zhuxiao frame = new PersonnelInfo_zhuxiao();
				frame.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(10, 247, 93, 23);
		contentPane.add(btnNewButton_6);
	}
	public void Look()
	{
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		//�����������
		columnNames = new Vector<>();
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("ְ��");
		columnNames.add("�绰");
		columnNames.add("��н");
		columnNames.add("סַ");
		columnNames.add("״̬");
		columnNames.add("ע��ʱ��");
		rowData = new Vector<>();
				
		//�������ݿ�
		 
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Statement statement = null;
		try {
			DbUtil dbutil = new DbUtil();
			try {
				con = dbutil.getCon();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����һ��Statement����
			statement = con.createStatement();
			ps = con.prepareStatement("select * from personnel_info");
			rs = ps.executeQuery();
			while(rs.next())
			{
				Vector<Object> hang = new Vector<>();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getString(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				hang.add(rs.getString(7));
				hang.add(rs.getString(8));
				hang.add(rs.getString(9));
				hang.add(rs.getString(10));
				hang.add(rs.getString(11));
			rowData.add(hang);
			}
			
		} catch (SQLException e1) {
			System.out.println("fail to connect the database��");
			e1.printStackTrace();
		}
		finally
		{
			try
			{
				rs.close();
				ps.close();
				statement.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException e1)
			{
				System.out.println("conn close fall");
			}
		}
		//���ñ��
		tableModel = new DefaultTableModel(rowData, columnNames);
		//���ñ�񼰲��ɱ༭
				jtable = new JTable(tableModel)
				{
					private static final long serialVersionUID = -4085954475206341833L;

					public boolean isCellEditable(int row,int column)
					{
						return false;
					}
				};
				//���������С
				jtable.setFont(new Font("΢���ź�",5,14));
				//���ñ�ͷ�����С
				JTableHeader header = jtable.getTableHeader();
				header.setPreferredSize(new Dimension(header.getWidth(),40));
				header.setFont(new Font("����",5,15));
				
				

						
		//�����п�
//		jtable.getColumnModel().getColumn(0).setPreferredWidth(75);
//		jtable.getColumnModel().getColumn(1).setPreferredWidth(300);
//		jtable.getColumnModel().getColumn(2).setPreferredWidth(75);
//		jtable.getColumnModel().getColumn(3).setPreferredWidth(250);
//		jtable.getColumnModel().getColumn(4).setPreferredWidth(75);
//		jtable.getColumnModel().getColumn(5).setPreferredWidth(75);
//		jtable.getColumnModel().getColumn(6).setPreferredWidth(75);
		jtable.getColumnModel().getColumn(6).setPreferredWidth(150);
		jtable.getColumnModel().getColumn(10).setPreferredWidth(185);
		
	}

}
