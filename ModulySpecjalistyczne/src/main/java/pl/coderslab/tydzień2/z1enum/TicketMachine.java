package pl.coderslab.tydzień2.z1enum;

import java.util.Scanner;

public class TicketMachine {
    public static int calculatePrice (Ticket ticket) {
        if (ticket.getType()==TicketType.NORMAL){
            return 10;
        } else if (ticket.getType()==TicketType.STUDENT) {
            return 7;
        } else if (ticket.getType()==TicketType.CHILD) {
            return 5;
        } else if (ticket.getType()==TicketType.SENIOR) {
            return 6;
        } else return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ticket type");
        TicketType type = TicketType.valueOf(scanner.next().toUpperCase());
        Ticket ticket = new Ticket();
        ticket.setType(type);
        System.out.println(calculatePrice(ticket));
    }
}
