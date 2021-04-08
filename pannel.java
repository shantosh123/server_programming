package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.lang.invoke.LambdaConversionException;
import java.awt.event.ActionEvent;

public class pannel extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel Home;
	private JPanel Question1;
	private JPanel question2;
	private JPanel Question3;
	private JPanel Question4;
	private JPanel Question5;
	private JPanel Question6;
	private JPanel Question7;
	private JPanel Question8;
	private JPanel Question9;
	private JPanel Question10;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JTextField txtInFinlandIt;
	private JButton btnNewButton_10;
	private JTextField txtWelcomeToOur;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JRadioButton rdbtnNewRadioButton_6;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JPanel Question2;
	private JTextField textField;
	private JButton btnNewButton_11;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_7;
	private JRadioButton rdbtnNewRadioButton_8;
	private JRadioButton rdbtnNewRadioButton_9;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;
	private JButton btnNewButton_21;
	private JPanel question3;
	private JTextField txtFinlandHasMoved;
	private JButton btnNewButton_22;
	private JRadioButton rdbtnNewRadioButton_10;
	private JRadioButton rdbtnNewRadioButton_11;
	private JRadioButton rdbtnNewRadioButton_12;
	private JRadioButton rdbtnNewRadioButton_13;
	private JRadioButton rdbtnNewRadioButton_14;
	private JButton btnNewButton_23;
	private JButton btnNewButton_24;
	private JButton btnNewButton_25;
	private JButton btnNewButton_26;
	private JButton btnNewButton_27;
	private JPanel Question04;
	private JTextField txtTheMaternityTime;
	private JButton btnNewButton_28;
	private JRadioButton rdbtnNewRadioButton_15;
	private JRadioButton rdbtnNewRadioButton_16;
	private JRadioButton rdbtnNewRadioButton_17;
	private JRadioButton rdbtnNewRadioButton_18;
	private JRadioButton rdbtnNewRadioButton_19;
	private JButton btnNewButton_29;
	private JButton btnNewButton_30;
	private JButton btnNewButton_31;
	private JButton btnNewButton_32;
	private JButton btnNewButton_33;
	private JPanel Question05;
	private JTextField txtDurationOfEarnings;
	private JButton btnNewButton_34;
	private JRadioButton rdbtnNewRadioButton_20;
	private JRadioButton rdbtnNewRadioButton_21;
	private JRadioButton rdbtnNewRadioButton_22;
	private JRadioButton rdbtnNewRadioButton_23;
	private JRadioButton rdbtnNewRadioButton_24;
	private JButton btnNewButton_35;
	private JButton btnNewButton_36;
	private JButton btnNewButton_37;
	private JButton btnNewButton_38;
	private JButton btnNewButton_39;
	private JPanel Question06;
	private JTextField txtOnTheOutside;
	private JButton btnNewButton_40;
	private JRadioButton rdbtnNewRadioButton_25;
	private JRadioButton rdbtnNewRadioButton_26;
	private JRadioButton rdbtnNewRadioButton_27;
	private JRadioButton rdbtnNewRadioButton_28;
	private JRadioButton rdbtnNewRadioButton_29;
	private JButton btnNewButton_41;
	private JButton btnNewButton_42;
	private JButton btnNewButton_43;
	private JButton btnNewButton_44;
	private JButton btnNewButton_45;
	private JButton btnNewButton_46;
	private JButton btnNewButton_47;
	private JPanel Question07;
	private JTextField txtFoodTaxationCan;
	private JButton btnNewButton_48;
	private JRadioButton rdbtnNewRadioButton_30;
	private JRadioButton rdbtnNewRadioButton_31;
	private JRadioButton rdbtnNewRadioButton_32;
	private JRadioButton rdbtnNewRadioButton_33;
	private JRadioButton rdbtnNewRadioButton_34;
	private JButton btnNewButton_49;
	private JButton btnNewButton_50;
	private JButton btnNewButton_51;
	private JButton btnNewButton_52;
	private JButton btnNewButton_53;
	private JButton btnNewButton_54;
	private JButton btnNewButton_55;
	private JPanel Question08;
	private JTextField txtTheStateAnd;
	private JButton btnNewButton_56;
	private JRadioButton rdbtnNewRadioButton_35;
	private JRadioButton rdbtnNewRadioButton_36;
	private JRadioButton rdbtnNewRadioButton_37;
	private JRadioButton rdbtnNewRadioButton_38;
	private JRadioButton rdbtnNewRadioButton_39;
	private JButton btnNewButton_57;
	private JButton btnNewButton_58;
	private JButton btnNewButton_59;
	private JButton btnNewButton_60;
	private JButton btnNewButton_61;
	private JButton btnNewButton_62;
	private JButton btnNewButton_63;
	private JPanel Question09;
	private JTextField txtYourChildreenMust;
	private JButton btnNewButton_64;
	private JRadioButton rdbtnNewRadioButton_40;
	private JRadioButton rdbtnNewRadioButton_41;
	private JRadioButton rdbtnNewRadioButton_42;
	private JRadioButton rdbtnNewRadioButton_43;
	private JRadioButton rdbtnNewRadioButton_44;
	private JButton btnNewButton_65;
	private JButton btnNewButton_66;
	private JButton btnNewButton_67;
	private JButton btnNewButton_68;
	private JButton btnNewButton_69;
	private JButton btnNewButton_70;
	private JButton btnNewButton_71;
	private JPanel question10;
	private JTextField txtFinlandCannotAfford;
	private JButton btnNewButton_72;
	private JRadioButton rdbtnNewRadioButton_45;
	private JRadioButton rdbtnNewRadioButton_46;
	private JRadioButton rdbtnNewRadioButton_47;
	private JRadioButton rdbtnNewRadioButton_48;
	private JRadioButton rdbtnNewRadioButton_49;
	private JButton btnNewButton_73;
	private JButton btnNewButton_74;
	private JButton btnNewButton_75;
	private JButton btnNewButton_76;
	private JButton btnNewButton_77;
	private JButton btnNewButton_78;
	private JButton btnNewButton_79;
	private JButton btnNewButton_80;
	private JButton btnNewButton_81;
	private JButton btnNewButton_83;
	private JButton btnNewButton_85;
	private JButton btnNewButton_86;
	private JButton btnNewButton_82;
	private JButton btnNewButton_84;
	private JButton btnNewButton_87;
	private JButton btnNewButton_88;
	private JButton btnNewButton_89;
	private JButton btnNewButton_90;
	private JPanel summary;
	private JButton btnNewButton_91;
	private JPanel Home_1;
	private JTextField txtWelcomeToSummary;
	private JButton btnNewButton_92;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pannel frame = new pannel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchpanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}

	/**
	 * Create the frame.
	 */
	public pannel() {
		setTitle("Home page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(33, 119, 1045, 506);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Home = new JPanel();
		layeredPane.add(Home, "name_444012321242800");
		Home.setLayout(null);
		
		txtWelcomeToOur = new JTextField();
		txtWelcomeToOur.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToOur.setBackground(Color.LIGHT_GRAY);
		txtWelcomeToOur.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtWelcomeToOur.setText("Welcome to our Election Survey");
		txtWelcomeToOur.setBounds(174, 163, 656, 146);
		Home.add(txtWelcomeToOur);
		txtWelcomeToOur.setColumns(10);
		
		btnNewButton_80 = new JButton("Start");
		btnNewButton_80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question1);
			}
		});
		btnNewButton_80.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_80.setBounds(435, 368, 179, 69);
		Home.add(btnNewButton_80);
		
		Question1 = new JPanel();
		Question1.setBackground(Color.WHITE);
		layeredPane.add(Question1, "name_444091677012100");
		Question1.setLayout(null);
		
		txtInFinlandIt = new JTextField();
		txtInFinlandIt.setHorizontalAlignment(SwingConstants.CENTER);
		txtInFinlandIt.setBackground(Color.WHITE);
		txtInFinlandIt.setForeground(Color.BLACK);
		txtInFinlandIt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtInFinlandIt.setText("In Finland it is easy to live on social security.");
		txtInFinlandIt.setBounds(91, 75, 562, 59);
		Question1.add(txtInFinlandIt);
		txtInFinlandIt.setColumns(10);
		
		btnNewButton_10 = new JButton("Question1");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_10.setBounds(91, 39, 103, 21);
		Question1.add(btnNewButton_10);
		
		rdbtnNewRadioButton_2 = new JRadioButton("2");
		rdbtnNewRadioButton_2.setBounds(233, 218, 65, 21);
		Question1.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("1");
		rdbtnNewRadioButton_3.setBounds(91, 218, 49, 21);
		Question1.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("3");
		rdbtnNewRadioButton_4.setBounds(338, 218, 49, 21);
		Question1.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_5 = new JRadioButton("4");
		rdbtnNewRadioButton_5.setBounds(477, 218, 65, 21);
		Question1.add(rdbtnNewRadioButton_5);
		
		rdbtnNewRadioButton_6 = new JRadioButton("5");
		rdbtnNewRadioButton_6.setBounds(624, 218, 57, 21);
		Question1.add(rdbtnNewRadioButton_6);
		
		
		//to choose only one radio button
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_6);
		
		btnNewButton_12 = new JButton("1 = Partialy disagree");
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_12.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_12.setBounds(77, 447, 125, 21);
		Question1.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("2 = Disagree");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_13.setBounds(269, 446, 103, 21);
		Question1.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("3 = Can't say");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_14.setBounds(432, 446, 115, 21);
		Question1.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("4 = Partialy agree ");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_15.setBounds(604, 446, 172, 21);
		Question1.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("5 = Strongly agreed");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_16.setBounds(828, 446, 159, 21);
		Question1.add(btnNewButton_16);
		
		btnNewButton_81 = new JButton("Home ");
		btnNewButton_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Home);
			}
		});
		btnNewButton_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_81.setBounds(269, 306, 152, 59);
		Question1.add(btnNewButton_81);
		
		btnNewButton_82 = new JButton("Next");
		btnNewButton_82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question2);
			}
		});
		btnNewButton_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_82.setBounds(490, 306, 152, 59);
		Question1.add(btnNewButton_82);
		
		question2 = new JPanel();
		layeredPane.add(question2, "name_444094185454200");
		question2.setLayout(null);
		
		Question2 = new JPanel();
		Question2.setLayout(null);
		Question2.setBackground(Color.WHITE);
		Question2.setBounds(0, 0, 1045, 506);
		question2.add(Question2);
		
		textField = new JTextField();
		textField.setText("The opening hours of the shop and other stores must be liberalized");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(91, 75, 562, 59);
		Question2.add(textField);
		
		btnNewButton_11 = new JButton("Question2");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_11.setBounds(91, 39, 103, 21);
		Question2.add(btnNewButton_11);
		
		rdbtnNewRadioButton = new JRadioButton("2");
		rdbtnNewRadioButton.setBounds(233, 218, 65, 21);
		Question2.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("1");
		rdbtnNewRadioButton_1.setBounds(91, 218, 49, 21);
		Question2.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_7 = new JRadioButton("3");
		rdbtnNewRadioButton_7.setBounds(338, 218, 49, 21);
		Question2.add(rdbtnNewRadioButton_7);
		
		rdbtnNewRadioButton_8 = new JRadioButton("4");
		rdbtnNewRadioButton_8.setBounds(477, 218, 65, 21);
		Question2.add(rdbtnNewRadioButton_8);
		
		rdbtnNewRadioButton_9 = new JRadioButton("5");
		rdbtnNewRadioButton_9.setBounds(624, 218, 57, 21);
		Question2.add(rdbtnNewRadioButton_9);
		
		btnNewButton_17 = new JButton("1 = Partialy disagree");
		btnNewButton_17.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_17.setBounds(51, 446, 125, 21);
		Question2.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("2 = Disagree");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_18.setBounds(233, 445, 103, 21);
		Question2.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("3 = Can't say");
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_19.setBounds(398, 445, 115, 21);
		Question2.add(btnNewButton_19);
		
		btnNewButton_20 = new JButton("4 = Partialy agree ");
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_20.setBounds(589, 445, 172, 21);
		Question2.add(btnNewButton_20);
		
		btnNewButton_21 = new JButton("5 = Strongly agreed");
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_21.setBounds(838, 445, 159, 21);
		Question2.add(btnNewButton_21);
		
