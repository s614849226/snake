

import javax.swing.JFrame;
public class jingjingsnake{

	public static void main(String[] args){
		JFrame frame =new JFrame();
		frame.setBounds(10,10,900,720);//���Ͻ�����ͳ���
		frame.setResizable(false);//�Ƿ���Ըı��С
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new jingjingPanel());//ADD����
		frame.setVisible(true);
	}
}