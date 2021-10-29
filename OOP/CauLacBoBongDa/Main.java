package CauLacBoBongDa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb=Integer.parseInt(input.nextLine());
        ArrayList<FootBallClub> clubsList = new ArrayList<>();
        for(int i=1;i<=numb;i++)
        {
            FootBallClub club=new FootBallClub();
            club.setId(input.nextLine());
            club.setNameClub(input.nextLine());
            club.setNumberOfFan(Long.parseLong(input.nextLine()));
            clubsList.add(club);
        }
        int num=Integer.parseInt(input.nextLine());
        ArrayList<Ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Ticket ticket = new Ticket();
            ticket.setIdClub(input.next());
            ticket.setTicketPrice(Long.parseLong(input.nextLine().trim()));
            ticketList.add(ticket);
        }
        for(Ticket ticket : ticketList)
        {
            for(FootBallClub club: clubsList)
            {
                if(club.getId().equals(ticket.getId()))
                {
                    System.out.println(ticket.getIdClub()+" "+club.getNameClub()+" "+club.getNumberOfFan()*ticket.getTicketPrice());

                }
            }

        }
    }
}
