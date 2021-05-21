package finalTask;

import java.util.*;

public class SeaBattleMethods {
    public static void print(String[][] empty) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) System.out.print(empty[i][j]);
            System.out.println();
        }
    }

    public static String[][] createEmptyField() {
        String[][] emptyField = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                emptyField[i][j] = "\uD83D\uDFE5";
            }
        }
        return emptyField;
    }


    public static void createAndPrintWarField(String[][] emptyField, List<ShipPoint> list, List<ShipPoint> halation) {
        for (ShipPoint halo : halation) {
            emptyField[halo.getX()][halo.getY()] = "\uD83D\uDFE6";
        }
        for (ShipPoint point : list) {
            emptyField[point.getX()][point.getY()] = "\uD83D\uDEF3" + "."; //"\uD83D\uDEF3"
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) System.out.print(emptyField[i][j]);
            System.out.println();
        }
    }

    public static void createAndPrintWarFieldPlusShots(String[][] emptyField, List<ShipPoint> list,
                                                       List<ShipPoint> halation, List<ShipPoint> playerShots) {
        for (ShipPoint halo : halation) {
            emptyField[halo.getX()][halo.getY()] = "\uD83D\uDFE6";
        }
        for (ShipPoint point : list) {
            emptyField[point.getX()][point.getY()] = "\uD83D\uDEF3" + "."; //"\uD83D\uDEF3"
        }
        for (ShipPoint shot : playerShots) {
            emptyField[shot.getX()][shot.getY()] = "☠️";
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) System.out.print(emptyField[i][j]);
            System.out.println();
        }
    }

    public static List<ShipPoint> listOfHalations(List<ShipPoint> ship) {
        List<ShipPoint> allHalations = new ArrayList<>();
        for (ShipPoint point : ship) {

            int x1 = point.getX() - 1;
            int y1 = point.getY() + 1;
            if (x1 < 0) x1 = 0;
            if (x1 > 9) x1 = 9;
            if (y1 < 0) y1 = 0;
            if (y1 > 9) y1 = 9;

            int x2 = point.getX() - 1;
            int y2 = point.getY();
            if (x2 < 0) x2 = 0;
            if (x2 > 9) x2 = 9;
            if (y2 < 0) y2 = 0;
            if (y2 > 9) y2 = 9;

            int x3 = point.getX() - 1;
            int y3 = point.getY() - 1;
            if (x3 < 0) x3 = 0;
            if (x3 > 9) x3 = 9;
            if (y3 < 0) y3 = 0;
            if (y3 > 9) y3 = 9;

            int x4 = point.getX();
            int y4 = point.getY() - 1;
            if (x4 < 0) x4 = 0;
            if (x4 > 9) x4 = 9;
            if (y4 < 0) y4 = 0;
            if (y4 > 9) y4 = 9;

            int x5 = point.getX() + 1;
            int y5 = point.getY() - 1;
            if (x5 < 0) x5 = 0;
            if (x5 > 9) x5 = 9;
            if (y5 < 0) y5 = 0;
            if (y5 > 9) y5 = 9;

            int x6 = point.getX() + 1;
            int y6 = point.getY();
            if (x6 < 0) x6 = 0;
            if (x6 > 9) x6 = 9;
            if (y6 < 0) y6 = 0;
            if (y6 > 9) y6 = 9;

            int x7 = point.getX() + 1;
            int y7 = point.getY() + 1;
            if (x7 < 0) x7 = 0;
            if (x7 > 9) x7 = 9;
            if (y7 < 0) y7 = 0;
            if (y7 > 9) y7 = 9;

            int x8 = point.getX();
            int y8 = point.getY() + 1;
            if (x8 < 0) x8 = 0;
            if (x8 > 9) x8 = 9;
            if (y8 < 0) y8 = 0;
            if (y8 > 9) y8 = 9;

            allHalations.add(new ShipPoint(x1, y1));
            allHalations.add(new ShipPoint(x2, y2));
            allHalations.add(new ShipPoint(x3, y3));
            allHalations.add(new ShipPoint(x4, y4));
            allHalations.add(new ShipPoint(x5, y5));
            allHalations.add(new ShipPoint(x6, y6));
            allHalations.add(new ShipPoint(x7, y7));
            allHalations.add(new ShipPoint(x8, y8));
        }
        return allHalations;
    }

    public static List<ShipPoint> createFourDeckShip() {
        List<ShipPoint> сoordinatesList4 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check4 = 0;
        while (check4 != 4) {
            String fourDeck = scanner.nextLine();
            String[] fourDeckCoordinates = fourDeck.split(";");
            if (fourDeckCoordinates.length == 4) {
                int counter4 = 0;
                сoordinatesList4.clear();
                counter4 = inputCheck(fourDeckCoordinates, сoordinatesList4, counter4);
                System.out.println(counter4);
                for (ShipPoint point : сoordinatesList4) {
                    System.out.println(point);
                }
                /*for (String s : fourDeckCoordinates) {
                    if (s.contains(",")) {
                        String[] numbers = s.split(",");
                        int x = Integer.parseInt(numbers[1]);
                        int y = Integer.parseInt(numbers[0]);
                        if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                            сoordinatesList4.add(new ShipPoint(x, y));
                            counter4++;
                        } else {
                            System.out.println("Координатами могут быть только цифры от 0 до 9. Повторите попытку ввода");
                            break;
                        }
                    } else {
                        System.out.println("Координаты одной точки должны быть разделены запятой! Повторите ввод");
                        break;
                    }
                }*/
                if (counter4 == 4) {
                    if (сoordinatesList4.get(0).getX() == сoordinatesList4.get(1).getX() &&
                            сoordinatesList4.get(0).getX() == сoordinatesList4.get(2).getX() &&
                            сoordinatesList4.get(0).getX() == сoordinatesList4.get(3).getX() &&
                            сoordinatesList4.get(3).getY() - сoordinatesList4.get(0).getY() == 3 ||
                            сoordinatesList4.get(0).getY() == сoordinatesList4.get(1).getY() &&
                                    сoordinatesList4.get(0).getY() == сoordinatesList4.get(2).getY() &&
                                    сoordinatesList4.get(0).getY() == сoordinatesList4.get(3).getY() &&
                                    сoordinatesList4.get(3).getX() - сoordinatesList4.get(0).getX() == 3) {
                        check4 = counter4;
                    } else {
                        System.out.println("Вы ввели невалидный четырехпалубный ! корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                    }
                } else {
                    System.out.println("Вы ввели невалидный четырехпалубный корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                }
            } else {
                System.out.println("Вы должны ввести ровно 4 координаты. Попробуйте снова");
            }
        }
        return сoordinatesList4;
    }


    public static List<ShipPoint> createThreeDeckShip() {
        List<ShipPoint> coordinateList3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check3 = 0;
        while (check3 != 3) {
            String threeDeck = scanner.nextLine();
            String[] threeDeckCoordinates = threeDeck.split(";");
            if (threeDeckCoordinates.length == 3) {
                int counter3 = 0;
                coordinateList3.clear();
                counter3 = inputCheck(threeDeckCoordinates, coordinateList3, counter3);
                /*for (String s : threeDeckCoordinates) {
                    if (s.contains(",")) {
                        String[] numbers = s.split(",");
                        int x = Integer.parseInt(numbers[1]);
                        int y = Integer.parseInt(numbers[0]);
                        if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                            coordinateList3.add(new ShipPoint(x, y));
                            counter3++;
                        } else {
                            System.out.println("Координатами могут быть только цифры от 0 до 9. Повторите попытку ввода");
                            break;
                        }
                    } else {
                        System.out.println("Координаты одной точки должны быть разделены запятой! Повторите ввод");
                        break;
                    }
                }*/
                if (counter3 == 3) {
                    if (coordinateList3.get(0).getX() == coordinateList3.get(1).getX() &&
                            coordinateList3.get(0).getX() == coordinateList3.get(2).getX() &&
                            coordinateList3.get(2).getY() - coordinateList3.get(0).getY() == 2
                            || coordinateList3.get(0).getY() == coordinateList3.get(1).getY() &&
                            coordinateList3.get(0).getY() == coordinateList3.get(2).getY() &&
                            coordinateList3.get(2).getX() - coordinateList3.get(0).getX() == 2) {
                        check3 = counter3;
                    } else {
                        System.out.println("Вы ввели невалидный трехпалубный корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                    }
                } else {
                    System.out.println("Вы ввели невалидный трехпалубный корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                }
            } else {
                System.out.println("Вы должны ввести ровно 3 координаты. Попробуйте снова");
            }
        }
        return coordinateList3;
    }

    public static List<ShipPoint> createTwoDeckShip() {
        List<ShipPoint> coordinateList2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check2 = 0;
        while (check2 != 2) {
            String twoDeck = scanner.nextLine();
            String[] twoDeckCoordinates = twoDeck.split(";");
            if (twoDeckCoordinates.length == 2) {
                int counter2 = 0;
                coordinateList2.clear();
                counter2 = inputCheck(twoDeckCoordinates, coordinateList2, counter2);
                /*for (String s : twoDeckCoordinates) {
                    if (s.contains(",")) {
                        String[] numbers = s.split(",");
                        int x = Integer.parseInt(numbers[1]);
                        int y = Integer.parseInt(numbers[0]);
                        if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                            coordinateList2.add(new ShipPoint(x, y));
                            counter2++;
                        } else {
                            System.out.println("Координатами могут быть только цифры от 0 до 9. Повторите попытку ввода");
                            break;
                        }
                    } else {
                        System.out.println("Координаты одной точки должны быть разделены запятой! Повторите ввод");
                        break;
                    }
                }*/
                if (counter2 == 2) {
                    if (coordinateList2.get(0).getX() == coordinateList2.get(1).getX() &&
                            coordinateList2.get(1).getY() - coordinateList2.get(0).getY() == 1
                            || coordinateList2.get(0).getY() == coordinateList2.get(1).getY() &&
                            coordinateList2.get(1).getX() - coordinateList2.get(0).getX() == 1) {
                        check2 = counter2;
                    } else {
                        System.out.println("Вы ввели невалидный двухпалубный корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                    }

                } else {
                    System.out.println("Вы ввели невалидный двухпалубный корабль. Палубы должны располагаться одна за другой по горизонтали или по вертикали. Повторите ввод координат.");
                }
            } else {
                System.out.println("Вы должны ввести ровно 2 координаты. Попробуйте снова");
            }
        }
        return coordinateList2;
    }

    public static List<ShipPoint> createOneDeckShip() {
        List<ShipPoint> coordinateList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check1 = 0;
        while (check1 != 1) {
            String oneDeck = scanner.nextLine();
            if (oneDeck.contains(",")) {
                String[] oneDeckCoordinates = oneDeck.split(",");

                if (oneDeckCoordinates.length == 2) {
                    coordinateList.clear();
                    check1 = 0;
                    int x = Integer.parseInt(oneDeckCoordinates[1]);
                    int y = Integer.parseInt(oneDeckCoordinates[0]);
                    if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                        coordinateList.add(new ShipPoint(x, y));
                        check1 = 1;
                    } else {
                        System.out.println("Координатами могут быть только цифры от 0 до 9. Повторите попытку ввода");
                    }
                } else {
                    System.out.println("Вы должны ввести ровно два числа через запятую! Повторите ввод");
                }
            } else {
                System.out.println("Координаты одной точки должны быть разделены запятой! Повторите ввод");
            }
        }
        return coordinateList;
    }

    public static void playerShots(String invitation, List<ShipPoint> allShipsCoordinatesList, List<ShipPoint> allShipsCoordinatesList2,
                                   List<ShipPoint> fourDeckShipCoordinatesList, List<ShipPoint> threeDeckShipCoordinatesList1,
                                   List<ShipPoint> threeDeckShipCoordinatesList2, List<ShipPoint> twoDeckShipCoordinatesList1,
                                   List<ShipPoint> twoDeckShipCoordinatesList2, List<ShipPoint> twoDeckShipCoordinatesList3,
                                   List<ShipPoint> oneDeckShipCoordinatesList1, List<ShipPoint> oneDeckShipCoordinatesList2,
                                   List<ShipPoint> oneDeckShipCoordinatesList3, List<ShipPoint> oneDeckShipCoordinatesList4,
                                   String[][] field, List<ShipPoint> neededAllShipsCoordinates, List<ShipPoint> halationsList, List<ShipPoint> shotsList) {
        Scanner scanner = new Scanner(System.in);

        while (allShipsCoordinatesList.size() != 0 && allShipsCoordinatesList2.size() != 0) {

            System.out.println(invitation);
            String[] pointCoordinates = scanner.nextLine().split(",");
            int x = Integer.parseInt(pointCoordinates[1]);
            int y = Integer.parseInt(pointCoordinates[0]);
            ShipPoint playerShots = (new ShipPoint(x, y));
            shotsList.add(playerShots);
            if (fourDeckShipCoordinatesList.contains(playerShots) && fourDeckShipCoordinatesList.size() > 1) {
                System.out.println("Попал!");
                fourDeckShipCoordinatesList.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (fourDeckShipCoordinatesList.contains(playerShots) && fourDeckShipCoordinatesList.size() == 1) {
                fourDeckShipCoordinatesList.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (threeDeckShipCoordinatesList1.contains(playerShots) && threeDeckShipCoordinatesList1.size() > 1) {
                System.out.println("Попал!");
                threeDeckShipCoordinatesList1.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (threeDeckShipCoordinatesList1.contains(playerShots) && threeDeckShipCoordinatesList1.size() == 1) {
                threeDeckShipCoordinatesList1.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (threeDeckShipCoordinatesList2.contains(playerShots) && threeDeckShipCoordinatesList2.size() > 1) {
                System.out.println("Попал!");
                threeDeckShipCoordinatesList2.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (threeDeckShipCoordinatesList2.contains(playerShots) && threeDeckShipCoordinatesList2.size() == 1) {
                threeDeckShipCoordinatesList2.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList1.contains(playerShots) && twoDeckShipCoordinatesList1.size() > 1) {
                System.out.println("Попал!");
                twoDeckShipCoordinatesList1.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList1.contains(playerShots) && twoDeckShipCoordinatesList1.size() == 1) {
                twoDeckShipCoordinatesList1.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList2.contains(playerShots) && twoDeckShipCoordinatesList2.size() > 1) {
                System.out.println("Попал!");
                twoDeckShipCoordinatesList2.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList2.contains(playerShots) && twoDeckShipCoordinatesList2.size() == 1) {
                twoDeckShipCoordinatesList2.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList3.contains(playerShots) && twoDeckShipCoordinatesList3.size() > 1) {
                System.out.println("Попал!");
                twoDeckShipCoordinatesList3.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (twoDeckShipCoordinatesList3.contains(playerShots) && twoDeckShipCoordinatesList3.size() == 1) {
                twoDeckShipCoordinatesList3.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (oneDeckShipCoordinatesList1.contains(playerShots)) {
                oneDeckShipCoordinatesList1.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (oneDeckShipCoordinatesList2.contains(playerShots)) {
                oneDeckShipCoordinatesList2.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (oneDeckShipCoordinatesList3.contains(playerShots)) {
                oneDeckShipCoordinatesList3.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else if (oneDeckShipCoordinatesList4.contains(playerShots)) {
                oneDeckShipCoordinatesList4.remove(playerShots);
                neededAllShipsCoordinates.remove(playerShots);
                System.out.println("Потопил!");
                createAndPrintWarFieldPlusShots(field, neededAllShipsCoordinates, halationsList, shotsList);
            } else {
                System.out.println("Мимо!");
                shotsList.remove(playerShots);
                break;
            }
        }
    }

    public static List<ShipPoint> check3DShipPlaceAndHalation(List<ShipPoint> allcoords, List<ShipPoint> allHalos,
                                                              List<ShipPoint> threeDeckShipCoordinates, List<ShipPoint> threeDeckShipHalation) {
        while (true) {
            threeDeckShipCoordinates = createThreeDeckShip();
            if (allcoords.contains(threeDeckShipCoordinates.get(0)) ||
                    allcoords.contains(threeDeckShipCoordinates.get(1)) ||
                    allcoords.contains(threeDeckShipCoordinates.get(2))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allHalos.contains(threeDeckShipCoordinates.get(0)) ||
                    allHalos.contains(threeDeckShipCoordinates.get(1)) ||
                    allHalos.contains(threeDeckShipCoordinates.get(2))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allcoords.addAll(threeDeckShipCoordinates);
                threeDeckShipHalation = listOfHalations(threeDeckShipCoordinates);
                allHalos.addAll(threeDeckShipHalation);
                break;
            }
        }
        return threeDeckShipCoordinates;
    }

    public static List<ShipPoint> check2DShipPlaceAndHalation(List<ShipPoint> allcoords, List<ShipPoint> allHalos,
                                                              List<ShipPoint> twoDeckShipCoordinates, List<ShipPoint> twoDeckShipHalation) {
        while (true) {
            twoDeckShipCoordinates = createTwoDeckShip();
            if (allcoords.contains(twoDeckShipCoordinates.get(0)) ||
                    allcoords.contains(twoDeckShipCoordinates.get(1))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allHalos.contains(twoDeckShipCoordinates.get(0)) ||
                    allHalos.contains(twoDeckShipCoordinates.get(1))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allcoords.addAll(twoDeckShipCoordinates);
                twoDeckShipHalation = listOfHalations(twoDeckShipCoordinates);
                allHalos.addAll(twoDeckShipHalation);
                break;
            }
        }
        return twoDeckShipCoordinates;
    }

    public static List<ShipPoint> check1DShipPlaceAndHalation(List<ShipPoint> allcoords, List<ShipPoint> allHalos,
                                                              List<ShipPoint> oneDeckShipCoordinates, List<ShipPoint> oneDeckShipHalation) {
        while (true) {
            oneDeckShipCoordinates = createOneDeckShip();
            if (allcoords.contains(oneDeckShipCoordinates.get(0))) {
                System.out.println("Это место уже занято другим кораблем. Проверьте координаты и повторите попытку ввода");

            } else if (allHalos.contains(oneDeckShipCoordinates.get(0))) {
                System.out.println("Вы заплыли на ореол другого корабля. Вокруг корабля должна быть область шириной" +
                        " в одну клетку, в которой не может быть других кораблей");
            } else {
                allcoords.addAll(oneDeckShipCoordinates);
                oneDeckShipHalation = listOfHalations(oneDeckShipCoordinates);
                allHalos.addAll(oneDeckShipHalation);
                break;
            }
        }
        return oneDeckShipCoordinates;
    }

    public static int inputCheck(String[] strings, List<ShipPoint> coordinateList, int counter) {
        for (String s : strings) {
            if (s.contains(",")) {
                String[] numbers = s.split(",");
                int x = Integer.parseInt(numbers[1]);
                int y = Integer.parseInt(numbers[0]);
                if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                    coordinateList.add(new ShipPoint(x, y));
                    counter++;
                } else {
                    System.out.println("Координатами могут быть только цифры от 0 до 9. Повторите попытку ввода");
                    break;
                }
            } else {
                System.out.println("Координаты одной точки должны быть разделены запятой! Повторите ввод");
                break;
            }
        }
        return counter;

    }
}
