package com.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		System.out.println("Menu :");
		System.out.println("1 - to add the inventory");
		System.out.println("2 - to display inventory");
		System.out.println("3 - to make purchase");
		System.out.println("4 - exit from the program ");
		int inputValue = 0;
		Scanner sc = new Scanner(System.in);
		inputValue = sc.nextInt();
		inventoryOperation(inputValue, sc);
	}
	private static void inventoryOperation(int inputValue, Scanner sc) {
		
		try {
			ElectronicProductIO electronicProductIO ;
			switch(inputValue) {
			case 1 :
				List<ElectronicProductIO> electronicProductList = new ArrayList();
				electronicProductIO = new ElectronicProductIO();
				System.out.println("Enter Product name :");
				electronicProductIO.setElectronicItem(sc.next());
				System.out.println("Enter Make and model :");
				electronicProductIO.setMakeAndModel(sc.next());
				System.out.println("Enter number of items :");
				electronicProductIO.setNoOfItems(sc.nextInt());
				System.out.println("Enter Price :");
				electronicProductIO.setPrice(sc.nextInt());
				System.out.println("Electronic Item : "+ electronicProductIO.getElectronicItem()+"\n" +"Make and model : "+electronicProductIO.getMakeAndModel() +"\n"+"Number  of Items :"
						+ electronicProductIO.getNoOfItems() +"\n"+"Enter price " +electronicProductIO.getPrice());
				electronicProductList.add(electronicProductIO);
				break;
			case 2 :
				
				List<ElectronicProductIO> itemList = new ArrayList();
				itemList.add(new ElectronicProductIO("Laptop", "Dell", 1, 1));
				itemList.add(new ElectronicProductIO("Mobile", "Asus", 1, 1));
				itemList.add(new ElectronicProductIO("Television", "Samsung", 1, 1));
				System.out.println("Electronic Item : Make and model : Number  of Items : Enter price ");
				for (ElectronicProductIO e : itemList) {
					System.out.println(e.getElectronicItem() +" : "+e.getMakeAndModel() + " :" +e.getNoOfItems()+ " : " +e.getPrice());
				}
				break;
			case 3:
				System.out.println("Please enter the Item which you would like to purchase :");
				Scanner scanner = new Scanner(System.in);
				String itemName = scanner.next();
				List<ElectronicProductIO> productList = new ArrayList();
				productList.add(new ElectronicProductIO("Laptop", "Dell", 1, 1));
				productList.add(new ElectronicProductIO("Mobile", "Asus", 1, 1));
				productList.add(new ElectronicProductIO("Television", "Samsung", 1, 1));
				boolean isPresent = false;
				for (ElectronicProductIO e : productList) {
					if(e.getElectronicItem().equalsIgnoreCase(itemName) || e.getMakeAndModel().equalsIgnoreCase(itemName)) {
						isPresent = true;
						System.out.println("Please find the Bill for the Item Bill :");
						System.out.println("Purchase Item  :" +e.getElectronicItem());
						System.out.println("Make and Model of the Item   :" +e.getMakeAndModel());
						System.out.println("Price  :" +e.getPrice());
						break;
					}
				}
				if(!isPresent) {
					System.out.println("The Item which you have entered is out of Stock......!");
				}
				break;
			case 4 :
				System.out.println("Thanks for visting....! ");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input....!");
			}
		}catch (InputMismatchException e) {
			System.out.println("Please enter the valid input.....!");
		}catch (Exception e) {
			System.out.println("Sorry,Something has gone wrong please try after some time.....!");
		}
		
	}
}