package store;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.NowTime;
import util.Style;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;

public class MainInterface extends JFrame {

	private static final LayoutManager NowTime = null;
	private JPanel contentPane;

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
					MainInterface frame = new MainInterface();
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
	public MainInterface() {
		try{
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch (Exception e) {
			e.printStackTrace();
		}


		//new Style();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1035, 556);
		setResizable(false);
		setTitle("king�̳���Ϣ����ϵͳ");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel picture = new JLabel();
		picture.setIcon(new ImageIcon("imgs/trianglify.png"));
		this.getLayeredPane().add(picture,new Integer(Integer.MIN_VALUE));
		picture.setBounds(0,0,1035,556);

		JPanel c = new JPanel();
		c = (JPanel)getContentPane();
		c.setOpaque(false);

		JButton btnNewButton = new JButton("ע �� �� ��");
		btnNewButton.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "�Ƿ�ע�����û���", "ע���û�", JOptionPane.YES_NO_OPTION);
				if(JOptionPane.YES_NO_OPTION==0) {
					dispose();
					LoginInterface frame = new LoginInterface();
					frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(23, 10, 143, 29);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("�� �� ϵ ͳ");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "�Ƿ��˳���", "�˳�", JOptionPane.YES_NO_OPTION);
				if(JOptionPane.YES_NO_OPTION==0) {
					dispose();
				}
			}
		});
		btnNewButton_1.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_1.setBounds(209, 10, 143, 29);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("ϵ ͳ �� ��");
		btnNewButton_2.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(402, 10, 143, 29);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("ʹ �� �� ��");
		btnNewButton_3.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "��ϵͳʵ�����̳���Ϣ�Ĺ���\n����Ϊ�Ĵ�ģ�飬���·���ʾ��\nʹ�ù����������κ���������ϵ����\n���䣺zs17337825170@163.com", "���ʹ�ð���",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnNewButton_3.setBounds(597, 10, 143, 29);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("��     ��");
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�汾�ţ�v1.21.\n�������ڣ�2019.06.10");
			}
		});
		btnNewButton_4.setBounds(796, 10, 128, 29);
		contentPane.add(btnNewButton_4);

		JLabel lblNewLabel = new JLabel("�˺ţ�");
		lblNewLabel.setBounds(23, 61, 54, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("������");
		lblNewLabel_1.setBounds(193, 61, 36, 15);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_5 = new JButton("�� �� �� ��");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPersonal frame = new AdminPersonal();
				frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(402, 49, 143, 29);
		contentPane.add(btnNewButton_5);

		JLabel label = new JLabel("��½ʱ�䣺");
		label.setBounds(594, 61, 60, 15);
		contentPane.add(label);

		JLabel lblNewLabel_3 = new JLabel(Temp.user);
		lblNewLabel_3.setBounds(63, 61, 86, 15);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(Temp.name);
		lblNewLabel_4.setBounds(239, 61, 113, 15);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel(new NowTime().getSystemTime());
		lblNewLabel_2.setBounds(664, 61, 156, 15);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton_6 = new JButton("��Ʒ��Ϣ����");
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductInfo frame = null;
				try {
					frame = new ProductInfo();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(true);

			}
		});
		btnNewButton_6.setBounds(86, 244, 143, 29);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("vip��Ϣ����");
		btnNewButton_7.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				VipInfo frame = new VipInfo();
				frame.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(380, 244, 143, 29);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("�̳����¹���");
		btnNewButton_8.setFont(new Font("΢���ź� Light", Font.PLAIN, 14));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				PersonnelInfo frame = new PersonnelInfo();
				frame.setVisible(true);

			}
		});
		btnNewButton_8.setBounds(677, 244, 143, 29);
		contentPane.add(btnNewButton_8);
	}
}