//to choose only one radio button
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnNewRadioButton_1);
		bg1.add(rdbtnNewRadioButton_7);
		bg1.add(rdbtnNewRadioButton_8);
		bg1.add(rdbtnNewRadioButton_9);
		bg1.add(rdbtnNewRadioButton);
		
		btnNewButton_83 = new JButton("Previous");
		btnNewButton_83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question1);
			}
		});
		btnNewButton_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_83.setBounds(200, 327, 136, 49);
		Question2.add(btnNewButton_83);
		
		btnNewButton_84 = new JButton("Next");
		btnNewButton_84.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question3);
			}
		});
		btnNewButton_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_84.setBounds(406, 327, 136, 49);
		Question2.add(btnNewButton_84);
		
		Question3 = new JPanel();
		layeredPane.add(Question3, "name_444095907096000");
		Question3.setLayout(null);
		
		question3 = new JPanel();
		question3.setLayout(null);
		question3.setBackground(Color.WHITE);
		question3.setBounds(0, 0, 1045, 506);
		Question3.add(question3);
		
		txtFinlandHasMoved = new JTextField();
		txtFinlandHasMoved.setText("Finland has moved to basic income, which would replace the current social security first lable .");
		txtFinlandHasMoved.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinlandHasMoved.setForeground(Color.BLACK);
		txtFinlandHasMoved.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtFinlandHasMoved.setColumns(10);
		txtFinlandHasMoved.setBackground(Color.WHITE);
		txtFinlandHasMoved.setBounds(91, 75, 766, 99);
		question3.add(txtFinlandHasMoved);
		
		btnNewButton_22 = new JButton("Question3");
		btnNewButton_22.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_22.setBounds(91, 39, 103, 21);
		question3.add(btnNewButton_22);
		
		rdbtnNewRadioButton_10 = new JRadioButton("2");
		rdbtnNewRadioButton_10.setBounds(233, 218, 65, 21);
		question3.add(rdbtnNewRadioButton_10);
		
		rdbtnNewRadioButton_11 = new JRadioButton("1");
		rdbtnNewRadioButton_11.setBounds(91, 218, 49, 21);
		question3.add(rdbtnNewRadioButton_11);
		
		rdbtnNewRadioButton_12 = new JRadioButton("3");
		rdbtnNewRadioButton_12.setBounds(338, 218, 49, 21);
		question3.add(rdbtnNewRadioButton_12);
		
		rdbtnNewRadioButton_13 = new JRadioButton("4");
		rdbtnNewRadioButton_13.setBounds(477, 218, 65, 21);
		question3.add(rdbtnNewRadioButton_13);
		
		rdbtnNewRadioButton_14 = new JRadioButton("5");
		rdbtnNewRadioButton_14.setBounds(624, 218, 57, 21);
		question3.add(rdbtnNewRadioButton_14);
		
		btnNewButton_23 = new JButton("1 = Partialy disagree");
		btnNewButton_23.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_23.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_23.setBounds(60, 433, 125, 21);
		question3.add(btnNewButton_23);
		
		btnNewButton_24 = new JButton("2 = Disagree");
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_24.setBounds(259, 432, 103, 21);
		question3.add(btnNewButton_24);
		
		btnNewButton_25 = new JButton("3 = Can't say");
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_25.setBounds(431, 432, 115, 21);
		question3.add(btnNewButton_25);
		
		btnNewButton_26 = new JButton("4 = Partialy agree ");
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_26.setBounds(615, 432, 172, 21);
		question3.add(btnNewButton_26);
		
		btnNewButton_27 = new JButton("5 = Strongly agreed");
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_27.setBounds(846, 432, 159, 21);
		question3.add(btnNewButton_27);
		
		
		//to choose only one radio button
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rdbtnNewRadioButton_10);
		bg2.add(rdbtnNewRadioButton_11);
		bg2.add(rdbtnNewRadioButton_12);
		bg2.add(rdbtnNewRadioButton_13);
		bg2.add(rdbtnNewRadioButton_14);
		
		btnNewButton_85 = new JButton("Previous");
		btnNewButton_85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question2);
			}
		});
		btnNewButton_85.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_85.setBounds(233, 297, 134, 51);
		question3.add(btnNewButton_85);
		
		btnNewButton_86 = new JButton("Next");
		btnNewButton_86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question4);
			}
		});
		btnNewButton_86.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_86.setBounds(441, 297, 134, 51);
		question3.add(btnNewButton_86);
		
		Question4 = new JPanel();
		layeredPane.add(Question4, "name_444103421488600");
		Question4.setLayout(null);
		
		Question04 = new JPanel();
		Question04.setLayout(null);
		Question04.setBackground(Color.WHITE);
		Question04.setBounds(0, 10, 1045, 506);
		Question4.add(Question04);
		
		txtTheMaternityTime = new JTextField();
		txtTheMaternityTime.setText("The maternity time must be secured by law.");
		txtTheMaternityTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTheMaternityTime.setForeground(Color.BLACK);
		txtTheMaternityTime.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtTheMaternityTime.setColumns(10);
		txtTheMaternityTime.setBackground(Color.WHITE);
		txtTheMaternityTime.setBounds(91, 75, 562, 59);
		Question04.add(txtTheMaternityTime);
		
		btnNewButton_28 = new JButton("Question4");
		btnNewButton_28.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_28.setBounds(91, 39, 103, 21);
		Question04.add(btnNewButton_28);
		
		rdbtnNewRadioButton_15 = new JRadioButton("2");
		rdbtnNewRadioButton_15.setBounds(233, 218, 65, 21);
		Question04.add(rdbtnNewRadioButton_15);
		
		rdbtnNewRadioButton_16 = new JRadioButton("1");
		rdbtnNewRadioButton_16.setBounds(91, 218, 49, 21);
		Question04.add(rdbtnNewRadioButton_16);
		
		rdbtnNewRadioButton_17 = new JRadioButton("3");
		rdbtnNewRadioButton_17.setBounds(338, 218, 49, 21);
		Question04.add(rdbtnNewRadioButton_17);
		
		rdbtnNewRadioButton_18 = new JRadioButton("4");
		rdbtnNewRadioButton_18.setBounds(477, 218, 65, 21);
		Question04.add(rdbtnNewRadioButton_18);
		
		rdbtnNewRadioButton_19 = new JRadioButton("5");
		rdbtnNewRadioButton_19.setBounds(624, 218, 57, 21);
		Question04.add(rdbtnNewRadioButton_19);
		
		btnNewButton_29 = new JButton("1 = Partialy disagree");
		btnNewButton_29.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_29.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_29.setBounds(31, 431, 125, 21);
		Question04.add(btnNewButton_29);
		
		btnNewButton_30 = new JButton("2 = Disagree");
		btnNewButton_30.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_30.setBounds(252, 430, 103, 21);
		Question04.add(btnNewButton_30);
		
		btnNewButton_31 = new JButton("3 = Can't say");
		btnNewButton_31.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_31.setBounds(427, 430, 115, 21);
		Question04.add(btnNewButton_31);
		
		btnNewButton_32 = new JButton("4 = Partialy agree ");
		btnNewButton_32.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_32.setBounds(629, 430, 172, 21);
		Question04.add(btnNewButton_32);
		
		btnNewButton_33 = new JButton("5 = Strongly agreed");
		btnNewButton_33.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_33.setBounds(848, 430, 159, 21);
		Question04.add(btnNewButton_33);
		

		//to choose only one radio button
		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(rdbtnNewRadioButton_15);
		bg4.add(rdbtnNewRadioButton_16);
		bg4.add(rdbtnNewRadioButton_17);
		bg4.add(rdbtnNewRadioButton_18);
		bg4.add(rdbtnNewRadioButton_19);
		
		btnNewButton_87 = new JButton("Previous");
		btnNewButton_87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question3);
			}
		});
		btnNewButton_87.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_87.setBounds(213, 312, 142, 52);
		Question04.add(btnNewButton_87);
		
		btnNewButton_88 = new JButton("Next");
		btnNewButton_88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question5);
			}
		});
		btnNewButton_88.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_88.setBounds(434, 312, 142, 52);
		Question04.add(btnNewButton_88);
		
		Question5 = new JPanel();
		layeredPane.add(Question5, "name_444105327970300");
		Question5.setLayout(null);
		
		Question05 = new JPanel();
		Question05.setLayout(null);
		Question05.setBackground(Color.WHITE);
		Question05.setBounds(0, 0, 1045, 506);
		Question5.add(Question05);
		
		txtDurationOfEarnings = new JTextField();
		txtDurationOfEarnings.setText("Duration of earnings related employment protection must be secured.");
		txtDurationOfEarnings.setHorizontalAlignment(SwingConstants.CENTER);
		txtDurationOfEarnings.setForeground(Color.BLACK);
		txtDurationOfEarnings.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtDurationOfEarnings.setColumns(10);
		txtDurationOfEarnings.setBackground(Color.WHITE);
		txtDurationOfEarnings.setBounds(91, 75, 562, 59);
		Question05.add(txtDurationOfEarnings);
		
		btnNewButton_34 = new JButton("Question5");
		btnNewButton_34.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_34.setBounds(91, 39, 103, 21);
		Question05.add(btnNewButton_34);
		
		rdbtnNewRadioButton_20 = new JRadioButton("2");
		rdbtnNewRadioButton_20.setBounds(233, 218, 65, 21);
		Question05.add(rdbtnNewRadioButton_20);
		
		rdbtnNewRadioButton_21 = new JRadioButton("1");
		rdbtnNewRadioButton_21.setBounds(91, 218, 49, 21);
		Question05.add(rdbtnNewRadioButton_21);
		
		rdbtnNewRadioButton_22 = new JRadioButton("3");
		rdbtnNewRadioButton_22.setBounds(338, 218, 49, 21);
		Question05.add(rdbtnNewRadioButton_22);
		
		rdbtnNewRadioButton_23 = new JRadioButton("4");
		rdbtnNewRadioButton_23.setBounds(477, 218, 65, 21);
		Question05.add(rdbtnNewRadioButton_23);
		
		rdbtnNewRadioButton_24 = new JRadioButton("5");
		rdbtnNewRadioButton_24.setBounds(624, 218, 57, 21);
		Question05.add(rdbtnNewRadioButton_24);
		
		btnNewButton_35 = new JButton("1 = Partialy disagree");
		btnNewButton_35.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_35.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_35.setBounds(38, 433, 125, 21);
		Question05.add(btnNewButton_35);
		
		btnNewButton_36 = new JButton("2 = Disagree");
		btnNewButton_36.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_36.setBounds(268, 432, 103, 21);
		Question05.add(btnNewButton_36);
		
		btnNewButton_37 = new JButton("3 = Can't say");
		btnNewButton_37.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_37.setBounds(427, 432, 115, 21);
		Question05.add(btnNewButton_37);
		
		btnNewButton_38 = new JButton("4 = Partialy agree ");
		btnNewButton_38.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_38.setBounds(613, 432, 172, 21);
		Question05.add(btnNewButton_38);
		
		btnNewButton_39 = new JButton("5 = Strongly agreed");
		btnNewButton_39.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_39.setBounds(857, 432, 159, 21);
		Question05.add(btnNewButton_39);
		
		//to choose only one radio button
				ButtonGroup bg5 = new ButtonGroup();
				bg5.add(rdbtnNewRadioButton_20);
				bg5.add(rdbtnNewRadioButton_21);
				bg5.add(rdbtnNewRadioButton_22);
				bg5.add(rdbtnNewRadioButton_23);
				bg5.add(rdbtnNewRadioButton_24);
		
		btnNewButton_89 = new JButton("Previous");
		btnNewButton_89.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question4);
			}
		});
		btnNewButton_89.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_89.setBounds(181, 305, 117, 53);
		Question05.add(btnNewButton_89);
		
		btnNewButton_90 = new JButton("Next");
		btnNewButton_90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question6);
			}
		});
		btnNewButton_90.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_90.setBounds(416, 305, 117, 53);
		Question05.add(btnNewButton_90);
		
		Question6 = new JPanel();
		layeredPane.add(Question6, "name_444107081183100");
		Question6.setLayout(null);
		
		Question06 = new JPanel();
		Question06.setLayout(null);
		Question06.setBackground(Color.WHITE);
		Question06.setBounds(0, 0, 1045, 506);
		Question6.add(Question06);
		
		txtOnTheOutside = new JTextField();
		txtOnTheOutside.setText("On the outside of the euro Finland will be better off.");
		txtOnTheOutside.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnTheOutside.setForeground(Color.BLACK);
		txtOnTheOutside.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtOnTheOutside.setColumns(10);
		txtOnTheOutside.setBackground(Color.WHITE);
		txtOnTheOutside.setBounds(91, 75, 562, 59);
		Question06.add(txtOnTheOutside);
		
		btnNewButton_40 = new JButton("Question6");
		btnNewButton_40.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_40.setBounds(91, 39, 103, 21);
		Question06.add(btnNewButton_40);
		
		rdbtnNewRadioButton_25 = new JRadioButton("2");
		rdbtnNewRadioButton_25.setBounds(233, 218, 65, 21);
		Question06.add(rdbtnNewRadioButton_25);
		
		rdbtnNewRadioButton_26 = new JRadioButton("1");
		rdbtnNewRadioButton_26.setBounds(91, 218, 49, 21);
		Question06.add(rdbtnNewRadioButton_26);
		
		rdbtnNewRadioButton_27 = new JRadioButton("3");
		rdbtnNewRadioButton_27.setBounds(338, 218, 49, 21);
		Question06.add(rdbtnNewRadioButton_27);
		
		rdbtnNewRadioButton_28 = new JRadioButton("4");
		rdbtnNewRadioButton_28.setBounds(477, 218, 65, 21);
		Question06.add(rdbtnNewRadioButton_28);
		
		rdbtnNewRadioButton_29 = new JRadioButton("5");
		rdbtnNewRadioButton_29.setBounds(624, 218, 57, 21);
		Question06.add(rdbtnNewRadioButton_29);
		
		btnNewButton_41 = new JButton("1 = Partialy disagree");
		btnNewButton_41.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_41.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_41.setBounds(42, 450, 125, 21);
		Question06.add(btnNewButton_41);
		
		//to choose only one radio button
		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(rdbtnNewRadioButton_25);
		bg6.add(rdbtnNewRadioButton_26);
		bg6.add(rdbtnNewRadioButton_27);
		bg6.add(rdbtnNewRadioButton_28);
		bg6.add(rdbtnNewRadioButton_29);
		
		btnNewButton_42 = new JButton("2 = Disagree");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_42.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_42.setBounds(244, 449, 103, 21);
		Question06.add(btnNewButton_42);
		
		btnNewButton_43 = new JButton("3 = Can't say");
		btnNewButton_43.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_43.setBounds(427, 449, 115, 21);
		Question06.add(btnNewButton_43);
		
		btnNewButton_44 = new JButton("4 = Partialy agree ");
		btnNewButton_44.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_44.setBounds(644, 449, 172, 21);
		Question06.add(btnNewButton_44);
		
		btnNewButton_45 = new JButton("5 = Strongly agreed");
		btnNewButton_45.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_45.setBounds(863, 449, 159, 21);
		Question06.add(btnNewButton_45);
		
		btnNewButton_46 = new JButton("Next");
		btnNewButton_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question7);
			}
		});
		btnNewButton_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_46.setBounds(491, 304, 136, 49);
		Question06.add(btnNewButton_46);
		
		btnNewButton_47 = new JButton("Previous ");
		btnNewButton_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question5);
			}
		});
		btnNewButton_47.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_47.setBounds(318, 304, 142, 49);
		Question06.add(btnNewButton_47);
		
		Question7 = new JPanel();
		layeredPane.add(Question7, "name_444108701228300");
		Question7.setLayout(null);
		
		Question07 = new JPanel();
		Question07.setLayout(null);
		Question07.setBackground(Color.WHITE);
		Question07.setBounds(0, 0, 1045, 506);
		Question7.add(Question07);
		
		txtFoodTaxationCan = new JTextField();
		txtFoodTaxationCan.setText("Food taxation can afford to fighten.");
		txtFoodTaxationCan.setHorizontalAlignment(SwingConstants.CENTER);
		txtFoodTaxationCan.setForeground(Color.BLACK);
		txtFoodTaxationCan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtFoodTaxationCan.setColumns(10);
		txtFoodTaxationCan.setBackground(Color.WHITE);
		txtFoodTaxationCan.setBounds(91, 75, 562, 59);
		Question07.add(txtFoodTaxationCan);
		
		btnNewButton_48 = new JButton("Question7");
		btnNewButton_48.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_48.setBounds(91, 39, 103, 21);
		Question07.add(btnNewButton_48);
		
		rdbtnNewRadioButton_30 = new JRadioButton("2");
		rdbtnNewRadioButton_30.setBounds(233, 218, 49, 21);
		Question07.add(rdbtnNewRadioButton_30);
		
		rdbtnNewRadioButton_31 = new JRadioButton("1");
		rdbtnNewRadioButton_31.setBounds(91, 218, 49, 21);
		Question07.add(rdbtnNewRadioButton_31);
		
		rdbtnNewRadioButton_32 = new JRadioButton("3");
		rdbtnNewRadioButton_32.setBounds(353, 218, 49, 21);
		Question07.add(rdbtnNewRadioButton_32);
		
		rdbtnNewRadioButton_33 = new JRadioButton("4");
		rdbtnNewRadioButton_33.setBounds(481, 218, 65, 21);
		Question07.add(rdbtnNewRadioButton_33);
		
		rdbtnNewRadioButton_34 = new JRadioButton("5");
		rdbtnNewRadioButton_34.setBounds(624, 218, 57, 21);
		Question07.add(rdbtnNewRadioButton_34);
		
		btnNewButton_49 = new JButton("1 = Partialy disagree");
		btnNewButton_49.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_49.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_49.setBounds(58, 433, 125, 21);
		Question07.add(btnNewButton_49);
		
		btnNewButton_50 = new JButton("2 = Disagree");
		btnNewButton_50.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_50.setBounds(284, 432, 103, 21);
		Question07.add(btnNewButton_50);
		
		btnNewButton_51 = new JButton("3 = Can't say");
		btnNewButton_51.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_51.setBounds(463, 432, 115, 21);
		Question07.add(btnNewButton_51);
		
		btnNewButton_52 = new JButton("4 = Partialy agree ");
		btnNewButton_52.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_52.setBounds(644, 432, 172, 21);
		Question07.add(btnNewButton_52);
		
		btnNewButton_53 = new JButton("5 = Strongly agreed");
		btnNewButton_53.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_53.setBounds(854, 432, 159, 21);
		Question07.add(btnNewButton_53);
		
		//to choose only one radio button
				ButtonGroup bg7 = new ButtonGroup();
				bg7.add(rdbtnNewRadioButton_30);
				bg7.add(rdbtnNewRadioButton_31);
				bg7.add(rdbtnNewRadioButton_32);
				bg7.add(rdbtnNewRadioButton_33);
				bg7.add(rdbtnNewRadioButton_34);
		
		btnNewButton_54 = new JButton("Next");
		btnNewButton_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question8);
			}
		});
		btnNewButton_54.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_54.setBounds(499, 314, 125, 39);
		Question07.add(btnNewButton_54);
		
		btnNewButton_55 = new JButton("Previous ");
		btnNewButton_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question6);
			}
		});
		btnNewButton_55.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_55.setBounds(321, 314, 139, 39);
		Question07.add(btnNewButton_55);
		
		Question8 = new JPanel();
		layeredPane.add(Question8, "name_444114587087200");
		Question8.setLayout(null);
		
		Question08 = new JPanel();
		Question08.setLayout(null);
		Question08.setBackground(Color.WHITE);
		Question08.setBounds(0, 0, 1045, 506);
		Question8.add(Question08);
		
		txtTheStateAnd = new JTextField();
		txtTheStateAnd.setText("The state and municipal finances must be balanced primarily by cutting spending.");
		txtTheStateAnd.setHorizontalAlignment(SwingConstants.CENTER);
		txtTheStateAnd.setForeground(Color.BLACK);
		txtTheStateAnd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtTheStateAnd.setColumns(10);
		txtTheStateAnd.setBackground(Color.WHITE);
		txtTheStateAnd.setBounds(91, 75, 622, 59);
		Question08.add(txtTheStateAnd);
		
		btnNewButton_56 = new JButton("Question8");
		btnNewButton_56.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_56.setBounds(91, 39, 103, 21);
		Question08.add(btnNewButton_56);
		
		rdbtnNewRadioButton_35 = new JRadioButton("2");
		rdbtnNewRadioButton_35.setBounds(233, 218, 49, 21);
		Question08.add(rdbtnNewRadioButton_35);
		
		rdbtnNewRadioButton_36 = new JRadioButton("1");
		rdbtnNewRadioButton_36.setBounds(91, 218, 49, 21);
		Question08.add(rdbtnNewRadioButton_36);
		
		rdbtnNewRadioButton_37 = new JRadioButton("3");
		rdbtnNewRadioButton_37.setBounds(353, 218, 49, 21);
		Question08.add(rdbtnNewRadioButton_37);
		
		rdbtnNewRadioButton_38 = new JRadioButton("4");
		rdbtnNewRadioButton_38.setBounds(481, 218, 65, 21);
		Question08.add(rdbtnNewRadioButton_38);
		
		rdbtnNewRadioButton_39 = new JRadioButton("5");
		rdbtnNewRadioButton_39.setBounds(624, 218, 57, 21);
		Question08.add(rdbtnNewRadioButton_39);
		
		btnNewButton_57 = new JButton("1 = Partialy disagree");
		btnNewButton_57.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_57.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_57.setBounds(50, 445, 125, 21);
		Question08.add(btnNewButton_57);
		
		btnNewButton_58 = new JButton("2 = Disagree");
		btnNewButton_58.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_58.setBounds(276, 444, 103, 21);
		Question08.add(btnNewButton_58);
		
		btnNewButton_59 = new JButton("3 = Can't say");
		btnNewButton_59.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_59.setBounds(440, 444, 115, 21);
		Question08.add(btnNewButton_59);
		
		btnNewButton_60 = new JButton("4 = Partialy agree ");
		btnNewButton_60.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_60.setBounds(644, 444, 172, 21);
		Question08.add(btnNewButton_60);
		
		btnNewButton_61 = new JButton("5 = Strongly agreed");
		btnNewButton_61.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_61.setBounds(863, 444, 159, 21);
		Question08.add(btnNewButton_61);
		
		
		//to choose only one radio button
				ButtonGroup bg8 = new ButtonGroup();
				bg8.add(rdbtnNewRadioButton_35);
				bg8.add(rdbtnNewRadioButton_36);
				bg8.add(rdbtnNewRadioButton_37);
				bg8.add(rdbtnNewRadioButton_38);
				bg8.add(rdbtnNewRadioButton_39);
				
				
		btnNewButton_62 = new JButton("Next");
		btnNewButton_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question9);
			}
		});
		btnNewButton_62.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_62.setBounds(499, 314, 125, 39);
		Question08.add(btnNewButton_62);
		
		btnNewButton_63 = new JButton("Previous ");
		btnNewButton_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question7);
			}
		});
		btnNewButton_63.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_63.setBounds(321, 314, 139, 39);
		Question08.add(btnNewButton_63);
		
		Question9 = new JPanel();
		layeredPane.add(Question9, "name_444117067012500");
		Question9.setLayout(null);
		
		Question09 = new JPanel();
		Question09.setLayout(null);
		Question09.setBackground(Color.WHITE);
		Question09.setBounds(0, 0, 1045, 506);
		Question9.add(Question09);
		
		txtYourChildreenMust = new JTextField();
		txtYourChildreenMust.setText("Your childreen must be raised and taxed.");
		txtYourChildreenMust.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourChildreenMust.setForeground(Color.BLACK);
		txtYourChildreenMust.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtYourChildreenMust.setColumns(10);
		txtYourChildreenMust.setBackground(Color.WHITE);
		txtYourChildreenMust.setBounds(91, 75, 562, 59);
		Question09.add(txtYourChildreenMust);
		
		btnNewButton_64 = new JButton("Question9");
		btnNewButton_64.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_64.setBounds(91, 39, 103, 21);
		Question09.add(btnNewButton_64);
		
		rdbtnNewRadioButton_40 = new JRadioButton("2");
		rdbtnNewRadioButton_40.setBounds(233, 218, 49, 21);
		Question09.add(rdbtnNewRadioButton_40);
		
		rdbtnNewRadioButton_41 = new JRadioButton("1");
		rdbtnNewRadioButton_41.setBounds(91, 218, 49, 21);
		Question09.add(rdbtnNewRadioButton_41);
		
		rdbtnNewRadioButton_42 = new JRadioButton("3");
		rdbtnNewRadioButton_42.setBounds(353, 218, 49, 21);
		Question09.add(rdbtnNewRadioButton_42);
		
		rdbtnNewRadioButton_43 = new JRadioButton("4");
		rdbtnNewRadioButton_43.setBounds(481, 218, 65, 21);
		Question09.add(rdbtnNewRadioButton_43);
		
		rdbtnNewRadioButton_44 = new JRadioButton("5");
		rdbtnNewRadioButton_44.setBounds(624, 218, 57, 21);
		Question09.add(rdbtnNewRadioButton_44);
		
		btnNewButton_65 = new JButton("1 = Partialy disagree");
		btnNewButton_65.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_65.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_65.setBounds(50, 451, 125, 21);
		Question09.add(btnNewButton_65);
		
		btnNewButton_66 = new JButton("2 = Disagree");
		btnNewButton_66.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_66.setBounds(251, 450, 103, 21);
		Question09.add(btnNewButton_66);
		
		btnNewButton_67 = new JButton("3 = Can't say");
		btnNewButton_67.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_67.setBounds(452, 450, 115, 21);
		Question09.add(btnNewButton_67);
		
		btnNewButton_68 = new JButton("4 = Partialy agree ");
		btnNewButton_68.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_68.setBounds(648, 450, 172, 21);
		Question09.add(btnNewButton_68);
		
		btnNewButton_69 = new JButton("5 = Strongly agreed");
		btnNewButton_69.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_69.setBounds(855, 450, 159, 21);
		Question09.add(btnNewButton_69);
		
		//to choose only one radio button
				ButtonGroup bg9 = new ButtonGroup();
				bg9.add(rdbtnNewRadioButton_40);
				bg9.add(rdbtnNewRadioButton_41);
				bg9.add(rdbtnNewRadioButton_42);
				bg9.add(rdbtnNewRadioButton_43);
				bg9.add(rdbtnNewRadioButton_44);
		
		btnNewButton_70 = new JButton("Next");
		btnNewButton_70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question10);
			}
		});
		btnNewButton_70.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_70.setBounds(499, 314, 125, 39);
		Question09.add(btnNewButton_70);
		
		btnNewButton_71 = new JButton("Previous ");
		btnNewButton_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question8);
			}
		});
		btnNewButton_71.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_71.setBounds(321, 314, 139, 39);
		Question09.add(btnNewButton_71);
		
		Question10 = new JPanel();
		layeredPane.add(Question10, "name_444118871235400");
		Question10.setLayout(null);
		
		question10 = new JPanel();
		question10.setLayout(null);
		question10.setBackground(Color.WHITE);
		question10.setBounds(0, 0, 1045, 506);
		Question10.add(question10);
		
		txtFinlandCannotAfford = new JTextField();
		txtFinlandCannotAfford.setText("Finland cannot afford social and health services on the current scale.");
		txtFinlandCannotAfford.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinlandCannotAfford.setForeground(Color.BLACK);
		txtFinlandCannotAfford.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtFinlandCannotAfford.setColumns(10);
		txtFinlandCannotAfford.setBackground(Color.WHITE);
		txtFinlandCannotAfford.setBounds(91, 75, 562, 59);
		question10.add(txtFinlandCannotAfford);
		
		btnNewButton_72 = new JButton("Question10");
		btnNewButton_72.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_72.setBounds(91, 39, 103, 21);
		question10.add(btnNewButton_72);
		
		rdbtnNewRadioButton_45 = new JRadioButton("2");
		rdbtnNewRadioButton_45.setBounds(233, 218, 49, 21);
		question10.add(rdbtnNewRadioButton_45);
		
		rdbtnNewRadioButton_46 = new JRadioButton("1");
		rdbtnNewRadioButton_46.setBounds(91, 218, 49, 21);
		question10.add(rdbtnNewRadioButton_46);
		
		rdbtnNewRadioButton_47 = new JRadioButton("3");
		rdbtnNewRadioButton_47.setBounds(353, 218, 49, 21);
		question10.add(rdbtnNewRadioButton_47);
		
		rdbtnNewRadioButton_48 = new JRadioButton("4");
		rdbtnNewRadioButton_48.setBounds(481, 218, 65, 21);
		question10.add(rdbtnNewRadioButton_48);
		
		rdbtnNewRadioButton_49 = new JRadioButton("5");
		rdbtnNewRadioButton_49.setBounds(624, 218, 57, 21);
		question10.add(rdbtnNewRadioButton_49);
		
		btnNewButton_73 = new JButton("1 = Partialy disagree");
		btnNewButton_73.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_73.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_73.setBounds(45, 451, 125, 21);
		question10.add(btnNewButton_73);
		
		btnNewButton_74 = new JButton("2 = Disagree");
		btnNewButton_74.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_74.setBounds(250, 450, 103, 21);
		question10.add(btnNewButton_74);
		
		btnNewButton_75 = new JButton("3 = Can't say");
		btnNewButton_75.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_75.setBounds(426, 450, 115, 21);
		question10.add(btnNewButton_75);
		
		btnNewButton_76 = new JButton("4 = Partialy agree ");
		btnNewButton_76.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_76.setBounds(634, 450, 172, 21);
		question10.add(btnNewButton_76);
		
		btnNewButton_77 = new JButton("5 = Strongly agreed");
		btnNewButton_77.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_77.setBounds(854, 450, 159, 21);
		question10.add(btnNewButton_77);
		
		//to choose only one radio button
				ButtonGroup bg10 = new ButtonGroup();
				bg10.add(rdbtnNewRadioButton_45);
				bg10.add(rdbtnNewRadioButton_46);
				bg10.add(rdbtnNewRadioButton_47);
				bg10.add(rdbtnNewRadioButton_48);
				bg10.add(rdbtnNewRadioButton_49);
		
		btnNewButton_78 = new JButton("Summary");
		btnNewButton_78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(summary);
				
			}
		});
		btnNewButton_78.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_78.setBounds(499, 314, 125, 39);
		question10.add(btnNewButton_78);
		
		btnNewButton_79 = new JButton("Previous ");
		btnNewButton_79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question9);
			}
		});
		btnNewButton_79.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_79.setBounds(321, 314, 139, 39);
		question10.add(btnNewButton_79);
		
		summary = new JPanel();
		layeredPane.add(summary, "name_454395456505000");
		summary.setLayout(null);
		
		Home_1 = new JPanel();
		Home_1.setLayout(null);
		Home_1.setBounds(0, 0, 1045, 506);
		summary.add(Home_1);
		
		txtWelcomeToSummary = new JTextField();
		txtWelcomeToSummary.setText("Welcome to summary page ");
		txtWelcomeToSummary.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToSummary.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtWelcomeToSummary.setColumns(10);
		txtWelcomeToSummary.setBackground(Color.LIGHT_GRAY);
		txtWelcomeToSummary.setBounds(170, 10, 582, 89);
		Home_1.add(txtWelcomeToSummary);
		
		btnNewButton_92 = new JButton("Submit ");
		btnNewButton_92.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_92.setBounds(435, 427, 179, 69);
		Home_1.add(btnNewButton_92);
		
		btnNewButton = new JButton("Question1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchpanels(Question1);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton.setBounds(20, 23, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Question2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question2);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(135, 23, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Question3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question3);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_2.setBounds(230, 23, 85, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Question4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question4);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_3.setBounds(339, 23, 85, 21);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Question5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question5);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_4.setBounds(452, 23, 85, 21);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Question6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question6);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBounds(573, 23, 85, 21);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Question7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question7);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_6.setBounds(691, 23, 85, 21);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Question8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question8);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_7.setBounds(818, 23, 85, 21);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Question9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question9);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_8.setBounds(938, 23, 85, 21);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("Question10");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(Question10);
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_9.setBounds(20, 69, 85, 21);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_91 = new JButton("Summary ");
		btnNewButton_91.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_91.setBounds(147, 68, 119, 21);
		contentPane.add(btnNewButton_91);
	}
}
