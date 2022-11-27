package com.andre;

import java.util.Scanner;

public class UI {

  private Scanner s = new Scanner(System.in);
  int num;
  String login;
  String password;

  public void startMenu() {
    System.out.println("***** Вітаємо Вас в КІНОТЕЦІ!!! *****\n");
    System.out.println("Оберіть варіант входу:" + "\n1. Авторизація" + "\n2. Регістрація" +
        "\n3. Переглянути список всіх фільмів" + "\n4. Вихід з програми");
    num = s.nextInt();
    switch (num) {
      case 1:
        //Autorization(login, password);
        break;
      case 2:
        //Registration(login, password);
        break;
      case 3:
        //List
        break;
      case 4:
        System.exit(0);
      default:
        System.out.println("Неправильний вибір!!! Спробуйте ще раз...");
        break;
    }

  }

  public void mainMenu() {
    System.out.println("Ви ввійшли в меню");
  }
}
