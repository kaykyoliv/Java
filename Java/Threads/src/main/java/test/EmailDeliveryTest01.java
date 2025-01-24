package test;

import dominio.Member;
import service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Member member = new Member();

        Thread jiraya = new Thread(new EmailDeliveryService(member), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(member), "kakashi");

        jiraya.start();
        kakashi.start();

        while(true){
            String email= JOptionPane.showInputDialog("Entre com o seu email");
            if(email == null || email.isEmpty()){
                member.close();
                break;
            }
            member.addMemberEmail(email);
        }
    }
}
