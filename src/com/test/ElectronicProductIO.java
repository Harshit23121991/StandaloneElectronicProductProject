package com.test;

public class ElectronicProductIO {
	private String electronicItem;
	private String makeAndModel;
	private int noOfItems;
	private int price;
	
	public ElectronicProductIO() {
		
	}
	
	public ElectronicProductIO(String electronicItem, String makeAndModel, int noOfItems, int price) {
		super();
		this.electronicItem = electronicItem;
		this.makeAndModel = makeAndModel;
		this.noOfItems = noOfItems;
		this.price = price;
	}
	public String getElectronicItem() {
		return electronicItem;
	}
	public void setElectronicItem(String electronicItem) {
		this.electronicItem = electronicItem;
	}
	public String getMakeAndModel() {
		return makeAndModel;
	}
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ElectronicProductIO [electronicItem=");
		builder.append(electronicItem);
		builder.append(", makeAndModel=");
		builder.append(makeAndModel);
		builder.append(", noOfItems=");
		builder.append(noOfItems);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((electronicItem == null) ? 0 : electronicItem.hashCode());
		result = prime * result + ((makeAndModel == null) ? 0 : makeAndModel.hashCode());
		result = prime * result + noOfItems;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicProductIO other = (ElectronicProductIO) obj;
		if (electronicItem == null) {
			if (other.electronicItem != null)
				return false;
		} else if (!electronicItem.equals(other.electronicItem))
			return false;
		if (makeAndModel == null) {
			if (other.makeAndModel != null)
				return false;
		} else if (!makeAndModel.equals(other.makeAndModel))
			return false;
		if (noOfItems != other.noOfItems)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}
