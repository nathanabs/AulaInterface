/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Nathan
 */
public class ImpostoBrasilService {

    public double imposto(double quantidade) {
        if (quantidade <= 100) {
            return quantidade * 0.2;
        } else {
            return quantidade * 0.15;
        }
    }
}
