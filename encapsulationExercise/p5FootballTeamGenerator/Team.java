package oop.encapsulationExercise.p5FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        if (!players.removeIf(player -> player.getName().equals(playerName))) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + getName() + " team.");
        }
    }

    public double getRating(String teamName) {
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
    }
}
