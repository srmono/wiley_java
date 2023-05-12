package data_structures;

import java.util.Arrays;

public class GreedyAlgorithm {
	public static void main(String[] args) {
		int[] coins = { 1, 5, 10, 25 }; // Available coin denominations
		int amount = 47; // Amount to make change for

		int[] result = makeChange(coins, amount);
		System.out.println("Minimum number of coins required: " + result[amount]);
		System.out.println("Coins used:");
		printCoinsUsed(result, coins, amount);
	}

	public static int[] makeChange(int[] coins, int amount) {
		int[] minCoins = new int[amount + 1]; // Array to store minimum number of coins
		int[] lastCoin = new int[amount + 1]; // Array to store last coin used to achieve minimum number of coins

		Arrays.fill(minCoins, Integer.MAX_VALUE); // Initialize minCoins array with a large value
		minCoins[0] = 0; // Base case: 0 coins needed to make change for amount 0

		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				if (minCoins[i - coin] + 1 < minCoins[i]) {
					minCoins[i] = minCoins[i - coin] + 1;
					lastCoin[i] = coin;
				}
			}
		}

		return lastCoin;
	}

	public static void printCoinsUsed(int[] lastCoin, int[] coins, int amount) {
		while (amount > 0) {
			int coin = lastCoin[amount];
			System.out.print(coin + " ");
			amount -= coin;
		}
		System.out.println();
	}
}
