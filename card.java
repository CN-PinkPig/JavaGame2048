import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class card extends JLabel{
	private int numbers;
	public card() {
		setHorizontalAlignment(SwingConstants.CENTER);
		setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		setOpaque(true);
		setBackground(new Color(204, 192, 178));
		setForeground(Color.white);
	}
	public int getNum() {
		return numbers;
	}
	public void setNumber(int num) {
		numbers=num;
		if(numbers==0) {
			this.setText("");
			setBackground(new Color(204, 192, 178));
		}else if(numbers==2) {
			this.setText("2");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 60));
			setForeground(new Color(121, 111, 101));
			setBackground(new Color(238, 228, 218));
		}else if(numbers==4) {
			this.setText("4");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 60));
			setBackground(new Color(242, 177, 121));
			setForeground(Color.white);
		}else if(numbers==8) {
			this.setText("8");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 60));
			setBackground(new Color(242, 177, 121));
			setForeground(Color.white);
		}else if(numbers==16) {
			this.setText("16");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 50));
			setBackground(new Color(245, 149, 99));
			setForeground(Color.white);
		}else if(numbers==32) {
			this.setText("32");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 50));
			setBackground(new Color(243,124,94));
			setForeground(Color.white);
		}else if(numbers==64) {
			this.setText("64");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 50));
			setBackground(new Color(246, 93, 59));
			setForeground(Color.white);
		}else if(numbers==128) {
			this.setText("128");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 40));
			setBackground(new Color(237, 204, 97));
			setForeground(Color.white);
		}else if(numbers==256) {
			this.setText("256");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 40));
			setBackground(new Color(205, 92, 92));
			setForeground(Color.white);
		}else if(numbers==512) {
			this.setText("512");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 40));
			setBackground(new Color(205, 85, 00));
			setForeground(Color.white);
		}else if(numbers==1024) {
			this.setText("1024");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 30));
			setBackground(new Color(238, 201, 0));
			setForeground(Color.white);
		}else if(numbers==2048) {
			this.setText("2048");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 30));
			setBackground(new Color(255, 30, 30));
			setForeground(Color.white);
		}else if(numbers==4096) {
			this.setText("4096");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 30));
			setBackground(new Color(0, 238, 76));
			setForeground(Color.white);
		}else if(numbers==8192) {
			this.setText("8192");
			setFont(new Font("HirakakuProN-W6", Font.BOLD, 30));
			setBackground(new Color(0, 229, 238));
			setForeground(Color.white);
		}else if(numbers>8192) {
			String[] options= {"退出游戏"};
			int response =JOptionPane.showOptionDialog(null, "你简直太厉害了这个游戏太简单了不适合您请单击退出游戏", "游戏结束", JOptionPane.OK_OPTION, JOptionPane.OK_OPTION, null, options, null);
			if(response==0) {
				System.exit(0);
			}
		}
	}
}
