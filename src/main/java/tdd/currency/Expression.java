/*
 * @(#)Expression.java $version 2015. 2. 8.
 *
 * Copyright 2015 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package tdd.currency;

/**
 * 
 * @author 박성현[kr17352@navercorp.com]
 * @version 1.0
 */
public interface Expression {

	Money reduce(String to);
}
