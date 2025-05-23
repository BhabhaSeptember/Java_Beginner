/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import utility.PlayerDatabase;
import utility.PlayerDatabaseException;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        League theLeague = new League();

        try {

            Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows",7);
            Game[] theGames = theLeague.createGames(theTeams);

            System.out.println(theLeague.getLeagueAnnouncement(theGames));
            for (Game currGame : theGames) {
                currGame.playGame();
                //break;
                System.out.println(currGame.getDescription());
            }

            theLeague.showBestTeam(theTeams);
            theLeague.showBestPlayers(theTeams);

            
        } 
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }

    
    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException {

        PlayerDatabase playerDB = new PlayerDatabase();

        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }

        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGames = 0;

        ArrayList theGames = new ArrayList();

        for (Team homeTeam : theTeams) {
            for (Team awayTeam : theTeams) {
                if (homeTeam != awayTeam) {
                    daysBetweenGames += 7;
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }

            }
        }

        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {

        Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];
        System.out.println("\n <=== Team Points ===>");

        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + " : Points = " + currTeam.getPointsTotal() + " || Goals Scored = "
                    + currTeam.getGoalsTotal());

        }

        System.out.println("\nWinner of the League is: " + currBestTeam.getTeamName() + "!!!!!");

    }

    public String getLeagueAnnouncement(Game[] theGames) {

        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(),
                theGames[theGames.length - 1].getTheDateTime().toLocalDate());

        return "<----- The league is scheduled to run for "
                + thePeriod.getMonths() + " month(s), and "
                + thePeriod.getDays() + " day(s)----> \n ";
    }

    public void showBestPlayers(Team[] theTeams) {
        ArrayList<Player> thePlayers = new ArrayList();
        for (Team currTeam : theTeams) {
            thePlayers.addAll(Arrays.asList(currTeam.getPlayerArray()));
        }

        Collections.sort(thePlayers, (p1, p2) -> Double.valueOf(p2.getGoalsScored()).compareTo(Double.valueOf(p1.getGoalsScored())));

        System.out.println("\n\n <=== Best Players ===>");
        for (Player currPlayer : thePlayers) {
            System.out.println(currPlayer.getPlayerName() + " : " + currPlayer.getGoalsScored());
        }
    }

}
