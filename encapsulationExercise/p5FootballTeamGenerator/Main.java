package oop.encapsulationExercise.p5FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();

        Map<String, Team> teams = new LinkedHashMap<>();

        while (!"END".equals(inputCommand)) {

            String[] commandData = inputCommand.split(";");

            String command = commandData[0];
            String teamName = commandData[1];

            try {
                switch (command) {
                    case "Team":
                        Team team = new Team(teamName);
                        teams.put(teamName, team);
                        break;
                    case "Add":
                        String playerName = commandData[2];
                        int endurance = Integer.parseInt(commandData[3]);
                        int sprint = Integer.parseInt(commandData[4]);
                        int dribble = Integer.parseInt(commandData[5]);
                        int passing = Integer.parseInt(commandData[6]);
                        int shooting = Integer.parseInt(commandData[7]);

                        if (!teams.containsKey(teamName)) {
                            System.out.println("Team " + teamName + " does not exist.");
                        } else {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        playerName = commandData[2];

                        if (!teams.containsKey(teamName)) {
                            System.out.println("Team " + teamName + " does not exist.");
                        } else {
                            teams.get(teamName).removePlayer(playerName);
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.println("Team " + teamName + " does not exist.");
                        } else {
                            System.out.println(teamName + " - " + Math.round(teams.get(teamName).getRating(teamName)));
                        }
                        break;
                }

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }

            inputCommand = scanner.nextLine();
        }

    }
}
