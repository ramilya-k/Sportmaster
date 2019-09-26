public class Main {
    public static void main(String[] args) {
        int totalPurchases = 16_000;
        int amount = 950;
        if (totalPurchases <= 15_000) {
            int amountForBonus = 1_000;
            int standardBonusesPerAmount = 50;
            int standardBonus = amount / amountForBonus * standardBonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(standardBonus);
            System.out.println(remain);
        }
        if (totalPurchases >= 15_001 && totalPurchases <= 150_000) {
            int amountForBonus = 1_000;
            int silverBonusesPerAmount = 70;
            int silverBonus = amount / amountForBonus * silverBonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(silverBonus);
            System.out.println(remain);
        }
        if (totalPurchases >= 150_000) {
            int amountForBonus = 1_000;
            int goldBonusesPerAmount = 100;
            int goldBonus = amount / amountForBonus * goldBonusesPerAmount;
            int remain = amountForBonus - amount % amountForBonus;
            System.out.println(goldBonus);
            System.out.println(remain);
        }
    }
}