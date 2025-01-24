package test;

import dominio.Account;

public class ThreadsAccountTest01 implements Runnable{

    private final    Account acc = new Account();
    public static void main(String[] args) {
        ThreadsAccountTest01 threadsAccountTest01 = new ThreadsAccountTest01();
        Thread t1 = new Thread(threadsAccountTest01, "Hestia");
        Thread t2 = new Thread(threadsAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            withdraw(10);
        }
        if(acc.getBalance() < 0){
            System.out.println("Saque negado, valor da conta está abaixo da quantidade a ser sacada");
        }
    }

    public void withdraw(int amount){
        System.out.println(getThreadName() +" #### fora do synchronized");
        synchronized (acc) {
            System.out.println(getThreadName() +" **** dentro do synchronized");

            if (acc.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                acc.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + acc.getBalance());

            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + acc.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
