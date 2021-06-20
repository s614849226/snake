import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.sound.sampled.*;

public class jingjingPanel extends JPanel  {//可以处理键盘事件的画
	ImageIcon title = new ImageIcon("title.jpg");

	public jingjingPanel(){}
		

	
	public void paintComponent(Graphics g){
               //画主键（画笔）
		super.paintComponent (g);
		this.setBackground(Color.GREEN);
		title.paintIcon(this,g,25,11); //画标题 注意表示方式
		

                }
		}
		//背景音乐
