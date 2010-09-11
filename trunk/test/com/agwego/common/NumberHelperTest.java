/*
 * Copyright (c) 2010. Agwego Enterprises Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * If you modify this software a credit would be nice
 */

package com.agwego.common;

import com.agwego.fuzz.FuzzTestAssert;
import com.agwego.fuzz.FuzzTester;
import com.agwego.fuzz.annotations.Fuzz;
import com.agwego.fuzz.annotations.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Tim Desjardins
 * @version $Rev$
 * $Id$
 */
@RunWith( FuzzTester.class )
@Parameters( TestDirectory = "test/com/agwego/common", Prefix = "NumberHelperTest" )
public class NumberHelperTest
{
    /**
     * @param actual -
     * @param otherwise -
     * @param expected -
     */
	@Fuzz
	public void parseIntOtherwise( final String actual, final Integer otherwise, final Integer expected )
	{
		assertEquals( expected, NumberHelper.parseInt( actual, otherwise ));
	}
	
	@Fuzz
	public void parseInt( final String actual, final Integer expected )
	{
		assertEquals( expected, NumberHelper.parseInt( actual ));
	}

	@Test
	public void classTest()
	{
		NumberHelper nh = new NumberHelper(); 
	}
}