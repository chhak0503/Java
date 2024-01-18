package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum4;
	private JTextField txtNum3;
	private JTextField txtNum6;
	private JTextField txtNum5;
	private JTextField txtNum8;
	private JTextField txtNum7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 10, 115, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭!!!");
				
			}
		});
		btn1.setBounds(12, 59, 68, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
				
			}
		});
		btn2.setBounds(89, 59, 68, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!!", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn3.setBounds(167, 59, 68, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(12, 99, 93, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 124, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(56, 121, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("확인");		
		btnUid.setBounds(178, 120, 60, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(247, 124, 115, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 153, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(56, 150, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		btnName.setBounds(178, 149, 60, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(247, 153, 115, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_3_2 = new JLabel("휴대폰");
		lblNewLabel_3_2.setBounds(12, 182, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(56, 179, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.setBounds(178, 178, 60, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(247, 182, 115, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("덧셈");
		lblNewLabel_3_2_1.setBounds(12, 215, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(56, 212, 49, 21);
		frame.getContentPane().add(txtNum1);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.setBounds(178, 211, 60, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과 :");
		lbResultPlus.setBounds(247, 215, 115, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(123, 212, 49, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(110, 210, 13, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lbResultMinus = new JLabel("결과 :");
		lbResultMinus.setBounds(247, 245, 115, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.setBounds(178, 241, 60, 23);
		frame.getContentPane().add(btnMinus);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(123, 242, 49, 21);
		frame.getContentPane().add(txtNum4);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(110, 240, 13, 23);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(56, 242, 49, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("뺄셈");
		lblNewLabel_3_2_1_1.setBounds(12, 245, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lbResultMulti = new JLabel("결과 :");
		lbResultMulti.setBounds(247, 275, 115, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.setBounds(178, 271, 60, 23);
		frame.getContentPane().add(btnMulti);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(123, 272, 49, 21);
		frame.getContentPane().add(txtNum6);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setBounds(110, 270, 13, 23);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(56, 272, 49, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("곱셈");
		lblNewLabel_3_2_1_2.setBounds(12, 275, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_2);
		
		JLabel lbResultDiv = new JLabel("결과 :");
		lbResultDiv.setBounds(247, 305, 115, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.setBounds(178, 301, 60, 23);
		frame.getContentPane().add(btnDiv);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(123, 302, 49, 21);
		frame.getContentPane().add(txtNum8);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setBounds(110, 300, 13, 23);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(56, 302, 49, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("나눗셈");
		lblNewLabel_3_2_1_3.setBounds(12, 305, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_3);
		
		JLabel lblNewLabel_5 = new JLabel("체크박스 실습");
		lblNewLabel_5.setBounds(12, 347, 93, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 368, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 368, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(134, 368, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(195, 368, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(256, 368, 57, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setBounds(321, 368, 68, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과 : ");
		lbCheckResult.setBounds(12, 397, 377, 15);
		frame.getContentPane().add(lbCheckResult);
		
		
		
		// 이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
				
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());						
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int result = num1 + num2;
				lbResultPlus.setText("결과 : " + result);
			}
		});
		
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText("결과 : " + cities);
				
			}
		});
	}
}














