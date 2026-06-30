package com.zepto.request;

public class OrderRequest
{

	private String itemName;
	private String qty;
	private String price;

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public String getQty()
	{
		return qty;
	}

	public void setQty(String qty)
	{
		this.qty = qty;
	}

	public String getPrice()
	{
		return price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

}
