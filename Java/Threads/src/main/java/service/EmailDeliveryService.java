package service;

import dominio.Member;

public class EmailDeliveryService implements Runnable{

    private final Member member;

    public EmailDeliveryService (Member member){
        this.member = member;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while(member.isOpen() || member.pendingEmails() > 0){
            try{
                String email = member.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + "Enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos emails foram enviado com sucesso!");
    }
}
