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
        List<ShipPoint> threeDeckShipHalation1Player1;
        List<ShipPoint> threeDeckShipCoordinatesList1Player1;

        System.out.println("Введите координаты первого трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        while (true) {
            threeDeckShipCoordinatesList1Player1 = createThreeDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(0)) ||
                    allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(1)) ||
                    allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(2))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(0)) ||
                    allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(1)) ||
                    allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList1Player1.get(2))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(threeDeckShipCoordinatesList1Player1);
                threeDeckShipHalation1Player1 = listOfHalations(threeDeckShipCoordinatesList1Player1);
                allShipsHalationsPlayer1.addAll(threeDeckShipHalation1Player1);
                break;
            }
        }

        System.out.println("Введите координаты второго трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        List<ShipPoint> threeDeckShipHalation2Player1;
        List<ShipPoint> threeDeckShipCoordinatesList2Player1;

        while (true) {
            threeDeckShipCoordinatesList2Player1 = createThreeDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(0)) ||
                    allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(1)) ||
                    allShipsCoordinatesListPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(2))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(0)) ||
                    allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(1)) ||
                    allShipsHalationsPlayer1.contains(threeDeckShipCoordinatesList2Player1.get(2))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(threeDeckShipCoordinatesList2Player1);
                threeDeckShipHalation2Player1 = listOfHalations(threeDeckShipCoordinatesList2Player1);
                allShipsHalationsPlayer1.addAll(threeDeckShipHalation2Player1);
                break;
            }
        }

        System.out.println("Введите координаты первого двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation1Player1;
        List<ShipPoint> twoDeckShipCoordinatesList1Player1;

        while (true) {
            twoDeckShipCoordinatesList1Player1 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList1Player1.get(0)) ||
                    allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList1Player1.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList1Player1.get(0)) ||
                    allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList1Player1.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(twoDeckShipCoordinatesList1Player1);
                twoDeckShipHalation1Player1 = listOfHalations(twoDeckShipCoordinatesList1Player1);
                allShipsHalationsPlayer1.addAll(twoDeckShipHalation1Player1);
                break;
            }
        }

        System.out.println("Введите координаты второго двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation2Player1;
        List<ShipPoint> twoDeckShipCoordinatesList2Player1;

        while (true) {
            twoDeckShipCoordinatesList2Player1 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList2Player1.get(0)) ||
                    allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList2Player1.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList2Player1.get(0)) ||
                    allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList2Player1.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(twoDeckShipCoordinatesList2Player1);
                twoDeckShipHalation2Player1 = listOfHalations(twoDeckShipCoordinatesList2Player1);
                allShipsHalationsPlayer1.addAll(twoDeckShipHalation2Player1);
                break;
            }
        }

        System.out.println("Введите координаты третьего двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation3Player1;
        List<ShipPoint> twoDeckShipCoordinatesList3Player1;

        while (true) {
            twoDeckShipCoordinatesList3Player1 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList3Player1.get(0)) ||
                    allShipsCoordinatesListPlayer1.contains(twoDeckShipCoordinatesList3Player1.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList3Player1.get(0)) ||
                    allShipsHalationsPlayer1.contains(twoDeckShipCoordinatesList3Player1.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(twoDeckShipCoordinatesList3Player1);
                twoDeckShipHalation3Player1 = listOfHalations(twoDeckShipCoordinatesList3Player1);
                allShipsHalationsPlayer1.addAll(twoDeckShipHalation3Player1);
                break;
            }
        }

        System.out.println("Введите координаты первого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation1Player1;
        List<ShipPoint> oneDeckShipCoordinatesList1Player1;

        while (true) {
            oneDeckShipCoordinatesList1Player1 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(oneDeckShipCoordinatesList1Player1.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(oneDeckShipCoordinatesList1Player1.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(oneDeckShipCoordinatesList1Player1);
                oneDeckShipHalation1Player1 = listOfHalations(oneDeckShipCoordinatesList1Player1);
                allShipsHalationsPlayer1.addAll(oneDeckShipHalation1Player1);
                break;
            }
        }

        System.out.println("Введите координаты второго однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation2Player1;
        List<ShipPoint> oneDeckShipCoordinatesList2Player1;

        while (true) {
            oneDeckShipCoordinatesList2Player1 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(oneDeckShipCoordinatesList2Player1.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(oneDeckShipCoordinatesList2Player1.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(oneDeckShipCoordinatesList2Player1);
                oneDeckShipHalation2Player1 = listOfHalations(oneDeckShipCoordinatesList2Player1);
                allShipsHalationsPlayer1.addAll(oneDeckShipHalation2Player1);
                break;
            }
        }

        System.out.println("Введите координаты третьего однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation3Player1;
        List<ShipPoint> oneDeckShipCoordinatesList3Player1;

        while (true) {
            oneDeckShipCoordinatesList3Player1 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(oneDeckShipCoordinatesList3Player1.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(oneDeckShipCoordinatesList3Player1.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(oneDeckShipCoordinatesList3Player1);
                oneDeckShipHalation3Player1 = listOfHalations(oneDeckShipCoordinatesList3Player1);
                allShipsHalationsPlayer1.addAll(oneDeckShipHalation3Player1);
                break;
            }
        }

        System.out.println("Введите координаты четвертого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation4Player1;
        List<ShipPoint> oneDeckShipCoordinatesList4Player1;

        while (true) {
            oneDeckShipCoordinatesList4Player1 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer1.contains(oneDeckShipCoordinatesList4Player1.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer1.contains(oneDeckShipCoordinatesList4Player1.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer1.addAll(oneDeckShipCoordinatesList4Player1);
                oneDeckShipHalation4Player1 = listOfHalations(oneDeckShipCoordinatesList4Player1);
                allShipsHalationsPlayer1.addAll(oneDeckShipHalation4Player1);
                break;
            }
        }

        createAndPrintWarField(emptyWarFieldPlayer1, allShipsCoordinatesListPlayer1, allShipsHalationsPlayer1);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Игрок под номером 2, теперь твоя очередь расставлять. Другой игрок, не подсматривай!");
        System.out.println("Введите координаты четырехпалубного корабля в формате x1,y1;x2,y2;x3,y3;x4,y4");
        List<ShipPoint> fourDeckShipCoordinatesListPlayer2 = createFourDeckShip();
        List<ShipPoint> allShipsCoordinatesListPlayer2 = new ArrayList<>(fourDeckShipCoordinatesListPlayer2);

        List<ShipPoint> fourDeckShipHalationPlayer2 = listOfHalations(fourDeckShipCoordinatesListPlayer2);
        List<ShipPoint> allShipsHalationsPlayer2 = new ArrayList<>(fourDeckShipHalationPlayer2);
        List<ShipPoint> threeDeckShipHalation1Player2;
        List<ShipPoint> threeDeckShipCoordinatesList1Player2;

        System.out.println("Введите координаты первого трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        while (true) {
            threeDeckShipCoordinatesList1Player2 = createThreeDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(0)) ||
                    allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(1)) ||
                    allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(2))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(0)) ||
                    allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(1)) ||
                    allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList1Player2.get(2))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(threeDeckShipCoordinatesList1Player2);
                threeDeckShipHalation1Player2 = listOfHalations(threeDeckShipCoordinatesList1Player2);
                allShipsHalationsPlayer2.addAll(threeDeckShipHalation1Player2);
                break;
            }
        }

        System.out.println("Введите координаты второго трехпалубного корабля в формате x1,y1;x2,y2;x3,y3");
        List<ShipPoint> threeDeckShipHalation2Player2;
        List<ShipPoint> threeDeckShipCoordinatesList2Player2;

        while (true) {
            threeDeckShipCoordinatesList2Player2 = createThreeDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(0)) ||
                    allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(1)) ||
                    allShipsCoordinatesListPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(2))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(0)) ||
                    allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(1)) ||
                    allShipsHalationsPlayer2.contains(threeDeckShipCoordinatesList2Player2.get(2))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(threeDeckShipCoordinatesList2Player2);
                threeDeckShipHalation2Player2 = listOfHalations(threeDeckShipCoordinatesList2Player2);
                allShipsHalationsPlayer2.addAll(threeDeckShipHalation2Player2);
                break;
            }
        }

        System.out.println("Введите координаты первого двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation1Player2;
        List<ShipPoint> twoDeckShipCoordinatesList1Player2;

        while (true) {
            twoDeckShipCoordinatesList1Player2 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList1Player2.get(0)) ||
                    allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList1Player2.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList1Player2.get(0)) ||
                    allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList1Player2.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(twoDeckShipCoordinatesList1Player2);
                twoDeckShipHalation1Player2 = listOfHalations(twoDeckShipCoordinatesList1Player2);
                allShipsHalationsPlayer2.addAll(twoDeckShipHalation1Player2);
                break;
            }
        }

        System.out.println("Введите координаты второго двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation2Player2;
        List<ShipPoint> twoDeckShipCoordinatesList2Player2;

        while (true) {
            twoDeckShipCoordinatesList2Player2 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList2Player2.get(0)) ||
                    allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList2Player2.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList2Player2.get(0)) ||
                    allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList2Player2.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(twoDeckShipCoordinatesList2Player2);
                twoDeckShipHalation2Player2 = listOfHalations(twoDeckShipCoordinatesList2Player2);
                allShipsHalationsPlayer2.addAll(twoDeckShipHalation2Player2);
                break;
            }
        }

        System.out.println("Введите координаты третьего двухпалубного корабля в формате x1,y1;x2,y2");
        List<ShipPoint> twoDeckShipHalation3Player2;
        List<ShipPoint> twoDeckShipCoordinatesList3Player2;

        while (true) {
            twoDeckShipCoordinatesList3Player2 = createTwoDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList3Player2.get(0)) ||
                    allShipsCoordinatesListPlayer2.contains(twoDeckShipCoordinatesList3Player2.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList3Player2.get(0)) ||
                    allShipsHalationsPlayer2.contains(twoDeckShipCoordinatesList3Player2.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(twoDeckShipCoordinatesList3Player2);
                twoDeckShipHalation3Player2 = listOfHalations(twoDeckShipCoordinatesList3Player2);
                allShipsHalationsPlayer2.addAll(twoDeckShipHalation3Player2);
                break;
            }
        }

        System.out.println("Введите координаты первого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation1Player2;
        List<ShipPoint> oneDeckShipCoordinatesList1Player2;

        while (true) {
            oneDeckShipCoordinatesList1Player2 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(oneDeckShipCoordinatesList1Player2.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(oneDeckShipCoordinatesList1Player2.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(oneDeckShipCoordinatesList1Player2);
                oneDeckShipHalation1Player2 = listOfHalations(oneDeckShipCoordinatesList1Player2);
                allShipsHalationsPlayer2.addAll(oneDeckShipHalation1Player2);
                break;
            }
        }

        System.out.println("Введите координаты второго однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation2Player2;
        List<ShipPoint> oneDeckShipCoordinatesList2Player2;

        while (true) {
            oneDeckShipCoordinatesList2Player2 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(oneDeckShipCoordinatesList2Player2.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(oneDeckShipCoordinatesList2Player2.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(oneDeckShipCoordinatesList2Player2);
                oneDeckShipHalation2Player2 = listOfHalations(oneDeckShipCoordinatesList2Player2);
                allShipsHalationsPlayer2.addAll(oneDeckShipHalation2Player2);
                break;
            }
        }

        System.out.println("Введите координаты третьего однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation3Player2;
        List<ShipPoint> oneDeckShipCoordinatesList3Player2;

        while (true) {
            oneDeckShipCoordinatesList3Player2 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(oneDeckShipCoordinatesList3Player2.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(oneDeckShipCoordinatesList3Player2.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(oneDeckShipCoordinatesList3Player2);
                oneDeckShipHalation3Player2 = listOfHalations(oneDeckShipCoordinatesList3Player2);
                allShipsHalationsPlayer2.addAll(oneDeckShipHalation3Player2);
                break;
            }
        }

        System.out.println("Введите координаты четвертого однопалубного корабля в формате x1,y1");
        List<ShipPoint> oneDeckShipHalation4Player2;
        List<ShipPoint> oneDeckShipCoordinatesList4Player2;

        while (true) {
            oneDeckShipCoordinatesList4Player2 = createOneDeckShip();
            if (allShipsCoordinatesListPlayer2.contains(oneDeckShipCoordinatesList4Player2.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allShipsHalationsPlayer2.contains(oneDeckShipCoordinatesList4Player2.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allShipsCoordinatesListPlayer2.addAll(oneDeckShipCoordinatesList4Player2);
                oneDeckShipHalation4Player2 = listOfHalations(oneDeckShipCoordinatesList4Player2);
                allShipsHalationsPlayer2.addAll(oneDeckShipHalation4Player2);
                break;
            }
        }

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
