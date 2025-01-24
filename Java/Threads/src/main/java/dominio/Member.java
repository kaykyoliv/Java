package dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Member {

    private final Queue<String> emails = new ArrayBlockingQueue<>(10);

    public boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (emails){
            while(emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Nao tem email disponivel na lista, entrando em modo de espera");
                emails.wait();
            }
            return emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos pegando mais emails");
            emails.notifyAll();
        }
    }
}
