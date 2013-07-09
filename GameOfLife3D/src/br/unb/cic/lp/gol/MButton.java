package br.unb.cic.lp.gol;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
/** 
 * Bot�o MButton que extende da classe JButton.
 * Esse bot�o tem posi��o i e j e uma fun��o setBackgroundImage. Que j� adiciona uma image
 * de um tamanho compat�vel no bot�o. 
 *
 */
public class MButton extends JButton {
	private int i;
	private int j;
	public MButton(int i, int j){
		this.i = i;
		this.j = j;
	}
	public void setBackgroundImage(Image image){
		image = image.getScaledInstance(getWidth(), getHeight(), 5);
		super.setIcon(new ImageIcon(image));
	}
	public int getI(){
		return i;
	}
	public int getJ(){
		return j;
	}

}
