

import javax.swing.JFrame;
public class jingjingsnake{

	public static void main(String[] args){
		JFrame frame =new JFrame();
		frame.setBounds(10,10,900,720);//左上角坐标和长宽
		frame.setResizable(false);//是否可以改变大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new jingjingPanel());//ADD画布
		frame.setVisible(true);
	}
}