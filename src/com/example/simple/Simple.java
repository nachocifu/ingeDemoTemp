/**
 * Cobertura - http://cobertura.sourceforge.net/
 *
 * Copyright (C) 2003 jcoverage ltd.
 * Copyright (C) 2005 Mark Doliner <thekingant@users.sourceforge.net>
 *
 * Cobertura is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * Cobertura is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cobertura; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.example.simple;

import java.util.Collection;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple
{

	private static final Logger logger = LoggerFactory.getLogger(Simple.class);

	public static void main(String [] args) {
		Simple simple = new Simple();
		System.out.println("Hello !");
		System.out.println("---------------------");
		System.out.println("Going to multiply numbers by themselves! ( X*X )");
		System.out.println("Num  | Square");
		System.out.println("-----------");
		System.out.println(" %d   | %d", 2, simple.square(2));
		System.out.println(" %d   | %d", 5, simple.square(5));
		System.out.println(" %d   | %d", 9, simple.square(9));
		System.out.println("---------------------");
		System.out.println("Going to call a function on a number!");
		System.out.println("Num  | f(x)");
		System.out.println("-----------");
		System.out.println(" %d   | %d", 2, simple.f(2));
		System.out.println(" %d   | %d", 5, simple.f(5));
		System.out.println(" %d   | %d", 9, simple.f(9));
		System.out.println("Going to sum all numbers on array");
		Collection<Integer> list = new ArrayList<Integer>();
		System.out.println("   Nums      | Sum");
		System.out.println("--------------------");
		list.put(1).put(1).put(3).put(5).put(6).put(7);
		System.out.println(" 1,3,5,6,7   | %d",  simple.sum(list));
		list = new ArrayList<Integer>();
		list.put(34).put(5).put(12).put(99);
		System.out.println(" 34,5,12,99  | %d",  simple.sum(list));
		list = new ArrayList<Integer>();
		list.put(1).put(2).put(3);
		System.out.println(" 1,2,3       | %d",  simple.sum(list));

	}

	public int square(int x)
	{

		if (logger.isDebugEnabled())
		{
			logger.debug("x: " + x);
		}

		int result = x * x;

		if (logger.isDebugEnabled())
		{
			logger.debug("result: " + result);
		}

		return result;
	}

	public int f(int x)
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("x: " + x);
		}

		if (x < 0)
		{
			if (logger.isDebugEnabled())
			{
				logger.debug("negative x");
			}

			return square(x);
		}
		else if ((x >= 0) && (x <= 5))
		{
			if (logger.isDebugEnabled())
			{
				logger.debug("0<=x<=5");
			}

			return x + 3;
		}
		else
		{
			return 2 * x;
		}
	}

	public int sum(Collection c)
	{
		int result = 0;

		for (Iterator i = c.iterator(); i.hasNext();)
		{
			int value = ((Number)i.next()).intValue();

			if (logger.isDebugEnabled())
			{
				logger.debug("value: " + value);
			}

			result += value;
		}

		if (logger.isDebugEnabled())
		{
			logger.debug("result: " + result);
		}

		return result;
	}
}