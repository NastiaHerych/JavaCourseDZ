package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static void program() {
        System.out.println("Введіть 1, щоб перевірити чи є такий місяць");
        System.out.println("Введіть 2, щоб вивести всі місяці з такою ж порою року");
        System.out.println("Введіть 3, щоб вивести всі місяці, які мають таку саму кількість днів");
        System.out.println("Введіть 4, щоб вивести всі місяці, які мають меншу кількість днів");
        System.out.println("Введіть 5, щоб вивести всі місяці, які мають більшу кількість днів");
        System.out.println("Введіть 6, щоб вивести на екран наступну пору року");
        System.out.println("Введіть 7, щоб вивести на екран попередню пору року");
        System.out.println("Введіть 8, щоб вивести на екран всі місяці, які мають парну кількість днів");
        System.out.println("Введіть 9, щоб вивести на екран всі місяці, які мають НЕпарну кількість днів");
        System.out.println("Введіть 10, щоб перевірити чи введений з консолі місяць має парну кількість днів");

    }

    static boolean MonthExists(ArrayList <Monthes> arrayListMonthes , String month) {
        boolean monthh = false;
        for (Monthes months : arrayListMonthes) {
            if (months.name().equalsIgnoreCase(month)) {
                monthh = true;
            }
        }
        return monthh;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Monthes> arrayListMonths = new ArrayList<Monthes>();
        for (Monthes monthValue : Monthes.values()) {
            arrayListMonths.add(monthValue);
        }

        ArrayList<Seasons> arrayListSeasons = new ArrayList<Seasons>();
        for (Seasons seasonValue : Seasons.values()) {
            arrayListSeasons.add(seasonValue);
        }

        System.out.println("Input season:");
        String season = scan.next();

        System.out.println("Input month:");
        String month = scan.next();

        System.out.println("Input days:");
        int numberOfDays = scan.nextInt();


        while (true) {
            program();

            switch (scan.nextInt()) {

                case 1: {
                    boolean monthh = MonthExists(arrayListMonths, month);

                    if (monthh == true) {
                        System.out.println("Month exist");
                    } else
                        System.out.println("Wrong month");

                    break;
                }


                case 2: {
                    boolean seasons = false;

                    for (Monthes months : arrayListMonths) {
                        if (months.getSeasons().name().equalsIgnoreCase(season)) {
                            seasons = true;
                        }
                    }

                    if (seasons == true) {
                        System.out.println("Season " + season + " has: ");

                        for (Monthes months2 : arrayListMonths) {
                            if (months2.getSeasons().toString().equalsIgnoreCase(season)) {
                                System.out.println(months2);
                            }
                        }
                    }
                    break;
                }


                case 3: {
                    boolean days = false;

                    for (Monthes months : arrayListMonths) {
                        if (months.getDays() == numberOfDays) {
                            days = true;
                        }
                    }

                    if (days == true) {
                        System.out.println("Number of days " + numberOfDays + " in next monthes:");
                        for (Monthes months2 : arrayListMonths) {
                            if (months2.getDays() == numberOfDays) {
                                System.out.println(months2);
                            }
                        }
                    }
                    break;
                }

                case 4: {
                    boolean days = false;

                    for (Monthes months : arrayListMonths) {
                        if (months.getDays() == numberOfDays && numberOfDays >= 30) {
                            days = true;
                        }
                    }

                    if (days == true) {
                        System.out.println("Less days in monthes: ");
                        for (Monthes months2 : arrayListMonths) {
                            if (months2.getDays() < numberOfDays) {
                                System.out.println( months2);
                            }
                        }
                    }
                    break;
                }


                case 5: {
                    boolean days = false;

                    for (Monthes months : arrayListMonths) {
                        if (months.getDays() == numberOfDays && numberOfDays <= 30) {
                            days = true;
                        }
                    }

                    if (days == true) {
                        System.out.println("More days in monthes: ");
                        for (Monthes months2 : arrayListMonths) {
                            if (months2.getDays() > numberOfDays) {
                                System.out.println(months2);
                            }
                        }
                    }
                    break;
                }


                case 6: {
                    boolean nextseason = false;

                    for (Seasons seasons : arrayListSeasons) {
                        if (seasons.name().equalsIgnoreCase(season)) {
                            nextseason = true;
                        }
                    }

                    if (nextseason == true) {
                        System.out.println("Next season:");

                        Seasons seasons2 = Seasons.valueOf(next(season.toLowerCase()));
                        int a = seasons2.ordinal();

                        if (a == (arrayListSeasons.size() - 1)) {
                            a = 0;
                            System.out.println(arrayListSeasons.get(a));
                        } else {
                            System.out.println(arrayListSeasons.get(a + 1));
                        }
                    }
                    break;
                }


                case 7: {
                    boolean previousseason = false;

                    for (Seasons seasons : arrayListSeasons) {
                        if (seasons.name().equalsIgnoreCase(season)) {
                            previousseason = true;
                        }
                    }

                    if (previousseason == true) {
                        System.out.println("Previous season:");

                        Seasons seasons2 = Seasons.valueOf(next(season.toLowerCase()));
                        int a = seasons2.ordinal();

                        if (a == 0) {
                            a = (arrayListSeasons.size() - 1);
                            System.out.println(arrayListSeasons.get(a));
                        } else {
                            System.out.println(arrayListSeasons.get(a - 1));
                        }
                    }
                    break;
                }


                case 8: {
                    System.out.println("Сountable monthes: ");
                    for (Monthes months : arrayListMonths) {
                        if (months.getDays() % 2 == 0) {
                            System.out.println(months);
                        }
                    }

                    break;
                }

                case 9: {
                    System.out.println("Uncountable monthes: ");
                    for (Monthes months : arrayListMonths) {
                        if (months.getDays() % 2 != 0) {
                            System.out.println(months);
                        }
                    }

                    break;
                }

                case 10: {
                    boolean countableMonth = MonthExists(arrayListMonths, month);

                    if (countableMonth == true) {
                        Monthes mmonth = Monthes.valueOf(next(month.toLowerCase()));

                        if (mmonth.getDays() % 2 == 0) {
                            System.out.println("Number of days in " + month + " - " + mmonth.getDays()
                                    + ". Countable");
                        } else {
                            System.out.println("Number of days in  " + month + " - " + mmonth.getDays()
                                    + ". Uncountable");
                        }
                    }
                    break;
                }


                default: {
                    System.out.println("Input number from 1 to 10");
                    break;
                }
            }

        }
    }
    static String next(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }
}
