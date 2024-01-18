package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CalcTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest frame = new CalcTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	ArrayList<Double> numberList = new ArrayList<>(); // 숫자를 저장하는 리스트
	ArrayList<String> arithList = new ArrayList<>(); // 연산자를 저장하는 리스트
	static final Double ERROR_NUM = -99999.999; //오류 넘버;

	StringBuilder sb = new StringBuilder(); // 입력되는 데이터(숫자, 연산자)를 저장하는 변수
	char[] arithmetic = { '+', 'X', '-', '/' };
	
	//입력된 데이터(숫자, 연산자)를 통해 결과 값을 반환하는 메서드
	public Double Cal() {
		if(!distinct()) return ERROR_NUM; // 계산하기전에 현재까지 입력된 데이터를 숫자와 연산자를 나누는 메서드를 호출하여 분리한다.
		double result = 0; // 계산 결과 값을 저장하는 변수

		// 우선순위 1번째인 'X', '/'연산에 대한 계산 로직
		int size = arithList.size();
		for (int i = 0; i < size; i++) {
			String s = arithList.get(i);
			if (s.contains("X") || s.contains("/")) {
				if (s.equals("X")) {
					result = numberList.get(i) * numberList.get(i + 1);
				} else if (s.equals("/")) {
					result = numberList.get(i) / numberList.get(i + 1);
				}
				arithList.remove(i); // 연산에 사용된 연산자는 제거
				numberList.set(i + 1, result); // 연산 결과값을 덮어 씌워서 저장
				numberList.remove(i); // 2개의 값을 계산 후 하나의 값이 되기때문에 덮어씌운 값을 제외한 나머지 값은 제거해준다.
				i--;
				size--;
			}
		}

		// 우선순위 2번째인 '+', '-' 연산에 대한 계산 로직
		size = arithList.size();
		for (int i = 0; i < size; i++) {
			String s = arithList.get(i);
			
			if (s.equals("+")) {
				result = numberList.get(i) + numberList.get(i + 1);
			} else if (s.equals("-")) {
				result = numberList.get(i) - numberList.get(i + 1);
			}
			
			arithList.remove(i); // 연산에 사용된 연산자는 제거
			numberList.set(i + 1, result); // 연산 결과값을 덮어 씌워서 저장
			numberList.remove(i); // 2개의 값을 계산 후 하나의 값이 되기때문에 덮어씌운 값을 제외한 나머지 값은 제거해준다.
			i--;
			size--;
		}

		return numberList.get(0);
	}

	// 숫자와 연산자를 나누어 저장하는 메서드
	public boolean distinct() {
		char[] cArr = sb.toString().toCharArray();
		StringBuilder temp = new StringBuilder();


		for (int i = 0; i < cArr.length; i++) {

			
			if (cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '/' || cArr[i] == 'X') { //해당 인덱스의 값이 연산자일 경우 실행
				
				if(i == 0) { //첫번째 값의 부호가 '+'나 '-'인 경우
					if(cArr[i] == '-' || cArr[i] == '+') {
						temp.append(cArr[i]);	
						continue;						
					} else if(cArr[i] == 'X' || cArr[i] == '/') { //첫번째 값의 부호가 'X'나 '/'인 경우는 잘못된 수식이므로 모든 데이터를 초기화 시키고 오류 메시지를 표시한다.
						JOptionPane.showMessageDialog(null, "잘못된 수식입니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
						reset();
						return false;
					}
				} 
				
				numberList.add(Double.parseDouble(temp.toString())); //연산자가 나오기전까지 저장되었던 숫자 값을 numberList에 저장한다.
				arithList.add(String.valueOf(cArr[i])); // 연산자를 arithList에 저장
				temp.delete(0, temp.length()); // 값을 저장한뒤에 다시 숫자를 넣기위해 초기화
				
			} else if (i == cArr.length - 1) { // 데이터에 저장된 마지막 인덱스일 경우 마지막 연산자 후에 숫자를 저장해온 temp변수에 마지막 인덱스 값을 넣고 numberList에 저장한다.
				temp.append(cArr[i]);
				numberList.add(Double.valueOf(temp.toString()));

			} else {
				temp.append(cArr[i]);
			}
			
		}
		return true;	
	}
	
	//모든 데이터를 초기화하는 메서드
	public void reset() { 
		sb.delete(0, sb.length());
		numberList.clear();
		arithList.clear();
		txtDisp.setText("0");
	}

	// 버튼이 눌릴때마다 텍스트에 해당 버튼의 값을 추가해서 보이도록 하는 메서드
	public void dataAppend(String btnText) {
		sb.append(btnText);
		txtDisp.setText(sb.toString());
	}

	// sb변수가 비어있는지 확인하는 메서드
	public boolean isEmpty() {
		return sb.length() == 0;
	}

	// sb 변수에 마지막 문자열 값이 연산자인지 확인하는 메서드
	public boolean check() {
		if (isEmpty())
			return true;
		
		//'='을 포함하고 있는 경우 초기화 시킨다.
		if(sb.toString().contains("=")) {
			reset();
			return false;
		}

		char[] cArr = sb.toString().toCharArray();

		for (char ch : arithmetic) {
			if (cArr[cArr.length - 1] == ch) {
				changeArit();
				return true;
			}
		}

		return true;
	}

	// sb변수 마지막에 있는 문자열을 삭제하는 메서드
	public void changeArit() {

		char[] cArr = sb.toString().toCharArray();

		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());
	}

	/**
	 * Create the frame.
	 */
	public CalcTest() {
		setTitle("CalcTest v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtDisp = new JTextField();
		txtDisp.setBackground(new Color(255, 255, 255));
		txtDisp.setEditable(false);
		txtDisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisp.setText("0");
		txtDisp.setBounds(12, 10, 273, 58);
		contentPane.add(txtDisp);
		txtDisp.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn7.getText());
			}
		});
		btn7.setBounds(12, 78, 60, 60);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn8.getText());
			}
		});
		btn8.setBounds(82, 78, 60, 60);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn9.getText());
			}
		});
		btn9.setBounds(154, 78, 60, 60);
		contentPane.add(btn9);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnDiv.getText());
			}
		});
		btnDiv.setBounds(224, 78, 60, 60);
		contentPane.add(btnDiv);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn4.getText());
			}
		});
		btn4.setBounds(13, 148, 60, 60);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn5.getText());
			}
		});
		btn5.setBounds(83, 148, 60, 60);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn6.getText());
			}
		});
		btn6.setBounds(155, 148, 60, 60);
		contentPane.add(btn6);

		JButton btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMulti.getText());
			}
		});
		btnMulti.setBounds(225, 148, 60, 60);
		contentPane.add(btnMulti);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn1.getText());
			}
		});
		btn1.setBounds(13, 218, 60, 60);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn2.getText());
			}
		});
		btn2.setBounds(83, 218, 60, 60);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn3.getText());
			}
		});
		btn3.setBounds(155, 218, 60, 60);
		contentPane.add(btn3);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMinus.getText());
			}
		});
		btnMinus.setBounds(225, 218, 60, 60);
		contentPane.add(btnMinus);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn0.getText());
			}
		});
		btn0.setBounds(82, 288, 60, 60);
		contentPane.add(btn0);

		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sb.delete(0, sb.length());
				txtDisp.setText("0");
				numberList.clear();
				arithList.clear();
			}
		});
		btnCancel.setBounds(12, 288, 60, 60);
		contentPane.add(btnCancel);

		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(check() == false) { //'='값이 이미 입력되어 있다면 return한다.
					return;
				}
				if(isEmpty()) { //데이터가 비어있는 경우 return 한다.
					return;
				}

				Double result = Cal();
				if(result == ERROR_NUM) return; //result 값이 오류 번호이면 return한다.
				
				String formatResult = "";
				result = Double.parseDouble(String.format("%.1f", result)); //소수 첫째자리까지 표현 
				
				if(String.valueOf(result).length() > 8) { //결과값의 길이(소수점 포함)가 8이상일 경우 지수표현식을 사용
					DecimalFormat df = new DecimalFormat("#.####E0");
					formatResult = df.format(result);
				} else {
					formatResult = String.valueOf(result);					
				}
				dataAppend(btnEq.getText());
				dataAppend(formatResult);
				numberList.clear();
				arithList.clear();
			}
		});
		btnEq.setBounds(155, 288, 60, 60);
		contentPane.add(btnEq);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnPlus.getText());
			}
		});
		btnPlus.setBounds(225, 288, 60, 60);
		contentPane.add(btnPlus);
	}
}
