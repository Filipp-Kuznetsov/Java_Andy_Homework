package com.company;

public class Sender {
   private int chooseMail;

    public Sender(int chooseMail) {
        this.chooseMail = chooseMail;
    }

    public int getChooseMail() {
        return chooseMail;
    }

    public void setChooseMail(int chooseMail) {
        this.chooseMail = chooseMail;
    }

    void send(int chooseMail){


        switch (chooseMail){
            case 1: new DHL().sendMail(); break;
            case 2: new Email().sendMail(); break;
            case 3: new Pigeon().sendMail(); break;
            default:
                System.out.println("Pleace take another taste ");
        }
    }


}
