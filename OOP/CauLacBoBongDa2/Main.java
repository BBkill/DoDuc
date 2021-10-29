package CauLacBoBongDa2;

import java.util.ArrayList;
import java.util.Collections;
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

        for(FootBallClub club: clubsList)
        {
            for(Ticket ticket : ticketList)
            {
                if(club.getId().equals(ticket.getId()))
                {
                    club.setTotalProfit(club.getNumberOfFan()*ticket.getTicketPrice());
                    club.setIdMatch(ticket.getIdClub());
                    break;
                }
            }

        }
        Collections.sort(clubsList);
        //clubsList.stream().forEach(System.out::println);
        for(FootBallClub club :clubsList)
        {
            System.out.println(club);
        }
    }
}
