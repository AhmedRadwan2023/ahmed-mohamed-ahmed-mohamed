/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ahmed
 */
public interface ICalculator {
    /**
* Adds given two numbers
* @param x first number
* @param y second number
* @return the sum of the two numbers
*/
int add(int x, int y);
/**
* Divides two numbers
* @param x first number
* @param y second number
* @return the division result
*/
float divide(int x, int y) throws RuntimeException;
}
