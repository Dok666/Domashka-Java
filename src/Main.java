import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int money = 100;  // Сумма на телефоне
        int replenishmentAmount = 1100;  // Сумма пополнения
        int bonusStart = 100; // Старт начисления бонуса
        int bonus;
        if(replenishmentAmount >= 1000) {bonus = replenishmentAmount / bonusStart;}
        else{ bonus = 0;};
        int yourBonus = bonus; // Ваш бонус
        int totalAmount = money + replenishmentAmount + bonus; // Общая сумма

        System.out.println("Ваш бонус: " + yourBonus);
        System.out.println("Общая сумма: " + totalAmount);




    }

    }