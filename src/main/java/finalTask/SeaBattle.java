package finalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static finalTask.SeaBattleMethods.*;

public class SeaBattle {
    public static void main(String[] args) {
        String[][] emptyWarFieldPlayer1 = createEmptyField();
        String[][] emptyWarFieldPlayer2 = createEmptyField();

        System.out.println("Начнем расставлять корабли на поле. Игрок под номером 1 начинай. Другой игрок, не подсматривай!");
        System.out.println("Введите координаты четырехпалубного корабля в формате x1,y1;x2,y2;x3,y3;x4,y4");
        List<ShipPoint> fourDeckShipCoordinatesListPlayer1 = createFourDeckShip();
        List<ShipPoint> allShipsCoordinatesListPlayer1 = new ArrayList<>(fourDeckShipCoordinatesListPlayer1);

        List<ShipPoint> fourDeckShipHalationPlayer1 = listOfHalations(fourDeckShipCoordinatesListPlayer1);
        List<ShipPoint> allShipsHalationsPlayer1 = new ArrayList<>(fourDeckShipHalationPlayer1);
        List<ShipPoint> threeDeckShipHalation1Player1 = new ArrayList<>();
        List<ShipPoint> threeDeckShipCoordinatesList1Player1 = new ArrayList<>();

        System.out.println("Введите координаты первого трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        threeDeckShipCoordinatesList1Player1 = check3DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                threeDeckShipCoordinatesList1Player1, threeDeckShipHalation1Player1);


        System.out.println("Введите координаты второго трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        List<ShipPoint> threeDeckShipHalation2Player1 = new ArrayList<>();
        List<ShipPoint> threeDeckShipCoordinatesList2Player1 = new ArrayList<>();
        threeDeckShipCoordinatesList2Player1 = check3DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                threeDeckShipCoordinatesList2Player1, threeDeckShipHalation2Player1);


        System.out.println("Введите координаты первого двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation1Player1 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList1Player1 = new ArrayList<>();
        twoDeckShipCoordinatesList1Player1 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                twoDeckShipCoordinatesList1Player1, twoDeckShipHalation1Player1);


        System.out.println("Введите координаты второго двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation2Player1 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList2Player1 = new ArrayList<>();
        twoDeckShipCoordinatesList2Player1 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                twoDeckShipCoordinatesList2Player1, twoDeckShipHalation2Player1);


        System.out.println("Введите координаты третьего двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation3Player1 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList3Player1 = new ArrayList<>();
        twoDeckShipCoordinatesList3Player1 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                twoDeckShipCoordinatesList3Player1, twoDeckShipHalation3Player1);


        System.out.println("Введите координаты первого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation1Player1 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList1Player1 = new ArrayList<>();
        oneDeckShipCoordinatesList1Player1 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                oneDeckShipCoordinatesList1Player1, oneDeckShipHalation1Player1);


        System.out.println("Введите координаты второго однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation2Player1 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList2Player1 = new ArrayList<>();
        oneDeckShipCoordinatesList2Player1 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                oneDeckShipCoordinatesList2Player1, oneDeckShipHalation2Player1);


        System.out.println("Введите координаты третьего однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation3Player1 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList3Player1 = new ArrayList<>();
        oneDeckShipCoordinatesList3Player1 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                oneDeckShipCoordinatesList3Player1, oneDeckShipHalation3Player1);


        System.out.println("Введите координаты четвертого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation4Player1 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList4Player1 = new ArrayList<>();
        oneDeckShipCoordinatesList4Player1 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1,
                oneDeckShipCoordinatesList4Player1, oneDeckShipHalation4Player1);


        createAndPrintWarField(emptyWarFieldPlayer1, allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Игрок под номером 2, теперь твоя очередь расставлять. Другой игрок, не подсматривай!");
        System.out.println("Введите координаты четырехпалубного корабля в формате x1,y1;x2,y2;x3,y3;x4,y4");
        List<ShipPoint> fourDeckShipCoordinatesListPlayer2 = createFourDeckShip();
        List<ShipPoint> allShipsCoordinatesListPlayer2 = new ArrayList<>(fourDeckShipCoordinatesListPlayer2);

        List<ShipPoint> fourDeckShipHalationPlayer2 = listOfHalations(fourDeckShipCoordinatesListPlayer2);
        List<ShipPoint> allShipsHalationsPlayer2 = new ArrayList<>(fourDeckShipHalationPlayer2);
        List<ShipPoint> threeDeckShipHalation1Player2 = new ArrayList<>();
        List<ShipPoint> threeDeckShipCoordinatesList1Player2 = new ArrayList<>();

        System.out.println("Введите координаты первого трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        threeDeckShipCoordinatesList1Player2 = check3DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                threeDeckShipCoordinatesList1Player2, threeDeckShipHalation1Player2);


        System.out.println("Введите координаты второго трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        List<ShipPoint> threeDeckShipHalation2Player2 = new ArrayList<>();
        List<ShipPoint> threeDeckShipCoordinatesList2Player2 = new ArrayList<>();
        threeDeckShipCoordinatesList2Player2 = check3DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                threeDeckShipCoordinatesList2Player2, threeDeckShipHalation2Player2);


        System.out.println("Введите координаты первого двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation1Player2 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList1Player2 = new ArrayList<>();
        twoDeckShipCoordinatesList1Player2 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                twoDeckShipCoordinatesList1Player2, twoDeckShipHalation1Player2);


        System.out.println("Введите координаты второго двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation2Player2 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList2Player2 = new ArrayList<>();
        twoDeckShipCoordinatesList2Player2 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                twoDeckShipCoordinatesList2Player2, twoDeckShipHalation2Player2);


        System.out.println("Введите координаты третьего двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation3Player2 = new ArrayList<>();
        List<ShipPoint> twoDeckShipCoordinatesList3Player2 = new ArrayList<>();
        twoDeckShipCoordinatesList3Player2 = check2DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                twoDeckShipCoordinatesList3Player2, twoDeckShipHalation3Player2);


        System.out.println("Введите координаты первого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation1Player2 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList1Player2 = new ArrayList<>();
        oneDeckShipCoordinatesList1Player2 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                oneDeckShipCoordinatesList1Player2, oneDeckShipHalation1Player2);


        System.out.println("Введите координаты второго однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation2Player2 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList2Player2 = new ArrayList<>();
        oneDeckShipCoordinatesList2Player2 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                oneDeckShipCoordinatesList2Player2, oneDeckShipHalation2Player2);


        System.out.println("Введите координаты третьего однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation3Player2 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList3Player2 = new ArrayList<>();
        oneDeckShipCoordinatesList3Player2 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                oneDeckShipCoordinatesList3Player2, oneDeckShipHalation3Player2);


        System.out.println("Введите координаты четвертого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation4Player2 = new ArrayList<>();
        List<ShipPoint> oneDeckShipCoordinatesList4Player2 = new ArrayList<>();
        oneDeckShipCoordinatesList4Player2 = check1DShipPlaceAndHalation(allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2,
                oneDeckShipCoordinatesList4Player2, oneDeckShipHalation4Player2);


        createAndPrintWarField(emptyWarFieldPlayer2, allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int player = (int) (Math.random() * 2 + 1);

        System.out.println("Игрок под номером " + player + ", ты ходишь первым!");
        List<ShipPoint> allshots1 = new ArrayList<>();
        List<ShipPoint> allshots2 = new ArrayList<>();
        if (player == 1) {
            while (allShipsCoordinatesListPlayer2.size() != 0 && allShipsCoordinatesListPlayer1.size() != 0) {
                playerShots("Игрок номер 1, вводи координату корабля противника в формате x,y", allShipsCoordinatesListPlayer2, allShipsCoordinatesListPlayer1,
                        fourDeckShipCoordinatesListPlayer2, threeDeckShipCoordinatesList1Player2, threeDeckShipCoordinatesList2Player2,
                        twoDeckShipCoordinatesList1Player2, twoDeckShipCoordinatesList2Player2, twoDeckShipCoordinatesList3Player2, oneDeckShipCoordinatesList1Player2,
                        oneDeckShipCoordinatesList2Player2, oneDeckShipCoordinatesList3Player2, oneDeckShipCoordinatesList4Player2, emptyWarFieldPlayer2,
                        allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2, allshots1);

                playerShots("Игрок номер 2, вводи координату корабля противника в формате x,y", allShipsCoordinatesListPlayer2, allShipsCoordinatesListPlayer1,
                        fourDeckShipCoordinatesListPlayer1, threeDeckShipCoordinatesList1Player1, threeDeckShipCoordinatesList2Player1,
                        twoDeckShipCoordinatesList1Player1, twoDeckShipCoordinatesList2Player1, twoDeckShipCoordinatesList3Player1, oneDeckShipCoordinatesList1Player1,
                        oneDeckShipCoordinatesList2Player1, oneDeckShipCoordinatesList3Player1, oneDeckShipCoordinatesList4Player1, emptyWarFieldPlayer1,
                        allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1, allshots2);
            }

        } else {
            while (allShipsCoordinatesListPlayer2.size() != 0 && allShipsCoordinatesListPlayer1.size() != 0) {

                playerShots("Игрок номер 2, вводи координату корабля противника в формате x,y", allShipsCoordinatesListPlayer2, allShipsCoordinatesListPlayer1,
                        fourDeckShipCoordinatesListPlayer1, threeDeckShipCoordinatesList1Player1, threeDeckShipCoordinatesList2Player1,
                        twoDeckShipCoordinatesList1Player1, twoDeckShipCoordinatesList2Player1, twoDeckShipCoordinatesList3Player1, oneDeckShipCoordinatesList1Player1,
                        oneDeckShipCoordinatesList2Player1, oneDeckShipCoordinatesList3Player1, oneDeckShipCoordinatesList4Player1, emptyWarFieldPlayer1,
                        allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1, allshots2);

                playerShots("Игрок номер 1, вводи координату корабля противника в формате x,y", allShipsCoordinatesListPlayer2, allShipsCoordinatesListPlayer1,
                        fourDeckShipCoordinatesListPlayer2, threeDeckShipCoordinatesList1Player2, threeDeckShipCoordinatesList2Player2,
                        twoDeckShipCoordinatesList1Player2, twoDeckShipCoordinatesList2Player2, twoDeckShipCoordinatesList3Player2, oneDeckShipCoordinatesList1Player2,
                        oneDeckShipCoordinatesList2Player2, oneDeckShipCoordinatesList3Player2, oneDeckShipCoordinatesList4Player2, emptyWarFieldPlayer2,
                        allShipsCoordinatesListPlayer2, allShipsHalationsPlayer2, allshots1);

            }
        }

        System.out.println("Игра окончена!");
    }
}
