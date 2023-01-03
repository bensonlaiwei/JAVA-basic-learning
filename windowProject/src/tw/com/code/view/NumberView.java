package tw.com.code.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tw.com.code.bean.NumberBean;
import tw.com.code.dao.NumberDao;
import tw.com.code.dao.impl.NumberDaoImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberView extends JFrame {

	private JPanel contentPane;
	private JTextField pname;
	private JTextField ppassword;
	private JTextField page;
	private JTextField pemail;
	private JTextField paddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberView frame = new NumberView();
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
	public NumberView() {
		setTitle("Number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號 : ");
		lblNewLabel.setBounds(39, 41, 46, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼 : ");
		lblNewLabel_1.setBounds(39, 66, 46, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("年紀 : ");
		lblNewLabel_2.setBounds(39, 91, 46, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("郵件 : ");
		lblNewLabel_3.setBounds(39, 118, 46, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("地址 : ");
		lblNewLabel_4.setBounds(39, 143, 46, 15);
		contentPane.add(lblNewLabel_4);
		
		pname = new JTextField();
		pname.setBounds(106, 38, 166, 21);
		contentPane.add(pname);
		pname.setColumns(10);
		
		ppassword = new JTextField();
		ppassword.setBounds(106, 63, 166, 21);
		contentPane.add(ppassword);
		ppassword.setColumns(10);
		
		page = new JTextField();
		page.setBounds(106, 88, 166, 21);
		contentPane.add(page);
		page.setColumns(10);
		
		pemail = new JTextField();
		pemail.setBounds(106, 112, 166, 21);
		contentPane.add(pemail);
		pemail.setColumns(10);
		
		paddress = new JTextField();
		paddress.setBounds(106, 140, 166, 21);
		contentPane.add(paddress);
		paddress.setColumns(10);
		
		JButton btnNew = new JButton("新增");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberBean bean = new NumberBean();
				bean.setpName(pname.getText());
				bean.setpPassword(ppassword.getText());
				bean.setpAge(page.getText());
				bean.setpEmail(pemail.getText());
				bean.setpAddress(paddress.getText());
				System.out.println(bean);
				
				//泛型
				NumberDao dao = new NumberDaoImpl();
				dao.add(bean);
				
				
			}
		});
		btnNew.setBounds(39, 183, 85, 23);
		contentPane.add(btnNew);
	}
}
