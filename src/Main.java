public class Main {
    public static void main(String[] args) {
        int totalPurchases = 16_000;
        int amount = 950;
        if (totalPurchases <= 15_000) { // Стандарт
            int amountForBonus = 1_000;
            int bonusesPerAmount = 50;
            int bonus = amount / amountForBonus * bonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(bonus);
            System.out.println(remain);
        }
        if (totalPurchases >= 15_001 && totalPurchases <= 150_000) { // Серебро
            int amountForBonus = 1_000;
            int bonusesPerAmount = 70;
            int bonus = amount / amountForBonus * bonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(bonus);
            System.out.println(remain);
        }
        if (totalPurchases >= 150_000) { // Золото
            int amountForBonus = 1_000;
            int bonusesPerAmount = 100;
            int bonus = amount / amountForBonus * bonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(bonus);
            System.out.println(remain);
        }
    }
}