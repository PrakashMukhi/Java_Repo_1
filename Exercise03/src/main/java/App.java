
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<BasketballTeam> basketballList = new ArrayList<>();
        List<FootballTeam> footballList = new ArrayList<>();
        readTeamsFromCSV("teams.csv", basketballList, footballList);

        System.out.println("*** Before results ***");
        System.out.println();

        basketballList = basketballList.stream().sorted(Comparator.comparingInt(BasketballTeam::getPoints))
                .collect(Collectors.toList());
        basketballList.forEach(System.out::println);
        System.out.println();

        footballList = footballList.stream().sorted(Comparator.comparingInt(FootballTeam::getPoints))
                .collect(Collectors.toList());
        footballList.forEach(System.out::println);

        readResultFromCSV(footballList, basketballList);

        System.out.println();
        System.out.println("*** After results ***");
        System.out.println();
        basketballList = basketballList.stream().sorted(Comparator.comparingInt(BasketballTeam::getPoints))
                .collect(Collectors.toList());
        basketballList.forEach(System.out::println);
        System.out.println();

        footballList = footballList.stream().sorted(Comparator.comparingInt(FootballTeam::getPoints))
                .collect(Collectors.toList());
        footballList.forEach(System.out::println);

    }

    private static void readResultFromCSV(List<FootballTeam> footballList, List<BasketballTeam> basketballList) {
        // TODO Auto-generated method stub
        Path pathToFile = Paths.get("C:\\Users\\046192\\IdeaProjects\\Exercise3\\src\\main\\resources\\results.csv");

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                FootballTeam footballTeam = footballList.stream()
                        .filter(o -> o.getTeamName().equalsIgnoreCase(attributes[0])).findFirst().orElse(null);
                if (footballTeam != null) {
                    footballTeam.updatePoints(attributes[1]);
                }

                BasketballTeam basketballTeam = basketballList.stream()
                        .filter(o -> o.getTeamName().equalsIgnoreCase(attributes[0])).findFirst().orElse(null);
                if (basketballTeam != null) {
                    basketballTeam.updatePoints(attributes[1]);
                }
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void readTeamsFromCSV(String fileName, List<BasketballTeam> basketballList,
                                         List<FootballTeam> footballList) {
        // TODO Auto-generated method stub

        Path pathToFile = Paths.get("C:\\Users\\046192\\IdeaProjects\\Exercise3\\src\\main\\resources\\teams.csv");

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                switch (attributes[0]) {
                    case "Basketball":
                        BasketballTeam basketballTeam = new BasketballTeam(attributes[1], Integer.parseInt(attributes[2]));
                        basketballList.add(basketballTeam);
                        break;

                    case "Football":
                        FootballTeam footballTeam = new FootballTeam(attributes[1], Integer.parseInt(attributes[2]),
                                attributes[3]);
                        footballList.add(footballTeam);
                        break;

                    default:
                        break;
                }
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
