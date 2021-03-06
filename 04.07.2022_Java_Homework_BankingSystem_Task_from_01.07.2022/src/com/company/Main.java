package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*  Допустим, вы пишите банковскую программу.
    У вас есть клиенты: юридические лица, физические лица, вип-клиеты.
     У каждого клиента есть Account{String ibann, double balance}.

    Условиями бизнеса предусмотрено, что по каждому счету начисляются проценты
     и после начисления клиентов информируют о балансе.

    На счета физических лиц проценты начисляется базовый процент.
    На счета юр.лиц начисляется процент, но при условие что остаток на счете не менее 10000.
    На счета вип-клиетов начисляется базовый процент плюс бонус. Информирование тоже осуществляется по разному:
     юр.лица и физ.лица получают выписку письмом, вип клиеты получают письмом и емэйлом.

     Вам необходимо разработать систему классов, реализовать метод начисления и метод информирования.
     Естественно, программа должна иметь возможность обрабатывать клиентов\счета списком.
 */

        Individual individualClient= new Individual("Jack",new Accounts("DE 51 00003527896547",5730.37));
        Entity enitityClient= new Entity("John",new Accounts("DE 51 00003527856547",10000.56));
        VIP_Client VIPClient= new VIP_Client("Jessy",new Accounts("DE 51 00003523396547",60078.327));


        List<Clients>clientsList=new ArrayList<>();

        clientsList.add(individualClient);
        clientsList.add(enitityClient);
        clientsList.add(VIPClient);

        for (Clients cl:clientsList) {
            cl.calcPercent();
        }
    }
}
