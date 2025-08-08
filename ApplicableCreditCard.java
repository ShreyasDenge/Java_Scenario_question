package com.shreyas.credit_card_program;

import java.util.Scanner;

public class ApplicableCreditCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer Name:");
		String name = sc.nextLine();
		
		System.out.print("Enter Customer Credit Points:");
		int creditPoint = Integer.parseInt(sc.nextLine());
		
		Customer customer = new Customer(name, creditPoint);
		
		CardType offeredCard = CardsOnOffer.getOfferedCard(customer);
		System.out.println(offeredCard);
		
		sc.close();
	}

}
