package com.eh.api;

public class Product
{
	private int id = 0;
	private String name = "";
	private int velocity = 0;

	public String getUtil()
	{
		return this.util;
	}

	public void setUtil(String util)
	{
		this.util = util;
	}

	private String util = "";

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void input(int value)
	{
		this.velocity = value;
	}

	public int output()
	{
		return this.velocity;
	}

}
