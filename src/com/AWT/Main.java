package com.AWT;

import javax.swing.*;

public class Main {
    static JFrame jFrame = getFrame(); // создание формы
    static  JPanel jPanel = new JPanel(); // создание панели

    public static void main(String[] args) {
	    jFrame.add(jPanel); // добавить панель на форму
	    JTextField jTextField =new JTextField(20); // тестовое поле
        JTextField jTextField2 =new JTextField(20);
        jTextField.setDragEnabled(true); // разрешени на перетащить и бросить
        jTextField2.setDragEnabled(true);
        jPanel.add(jTextField); // добавить на панель
        jPanel.add(jTextField2);
        jFrame.revalidate(); // перерисовать
    }

    static JFrame getFrame(){
        JFrame jFrame=new JFrame(){}; // создание формы
        jFrame.setVisible(true); // видимость
        jFrame.setBounds(550,250,300,100); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход
        return jFrame; // передать форму
    }
}
