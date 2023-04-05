/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.dailycodebuffer.Spring.boot.tutorial.error;

/**
 *
 * @author Deep Banerji
 */
public class DepartmentNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>DepartmentNotFoundException</code>
     * without detail message.
     */
    public DepartmentNotFoundException() {
    }

    /**
     * Constructs an instance of <code>DepartmentNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DepartmentNotFoundException(String msg) {
        super(msg);
    }
}
