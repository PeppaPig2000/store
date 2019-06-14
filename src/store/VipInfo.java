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

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VipInfo extends JFrame {

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
					VipInfo frame = new VipInfo();
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
	public VipInfo() {
		setTitle("vip��Ϣ����");
		try{
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e) {
            e.printStackTrace();
        }
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 10, 699, 428);
		Look();
		//���������С
		jtable.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		//���ñ�ͷ�����С
		JTableHeader header = jtable.getTableHeader();
		//�����и�
//		jtable.setRowHeight(30);
		
		//jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//ȡ���Զ�����
		//���ù������
		jscrollpane = new JScrollPane(jtable);
		jscrollpane.setBounds(147, 10, 680, 430);
		contentPane.add(jscrollpane);
		((JComponent) jscrollpane).setOpaque(false);
		jtable.setOpaque(false);
		
		btnNewButton = new JButton("ע��");
		btnNewButton.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				vipinfo_zhuce frame = new vipinfo_zhuce();
				frame.setVisible(true);
			}	
		
		});
		btnNewButton.setBounds(10, 63, 127, 36);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("��ѯ�޸�");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				Vipinfo_chaxun frame = new Vipinfo_chaxun();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_1.setBounds(10, 178, 127, 36);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("ע��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		        }catch (Exception e1) {
		            e1.printStackTrace();
		        }
				Vipinfo_zhuxiao frame = new Vipinfo_zhuxiao();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 294, 127, 36);
		contentPane.add(btnNewButton_2);
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
		columnNames.add("�˺�");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("סַ");
		columnNames.add("�绰");
		columnNames.add("�ۿ�");
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
			ps = con.prepareStatement("select * from vip_info");
			rs = ps.executeQuery();
			while(rs.next())
			{
				Vector<Object> hang = new Vector<>();
				hang.add(rs.getString(1));
				hang.add(rs.getString(3));
				hang.add(rs.getString(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				hang.add(rs.getString(7));
				hang.add(rs.getString(8));
				
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
//		jtable.getColumnModel().getColumn(8).setPreferredWidth(85);
		
	}
}
