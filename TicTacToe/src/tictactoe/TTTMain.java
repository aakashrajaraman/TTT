package tictactoe;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class TTTMain extends JPanel {
	public static JTextArea box1 = new JTextArea("    ");
	public static JTextArea box2 = new JTextArea("    ");
	public static JTextArea box3 = new JTextArea("    ");
	public static JTextArea box4 = new JTextArea("    ");
	public static JTextArea box5 = new JTextArea("    ");
	public static JTextArea box6 = new JTextArea("    ");
	public static JTextArea box7 = new JTextArea("    ");
	public static JTextArea box8 = new JTextArea("    ");
	public static JTextArea box9 = new JTextArea("    ");
	public static JTextArea[] jta = new JTextArea[9];
	public static int counter = 0;
	public static JFrame frame = new JFrame();


	public static char[] boxes = new char[9];

	int count = 0;
	public static int startcount = 0;

	public static void main(String[] args) {

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 667);

		TTTMain ttt = new TTTMain();
		ttt.init();

		frame.add(ttt);
		frame.setVisible(true);

	}

	public void init() {
		JOptionPane.showMessageDialog(null,
				"Hello, this is a Tic Tac Toe Game. You will play as the circle, and the computer will play as the cross. You get the first move.");
	}

	public void paint(Graphics g) {// not called by programmer, but by compiler.
		super.paint(g);
		drawTextBoxes(g);
	}

	public void drawTextBoxes(Graphics g) {
		int m = 150;
		Font font = new Font("Impact", Font.PLAIN, 65);

		box1.setForeground(Color.white);
		box1.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box1.setFont(font);
		box1.setEditable(false);
		box1.setBounds(600, 200, 80, 80);

		box2.setForeground(Color.white);
		box2.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box2.setFont(font);
		box2.setEditable(false);
		box2.setBounds(683, 200, 80, 80);

		box3.setForeground(Color.white);
		box3.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box3.setFont(font);
		box3.setEditable(false);
		box3.setBounds(766, 200, 80, 80);

		box4.setForeground(Color.white);
		box4.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box4.setFont(font);
		box4.setEditable(false);
		box4.setBounds(600, 283, 80, 80);

		box5.setForeground(Color.white);
		box5.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box5.setFont(font);
		box5.setEditable(false);
		box5.setBounds(683, 283, 80, 80);

		box6.setForeground(Color.white);
		box6.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box6.setFont(font);
		box6.setEditable(false);
		box6.setBounds(766, 283, 80, 80);

		box7.setForeground(Color.white);
		box7.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box7.setFont(font);
		box7.setEditable(false);
		box7.setBounds(600, 366, 80, 80);

		box8.setForeground(Color.white);
		box8.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box8.setFont(font);
		box8.setEditable(false);
		box8.setBounds(683, 366, 80, 80);

		box9.setForeground(Color.white);
		box9.setBackground(new Color(96, 99, 96));
		setLayout(null);
		box9.setFont(font);
		box9.setEditable(false);
		box9.setBounds(766, 366, 80, 80);

		box1.setVisible(true);
		add(box1);
		box2.setVisible(true);
		add(box2);
		box3.setVisible(true);
		add(box3);
		box4.setVisible(true);
		add(box4);
		box5.setVisible(true);
		add(box5);
		box6.setVisible(true);
		add(box6);
		box7.setVisible(true);
		add(box7);
		box8.setVisible(true);
		add(box8);
		box9.setVisible(true);
		add(box9);

		g.setColor(new Color(0, 0, 0));
		g.fillRect(530 + m, 150, 3, 340);
		g.fillRect(613 + m, 150, 3, 340);
		g.fillRect(400 + m, 280, 340, 3);
		g.fillRect(400 + m, 363, 340, 3);
		clicks();

	}

	public void clicks() {
		Handler handler = new Handler();
		box1.addMouseListener(handler);
		box2.addMouseListener(handler);
		box3.addMouseListener(handler);
		box4.addMouseListener(handler);
		box5.addMouseListener(handler);
		box6.addMouseListener(handler);
		box7.addMouseListener(handler);
		box8.addMouseListener(handler);
		box9.addMouseListener(handler);
	}

	private class Handler implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if (((JTextArea) e.getSource()).getText().equals("  X")) {

			} else {
				((JTextArea) e.getSource()).setText("  0");
			}
			
			
			if (box1.getText().equals("  0")) {

				boxes[0] = 'O';
				box1.setText("  O");
				

			} else if (box2.getText().equals("  0")) {

				boxes[1] = 'O';
				box2.setText("  O");
				

			} else if (box3.getText().equals("  0")) {

				boxes[2] = 'O';
				box3.setText("  O");
				

			} else if (box4.getText().equals("  0")) {

				boxes[3] = 'O';
				box4.setText("  O");
				

			} else if (box5.getText().equals("  0")) {

				boxes[4] = 'O';
				box5.setText("  O");
				

			} else if (box6.getText().equals("  0")) {

				boxes[5] = 'O';
				box6.setText("  O");
				

			} else if (box7.getText().equals("  0")) {

				boxes[6] = 'O';
				box7.setText("  O");
				

			} else if (box8.getText().equals("  0")) {

				boxes[7] = 'O';
				box8.setText("  O");
				

			} else if (box9.getText().equals("  0")) {

				boxes[8] = 'O';
				box9.setText("  O");
				

			}
			
			compLogic();
			

		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
	}

	public static void compLogic() {
		int xs = 1, os = 0;
		jta[0] = box1;
		jta[1] = box2;
		jta[2] = box3;
		jta[3] = box4;
		jta[4] = box5;
		jta[5] = box6;
		jta[6] = box7;
		jta[7] = box8;
		jta[8] = box9;
		// starting play.
		if (startcount == 0) {
			if (jta[4].getText().equals("  O")) {
				jta[0].setText("  X");
				boxes[0] = 'X';
			}else if (box1.getText().equals("  O") || box3.getText().equals("  O") || box7.getText().equals("  O")
					|| box9.getText().equals("  O") || box2.getText().equals("  O") || box4.getText().equals("  O")
					|| box6.getText().equals("  O") || box8.getText().equals("  O")) {
				jta[4].setText("  X");
				boxes[4] = 'X';
			}
				startcount++;
		}
		if(startcount > 0) {// moves after 1
			checkEnd();
			xs = 0;
			os = 0;
			for (int i = 0; i < 9; i++) {// check for scen for play2win
				if (boxes[i] == 'X') {
					xs++;
				} else if (boxes[i] == 'O') {
					os++;
				}
			}
			if (os > xs) {
				
				counter = 0;
				play2win();
			}
			
			xs = 0;
			os = 0;
			for (int i = 0; i < 9; i++) {
				if (boxes[i] == 'X') {
					xs++;
				} else if (boxes[i] == 'O') {
					os++;
				}
			}
			if(os>xs) {
				
				counter = 0;
				check2();
			}
		
		
		xs = 0;
		os = 0;
		for (int i = 0; i < 9; i++) {
			if (boxes[i] == 'X') {
				xs++;
			} else if (boxes[i] == 'O') {
				os++;
			}
		}
		if (os > xs) {
			counter = 0;
			otherwise();
		}
		checkEnd();
		startcount++;
		}
	}

	public static void check2() {
		jta[0] = box1;
		jta[1] = box2;
		jta[2] = box3;
		jta[3] = box4;
		jta[4] = box5;
		jta[5] = box6;
		jta[6] = box7;
		jta[7] = box8;
		jta[8] = box9;

		//verticals
		if (counter < 1) {
			
			for (int i = 0; i <= 5; i++) {

				if ((boxes[i] == 'O' && boxes[i + 3] == 'O')) {
					if (i < 3 && boxes[i + 6] == '\0') {
						jta[i + 6].setText("  X");
						boxes[i + 6] = 'X';
						counter++;
						return;
						
					} else if (i >= 3 && boxes[i - 3] == '\0') {
						jta[i - 3].setText("  X");
						boxes[i - 3] = 'X';
						
						counter++;
						return;
					}
					
				}
			}
			
		}
			if(counter < 1) {
			for (int i = 0; i <= 2; i++) {
				if ((boxes[i] == 'O' && boxes[i + 6] == 'O')) {
					if (boxes[i + 3] == '\0') {
						jta[i + 3].setText("  X");
						boxes[i + 3] = 'X';
						counter++;
						return;
					}
					
				}

			}
			
			}// all verticals checked.
		if(counter < 1) {
		for (int i = 0; i < 7; i = i + 3) {// AB, C?
			if (boxes[i] == 'O' && boxes[i + 1] == 'O') {
				if (boxes[i + 2] == '\0') {
					jta[i + 2].setText("  X");
					boxes[i + 2] = 'X';
					counter++;
					return;
				}
				
			}
		}
		
		}
		if (counter < 1) {
			for (int i = 1; i < 8; i = i + 3) {// A? BC
				if (boxes[i] == 'O' && boxes[i + 1] == 'O') {
					if (boxes[i - 1] == '\0') {
						jta[i - 1].setText("  X");
						boxes[i - 1] = 'X';
						counter++;
						return;
					}
					
				}
			}

			for (int i = 0; i < 7; i = i + 3) {// AC B?
				if (boxes[i] == 'O' && boxes[i + 2] == 'O') {
					if (boxes[i + 1] == '\0') {
						jta[i + 1].setText("  X");
						boxes[i + 1] = 'X';
						counter++;
						return;
					}
					
				}
			}
		}

		// do the diags, and the check end, and the random move incase of no 2 together
		if (counter < 1) {
			for (int i = 0; i < 4; i = i + 4) {// AC B?
				if (boxes[i] == 'O' && boxes[i + 4] == 'O') {// left diag
					if (boxes[i + 8] == '\0') {
						jta[i + 8].setText("  X");
						boxes[i + 8] = 'X';
						counter++;
						return;
					}
				} else if (boxes[i + 4] == 'O' && boxes[i + 8] == 'O') {
					if (boxes[i] == '\0') {
						jta[i].setText("  X");
						boxes[i] = 'X';
						counter++;
						return;
					}
				}
			}
			
		}
		if (counter < 1) {
			for (int i = 2; i < 4; i = i + 2) {
				if (boxes[i] == 'O' && boxes[i + 2] == 'O') {// right diag
					if (boxes[i + 4] == '\0') {
						jta[i + 4].setText("  X");
						boxes[i + 4] = 'X';
						counter++;
						return;
					}
				} else if (boxes[i + 2] == 'O' && boxes[i + 4] == 'O') {
					if (boxes[i] == '\0') {
						jta[i].setText("  X");
						boxes[i] = 'X';
						counter++;
						return;

					}
				}
			}
			
		}
		
	}

	public static void play2win() {

		jta[0] = box1;
		jta[1] = box2;
		jta[2] = box3;
		jta[3] = box4;
		jta[4] = box5;
		jta[5] = box6;
		jta[6] = box7;
		jta[7] = box8;
		jta[8] = box9;

		if (counter < 1) {
			for (int i = 0; i <= 5; i++) {

				if ((boxes[i] == 'X' && boxes[i + 3] == 'X')) {
					if (i < 3 && boxes[i + 6] == '\0') {
						jta[i + 6].setText("  X");
						boxes[i + 6] = 'X';
						counter++;
						return;
					} else if (i >= 3 && boxes[i - 3] == '\0') {
						jta[i - 3].setText("  X");
						boxes[i - 3] = 'X';
						counter++;
						return;
					}
					
				}
			}

			for (int i = 0; i <= 2; i++) {
				if ((boxes[i] == 'X' && boxes[i + 6] == 'X')) {
					if (boxes[i + 3] == '\0') {
						jta[i + 3].setText("  X");
						boxes[i + 3] = 'X';
						counter++;
						return;
					}
					
				}

			} // all verticals checked.
		}
		if (counter < 1) {
			for (int i = 0; i < 7; i = i + 3) {// AB, C?
				if (boxes[i] == 'X' && boxes[i + 1] == 'X') {
					if (boxes[i + 2] == '\0') {
						jta[i + 2].setText("  X");
						boxes[i + 2] = 'X';
						counter++;
						return;
					}
					
				}
			}
		}
		if (counter < 1) {
			for (int i = 1; i < 8; i = i + 3) {// A? BC
				if (boxes[i] == 'X' && boxes[i + 1] == 'X') {
					if (boxes[i - 1] == '\0') {
						jta[i - 1].setText("  X");
						boxes[i - 1] = 'X';
						counter++;
						return;
					}
					
				}
			}

			for (int i = 0; i < 7; i = i + 3) {// AC B?
				if (boxes[i] == 'X' && boxes[i + 2] == 'X') {
					if (boxes[i + 1] == '\0') {
						jta[i + 1].setText("  X");
						boxes[i + 1] = 'X';
						counter++;
						return;
					}
					
				}
			}
		}

		// do the diags, and the check end, and the random move incase of no 2 together
		if (counter < 1) {
			for (int i = 0; i < 4; i = i + 4) {// AC B?
				if (boxes[i] == 'X' && boxes[i + 4] == 'X') {// left diag
					if (boxes[i + 8] == '\0') {
						jta[i + 8].setText("  X");
						boxes[i + 8] = 'X';
						counter++;
						return;
					}
				} else if (boxes[i + 4] == 'X' && boxes[i + 8] == 'X') {
					if (boxes[i] == '\0') {
						jta[i].setText("  X");
						boxes[i] = 'X';
						counter++;
						return;
					}
				}

			}
			
		}
		if (counter < 1) {
			for (int i = 2; i < 4; i = i + 2) {
				if (boxes[i] == 'X' && boxes[i + 2] == 'X') {// right diag
					if (boxes[i + 4] == '\0') {
						jta[i + 4].setText("  X");
						boxes[i + 4] = 'X';
						counter++;
						return;
					}
				} else if (boxes[i + 2] == 'X' && boxes[i + 4] == 'X') {
					if (boxes[i] == '\0') {
						jta[i].setText("  X");
						boxes[i] = 'X';
						counter++;
						return;

					}
				}
			}
			
		}

	}

	public static void otherwise() {
		
		jta[0] = box1;
		jta[1] = box2;
		jta[2] = box3;
		jta[3] = box4;
		jta[4] = box5;
		jta[5] = box6;
		jta[6] = box7;
		jta[7] = box8;
		jta[8] = box9;

		if (boxes[7] == '\0') {
			jta[7].setText("  X");
			boxes[7] = 'X';
			
		} else if (boxes[5] == '\0') {
			jta[5].setText("  X");
			boxes[5] = 'X';
			
		} else if (boxes[3] == '\0') {
			jta[3].setText("  X");
			boxes[3] = 'X';
			
		} else if (boxes[1] == '\0') {
			jta[1].setText("  X");
			boxes[1] = 'X';
			
		} else {
			
			
			for (int i = 0; i < 8; i++) {
				if (boxes[i] == '\0') {
					jta[i].setText("  X");
					boxes[i] = 'X';
					break;
				}
			}
			
		}

	}
	
	public static void checkEnd() {
		int x = 0;
		for(int i =0; i<9; i++) {
			if(boxes[i] != '\0') {
				x = 1;
			}
			
		}
		
		if(x==1) {
		
		for(int i =0; i<7; i = i+3) {//horizontal checks.
			if(boxes[i] == boxes[i+1] && boxes[i+1] == boxes[i+2]) {
				if(boxes[i]== 'X') {
					JOptionPane.showMessageDialog(frame,"You Lose!");
					reset();
					
				}else if(boxes[i] == 'O') {
					JOptionPane.showMessageDialog(frame,"You Win!");
					reset();
					
				}
			}
		}
		for(int i =0; i<3; i++) {//vertical checks.
			if(boxes[i] == boxes[i+3] && boxes[i+3] == boxes[i+6]) {
				if(boxes[i]== 'X') {
					JOptionPane.showMessageDialog(frame,"You Lose!");
					reset();
					
				}else if(boxes[i] == 'O') {
					JOptionPane.showMessageDialog(frame,"You Win!");
					reset();
					
				}
			}
		}
		
		if(boxes[0] == boxes[4] && boxes[4] == boxes[8]) {
			if(boxes[0] == 'X') {
				JOptionPane.showMessageDialog(frame,"You Lose!");
				reset();
				
			}else if (boxes[0] == 'O'){
				JOptionPane.showMessageDialog(frame,"You Win!");
				reset();
				
			}
		}
		
		if(boxes[2] == boxes[4] && boxes[4] == boxes[6]) {
			if(boxes[2] == 'X') {
				JOptionPane.showMessageDialog(frame,"You Lose!");
				reset();
				
			}else if(boxes[2] == 'O'){
				JOptionPane.showMessageDialog(frame,"You Win!");
				reset();
				
			}
		}
		}
		
	}
	
	public static void reset() {
		box1.setText("");
		box2.setText("");
		box3.setText("");
		box4.setText("");
		box5.setText("");
		box6.setText("");
		box7.setText("");
		box8.setText("");
		box9.setText("");
		
		for(int i =0; i<9; i++) {
			boxes[i] = '\0';
		}
		
	}
	
}