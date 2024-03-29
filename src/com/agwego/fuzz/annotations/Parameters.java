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

package com.agwego.fuzz.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specify the @Parameters to be used by @RunWith( FuzzTester.class ) <br/>
 * The parameters are:
 * <ul>
 * <li> TestDirectory (required) - the directory containing your test files (can be absolute or relative)</li>
 * <li> Prefix - the file prefix to associate with the unit test </li>
 * <li> Suffix - the file suffix to associate with the unit test, default ".json"</li>
 * <li> TestDirectoryRootPropertyName - a property name to use instead of TestDirectory (not implemented yet)</li>
 * @see com.agwego.common.FileFilterPrePost
 *
 * @author Tim Desjardins
 * @version $Rev$
 * <br/>
 * $Id$
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface Parameters {
	String TestDirectory();
	String Prefix() default "";
	String Suffix() default ".json";
	String TestDirectoryRootPropertyName() default "";
}